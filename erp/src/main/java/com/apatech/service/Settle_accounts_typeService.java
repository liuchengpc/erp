package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Settle_accounts_type;
import com.apatech.domain.Settle_accounts_type;
import com.apatech.mapper.Settle_accounts_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Settle_accounts_typeService {
	@Autowired
	private Settle_accounts_typeMapper dao;
	
	public PageInfo<Settle_accounts_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Settle_accounts_type> list=dao.selectAll();

    	PageInfo<Settle_accounts_type> page=new PageInfo<Settle_accounts_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String satId){
    	return dao.deleteByPrimaryKey(satId);
    }

    public int insert(Settle_accounts_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Settle_accounts_type record){
    	return dao.insertSelective(record);
    }

    public Settle_accounts_type selectByPrimaryKey(String satId){
    	return dao.selectByPrimaryKey(satId);
    }

    public int updateByPrimaryKeySelective(Settle_accounts_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Settle_accounts_type record){
    	return dao.updateByPrimaryKey(record);
    }
}