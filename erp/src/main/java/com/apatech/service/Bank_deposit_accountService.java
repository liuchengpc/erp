package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Bank_deposit_account;
import com.apatech.domain.Bank_deposit_account;
import com.apatech.mapper.Bank_deposit_accountMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Bank_deposit_accountService {
	@Autowired
	private Bank_deposit_accountMapper dao;
	
	public PageInfo<Bank_deposit_account> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Bank_deposit_account> list=dao.selectAll();

    	PageInfo<Bank_deposit_account> page=new PageInfo<Bank_deposit_account>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String adaId){
    	return dao.deleteByPrimaryKey(adaId);
    }

    public int insert(Bank_deposit_account record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Bank_deposit_account record){
    	return dao.insertSelective(record);
    }

    public Bank_deposit_account selectByPrimaryKey(String adaId){
    	return dao.selectByPrimaryKey(adaId);
    }

    public int updateByPrimaryKeySelective(Bank_deposit_account record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Bank_deposit_account record){
    	return dao.updateByPrimaryKey(record);
    }
}