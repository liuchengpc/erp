package com.apatech.mapper;

import com.apatech.domain.Customer_demand_products;

public interface Customer_demand_productsMapper {
    int deleteByPrimaryKey(String cdpId);

    int insert(Customer_demand_products record);

    int insertSelective(Customer_demand_products record);

    Customer_demand_products selectByPrimaryKey(String cdpId);

    int updateByPrimaryKeySelective(Customer_demand_products record);

    int updateByPrimaryKey(Customer_demand_products record);
}