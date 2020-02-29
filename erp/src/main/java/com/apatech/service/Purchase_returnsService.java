package com.apatech.service;

import java.sql.SQLException;
import java.util.List;

import com.apatech.mapper.Purchase_returns_detailedMapper;
import com.apatech.pojo.PurchaseReturnsPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Purchase_returns;
import com.apatech.mapper.Purchase_returnsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Purchase_returnsService {
	@Autowired
	private Purchase_returnsMapper dao;
	@Autowired
	private Purchase_returnsMapper purchase_returnsMapper;
	private Purchase_returns_detailedMapper detailedMapper;

	public PageInfo<Purchase_returns> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Purchase_returns> list=dao.selectAll();

    	PageInfo<Purchase_returns> page=new PageInfo<Purchase_returns>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String pureId){
    	return dao.deleteByPrimaryKey(pureId);
    }

    public int insert(Purchase_returns record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Purchase_returns record){
    	return dao.insertSelective(record);
    }

    public Purchase_returns selectByPrimaryKey(String pureId){
    	return dao.selectByPrimaryKey(pureId);
    }

    public int updateByPrimaryKeySelective(Purchase_returns record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Purchase_returns record){
    	return dao.updateByPrimaryKey(record);
    }

    public PurchaseReturnsPojo selectLast() {
        return purchase_returnsMapper.selectLast();
    }

	public PurchaseReturnsPojo selectPrev(Integer lineId) {
		return dao.selectPrev(lineId);
	}

	public PurchaseReturnsPojo selectNext(Integer lineId) {
		return dao.selectNext(lineId);
	}

	public PurchaseReturnsPojo selectFirst() {
		return dao.selectFirst();
	}

	public String selectPureId() {
		return purchase_returnsMapper.selectPureId();
	}

	@Transactional(rollbackFor = Exception.class)
	public void insertWithDetails(PurchaseReturnsPojo returnsPojo) throws Exception {
		returnsPojo.setPureId(dao.selectPureId());
		returnsPojo.setPureDocumentNumber(dao.selectPureId());
		dao.insertWithDetails(returnsPojo);
		detailedMapper.insertList(returnsPojo.getDetails());
	}
}