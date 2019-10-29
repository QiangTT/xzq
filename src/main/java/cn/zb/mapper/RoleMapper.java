package cn.zb.mapper;

import cn.zb.entity.Roles;
import cn.zb.vo.Condition;

import java.util.List;

public interface RoleMapper {
    List<Roles> selectByCondition(Condition con);
    int selectCountByCondition(Condition con);

    void insert(Roles roles);

    Roles selectById(Integer id);


    void updateById(Roles roles);

    void delete(Integer roleId);
}
