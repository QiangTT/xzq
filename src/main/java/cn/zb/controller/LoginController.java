package cn.zb.controller;

import cn.zb.entity.Admins;
import cn.zb.entity.Modules;
import cn.zb.entity.Rights;
import cn.zb.entity.Users;
import cn.zb.service.AdminService;
import cn.zb.service.UserService;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class LoginController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String doLogin(String loginname, String loginpassword, String code, HttpServletRequest request, HttpSession session, Integer usertype){
        //验证码验证
        String originCode = (String) session.getAttribute("code");
        if(!originCode.equalsIgnoreCase(code)){
            request.setAttribute("msg", "验证码错误");
            return "/index";
        }
        if(usertype==1){
            Users user=userService.loginusers(loginname, loginpassword);
            if(user != null){
                session.setAttribute("user", user);
                List<Modules> modulesList = new ArrayList<>();
                List<Rights>rightsList = new ArrayList<>();
                Rights rights = new Rights("帐务年查询","accountYQuery");
                Rights rights1 = new Rights("帐务月查询","accountMQuery");
                rightsList.add(rights);
                rightsList.add(rights1);
                Modules modules = new Modules(5,"帐务管理","account",rightsList);
                List<Rights> rightsList1 = new ArrayList<>();
                Rights rights2 = new Rights("帐单查询","browse");
                rightsList1.add(rights2);
                Modules modules1 = new Modules(6,"帐单管理","reckon",rightsList1);
                modulesList.add(modules);
                modulesList.add(modules1);
                session.setAttribute("moduleList",modulesList);
                session.setAttribute("user", user);
                return "/main";
            }else {
                request.setAttribute("msg", "用户名或密码错误");
                return "/index";
            }
        }else{
            Admins admin = adminService.login(loginname, loginpassword);
            if(admin != null){
                session.setAttribute("user", admin);
                //查询管理员拥有的模块
                session.setAttribute("moduleList",adminService.findModulesByAdminId(admin.getId()));
                System.out.println(adminService.findModulesByAdminId(admin.getId()));
                return "/main";
            }else {
                request.setAttribute("msg", "用户名或密码错误");
                return "/index";
            }
        }
    }

    @RequestMapping("/generateCode")
    public void generateCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Random random=new Random();
        //在内存中创建画图板
        BufferedImage image=new BufferedImage(70,23,BufferedImage.TYPE_INT_RGB);

        //获得画笔
        Graphics graphics=image.getGraphics();

        //设置画笔颜色
        graphics.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));

        //画一个带填充色的矩形作为背景颜色
        graphics.fillRect(0, 0, 70, 30);

        //设置画笔颜色
        graphics.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));

        //设置字体
        graphics.setFont(new Font("Courier New", Font.BOLD+Font.ITALIC,18));

        //生成一个4位的随机字符串，字符串中包括[a-z][0-9]
        String s="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer code=new StringBuffer();
        for (int i = 0; i < 5; i++) {
            code.append(s.charAt(random.nextInt(s.length())));
        }

        //将code写到图片上
        graphics.drawString(code.toString(), 6, 16);
        request.getSession().setAttribute("code", code.toString());

        System.out.println(code);
        //将图片发送给客户端
        OutputStream out=response.getOutputStream();

        //将图片压缩成JPEG格式写入out中
        JPEGImageEncoder encoder= JPEGCodec.createJPEGEncoder(out);
        encoder.encode(image);
    }

    @RequestMapping("{url}")
    public String showModeulePage(@PathVariable("url") String url){
        return "/"+url+"/index";
    }

    @RequestMapping("/exit")
    public String exit(HttpSession session){
        session.removeAttribute("user");
        return "/index";
    }
}
