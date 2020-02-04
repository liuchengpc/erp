package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_quotation_details;
import com.apatech.domain.Sales_quotation_details;
import com.apatech.domain.Sales_quotation_details;
import com.apatech.mapper.Sales_quotation_detailsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Sales_quotation_detailsService {
	@Autowired
	private Sales_quotation_detailsMapper dao;
	
	public PageInfo<Sales_quotation_details> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Sales_quotation_details> list=dao.selectAll();

    	PageInfo<Sales_quotation_details> page=new PageInfo<Sales_quotation_details>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	public List<Sales_quotation_details> querybysqlid(String sqlId){
		return dao.querybysqlid(sqlId);
	}
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String sqdId){
    	return dao.deleteByPrimaryKey(sqdId);
    }

    public int insert(Sales_quotation_details record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_quotation_details record){
    	return dao.insertSelective(record);
    }

    public Sales_quotation_details selectByPrimaryKey(String sqdId){
    	return dao.selectByPrimaryKey(sqdId);
    }

    public int updateByPrimaryKeySelective(Sales_quotation_details record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_quotation_details record){
    	return dao.updateByPrimaryKey(record);
    }
}