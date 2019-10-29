package cn.zb.service;

import cn.zb.entity.Rights;
import cn.zb.vo.Condition;

import java.util.List;
import java.util.Map;

public interface RightService {
    //根据条件分页查询权限列表
   Map<String,Object> findByCondition(Condition con);
   //修改权限
    void modify(Rights rights);
    //修改权限前查询权限信息
    Map<String,Object> findById(Integer id);
    //查询所有权限
    List<Rights> findAll();
}
