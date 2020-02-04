package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Collection_term;
import com.apatech.domain.Collection_term;
import com.apatech.domain.Collection_term;
import com.apatech.mapper.Collection_termMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Collection_termService {
	@Autowired
	private Collection_termMapper dao;
	
	public PageInfo<Collection_term> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Collection_term> list=dao.selectAll();

    	PageInfo<Collection_term> page=new PageInfo<Collection_term>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String coteId){
    	return dao.deleteByPrimaryKey(coteId);
    }

    public int insert(Collection_term record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Collection_term record){
    	return dao.insertSelective(record);
    }

    public Collection_term selectByPrimaryKey(String coteId){
    	return dao.selectByPrimaryKey(coteId);
    }

    public int updateByPrimaryKeySelective(Collection_term record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Collection_term record){
    	return dao.updateByPrimaryKey(record);
    }
}