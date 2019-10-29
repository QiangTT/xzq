package cn.zb.service.impl;

import cn.zb.entity.Rights;
import cn.zb.entity.Rolerights;
import cn.zb.entity.Roles;
import cn.zb.mapper.RightMapper;
import cn.zb.mapper.RoleMapper;
import cn.zb.mapper.RoleRightMapper;
import cn.zb.service.RightService;
import cn.zb.service.RoleService;
import cn.zb.utils.PageSupport;
import cn.zb.vo.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired()
    private RoleMapper roleMapper;
    @Autowired
    private RoleRightMapper roleRightMapper;
    @Autowired
    private RightMapper rightMapper;

    @Override
    public Map<String,Object> findByCondition(Condition con) {
        Map<String,Object> map = new HashMap<>();
        PageSupport pageSupport = new PageSupport();
        pageSupport.setPageNo(con.getPageNo());
        pageSupport.setPageSize(con.getPageSize());
        pageSupport.setTotalCont(roleMapper.selectCountByCondition(con));
        map.put("pageSupport",pageSupport);
        map.put("roleList",roleMapper.selectByCondition(con));
        return map;
    }

    @Override
    public void add(Roles roles) {
        //插入角色
        roleMapper.insert(roles);
        //插入角色的权限
        Rolerights[] rolerights = new Rolerights[0];
        for(Rights rights:roles.getRightsList()){
                Rolerights rolerights1 = new Rolerights();
                rolerights1.setRoleId(roles.getId());
                rolerights1.setRightId(rights.getId());
                rolerights = Arrays.copyOf(rolerights,rolerights.length+1);
                rolerights[rolerights.length-1] = rolerights1;
        }
        roleRightMapper.insert(rolerights);
    }

    @Override
    public Map<String,Object> showUpdate(Integer roleId) {
        Map<String,Object> map = new HashMap<>();
        //根据roleId查询角色及对应权限
        Roles roles = roleMapper.selectById(roleId);
        //查新全部权限
        List<Rights> rightsList = rightMapper.selectAll();

        map.put("role",roles);
        map.put("rightList",rightsList);
        return map;
    }

    @Override
    public void modify(Roles roles) {
        //修改角色
        roleMapper.updateById(roles);
        //修改角色对应的权限
        roleRightMapper.deleteByRoleId(roles.getId());
        Rolerights[] rolerights = new Rolerights[0];
        for(Rights rights:roles.getRightsList()){
            Rolerights rolerights1 = new Rolerights();
            rolerights1.setRoleId(roles.getId());
            rolerights1.setRightId(rights.getId());
            rolerights = Arrays.copyOf(rolerights,rolerights.length+1);
            rolerights[rolerights.length-1] = rolerights1;
        }
        roleRightMapper.insert(rolerights);
    }

    @Override
    public void remove(Integer roleId) {
        roleMapper.delete(roleId);
    }

}
