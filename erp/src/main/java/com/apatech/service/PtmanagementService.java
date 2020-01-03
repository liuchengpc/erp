package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Ptmanagement;
import com.apatech.mapper.PtmanagementMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PtmanagementService {
	@Autowired
	private PtmanagementMapper dao;

	public List<Ptmanagement> queryByID(Integer privilegeTypeID){
		
		return dao.queryByID(privilegeTypeID);
	}
	
    public int deleteByPrimaryKey(Integer ptid) {
    	return dao.deleteByPrimaryKey(ptid);
    }

    public int insert(Ptmanagement record) {
    	return dao.insert(record);
    }


    public int insertSelective(Ptmanagement record) {
    	return dao.insertSelective(record);
    }


    public Ptmanagement selectByPrimaryKey(Integer ptid) {
    	return dao.selectByPrimaryKey(ptid);
    }
    
    public List<Ptmanagement> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Ptmanagement> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Ptmanagement> list=dao.selectAll();
    	PageInfo<Ptmanagement> page=new PageInfo<Ptmanagement>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Ptmanagement record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Ptmanagement record) {
    	return dao.updateByPrimaryKey(record);
    }

}