package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_order_type;
import com.apatech.domain.Sales_order_type;
import com.apatech.domain.Sales_order_type;
import com.apatech.mapper.Sales_order_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Sales_order_typeService {
	@Autowired
	private Sales_order_typeMapper dao;
	
	public PageInfo<Sales_order_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Sales_order_type> list=dao.selectAll();

    	PageInfo<Sales_order_type> page=new PageInfo<Sales_order_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String sdId){
    	return dao.deleteByPrimaryKey(sdId);
    }

    public int insert(Sales_order_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_order_type record){
    	return dao.insertSelective(record);
    }

    public Sales_order_type selectByPrimaryKey(String sdId){
    	return dao.selectByPrimaryKey(sdId);
    }

    public int updateByPrimaryKeySelective(Sales_order_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_order_type record){
    	return dao.updateByPrimaryKey(record);
    }
}