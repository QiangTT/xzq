package cn.zb.mapper;

import cn.zb.entity.Rights;
import cn.zb.vo.Condition;

import java.util.List;

public interface RightMapper {
    List<Rights> selectByCondition(Condition con);
    //分页总记录数
    int selectCount(Condition con);
    void update(Rights rights);

    Rights selectById(Integer id);

    List<Rights> selectAll();
}
