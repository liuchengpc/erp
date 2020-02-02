package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Receivablesdetails;
import com.apatech.domain.Receivablesdetails;
import com.apatech.domain.Receivablesdetails;
import com.apatech.mapper.ReceivablesdetailsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ReceivablesdetailsService {
	@Autowired
	private ReceivablesdetailsMapper dao;
	
	public PageInfo<Receivablesdetails> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Receivablesdetails> list=dao.selectAll();

    	PageInfo<Receivablesdetails> page=new PageInfo<Receivablesdetails>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String recedetailId){
    	return dao.deleteByPrimaryKey(recedetailId);
    }

    public int insert(Receivablesdetails record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Receivablesdetails record){
    	return dao.insertSelective(record);
    }

    public Receivablesdetails selectByPrimaryKey(String recedetailId){
    	return dao.selectByPrimaryKey(recedetailId);
    }

    public int updateByPrimaryKeySelective(Receivablesdetails record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Receivablesdetails record){
    	return dao.updateByPrimaryKey(record);
    }
}