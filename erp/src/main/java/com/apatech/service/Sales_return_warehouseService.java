package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_return_warehouse;
import com.apatech.domain.Sales_return_warehouse;
import com.apatech.domain.Sales_return_warehouse;
import com.apatech.mapper.Sales_return_warehouseMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Sales_return_warehouseService {
	@Autowired
	private Sales_return_warehouseMapper dao;
	
	public int selectcount() {
		return dao.selectcount(); 
	}
	
	
	public int deletelist(String id) {
		dao.deletelist2(id);
		return dao.deletelist(id);
	}
	
	public int selectlist(String id,String sid) {
		dao.selectlist2(id, sid);
		return dao.selectlist(id, sid);
	}
		
	public PageInfo<Sales_return_warehouse> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Sales_return_warehouse> list=dao.selectAll();

    	PageInfo<Sales_return_warehouse> page=new PageInfo<Sales_return_warehouse>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String srwId){
    	return dao.deleteByPrimaryKey(srwId);
    }

    public int insert(Sales_return_warehouse record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_return_warehouse record){
    	return dao.insertSelective(record);
    }

    public Sales_return_warehouse selectByPrimaryKey(String srwId){
    	return dao.selectByPrimaryKey(srwId);
    }

    public int updateByPrimaryKeySelective(Sales_return_warehouse record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_return_warehouse record){
    	return dao.updateByPrimaryKey(record);
    }
}