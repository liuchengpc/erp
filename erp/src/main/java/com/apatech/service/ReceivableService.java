package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Receivable;
import com.apatech.domain.Receivable;
import com.apatech.domain.Receivable;
import com.apatech.mapper.ReceivableMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ReceivableService {
	@Autowired
	private ReceivableMapper dao;
	
	public PageInfo<Receivable> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Receivable> list=dao.selectAll();

    	PageInfo<Receivable> page=new PageInfo<Receivable>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	
	
	public PageInfo<Receivable> selectAllpagelc(Integer pageNum,Integer pageSize,String payablesCustom2){
		System.out.println("分页的集合："+dao.selectAll().toString());
		
		PageHelper.startPage(pageNum, pageSize);
		List<Receivable> list=dao.selectAlllc(payablesCustom2);
		
		PageInfo<Receivable> page=new PageInfo<Receivable>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
		return page;
	}
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String receivableId){
    	return dao.deleteByPrimaryKey(receivableId);
    }

    public int insert(Receivable record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Receivable record){
    	return dao.insertSelective(record);
    }

    public Receivable selectByPrimaryKey(String receivableId){
    	return dao.selectByPrimaryKey(receivableId);
    }

    public int updateByPrimaryKeySelective(Receivable record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Receivable record){
    	return dao.updateByPrimaryKey(record);
    }
}