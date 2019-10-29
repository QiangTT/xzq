package cn.zb.service;

import cn.zb.entity.Detaildays;
import cn.zb.entity.Detailmonths;
import cn.zb.entity.Detailyears;

import java.util.List;

public interface AccountService {
    List<Detailyears> findyears();
    List<Detailyears> findByYear(Integer year);
    List<Detailmonths> findMonths(String ip, Integer year);
    List<Detailmonths> findAllMonths();
    List<Detailmonths> findMonthByYeaAndMonth(String year,String month);
    List<Detaildays> findDays(String ip, String year, String month);
}
