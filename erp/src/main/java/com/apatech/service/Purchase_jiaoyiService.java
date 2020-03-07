package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_jiaoyi;
import com.apatech.mapper.Purchase_jiaoyiMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional
public class Purchase_jiaoyiService {
	@Autowired
	private Purchase_jiaoyiMapper dao;
	
	 public PageInfo<Purchase_jiaoyi> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchase_jiaoyi> list=dao.selectAll();

    	PageInfo<Purchase_jiaoyi> page=new PageInfo<Purchase_jiaoyi>(list);
//	    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public PageInfo<Purchase_jiaoyi> selectAllpage(Integer pageNum,Integer pageSize,Purchase_jiaoyi jiaoyi){
	    	System.out.println("分页的集合："+dao.selectAllXz(jiaoyi).toString());
			 
	    	PageHelper.startPage(pageNum, pageSize);
	    	List<Purchase_jiaoyi> list=dao.selectAllXz(jiaoyi);

	    	PageInfo<Purchase_jiaoyi> page=new PageInfo<Purchase_jiaoyi>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
	    	return page;
	    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(Integer apId){
    	return dao.deleteByPrimaryKey(apId);    
    }
    
    public int deleteByPrimaryKey2(String jyCustom3){
    	return dao.deleteByPrimaryKey2(jyCustom3);    
    }
    public int deleteByPrimaryKey3(String jyNumber){
    	return dao.deleteByPrimaryKey3(jyNumber);    
    }

    public int insert(Purchase_jiaoyi record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_jiaoyi record){
    	return dao.insertSelective(record);
    }

    public Purchase_jiaoyi selectByPrimaryKey(Integer apId){
    	return dao.selectByPrimaryKey(apId);
    }

    public int updateByPrimaryKeySelective(Purchase_jiaoyi record){
    	return dao.updateByPrimaryKeySelective(record);
    }
  
    public int updateByPrimaryKey(Purchase_jiaoyi record){
    	return dao.updateByPrimaryKey(record);
    }
}