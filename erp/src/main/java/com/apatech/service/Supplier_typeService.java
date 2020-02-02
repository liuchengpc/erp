package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Supplier_type;
import com.apatech.domain.Supplier_type;
import com.apatech.domain.Supplier_type;
import com.apatech.mapper.Supplier_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Supplier_typeService {
	@Autowired
	private Supplier_typeMapper dao;
	
	public PageInfo<Supplier_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Supplier_type> list=dao.selectAll();

    	PageInfo<Supplier_type> page=new PageInfo<Supplier_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String stId){
    	return dao.deleteByPrimaryKey(stId);
    }

    public int insert(Supplier_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Supplier_type record){
    	return dao.insertSelective(record);
    }

    public Supplier_type selectByPrimaryKey(String stId){
    	return dao.selectByPrimaryKey(stId);
    }

    public int updateByPrimaryKeySelective(Supplier_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Supplier_type record){
    	return dao.updateByPrimaryKey(record);
    }
}