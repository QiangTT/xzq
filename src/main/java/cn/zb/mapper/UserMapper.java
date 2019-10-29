package cn.zb.mapper;

import cn.zb.entity.Users;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    Users selectusersByUsernameAndPassword(@Param("loginname") String loginname, @Param("loginpassword") String loginpassword);
}
