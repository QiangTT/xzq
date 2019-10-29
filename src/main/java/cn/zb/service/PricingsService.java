package cn.zb.service;

import cn.zb.entity.Pricings;
import cn.zb.vo.Condition;

import java.util.List;

public interface PricingsService {
    List<Pricings> findAll();
    void add(Pricings pricings);
    void remove(Integer Id);
    Pricings detail(Integer Id);
    void modify(Pricings pricings);
    List<Pricings> findBynameAndprices(Condition condition);
}
