package com.apatech.mapper;

import com.apatech.domain.Sales_quotation;

public interface Sales_quotationMapper {
    int deleteByPrimaryKey(String sqId);

    int insert(Sales_quotation record);

    int insertSelective(Sales_quotation record);

    Sales_quotation selectByPrimaryKey(String sqId);

    int updateByPrimaryKeySelective(Sales_quotation record);

    int updateByPrimaryKey(Sales_quotation record);
}