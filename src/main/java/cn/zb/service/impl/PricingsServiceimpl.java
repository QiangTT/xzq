package cn.zb.service.impl;

import cn.zb.entity.Pricings;
import cn.zb.expection.PricingsNameRepeatException;
import cn.zb.mapper.PricingsDao;
import cn.zb.service.PricingsService;
import cn.zb.vo.Condition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricingsServiceimpl implements PricingsService {
    @Autowired
    private PricingsDao pricingsDao;

    @Override
    public List<Pricings> findAll() {

        return pricingsDao.selectAll();
    }

    @Override
    public void add(Pricings pricings) throws PricingsNameRepeatException {
        Pricings pricings1=pricingsDao.selectByname(pricings.getName());
        if (pricings1!=null){
            throw new PricingsNameRepeatException("资费名称重复");
        }
       pricingsDao.insert(pricings);
    }

    @Override
    public void remove(Integer Id) {
         pricingsDao.delete(Id);
    }

    @Override
    public Pricings detail(Integer Id) {
        Pricings pricings=pricingsDao.selectById(Id);
        return pricings;
    }

    @Override
    public void modify(Pricings pricings) {
        pricingsDao.update(pricings);
    }

    @Override
    public List<Pricings> findBynameAndprices(Condition condition) {
        return  pricingsDao.selectBynameAndprices(condition);
    }
}
