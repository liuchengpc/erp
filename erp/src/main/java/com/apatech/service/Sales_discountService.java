package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_discount;
import com.apatech.domain.Sales_discount;
import com.apatech.domain.Sales_discount;
import com.apatech.mapper.Sales_discountMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Sales_discountService {
	@Autowired
	private Sales_discountMapper dao;
	
	public PageInfo<Sales_discount> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Sales_discount> list=dao.selectAll();

    	PageInfo<Sales_discount> page=new PageInfo<Sales_discount>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String sdId){
    	return dao.deleteByPrimaryKey(sdId);
    }

    public int insert(Sales_discount record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_discount record){
    	return dao.insertSelective(record);
    }

    public Sales_discount selectByPrimaryKey(String sdId){
    	return dao.selectByPrimaryKey(sdId);
    }

    public int updateByPrimaryKeySelective(Sales_discount record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_discount record){
    	return dao.updateByPrimaryKey(record);
    }
}