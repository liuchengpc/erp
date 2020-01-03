package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Commoditytype;

public interface CommoditytypeMapper {
	List<Commoditytype> queryCommodityType();
	
    int deleteByPrimaryKey(Integer commoditytypeid);

    int insert(Commoditytype record);

    int insertSelective(Commoditytype record);

    Commoditytype selectByPrimaryKey(Integer commoditytypeid);
    
    @Select("select * from Commoditytype")
    List<Commoditytype> selectAll();

    int updateByPrimaryKeySelective(Commoditytype record);

    int updateByPrimaryKey(Commoditytype record);
}