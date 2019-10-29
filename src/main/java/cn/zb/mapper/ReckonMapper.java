package cn.zb.mapper;

import cn.zb.entity.Bill;
import cn.zb.entity.Usersbusiness;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReckonMapper {

    List<Bill> selectBills(@Param("userName")String userName, @Param("year")Integer year, @Param("month")Integer month);
    List<Usersbusiness> selectBusiness(@Param("id") Integer id);

    Usersbusiness selectOne(Integer id);
}
