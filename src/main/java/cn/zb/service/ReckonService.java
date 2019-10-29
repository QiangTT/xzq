package cn.zb.service;

import cn.zb.entity.Bill;
import cn.zb.entity.Usersbusiness;

import java.util.List;

public interface ReckonService {
    List<Usersbusiness> findBusiness(Integer id);
    List<Bill> findBillCon(String userName, Integer year, Integer month);
    Usersbusiness findOne(Integer id);
}
