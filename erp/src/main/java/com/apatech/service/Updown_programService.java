package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Updown_program;
import com.apatech.domain.Updown_program;
import com.apatech.domain.Updown_program;
import com.apatech.mapper.Updown_programMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Updown_programService {
	@Autowired
	private Updown_programMapper dao;
	
	public PageInfo<Updown_program> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Updown_program> list=dao.selectAll();

    	PageInfo<Updown_program> page=new PageInfo<Updown_program>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	
	public List<Updown_program> selectAll(){
		System.out.println("进入查询所有,数据为:"+dao.selectAll());
		return dao.selectAll();
	}
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String upId){
    	return dao.deleteByPrimaryKey(upId);
    }

    public int insert(Updown_program record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Updown_program record){
    	return dao.insertSelective(record);
    }

    public Updown_program selectByPrimaryKey(String upId){
    	return dao.selectByPrimaryKey(upId);
    }

    public int updateByPrimaryKeySelective(Updown_program record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Updown_program record){
    	return dao.updateByPrimaryKey(record);
    }
}