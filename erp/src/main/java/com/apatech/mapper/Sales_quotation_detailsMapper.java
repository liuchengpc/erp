package com.apatech.mapper;

import com.apatech.domain.Sales_quotation_details;

public interface Sales_quotation_detailsMapper {
    int deleteByPrimaryKey(String sqdId);

    int insert(Sales_quotation_details record);

    int insertSelective(Sales_quotation_details record);

    Sales_quotation_details selectByPrimaryKey(String sqdId);

    int updateByPrimaryKeySelective(Sales_quotation_details record);

    int updateByPrimaryKey(Sales_quotation_details record);
}