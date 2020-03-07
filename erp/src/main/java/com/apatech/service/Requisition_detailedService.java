package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Requisition_detailed;
import com.apatech.domain.Requisition_detailed;
import com.apatech.domain.Requisition_detailed;
import com.apatech.mapper.Requisition_detailedMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Requisition_detailedService {
	@Autowired
	private Requisition_detailedMapper dao;
	
	public PageInfo<Requisition_detailed> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Requisition_detailed> list=dao.selectAll();

    	PageInfo<Requisition_detailed> page=new PageInfo<Requisition_detailed>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	
	/**
	 */
	public List<Requisition_detailed> queryAllByR_Id(String requisitionId){
		return dao.queryAllByR_ID(requisitionId);
	}
	 
	public List<Requisition_detailed> selectAll(){
		return dao.selectAll();
	}
	
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String rdId){
    	return dao.deleteByPrimaryKey(rdId);
    }

    public int deleteByrequisitionId(String requisitionId){
    	return dao.deleteByrequisitionId(requisitionId);
    }
    
    public int insert(Requisition_detailed record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Requisition_detailed record){
    	return dao.insertSelective(record);
    }
    public int insertSelective2(Requisition_detailed record){
    	return dao.insertSelective2(record);
    }

    public Requisition_detailed selectByPrimaryKey(String rdId){
    	return dao.selectByPrimaryKey(rdId);
    }

    public int updateByPrimaryKeySelective(Requisition_detailed record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Requisition_detailed record){
    	return dao.updateByPrimaryKey(record);
    }
}