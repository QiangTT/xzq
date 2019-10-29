package cn.zb.controller;

import cn.zb.entity.Rights;
import cn.zb.entity.Roles;
import cn.zb.service.RightService;
import cn.zb.service.RoleService;
import cn.zb.vo.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private RightService rightService;

    @RequestMapping("/browseRole")
    public String list(HttpServletRequest req, Condition con){
        con.setPageStart((con.getPageNo()-1)*con.getPageSize());
        req.setAttribute("map",roleService.findByCondition(con));
        req.setAttribute("condition",con);
        return "/rights/rolebrowse";
    }

    @RequestMapping("/addnewRole")
    public String showRoleAdd(Model model){
        model.addAttribute("rightList",rightService.findAll());
        return "/rights/roleadd";
    }

    @RequestMapping("/role/add")
    public String add(Roles roles,Integer[] rightIds){
        List<Rights> list = new ArrayList<>();
        for (Integer id:rightIds){
            Rights rights = new Rights();
            rights.setId(id);
            list.add(rights);
        }
        roles.setRightsList(list);
        roleService.add(roles);
        return "redirect:/browseRole?pageNo=1";
    }

    @RequestMapping("/updatetimeRole")
    public String showUpdate(HttpServletRequest req, Condition con){
        con.setPageStart((con.getPageNo()-1)*con.getPageSize());
        req.setAttribute("map",roleService.findByCondition(con));
        req.setAttribute("condition",con);
        return "/rights/rolebrforupd";
    }

    @RequestMapping("/role/showUpdate")
    public String showUpdate(Model model,Integer roleId){
        model.addAttribute("map",roleService.showUpdate(roleId));
        return "/rights/roleupdate";
    }

    @RequestMapping("/role/update")
    public String update(Roles roles,Integer[] rightIds){
        List<Rights> list = new ArrayList<>();
        for (Integer id:rightIds){
            Rights rights = new Rights();
            rights.setId(id);
            list.add(rights);
        }
        roles.setRightsList(list);
        roleService.modify(roles);
        return "redirect:/browseRole?pageNo=1";
    }

    @RequestMapping("/deleteRole")
    public String showDelete(HttpServletRequest req, Condition con){
        con.setPageStart((con.getPageNo()-1)*con.getPageSize());
        req.setAttribute("map",roleService.findByCondition(con));
        req.setAttribute("condition",con);
        return "/rights/rolebrfordel";
    }

    @RequestMapping("/role/delete")
    public String delete(Integer roleId){
        roleService.remove(roleId);
        return "redirect:/deleteRole?pageNo=1";
    }
}
