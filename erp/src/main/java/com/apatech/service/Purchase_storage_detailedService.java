package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_storage_detailed;
import com.apatech.domain.Purchase_storage_detailed;
import com.apatech.domain.Purchase_storage_detailed;
import com.apatech.mapper.Purchase_storage_detailedMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Purchase_storage_detailedService {
	@Autowired
	private Purchase_storage_detailedMapper dao;
	
	public PageInfo<Purchase_storage_detailed> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchase_storage_detailed> list=dao.selectAll();

    	PageInfo<Purchase_storage_detailed> page=new PageInfo<Purchase_storage_detailed>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String psdId){
    	return dao.deleteByPrimaryKey(psdId);
    }

    public int insert(Purchase_storage_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_storage_detailed record){
    	return dao.insertSelective(record);
    }

    public Purchase_storage_detailed selectByPrimaryKey(String psdId){
    	return dao.selectByPrimaryKey(psdId);
    }

    public int updateByPrimaryKeySelective(Purchase_storage_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_storage_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}