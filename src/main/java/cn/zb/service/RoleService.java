package cn.zb.service;

import cn.zb.entity.Roles;
import cn.zb.vo.Condition;

import java.util.List;
import java.util.Map;

public interface RoleService {
    Map<String,Object> findByCondition(Condition con);
    void add(Roles roles);
    Map<String,Object> showUpdate(Integer roleId);
    void modify(Roles roles);

    void remove(Integer roleId);
}
