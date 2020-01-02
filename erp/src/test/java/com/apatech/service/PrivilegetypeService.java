package com.apatech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Privilegetype;
import com.apatech.domain.Ptmanagement;
import com.apatech.mapper.PrivilegetypeMapper;
import com.apatech.mapper.PtmanagementMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PrivilegetypeService {
	@Autowired
	private PrivilegetypeMapper dao;

	@Autowired
	private PtmanagementMapper pt;
	
	public List<Privilegetype> queryPrivilegeType(){
		List<Privilegetype> list = dao.queryPrivilegeType();
		for (Privilegetype privilegetype : list) {
			List<Ptmanagement> list2 = pt.queryByID(privilegetype.getPrivilegetypeid());
			privilegetype.setList(list2);
		}
		
		return	list;
	}
	
    public int deleteByPrimaryKey(Integer privilegetypeid) {
    	return dao.deleteByPrimaryKey(privilegetypeid);
    }

    public int insert(Privilegetype record) {
    	return dao.insert(record);
    }


    public int insertSelective(Privilegetype record) {
    	return dao.insertSelective(record);
    }


    public Privilegetype selectByPrimaryKey(Integer privilegetypeid) {
    	return dao.selectByPrimaryKey(privilegetypeid);
    }
    
    public List<Privilegetype> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Privilegetype> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Privilegetype> list=dao.selectAll();
    	PageInfo<Privilegetype> page=new PageInfo<Privilegetype>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Privilegetype record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Privilegetype record) {
    	return dao.updateByPrimaryKey(record);
    }

}