package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Commodity;
import com.apatech.domain.Commoditydetail;
import com.apatech.mapper.CommoditydetailMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CommoditydetailService {
	@Autowired
	private CommoditydetailMapper dao;

	public List<Commoditydetail> queryCommodityDetailByProductCodeID(String commodity) {
		
		return dao.queryCommodityDetailByProductCodeID(commodity);
	}
	
	public List<Commoditydetail> queryCommodityDetailByCashregister(Commoditydetail c){
		
		return dao.queryCommodityDetailByCashregister(c);
	}
	
    public int deleteByPrimaryKey(String commoditydetailid) {
    	return dao.deleteByPrimaryKey(commoditydetailid);
    }
    public int deleteByPrimaryKey2(String productCodeID) {
    	return dao.deleteByPrimaryKey2(productCodeID);
    }

    public int insert(Commoditydetail record) {
    	return dao.insert(record);
    }


    public int insertSelective(Commoditydetail record) {
    	return dao.insertSelective(record);
    }

    public List<Commoditydetail> selectAll2(Integer commoditytypeid,String selectqb){
    	List<Commoditydetail> li=dao.selectAll2(commoditytypeid, selectqb);
    	
    	return li;
    }

    public Commoditydetail selectByPrimaryKey(String commoditydetailid) {
    	return dao.selectByPrimaryKey(commoditydetailid);
    }
  
    public List<Commoditydetail> selectByPrimaryKey2(String commoditydetailid) {
    	return dao.selectByPrimaryKey2(commoditydetailid);
    }
    public List<Commoditydetail> selectByPrimaryKey3(String productCodeID) {
    	return dao.selectByPrimaryKey3(productCodeID);
    }
    
    public List<Commoditydetail> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Commoditydetail> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Commoditydetail> list=dao.selectAll();
    	PageInfo<Commoditydetail> page=new PageInfo<Commoditydetail>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Commoditydetail record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Commoditydetail record) {
    	return dao.updateByPrimaryKey(record);
    }

}