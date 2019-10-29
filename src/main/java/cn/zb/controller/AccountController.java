package cn.zb.controller;

import cn.zb.entity.Detaildays;
import cn.zb.entity.Detailmonths;
import cn.zb.entity.Detailyears;
import cn.zb.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/accountYQuery")
    public String queryYears(Model model){
        List<Detailyears> detailyears =accountService.findyears();
        model.addAttribute("detailyears",detailyears);
        return "/account/acctyear";
    }
    @RequestMapping("/qByYear")
    public String queryByYear(Model model,String year){
        List<Detailyears> detailyears =accountService.findByYear(Integer.parseInt(year));
        model.addAttribute("year",year);
        model.addAttribute("detailyears",detailyears);
        return "/account/acctyear";
    }

    @RequestMapping("/qMonths")
    public String queryMonths(Model model,String year,String ip){

        List<Detailmonths> detailmonths = accountService.findMonths(ip,Integer.parseInt(year));
        model.addAttribute("ip",ip);
        model.addAttribute("year",year);
        model.addAttribute("detailmonths",detailmonths);
        return "/account/acctyeardetail";
    }
    @RequestMapping("/accountMQuery")
    public String queryMonths(Model model){
        List<Detailmonths> detailmonths =accountService.findAllMonths();
        model.addAttribute("detailmonths",detailmonths);
        return "/account/acctmonth";
    }
    @RequestMapping("/qMonthByYearAndMonth")
    public String queryMonthByYeaAndMonth(Model model,String year,String month){
        List<Detailmonths> detailmonths =accountService.findMonthByYeaAndMonth(year,month);
        model.addAttribute("detailmonths",detailmonths);
        model.addAttribute("year",year);
        model.addAttribute("month",month);
        return "/account/acctmonth";
    }
    @RequestMapping("/qmonthDetail")
    public String monthDetail(Model model,String ip,String year,String month){
        List<Detaildays> detaildaysList = accountService.findDays(ip,year,month);
        model.addAttribute("detaildaysList",detaildaysList);
        model.addAttribute("ip",ip);
        model.addAttribute("year",year);
        model.addAttribute("month",month);
        return "/account/acctmonthdetail";
    }
}
