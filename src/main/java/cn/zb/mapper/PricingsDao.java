package cn.zb.mapper;

import cn.zb.entity.Pricings;
import cn.zb.vo.Condition;

import java.util.List;

public interface PricingsDao {
     List<Pricings> selectAll();
    void insert(Pricings pricings);
    Pricings selectByname(String name);
    void delete(Integer Id);
    Pricings selectById(Integer Id);
    void update(Pricings pricings);
    List<Pricings> selectBynameAndprices(Condition condition);
}
