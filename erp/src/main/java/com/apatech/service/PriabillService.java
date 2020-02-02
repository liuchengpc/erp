package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Priabill;
import com.apatech.domain.Priabill;
import com.apatech.mapper.PriabillMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PriabillService {
	@Autowired
	private PriabillMapper dao;
	
	public PageInfo<Priabill> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Priabill> list=dao.selectAll();

    	PageInfo<Priabill> page=new PageInfo<Priabill>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String priabillId){
    	return dao.deleteByPrimaryKey(priabillId);
    }

    public int insert(Priabill record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Priabill record){
    	return dao.insertSelective(record);
    }

    public Priabill selectByPrimaryKey(String priabillId){
    	return dao.selectByPrimaryKey(priabillId);
    }

    public int updateByPrimaryKeySelective(Priabill record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Priabill record){
    	return dao.updateByPrimaryKey(record);
    }
}