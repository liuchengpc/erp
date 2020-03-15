package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchasing_order;
import com.apatech.mapper.Purchasing_orderMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Purchasing_orderService {
    
    @Autowired
   	private Purchasing_orderMapper dao;
   	
   	public PageInfo<Purchasing_order> selectAllpage(Integer pageNum,Integer pageSize){
       	System.out.println("分页的集合："+dao.selectAll2().toString());
   		 
       	PageHelper.startPage(pageNum, pageSize);
       	List<Purchasing_order> list=dao.selectAll2();

       	PageInfo<Purchasing_order> page=new PageInfo<Purchasing_order>(list);
//   		    	System.out.println("分页的集合2："+page.getList().toString());
       	return page;
   }
   	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
	   }
	
	   public int deleteByPrimaryKey(String poId){
	   	return dao.deleteByPrimaryKey(poId);
	   }
	
	   public int insert(Purchasing_order record){
	   	return dao.insert(record);
	   }
	   
	   public int insertSelective(Purchasing_order record){
	   	return dao.insertSelective(record);
	   }
	
	   public Purchasing_order selectByPrimaryKey(String poId){
	   	return dao.selectByPrimaryKey(poId);
	   }
	
	   public int updateByPrimaryKeySelective(Purchasing_order record){
	   	return dao.updateByPrimaryKeySelective(record);
	   }
	   
	   public int updateByPrimaryKeySelective22(Purchasing_order record){
	   	return dao.updateByPrimaryKeySelective22(record);
	   }
	
	   public int updateByPrimaryKey(Purchasing_order record){
	   	return dao.updateByPrimaryKey(record);
	   }
}