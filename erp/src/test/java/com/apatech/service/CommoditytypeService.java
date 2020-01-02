package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Commoditytype;
import com.apatech.mapper.CommoditytypeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CommoditytypeService {
	@Autowired
	private CommoditytypeMapper dao;

	public PageInfo<Commoditytype> queryCommodityType(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<Commoditytype> list = dao.queryCommodityType();
		PageInfo<Commoditytype> page = new PageInfo<Commoditytype>(list);
		return page;
	}
	
    public int deleteByPrimaryKey(Integer commoditytypeid) {
    	return dao.deleteByPrimaryKey(commoditytypeid);
    }

    public int insert(Commoditytype record) {
    	return dao.insert(record);
    }


    public int insertSelective(Commoditytype record) {
    	return dao.insertSelective(record);
    }


    public Commoditytype selectByPrimaryKey(Integer commoditytypeid) {
    	return dao.selectByPrimaryKey(commoditytypeid);
    }
    
    public List<Commoditytype> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Commoditytype> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Commoditytype> list=dao.selectAll();
    	PageInfo<Commoditytype> page=new PageInfo<Commoditytype>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Commoditytype record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Commoditytype record) {
    	return dao.updateByPrimaryKey(record);
    }

}