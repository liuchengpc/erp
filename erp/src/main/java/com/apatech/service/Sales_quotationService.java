package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_quotation;
import com.apatech.domain.Team;
import com.apatech.domain.Sales_quotation;
import com.apatech.domain.Sales_quotation;
import com.apatech.mapper.Sales_quotationMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Sales_quotationService {
	@Autowired
	private Sales_quotationMapper dao;
	/*
	 * 分页处理
	 * 
	 */
	public PageInfo<Sales_quotation> selectAllpage(Integer pageNum){
    	PageHelper.startPage(pageNum,1);
    	List<Sales_quotation> list=dao.selectAllpage();
//    	System.out.println("分页的集合："+dao.selectAll().toString());
    	PageInfo<Sales_quotation> page=new PageInfo<Sales_quotation>(list);
//    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	
	public PageInfo<Sales_quotation> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Sales_quotation> list=dao.selectAll();

    	PageInfo<Sales_quotation> page=new PageInfo<Sales_quotation>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String sqId){
    	return dao.deleteByPrimaryKey(sqId);
    }

    public int insert(Sales_quotation record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_quotation record){
    	return dao.insertSelective(record);
    }

    public Sales_quotation selectByPrimaryKey(String sqId){
    	return dao.selectByPrimaryKey(sqId);
    }

    public int updateByPrimaryKeySelective(Sales_quotation record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_quotation record){
    	return dao.updateByPrimaryKey(record);
    }
}