package com.apatech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Salesorder;
import com.apatech.domain.Salesorder;
import com.apatech.domain.Salesorder;
import com.apatech.mapper.SalesorderMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SalesorderService {
	@Autowired
	private SalesorderMapper dao;
	
	public PageInfo<Salesorder> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Salesorder> list=dao.selectAll();

    	PageInfo<Salesorder> page=new PageInfo<Salesorder>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	public PageInfo<Salesorder> selectAllbypage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Salesorder> list=dao.selectAll();

    	PageInfo<Salesorder> page=new PageInfo<Salesorder>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 public String getno(String billdate){
	    	return dao.getno(billdate);
	 }
	 public List<Salesorder> selectAll(){
	    	return dao.selectAll();
    }
    public int deleteByPrimaryKey(String soId){
    	return dao.deleteByPrimaryKey(soId);
    }

    public int insert(Salesorder record){
    	return dao.insert(record);
    }
    
    public String selectbysh(String bitten){
    	return dao.selectbysh(bitten);
    }
    
    public List<Salesorder> selectzdsh(){
    	List<Salesorder> list = new ArrayList<Salesorder>();
    	for (Salesorder stu : dao.selectAll()) {
			if(stu.getSoAuditing().equals("1")) {
				list.add(stu);
			}
		}
    	return list;
    }
    
    public int insertSelective(Salesorder record){
    	return dao.insertSelective(record);
    }

    public Salesorder selectByPrimaryKey(String soId){
    	return dao.selectByPrimaryKey(soId);
    }

    public int updateByPrimaryKeySelective(Salesorder record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Salesorder record){
    	return dao.updateByPrimaryKey(record);
    }
}