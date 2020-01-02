package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Integral;

public interface IntegralMapper {
	Integral queryByIntegral();
	
    int deleteByPrimaryKey(Integer integralid);

    int insert(Integral record);

    int insertSelective(Integral record);

    Integral selectByPrimaryKey(Integer integralid);
    
    @Select("select * from Integral")
    List<Integral> selectAll();

    int updateByPrimaryKeySelective(Integral record);

    int updateByPrimaryKey(Integral record);
}