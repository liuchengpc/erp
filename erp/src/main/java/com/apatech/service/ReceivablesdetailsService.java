package com.apatech.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	
	public PageInfo<Receivablesdetails> selectAllpagebyidlc(Integer pageNum,Integer pageSize,String receivablesbillId){
		System.out.println("分页的集合："+dao.selectAllpagebyidlc(receivablesbillId).toString());
		
		PageHelper.startPage(pageNum, pageSize);
		List<Receivablesdetails> list=dao.selectAllpagebyidlc(receivablesbillId);
		
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
    public int deleteByzbidlc(String receivablesbillId){
    	return dao.deleteByzbidlc(receivablesbillId);
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