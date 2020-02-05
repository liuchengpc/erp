package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Currency;
import com.apatech.domain.Currency;
import com.apatech.domain.Currency;
import com.apatech.mapper.CurrencyMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CurrencyService {
	@Autowired
	private CurrencyMapper dao;
	
	//查询所有货币
	public List<Currency> selectAll(){
		return dao.selectAll();
	}
	
	public PageInfo<Currency> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Currency> list=dao.selectAll();

    	PageInfo<Currency> page=new PageInfo<Currency>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String currencyId){
    	return dao.deleteByPrimaryKey(currencyId);
    }

    public int insert(Currency record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Currency record){
    	return dao.insertSelective(record);
    }

    public Currency selectByPrimaryKey(String currencyId){
    	return dao.selectByPrimaryKey(currencyId);
    }

    public int updateByPrimaryKeySelective(Currency record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Currency record){
    	return dao.updateByPrimaryKey(record);
    }
}