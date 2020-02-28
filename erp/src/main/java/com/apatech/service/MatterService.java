package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Matter;
import com.apatech.domain.Matter;
import com.apatech.domain.Matter;
import com.apatech.mapper.MatterMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class MatterService {
	@Autowired
	private MatterMapper dao;
	
	/**
	 * 用于查询单位
	 */
	@Autowired
	private Measurement_unitService mu_dao;
	public PageInfo<Matter> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Matter> list=dao.selectAll();

    	PageInfo<Matter> page=new PageInfo<Matter>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String matterId){
    	return dao.deleteByPrimaryKey(matterId);
    }

    public int insert(Matter record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Matter record){
    	return dao.insertSelective(record);
    }

    public Matter selectByPrimaryKey(String matterId){
    	return dao.selectByPrimaryKey(matterId);
    }

    public int updateByPrimaryKeySelective(Matter record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Matter record){
    	return dao.updateByPrimaryKey(record);
    }
    
    public List<Matter> queryAll(){
    	List<Matter> list=dao.selectAll();
    	for (Matter m : list) {
    		m.setMu_name(mu_dao.selectByPrimaryKey(m.getMuId()).getMuName());
		}
    	return list;
    }
    public Matter queryAllByPrimaryKey(String matterId) {
    	System.out.println(dao.selectByPrimaryKey(matterId).toString());
    	Matter m=dao.selectByPrimaryKey(matterId);
    	//m.setMu_name(mu_dao.selectByPrimaryKey(m.getMuId()).getMuName());
    	return m;
    }
}