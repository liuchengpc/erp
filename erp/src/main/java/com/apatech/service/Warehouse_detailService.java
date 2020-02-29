package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Warehouse_detail;
import com.apatech.domain.Warehouse_detail;
import com.apatech.domain.Warehouse_detail;
import com.apatech.mapper.Warehouse_detailMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class Warehouse_detailService {
	@Autowired
	private Warehouse_detailMapper dao;
	
	public int selectcount() {
		return dao.selectcount();
	}
	
	public int deletebysj(String sj) {
		return dao.deletebysj(sj);
	}
	
	public PageInfo<Warehouse_detail> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Warehouse_detail> list=dao.selectAll();

    	PageInfo<Warehouse_detail> page=new PageInfo<Warehouse_detail>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String wdId){
    	return dao.deleteByPrimaryKey(wdId);
    }

    public int insert(Warehouse_detail record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Warehouse_detail record){
    	return dao.insertSelective(record);
    }

    public Warehouse_detail selectByPrimaryKey(String wdId){
    	return dao.selectByPrimaryKey(wdId);
    }
    
    public int selectbyid(String id,String sid){
    	Warehouse_detail stu = dao.selectbyid(id, sid);
    	int i=0;	
		//System.out.println(stu);
		if(stu!=null) {
		if(stu.getWdInorout()==0) {
			i=stu.getWdNumber()+stu.getWdLastbalancenumber();
		}else {
			i=stu.getWdLastbalancenumber()-stu.getWdNumber();
		}
		}
    	return i;
    }

    public int updateByPrimaryKeySelective(Warehouse_detail record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Warehouse_detail record){
    	return dao.updateByPrimaryKey(record);
    }
}