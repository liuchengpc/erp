package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Bank;
import com.apatech.domain.Bank;
import com.apatech.domain.Bank;
import com.apatech.mapper.BankMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class BankService {
	@Autowired
	private BankMapper dao;
	
	public PageInfo<Bank> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Bank> list=dao.selectAll();

    	PageInfo<Bank> page=new PageInfo<Bank>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String bankId){
    	return dao.deleteByPrimaryKey(bankId);
    }

    public int insert(Bank record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Bank record){
    	return dao.insertSelective(record);
    }

    public Bank selectByPrimaryKey(String bankId){
    	return dao.selectByPrimaryKey(bankId);
    }

    public int updateByPrimaryKeySelective(Bank record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Bank record){
    	return dao.updateByPrimaryKey(record);
    }
}