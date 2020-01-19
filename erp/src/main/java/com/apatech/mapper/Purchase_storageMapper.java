package com.apatech.mapper;

import com.apatech.domain.Purchase_storage;

public interface Purchase_storageMapper {
    int deleteByPrimaryKey(String psId);

    int insert(Purchase_storage record);

    int insertSelective(Purchase_storage record);

    Purchase_storage selectByPrimaryKey(String psId);

    int updateByPrimaryKeySelective(Purchase_storage record);

    int updateByPrimaryKey(Purchase_storage record);
}