package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Out_storage_type;
import com.apatech.domain.Out_storage_type;
import com.apatech.domain.Out_storage_type;
import com.apatech.mapper.Out_storage_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Out_storage_typeService {
	@Autowired
	private Out_storage_typeMapper dao;
	
	public PageInfo<Out_storage_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Out_storage_type> list=dao.selectAll();

    	PageInfo<Out_storage_type> page=new PageInfo<Out_storage_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String ostId){
    	return dao.deleteByPrimaryKey(ostId);
    }

    public int insert(Out_storage_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Out_storage_type record){
    	return dao.insertSelective(record);
    }

    public Out_storage_type selectByPrimaryKey(String ostId){
    	return dao.selectByPrimaryKey(ostId);
    }

    public int updateByPrimaryKeySelective(Out_storage_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Out_storage_type record){
    	return dao.updateByPrimaryKey(record);
    }
}