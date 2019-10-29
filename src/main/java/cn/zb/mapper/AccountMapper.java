package cn.zb.mapper;

import cn.zb.entity.Detaildays;
import cn.zb.entity.Detailmonths;
import cn.zb.entity.Detailyears;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {
    List<Detailyears> selectYears();
    List<Detailyears> selectByYear(Integer year);
    List<Detailmonths> selectMonths(@Param("ip") String ip, @Param("year") Integer year);
    List<Detailmonths> selectAllMonths();
    List<Detailmonths> selectMonthByYeaAndMonth(@Param("year")String year,@Param(("month")) String month);
    List<Detaildays> selectDays(@Param("ip") String ip, @Param("year") String year, @Param("month") String month);
}
