package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Invoice_type;
import com.apatech.domain.Invoice_type;
import com.apatech.domain.Invoice_type;
import com.apatech.mapper.Invoice_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Invoice_typeService {
	@Autowired
	private Invoice_typeMapper dao;
	
	public PageInfo<Invoice_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Invoice_type> list=dao.selectAll();

    	PageInfo<Invoice_type> page=new PageInfo<Invoice_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String itId){
    	return dao.deleteByPrimaryKey(itId);
    }

    public int insert(Invoice_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Invoice_type record){
    	return dao.insertSelective(record);
    }

    public Invoice_type selectByPrimaryKey(String itId){
    	return dao.selectByPrimaryKey(itId);
    }

    public int updateByPrimaryKeySelective(Invoice_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Invoice_type record){
    	return dao.updateByPrimaryKey(record);
    }
}