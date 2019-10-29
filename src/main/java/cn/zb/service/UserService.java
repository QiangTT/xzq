package cn.zb.service;

import cn.zb.entity.Users;

public interface UserService {
    Users loginusers(String loginname, String loginpassword);
}
