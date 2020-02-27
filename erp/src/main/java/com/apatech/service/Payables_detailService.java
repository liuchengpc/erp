package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Payables_detail;
import com.apatech.domain.Priadetails;
import com.apatech.domain.Payables_detail;
import com.apatech.domain.Payables_detail;
import com.apatech.mapper.Payables_detailMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Payables_detailService {
	@Autowired
	private Payables_detailMapper dao;
	
	public PageInfo<Payables_detail> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Payables_detail> list=dao.selectAll();

    	PageInfo<Payables_detail> page=new PageInfo<Payables_detail>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	
	public PageInfo<Payables_detail> selectByPayablesbillSupplierName(Integer page,Integer limit,String paydetailId){
    	System.out.println("分页的集合："+dao.selectByPayablesbillSupplierName(paydetailId));
    	PageHelper.startPage(page, limit);
    	List<Payables_detail> list=dao.selectByPayablesbillSupplierName(paydetailId);

    	PageInfo<Payables_detail> pageFy=new PageInfo<Payables_detail>(list);
    	return pageFy;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String paydetailId){
    	return dao.deleteByPrimaryKey(paydetailId);
    }

    public int insert(Payables_detail record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Payables_detail record){
    	return dao.insertSelective(record);
    }

    public Payables_detail selectByPrimaryKey(String paydetailId){
    	return dao.selectByPrimaryKey(paydetailId);
    }

    public int updateByPrimaryKeySelective(Payables_detail record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Payables_detail record){
    	return dao.updateByPrimaryKey(record);
    }
}