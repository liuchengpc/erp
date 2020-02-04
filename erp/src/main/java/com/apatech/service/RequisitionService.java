package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Requisition;
import com.apatech.domain.Requisition;
import com.apatech.domain.Requisition;
import com.apatech.mapper.RequisitionMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class RequisitionService {
	@Autowired
	private RequisitionMapper dao;
	
	public PageInfo<Requisition> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Requisition> list=dao.selectAll();

    	PageInfo<Requisition> page=new PageInfo<Requisition>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String requisitionId){
    	return dao.deleteByPrimaryKey(requisitionId);
    }

    public int insert(Requisition record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Requisition record){
    	return dao.insertSelective(record);
    }

    public Requisition selectByPrimaryKey(String requisitionId){
    	return dao.selectByPrimaryKey(requisitionId);
    }

    public int updateByPrimaryKeySelective(Requisition record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Requisition record){
    	return dao.updateByPrimaryKey(record);
    }
}