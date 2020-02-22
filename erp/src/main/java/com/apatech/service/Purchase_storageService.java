package com.apatech.service;

import java.util.List;

import com.apatech.pojo.PurchaseStoragePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_storage;
import com.apatech.domain.Purchase_storage;
import com.apatech.domain.Purchase_storage;
import com.apatech.mapper.Purchase_storageMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Purchase_storageService {
	@Autowired
	private Purchase_storageMapper dao;
	@Autowired
	private Purchase_storageMapper purchase_storageMapper;

	public PageInfo<Purchase_storage> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchase_storage> list=dao.selectAll();

    	PageInfo<Purchase_storage> page=new PageInfo<Purchase_storage>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String psId){
    	return dao.deleteByPrimaryKey(psId);
    }

    public int insert(Purchase_storage record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_storage record){
    	return dao.insertSelective(record);
    }

    public Purchase_storage selectByPrimaryKey(String psId){
    	return dao.selectByPrimaryKey(psId);
    }

    public int updateByPrimaryKeySelective(Purchase_storage record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_storage record){
    	return dao.updateByPrimaryKey(record);
    }

    public PurchaseStoragePojo selectLast() {
	    return dao.selectLast();
    }

	public PurchaseStoragePojo selectPrev(Integer lineId) {
		return purchase_storageMapper.selectPrev(lineId);
	}

	public PurchaseStoragePojo selectNext(Integer lineId) {
		return purchase_storageMapper.selectNext(lineId);
	}

	public PurchaseStoragePojo selectFirst() {
		return purchase_storageMapper.selectFirst();
	}
}