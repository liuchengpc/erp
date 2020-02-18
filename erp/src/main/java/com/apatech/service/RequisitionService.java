package com.apatech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Requisition;
import com.apatech.domain.Requisition;
import com.apatech.domain.Requisition;
import com.apatech.mapper.RequisitionMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class RequisitionService {
	@Autowired
	private RequisitionMapper dao;
	
	@Autowired
	private Requisition_detailedService Rd_dao;
	
	@Autowired
	private WarehouseService Wh_dao;
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Requisition> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Requisition> list=dao.selectAll();

    	PageInfo<Requisition> page=new PageInfo<Requisition>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	
	
	/**
	 * 分页联表查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Requisition> queryAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.queryAllByTime().toString());
    	PageHelper.startPage(pageNum, pageSize);
    	List<Requisition> list=dao.queryAllByTime();
    	System.out.println("循环前数据为"+dao.queryAllByTime());
    	//加入调拨详表和仓库的名称
    	for (Requisition requisition : list) {
    		System.out.println("第一句前");
			requisition.setRd_list(Rd_dao.queryAllByR_Id(requisition.getRequisitionId()));
			System.out.println("第一句"+Rd_dao.queryAllByR_Id(requisition.getRequisitionId()).toString());
			requisition.setRequisitionOutWarehouseName(Wh_dao.selectByPrimaryKey(requisition.getRequisitionOutWarehouse()).getWarehouseName());
			System.out.println("第二句");
			requisition.setRequisitionInputWarehouseName(Wh_dao.selectByPrimaryKey(requisition.getRequisitionInputWarehouse()).getWarehouseName());
			System.out.println("第三句");
		}
    	System.out.println("循环后数据为"+list.toString());
    	PageInfo<Requisition> page=new PageInfo<Requisition>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String requisitionId){
    	return dao.deleteByPrimaryKey(requisitionId);
    }

    public int insert(Requisition record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Requisition record){
    	return dao.insertSelective(record);
    }

    public Requisition selectByPrimaryKey(String requisitionId){
    	return dao.selectByPrimaryKey(requisitionId);
    }

    public int updateByPrimaryKeySelective(Requisition record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Requisition record){
    	return dao.updateByPrimaryKey(record);
    }
}