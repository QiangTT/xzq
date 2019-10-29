package cn.zb.service.impl;

import cn.zb.entity.Detaildays;
import cn.zb.entity.Detailmonths;
import cn.zb.entity.Detailyears;
import cn.zb.mapper.AccountMapper;
import cn.zb.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Detailyears> findyears() {
        return accountMapper.selectYears();
    }

    @Override
    public List<Detailyears> findByYear(Integer year) {
        return accountMapper.selectByYear(year);
    }

    @Override
    public List<Detailmonths> findMonths(String ip, Integer year) {
        return accountMapper.selectMonths(ip,year);
    }

    @Override
    public List<Detailmonths> findAllMonths() {
        return accountMapper.selectAllMonths();
    }

    @Override
    public List<Detailmonths> findMonthByYeaAndMonth(String year, String month) {
        return accountMapper.selectMonthByYeaAndMonth(year,month);
    }

    @Override
    public List<Detaildays> findDays(String ip, String year, String month) {
        return accountMapper.selectDays(ip,year,month);
    }
}
