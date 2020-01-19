package com.apatech.mapper;

import com.apatech.domain.Priadetails;

public interface PriadetailsMapper {
    int deleteByPrimaryKey(String priadetailsId);

    int insert(Priadetails record);

    int insertSelective(Priadetails record);

    Priadetails selectByPrimaryKey(String priadetailsId);

    int updateByPrimaryKeySelective(Priadetails record);

    int updateByPrimaryKey(Priadetails record);
}