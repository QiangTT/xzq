package cn.zb.controller;

import cn.zb.entity.Pricings;
import cn.zb.service.PricingsService;
import cn.zb.vo.Condition;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

@Controller


public class PricingsController {
    @Autowired
    private PricingsService pricingsService;

    /*@RequestMapping("/feeAll")

    public String priceAll(Model model, @RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,3);
        List<Pricings> list=pricingsService.findAll();
        PageInfo pageInfo=new PageInfo(list);
        model.addAttribute("priceAll",list);
        model.addAttribute("pageInfo",pageInfo);

        return "/fee/feebrowse";
    }*/

    @RequestMapping("/feeadd")
    public String priceAdd(Pricings pricings){
System.out.println(pricings.getName()+"+"+pricings.getBasefee()+"+"+pricings.getRatefee()+"+"+pricings.getDescription());
        pricingsService.add(pricings);
        return "redirect:/browseFee";
    }
    @RequestMapping("/addnewFee")
    public String addFee(){
        return "/fee/feeadd";
    }

   /* @RequestMapping("/feeAlldel")
    public String priceAlldel(Model model, @RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,3);
        List<Pricings> list=pricingsService.findAll();
        PageInfo pageInfo=new PageInfo(list);
        model.addAttribute("priceAlldel",list);
        model.addAttribute("pageInfo",pageInfo);

        return "/fee/feebrfordel";
    }*/

    @RequestMapping("/feedel")
    public String pricedel(Integer id)  {

    pricingsService.remove(id);
    return "redirect:/deleteFee";
    }

@RequestMapping("/detail")
public String pridetail(Integer id,Model model){
        Pricings pricings=pricingsService.detail(id);
        model.addAttribute("detail",pricings);

        return "/fee/feeupdate";
}

   /* @RequestMapping("/feeAllup")
    public String priceAllup(Model model,@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,3);
        List<Pricings> list=pricingsService.findAll();
        PageInfo pageInfo=new PageInfo(list);
        model.addAttribute("priceAllup",list);
        model.addAttribute("pageInfo",pageInfo);

        return "/fee/feebrforupd";
    }*/
    @RequestMapping("/feeup")
    public String priceup(Pricings pricings){
    pricingsService.modify(pricings);
    return "redirect:/updatetimeFee";
    }

    @RequestMapping("/browseFee")
    public String priceCondition(Condition condition,Model model, @RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,3);
        List<Pricings> listConditon=pricingsService.findBynameAndprices(condition);
        PageInfo pageInfo=new PageInfo(listConditon);
        model.addAttribute("priceAll",listConditon);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("condition",condition);

        return "/fee/feebrowse";
    }
    @RequestMapping("/updatetimeFee")
    public String priceConditionup(Condition condition,Model model, @RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,3);
        List<Pricings> listConditon=pricingsService.findBynameAndprices(condition);
        PageInfo pageInfo=new PageInfo(listConditon);
        model.addAttribute("priceAllup",listConditon);
        model.addAttribute("pageInfo",pageInfo);

        return "/fee/feebrforupd";
    }
    @RequestMapping("/deleteFee")
    public String priceConditiondel(Condition condition,Model model, @RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,3);
        List<Pricings> listConditon=pricingsService.findBynameAndprices(condition);
        PageInfo pageInfo=new PageInfo(listConditon);
        model.addAttribute("priceAlldel",listConditon);
        model.addAttribute("pageInfo",pageInfo);

        return "/fee/feebrfordel";
    }
}
