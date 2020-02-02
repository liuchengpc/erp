package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Payablesmain;
import com.apatech.domain.Payablesmain;
import com.apatech.domain.Payablesmain;
import com.apatech.mapper.PayablesmainMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PayablesmainService {
	@Autowired
	private PayablesmainMapper dao;
	
	public PageInfo<Payablesmain> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Payablesmain> list=dao.selectAll();

    	PageInfo<Payablesmain> page=new PageInfo<Payablesmain>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String payablesmainId){
    	return dao.deleteByPrimaryKey(payablesmainId);
    }

    public int insert(Payablesmain record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Payablesmain record){
    	return dao.insertSelective(record);
    }

    public Payablesmain selectByPrimaryKey(String payablesmainId){
    	return dao.selectByPrimaryKey(payablesmainId);
    }

    public int updateByPrimaryKeySelective(Payablesmain record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Payablesmain record){
    	return dao.updateByPrimaryKey(record);
    }
}