package com.apatech.mapper;

import com.apatech.domain.Invoicetype;

public interface InvoicetypeMapper {
    int deleteByPrimaryKey(String invoicetypeId);

    int insert(Invoicetype record);

    int insertSelective(Invoicetype record);

    Invoicetype selectByPrimaryKey(String invoicetypeId);

    int updateByPrimaryKeySelective(Invoicetype record);

    int updateByPrimaryKey(Invoicetype record);
}