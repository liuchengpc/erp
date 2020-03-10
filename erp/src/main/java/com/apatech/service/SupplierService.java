package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Supplier;
import com.apatech.domain.Supplier;
import com.apatech.domain.Supplier;
import com.apatech.mapper.SupplierMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SupplierService {
	@Autowired
	private SupplierMapper dao;
	
	public PageInfo<Supplier> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Supplier> list=dao.selectAll();

    	PageInfo<Supplier> page=new PageInfo<Supplier>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String supplierId){
    	return dao.deleteByPrimaryKey(supplierId);
    }

    public int insert(Supplier record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Supplier record){
    	return dao.insertSelective(record);
    }

    public Supplier selectByPrimaryKey(String supplierId){
    	return dao.selectByPrimaryKey(supplierId);
    }
    
    public Supplier selectByPrimaryKey2(String supplierName){
    	return dao.selectByPrimaryKey2(supplierName);
    }

    public int updateByPrimaryKeySelective(Supplier record){
    	return dao.updateByPrimaryKeySelective(record);
    }
    
    public int updateByPrimaryKeySelective2(Supplier record){
    	return dao.updateByPrimaryKeySelective2(record);
    }

    public int updateByPrimaryKey(Supplier record){
    	return dao.updateByPrimaryKey(record);
    }

    public List<Supplier> selectAll() {
        return dao.selectAll();
    }
}