package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Privilege;
import com.apatech.mapper.PrivilegeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PrivilegeService {
	@Autowired
	private PrivilegeMapper dao;

    public int deleteByPrimaryKey(Integer privilegeid) {
    	return dao.deleteByPrimaryKey(privilegeid);
    }

    public int insert(Privilege record) {
    	return dao.insert(record);
    }


    public int insertSelective(Privilege record) {
    	return dao.insertSelective(record);
    }


    public Privilege selectByPrimaryKey(Integer privilegeid) {
    	return dao.selectByPrimaryKey(privilegeid);
    }
    
    public List<Privilege> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Privilege> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Privilege> list=dao.selectAll();
    	PageInfo<Privilege> page=new PageInfo<Privilege>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Privilege record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Privilege record) {
    	return dao.updateByPrimaryKey(record);
    }

}