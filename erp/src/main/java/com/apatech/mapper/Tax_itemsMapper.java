package com.apatech.mapper;

import com.apatech.domain.Tax_items;

public interface Tax_itemsMapper {
    int deleteByPrimaryKey(String tiId);

    int insert(Tax_items record);

    int insertSelective(Tax_items record);

    Tax_items selectByPrimaryKey(String tiId);

    int updateByPrimaryKeySelective(Tax_items record);

    int updateByPrimaryKey(Tax_items record);
}