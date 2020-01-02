package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Detail;

public interface DetailMapper {
    int deleteByPrimaryKey(Integer detailid);
    
    @Delete("delete from detail where billid = #{billid}")
    int deleteByid(String billid);

    int insert(Detail record);

    int insertSelective(Detail record);
    
    int insertSelective2(List<Detail> record);

    Detail selectByPrimaryKey(Integer detailid);
    
    @Select("select * from Detail")
    List<Detail> selectAll();
    
    @Select("SELECT * FROM Detail a\r\n" + 
    		"INNER JOIN bill d ON a.billID=d.billID\r\n" + 
    		"INNER JOIN commoditydetail b ON a.commodityDetailID =b.commodityDetailID\r\n" + 
    		"INNER JOIN commodity c ON b.productCodeID=c.productCodeID\r\n" + 
    		"WHERE d.billID=#{billid}")
    List<Detail> selectAllByid( 
    		String billid//采购单ID
	);
    
    /**
     * 根据商品主表id查询
     * @return
     */
    @Select("SELECT * FROM supplier b \r\n" + 
    		"INNER JOIN bill e ON e.supplierID=b.supplierID\r\n" + 
    		"INNER JOIN users h ON h.userID=e.userID\r\n" + 
    		"INNER JOIN detail f ON f.billID=e.billID\r\n" + 
    		"INNER JOIN commoditydetail g ON g.commodityDetailID=f.commodityDetailID\r\n" + 
    		"WHERE f.billID=#{billid}")
    List<Detail> selectByid(String billid);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
}