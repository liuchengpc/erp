package com.apatech.mapper;

import com.apatech.domain.Customer_grade;

public interface Customer_gradeMapper {
    int deleteByPrimaryKey(String cgId);

    int insert(Customer_grade record);

    int insertSelective(Customer_grade record);

    Customer_grade selectByPrimaryKey(String cgId);

    int updateByPrimaryKeySelective(Customer_grade record);

    int updateByPrimaryKey(Customer_grade record);
}