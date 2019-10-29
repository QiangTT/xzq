package cn.zb.controller;

import cn.zb.entity.Bill;
import cn.zb.entity.Usersbusiness;
import cn.zb.service.ReckonService;
import cn.zb.service.impl.ReckonServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class ReckonController {
    @Autowired
    private ReckonService reckonService;
     @RequestMapping("details")
    public String findall(Model model, String id,@RequestParam(value = "page",defaultValue = "1")Integer page){
         PageHelper.startPage(page,2);
         List<Usersbusiness> usersbusinesses=reckonService.findBusiness(Integer.parseInt(id));
         PageInfo pageInfo=new PageInfo(usersbusinesses);
         model.addAttribute("pag",pageInfo);
         model.addAttribute("usersbusinesses",usersbusinesses);
      return "/reckon/reckondetail";
     }

    @RequestMapping("browse")
     public  String findby(Model model, String username, Integer year, Integer month, @RequestParam(value = "page",defaultValue = "1")Integer page){
        PageHelper.startPage(page,2);
        List<Bill> bills=reckonService.findBillCon(username,year,month);
        PageInfo pageInfo=new PageInfo(bills);
        model.addAttribute("pag",pageInfo);

        System.out.println(bills);
        System.out.println(111111);
        model.addAttribute("bills",bills);
        System.out.println(bills);
        model.addAttribute("username",username);
        System.out.println(username);
        model.addAttribute("year",year);
        System.out.println(year);
        model.addAttribute("month",month);
    return "/reckon/reckon";
    }


}
