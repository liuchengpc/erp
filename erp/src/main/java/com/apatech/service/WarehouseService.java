package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Warehouse;
import com.apatech.domain.Warehouse;
import com.apatech.domain.Warehouse;
import com.apatech.mapper.WarehouseMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class WarehouseService {
	@Autowired
	private WarehouseMapper dao;
	
	//查询所有仓库
	public List<Warehouse> selectAll(){
		return dao.selectAll();
	}
	
	public PageInfo<Warehouse> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Warehouse> list=dao.selectAll();

    	PageInfo<Warehouse> page=new PageInfo<Warehouse>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String warehouseId){
    	return dao.deleteByPrimaryKey(warehouseId);
    }

    public int insert(Warehouse record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Warehouse record){
    	return dao.insertSelective(record);
    }

    public Warehouse selectByPrimaryKey(String warehouseId){
    	return dao.selectByPrimaryKey(warehouseId);
    }

    public int updateByPrimaryKeySelective(Warehouse record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Warehouse record){
    	return dao.updateByPrimaryKey(record);
    }
}