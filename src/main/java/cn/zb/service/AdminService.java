package cn.zb.service;

import cn.zb.entity.Admins;
import cn.zb.entity.Modules;

import java.util.List;

public interface AdminService {
    Admins login(String loginname, String loginpassword);
    List<Admins> findAll();
    List<Modules> findModulesByAdminId(Integer adminId);
}
