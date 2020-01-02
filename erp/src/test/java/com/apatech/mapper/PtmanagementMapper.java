package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Ptmanagement;

public interface PtmanagementMapper {
	List<Ptmanagement> queryByID(Integer privilegeTypeID);
	
    int deleteByPrimaryKey(Integer ptid);

    int insert(Ptmanagement record);

    int insertSelective(Ptmanagement record);

    Ptmanagement selectByPrimaryKey(Integer ptid);
    
    @Select("select * from Ptmanagement")
    List<Ptmanagement> selectAll();

    int updateByPrimaryKeySelective(Ptmanagement record);

    int updateByPrimaryKey(Ptmanagement record);
}