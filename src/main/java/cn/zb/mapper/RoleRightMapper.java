package cn.zb.mapper;

import cn.zb.entity.Rolerights;

public interface RoleRightMapper {
    void insert(Rolerights[] rolerights);

    void deleteByRoleId(int roleId);
}
