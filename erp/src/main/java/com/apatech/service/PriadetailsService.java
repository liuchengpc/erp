package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Priadetails;
import com.apatech.domain.Priadetails;
import com.apatech.domain.Priadetails;
import com.apatech.mapper.PriadetailsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PriadetailsService {
	@Autowired
	private PriadetailsMapper dao;
	
	public PageInfo<Priadetails> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Priadetails> list=dao.selectAll();

    	PageInfo<Priadetails> page=new PageInfo<Priadetails>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String priadetailsId){
    	return dao.deleteByPrimaryKey(priadetailsId);
    }

    public int insert(Priadetails record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Priadetails record){
    	return dao.insertSelective(record);
    }

    public Priadetails selectByPrimaryKey(String priadetailsId){
    	return dao.selectByPrimaryKey(priadetailsId);
    }

    public int updateByPrimaryKeySelective(Priadetails record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Priadetails record){
    	return dao.updateByPrimaryKey(record);
    }
}