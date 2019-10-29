package cn.zb.mapper;

import cn.zb.entity.Admins;
import cn.zb.entity.Modules;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    Admins selectByUsernameAndPassword(@Param("loginname") String loginname, @Param("loginpassword") String loginpassword);
    List<Admins> selectAll();

    List<Modules> selectModulesByAdminId(Integer adminId);
}
