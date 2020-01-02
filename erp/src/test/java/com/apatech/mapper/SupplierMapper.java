package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Commodity;
import com.apatech.domain.Supplier;

public interface SupplierMapper {
    int deleteByPrimaryKey(Integer supplierid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer supplierid);
    
    @Select("select * from Supplier")
    List<Supplier> selectAll();
    
    List<Supplier> selectAll2(@Param("province")String province,@Param("city")String city,@Param("region")String region, @Param("selectqb")String selectqb);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}