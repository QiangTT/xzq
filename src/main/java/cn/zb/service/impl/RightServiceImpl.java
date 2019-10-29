package cn.zb.service.impl;

import cn.zb.entity.Modules;
import cn.zb.entity.Operations;
import cn.zb.entity.Rights;
import cn.zb.mapper.ModuleMapper;
import cn.zb.mapper.OperationMapper;
import cn.zb.mapper.RightMapper;
import cn.zb.service.RightService;
import cn.zb.utils.PageSupport;
import cn.zb.vo.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RightServiceImpl implements RightService {
    @Autowired
    private RightMapper rightMapper;
    @Autowired
    private OperationMapper operationMapper;
    @Autowired
    private ModuleMapper moduleMapper;
    @Override
    public Map<String,Object> findByCondition(Condition con) {
        Map<String,Object> map = new HashMap<>();
        PageSupport pageSupport = new PageSupport();
        pageSupport.setPageNo(con.getPageNo());
        pageSupport.setPageSize(con.getPageSize());
        pageSupport.setTotalCont(rightMapper.selectCount(con));
        map.put("pageSupport",pageSupport);
        map.put("rightList",rightMapper.selectByCondition(con));
        return map;
    }

    @Override
    public void modify(Rights rights) {
        rightMapper.update(rights);
    }

    @Override
    public Map<String, Object> findById(Integer id) {
        Map<String,Object> map = new HashMap<>();
        //根据id查询权限
        Rights rights = rightMapper.selectById(id);
        //查询所有模块
        List<Modules> modulesList = moduleMapper.selectAll();
        //查询所有操作
        List<Operations> operationsList = operationMapper.selectAll();
        map.put("right",rights);
        map.put("moduleList",modulesList);
        map.put("operationList",operationsList);
        return map;
    }

    @Override
    public List<Rights> findAll() {
        return rightMapper.selectAll();
    }
}
