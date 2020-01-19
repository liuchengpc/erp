package com.apatech.mapper;

import com.apatech.domain.Payables_detail;

public interface Payables_detailMapper {
    int deleteByPrimaryKey(String paydetailId);

    int insert(Payables_detail record);

    int insertSelective(Payables_detail record);

    Payables_detail selectByPrimaryKey(String paydetailId);

    int updateByPrimaryKeySelective(Payables_detail record);

    int updateByPrimaryKey(Payables_detail record);
}