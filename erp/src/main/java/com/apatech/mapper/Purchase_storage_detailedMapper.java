package com.apatech.mapper;

import com.apatech.domain.Purchase_storage_detailed;

public interface Purchase_storage_detailedMapper {
    int deleteByPrimaryKey(String psdId);

    int insert(Purchase_storage_detailed record);

    int insertSelective(Purchase_storage_detailed record);

    Purchase_storage_detailed selectByPrimaryKey(String psdId);

    int updateByPrimaryKeySelective(Purchase_storage_detailed record);

    int updateByPrimaryKey(Purchase_storage_detailed record);
}