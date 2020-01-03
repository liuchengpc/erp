package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Cashregisterdetail;
import com.apatech.domain.Detail;

public interface CashregisterdetailMapper {
    int deleteByid(String cashregisterid);
	
	List<Cashregisterdetail> queryByDetail(String cashregisterid);
	
	int insertCashregisterDetail(Cashregisterdetail cs);
	
    int deleteByPrimaryKey(Integer cashregisterdetailid);

    int insert(Cashregisterdetail record);

    int insertSelective(Cashregisterdetail record);

    Cashregisterdetail selectByPrimaryKey(Integer cashregisterdetailid);
    
    /**
     * 主详详查询
     * @param cashregisterdetailid
     * @return
     */
    List<Cashregisterdetail> selectByCashregisterId(String cashregisterid);
    /**
     * 根据订单主表id查询
     * @return
     */
    @Select("SELECT  * FROM cashregisterdetail a\r\n" + 
    		"INNER JOIN cashregister b ON a.cashRegisterID=b.ashRegisterID\r\n" + 
    		"INNER JOIN commoditydetail c ON a.commodityDetailID=c.commodityDetailID\r\n" + 
    		"INNER JOIN commoditydetail d ON  a.commodityDetailID=d.commodityDetailID\r\n" + 
    		"INNER JOIN commodity e ON e.productCodeID=d.productCodeID\r\n"+ 
    		"INNER JOIN color f ON f.colorID =d.colorID\r\n" + 
    		"INNER JOIN commoditysize g ON g.commoditySizeID=d.commoditySizeID " + 
    		"WHERE a.cashRegisterID=#{cashregisterid}")
    List<Cashregisterdetail> selectByid(String cashregisterid);
  
    /**
     * 根据商品详表id查询订单
     * @return
     */
    @Select("SELECT  *,d.count as spxqcount FROM cashregisterdetail a\r\n" + 
    		"INNER JOIN cashregister b ON a.cashRegisterID=b.ashRegisterID\r\n" + 
    		"INNER JOIN commoditydetail d ON  a.commodityDetailID=d.commodityDetailID\r\n" + 
    		"INNER JOIN commodity e ON e.productCodeID=d.productCodeID\r\n"+ 
    		"INNER JOIN color f ON f.colorID =d.colorID\r\n" + 
    		"INNER JOIN commoditysize g ON g.commoditySizeID=d.commoditySizeID " + 
    		"WHERE a.commoditydetailid=#{commoditydetailid}")
    List<Cashregisterdetail> selectByid2(String commoditydetailid);
    
    @Select("select * from Cashregisterdetail")
    List<Cashregisterdetail> selectAll();

    int updateByPrimaryKeySelective(Cashregisterdetail record);

    int updateByPrimaryKey(Cashregisterdetail record);
}