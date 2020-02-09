package com.apatech.service;

import java.util.List;

import com.apatech.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_requisition_type;
import com.apatech.domain.Purchase_requisition_type;
import com.apatech.domain.Purchase_requisition_type;
import com.apatech.mapper.Purchase_requisition_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

@Service
@Transactional
public class Purchase_requisition_typeService {
	@Autowired
	private Purchase_requisition_typeMapper dao;
	
	public PageInfo<Purchase_requisition_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchase_requisition_type> list=dao.selectAll();

    	PageInfo<Purchase_requisition_type> page=new PageInfo<Purchase_requisition_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String prtId){
    	return dao.deleteByPrimaryKey(prtId);
    }

    public int insert(Purchase_requisition_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_requisition_type record){
    	return dao.insertSelective(record);
    }

    public Purchase_requisition_type selectByPrimaryKey(String prtId){
    	return dao.selectByPrimaryKey(prtId);
    }

    public int updateByPrimaryKeySelective(Purchase_requisition_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_requisition_type record){
    	return dao.updateByPrimaryKey(record);
    }

//    public List<Team> selectAll(){
//        return dao.selectAll();
//    }
}