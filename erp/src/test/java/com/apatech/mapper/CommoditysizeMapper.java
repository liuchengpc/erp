package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Commoditysize;

public interface CommoditysizeMapper {
    int deleteByPrimaryKey(Integer commoditysizeid);

    int insert(Commoditysize record);

    int insertSelective(Commoditysize record);

    Commoditysize selectByPrimaryKey(Integer commoditysizeid);
    
    @Select("select * from Commoditysize")
    List<Commoditysize> selectAll();

    int updateByPrimaryKeySelective(Commoditysize record);

    int updateByPrimaryKey(Commoditysize record);
}