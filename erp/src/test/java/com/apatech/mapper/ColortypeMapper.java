package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Colortype;

public interface ColortypeMapper {
    int deleteByPrimaryKey(Integer colortypeid);

    int insert(Colortype record);

    int insertSelective(Colortype record);

    Colortype selectByPrimaryKey(Integer colortypeid);
    
    @Select("select * from Colortype")
    List<Colortype> selectAll();
    
   

    int updateByPrimaryKeySelective(Colortype record);

    int updateByPrimaryKey(Colortype record);
}