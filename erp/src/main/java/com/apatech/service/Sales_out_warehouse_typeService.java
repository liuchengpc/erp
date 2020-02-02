package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_out_warehouse_type;
import com.apatech.domain.Sales_out_warehouse_type;
import com.apatech.domain.Sales_out_warehouse_type;
import com.apatech.mapper.Sales_out_warehouse_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Sales_out_warehouse_typeService {
	@Autowired
	private Sales_out_warehouse_typeMapper dao;
	
	public PageInfo<Sales_out_warehouse_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Sales_out_warehouse_type> list=dao.selectAll();

    	PageInfo<Sales_out_warehouse_type> page=new PageInfo<Sales_out_warehouse_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String sowtId){
    	return dao.deleteByPrimaryKey(sowtId);
    }

    public int insert(Sales_out_warehouse_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_out_warehouse_type record){
    	return dao.insertSelective(record);
    }

    public Sales_out_warehouse_type selectByPrimaryKey(String sowtId){
    	return dao.selectByPrimaryKey(sowtId);
    }

    public int updateByPrimaryKeySelective(Sales_out_warehouse_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_out_warehouse_type record){
    	return dao.updateByPrimaryKey(record);
    }
}