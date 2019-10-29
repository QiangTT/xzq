package cn.zb.service.impl;

import cn.zb.entity.Users;
import cn.zb.mapper.UserMapper;
import cn.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout = 10,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
 @Autowired
 private UserMapper userMapper;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Users loginusers(String loginname, String loginpassword) {
        return userMapper.selectusersByUsernameAndPassword(loginname, loginpassword);
    }
}
