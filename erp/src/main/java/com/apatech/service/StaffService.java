package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Staff;
import com.apatech.domain.Staff;
import com.apatech.domain.Staff;
import com.apatech.mapper.StaffMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class StaffService {
	@Autowired
	private StaffMapper dao;
	
	public PageInfo<Staff> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Staff> list=dao.selectAll();

    	PageInfo<Staff> page=new PageInfo<Staff>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	

	 
	public List<Staff> selectAll(){
		System.out.println("查询所有结果为"+dao.selectAll().toString());
		return dao.selectAll();
	}
	
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String staffId){
    	return dao.deleteByPrimaryKey(staffId);
    }

    public int insert(Staff record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Staff record){
    	return dao.insertSelective(record);
    }

    public Staff selectByPrimaryKey(String staffId){
    	return dao.selectByPrimaryKey(staffId);
    }

    public int updateByPrimaryKeySelective(Staff record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Staff record){
    	return dao.updateByPrimaryKey(record);
    }
}