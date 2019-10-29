package cn.zb.service.impl;

import cn.zb.entity.Bill;
import cn.zb.entity.Usersbusiness;
import cn.zb.mapper.ReckonMapper;
import cn.zb.service.ReckonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReckonServiceImpl implements ReckonService {
    @Autowired
    private ReckonMapper reckonMapper;

    @Override
    public List<Usersbusiness> findBusiness(Integer id) {
        return reckonMapper.selectBusiness(id);
    }

    @Override
    public List<Bill> findBillCon(String userName, Integer year, Integer month) {
        return reckonMapper.selectBills(userName,year,month);
    }

    @Override
    public Usersbusiness findOne(Integer id) {

        return reckonMapper.selectOne(id);
    }
}
