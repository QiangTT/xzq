package cn.zb.service.impl;

import cn.zb.entity.Admins;
import cn.zb.entity.Modules;
import cn.zb.mapper.AdminMapper;
import cn.zb.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout = 10,rollbackFor = Exception.class)
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Admins login(String loginname, String loginpassword) {
        return adminMapper.selectByUsernameAndPassword(loginname, loginpassword);
    }

    @Override
    public List<Admins> findAll() {
        return adminMapper.selectAll();
    }

    @Override
    public List<Modules> findModulesByAdminId(Integer adminId) {
        return adminMapper.selectModulesByAdminId(adminId);
    }
}
