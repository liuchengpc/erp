package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Material_type;
import com.apatech.domain.Material_type;
import com.apatech.domain.Material_type;
import com.apatech.mapper.Material_typeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Material_typeService {
	@Autowired
	private Material_typeMapper dao;
	
	public PageInfo<Material_type> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Material_type> list=dao.selectAll();

    	PageInfo<Material_type> page=new PageInfo<Material_type>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String mtId){
    	return dao.deleteByPrimaryKey(mtId);
    }

    public int insert(Material_type record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Material_type record){
    	return dao.insertSelective(record);
    }

    public Material_type selectByPrimaryKey(String mtId){
    	return dao.selectByPrimaryKey(mtId);
    }

    public int updateByPrimaryKeySelective(Material_type record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Material_type record){
    	return dao.updateByPrimaryKey(record);
    }
}