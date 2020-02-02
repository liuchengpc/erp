package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Tax_items;
import com.apatech.domain.Tax_items;
import com.apatech.domain.Tax_items;
import com.apatech.mapper.Tax_itemsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Tax_itemsService {
	@Autowired
	private Tax_itemsMapper dao;
	
	public PageInfo<Tax_items> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Tax_items> list=dao.selectAll();

    	PageInfo<Tax_items> page=new PageInfo<Tax_items>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String tiId){
    	return dao.deleteByPrimaryKey(tiId);
    }

    public int insert(Tax_items record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Tax_items record){
    	return dao.insertSelective(record);
    }

    public Tax_items selectByPrimaryKey(String tiId){
    	return dao.selectByPrimaryKey(tiId);
    }

    public int updateByPrimaryKeySelective(Tax_items record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Tax_items record){
    	return dao.updateByPrimaryKey(record);
    }
}