package cn.zb.controller;

import cn.zb.entity.Rights;
import cn.zb.service.RightService;
import cn.zb.vo.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class RightController {

    @Autowired
    private RightService rightService;

    @RequestMapping("/browseRight")
    public String rightList(HttpServletRequest req, Condition con){
        //设置分页起始数据量
        con.setPageStart((con.getPageNo()-1)*con.getPageSize());

        req.setAttribute("rightList",rightService.findByCondition(con).get("rightList"));
        req.setAttribute("pageSupport",rightService.findByCondition(con).get("pageSupport"));
        req.setAttribute("condition",con);
        return "/rights/rightbrowse";
    }

    @RequestMapping("/right/update")
    public String update(Rights rights, Condition con, HttpServletResponse resp) throws UnsupportedEncodingException {
        rightService.modify(rights);
        System.out.println(con.getModuleName());
        return "redirect:/updatetimeRight?pageNo="+con.getPageNo()+"&moduleName="+URLEncoder.encode(con.getModuleName(),"UTF-8")+"&operationName="+URLEncoder.encode(con.getOperationName(),"UTF-8");
    }

    @RequestMapping("/right/detail")
    public String detail(Model model,Integer id,Condition con){
        model.addAttribute("map",rightService.findById(id));
        model.addAttribute("condition",con);
        return "/rights/rightupdate";
    }

    @RequestMapping("/updatetimeRight")
    public String updatePage(HttpServletRequest req, Condition con){
        //设置分页起始数据量
        con.setPageStart((con.getPageNo()-1)*con.getPageSize());

        req.setAttribute("rightList",rightService.findByCondition(con).get("rightList"));
        req.setAttribute("pageSupport",rightService.findByCondition(con).get("pageSupport"));
        req.setAttribute("condition",con);
        return "/rights/rightbrforupd";
    }
}
