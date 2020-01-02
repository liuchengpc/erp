package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Commodity;
import com.apatech.domain.Commoditydetail;

public interface CommoditydetailMapper {
	List<Commoditydetail> queryCommodityDetailByProductCodeID(String commodity);
	
	List<Commoditydetail> queryCommodityDetailByCashregister(Commoditydetail c);
	
    int deleteByPrimaryKey(String commoditydetailid);
    int deleteByPrimaryKey2(String productCodeID);

    int insert(Commoditydetail record);

    int insertSelective(Commoditydetail record);

    Commoditydetail selectByPrimaryKey(String commoditydetailid);
    
    List<Commoditydetail> selectByPrimaryKey2(String commoditydetailid);
    
    List<Commoditydetail> selectByPrimaryKey3(String productCodeID);
    
    @Select("select * from Commoditydetail")
    List<Commoditydetail> selectAll();
    
    /**
     * 根据商品主表id查询
     * @return
     */
    @Select("SELECT * FROM commodity a\r\n" + 
    		"INNER JOIN commoditydetail d ON a.`productCodeID`=d.`productCodeID`\r\n" + 
    		"INNER JOIN color e ON d.`colorID`=e.`colorID`\r\n" + 
    		"INNER JOIN commoditysize f ON d.`commoditySizeID`=f.`commoditySizeID`\r\n" + 
    		"WHERE d.`productCodeID`=#{productcodeid}")
    List<Commodity> selectByid(String productcodeid);
    

    List<Commoditydetail> selectAll2(@Param("commoditytypeid")Integer commoditytypeid,@Param("selectqb")String selectqb);

    int updateByPrimaryKeySelective(Commoditydetail record);

    int updateByPrimaryKey(Commoditydetail record);
}