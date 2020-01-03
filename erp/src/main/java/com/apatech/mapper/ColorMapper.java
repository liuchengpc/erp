package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Color;

public interface ColorMapper {
	List<Color> queryColorByColorTypeID(Integer colortypeid);
	
    int deleteByPrimaryKey(Integer colorid);

    int insert(Color record);

    int insertSelective(Color record);

    Color selectByPrimaryKey(Integer colorid);
    
    @Select("select * from Color")
    List<Color> selectAll();

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
}