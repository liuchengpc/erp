package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_discount;
import com.apatech.domain.Purchase_discount;
import com.apatech.domain.Purchase_discount;
import com.apatech.mapper.Purchase_discountMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Purchase_discountService {
	@Autowired
	private Purchase_discountMapper dao;
	
	public PageInfo<Purchase_discount> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchase_discount> list=dao.selectAll();

    	PageInfo<Purchase_discount> page=new PageInfo<Purchase_discount>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String pdId){
    	return dao.deleteByPrimaryKey(pdId);
    }

    public int insert(Purchase_discount record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_discount record){
    	return dao.insertSelective(record);
    }

    public Purchase_discount selectByPrimaryKey(String pdId){
    	return dao.selectByPrimaryKey(pdId);
    }

    public int updateByPrimaryKeySelective(Purchase_discount record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_discount record){
    	return dao.updateByPrimaryKey(record);
    }
}