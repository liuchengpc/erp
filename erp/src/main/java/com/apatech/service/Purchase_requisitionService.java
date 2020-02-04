package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_requisition;
import com.apatech.domain.Purchase_requisition;
import com.apatech.domain.Purchase_requisition;
import com.apatech.mapper.Purchase_requisitionMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Purchase_requisitionService {
	@Autowired
	private Purchase_requisitionMapper dao;
	
	public PageInfo<Purchase_requisition> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchase_requisition> list=dao.selectAll();

    	PageInfo<Purchase_requisition> page=new PageInfo<Purchase_requisition>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String prId){
    	return dao.deleteByPrimaryKey(prId);
    }

    public int insert(Purchase_requisition record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_requisition record){
    	return dao.insertSelective(record);
    }

    public Purchase_requisition selectByPrimaryKey(String prId){
    	return dao.selectByPrimaryKey(prId);
    }

    public int updateByPrimaryKeySelective(Purchase_requisition record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_requisition record){
    	return dao.updateByPrimaryKey(record);
    }
}