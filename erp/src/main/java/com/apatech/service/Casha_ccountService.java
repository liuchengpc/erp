package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Casha_ccount;
import com.apatech.domain.Casha_ccount;
import com.apatech.domain.Casha_ccount;
import com.apatech.mapper.Casha_ccountMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Casha_ccountService {
	@Autowired
	private Casha_ccountMapper dao;
	
	public PageInfo<Casha_ccount> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Casha_ccount> list=dao.selectAll();

    	PageInfo<Casha_ccount> page=new PageInfo<Casha_ccount>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String ccId){
    	return dao.deleteByPrimaryKey(ccId);
    }

    public int insert(Casha_ccount record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Casha_ccount record){
    	return dao.insertSelective(record);
    }

    public Casha_ccount selectByPrimaryKey(String ccId){
    	return dao.selectByPrimaryKey(ccId);
    }

    public int updateByPrimaryKeySelective(Casha_ccount record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Casha_ccount record){
    	return dao.updateByPrimaryKey(record);
    }
}