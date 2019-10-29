package cn.zb.mapper;

import cn.zb.entity.Modules;
import cn.zb.entity.Operations;

import java.util.List;

public interface OperationMapper {
    List<Operations> selectAll();
}
