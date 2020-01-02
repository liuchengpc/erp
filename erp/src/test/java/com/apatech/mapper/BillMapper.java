package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Bill;

public interface BillMapper {
    int deleteByPrimaryKey(String billid);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(String billid);
    
    @Select("select * from Bill")
    List<Bill> selectAll();

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}