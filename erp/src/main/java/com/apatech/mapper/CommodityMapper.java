package com.apatech.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.format.annotation.DateTimeFormat;

import com.apatech.domain.Commodity;
import com.apatech.domain.Commoditydetail;

public interface CommodityMapper {
	List<Commodity> queryCommodityXZ(Commodity c);
	
    int deleteByPrimaryKey(String productcodeid);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(String productcodeid);
    
    List<Commodity> selectAllBydpid(String supplierid);
    
    @Select("select * from Commodity")
    List<Commodity> selectAll();
    
   
    List<Commodity> selectAll2(@Param("commoditytypeid")Integer commoditytypeid,@Param("selectqb")String selectqb);
    
    
    List<Commodity> selectAll3(
    		@Param("shopid")Integer shopid,//店铺
    		@Param("oldtime")Date oldtime,//开始时间
    		@Param("newtime")Date newtime,//结束时间
    		@Param("selectqb")String selectqb//查找
	);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}