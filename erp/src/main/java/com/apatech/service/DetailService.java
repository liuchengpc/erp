package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Detail;
import com.apatech.mapper.DetailMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class DetailService {
	@Autowired
	private DetailMapper dao;

    public int deleteByPrimaryKey(Integer detailid) {
    	return dao.deleteByPrimaryKey(detailid);
    }
    public int deleteByid(String billid) {
    	return dao.deleteByid(billid);
    }

    public int insert(Detail record) {
    	return dao.insert(record);
    }


    public int insertSelective(Detail record) {
    	return dao.insertSelective(record);
    }
    public int insertSelective2(List<Detail> record) {
    	return dao.insertSelective2(record);
    }


    public Detail selectByPrimaryKey(Integer detailid) {
    	return dao.selectByPrimaryKey(detailid);
    }
    
    public List<Detail> selectAll() {
    	return dao.selectAll();
    }
    
    public List<Detail> selectAllByid(String billid) {
    	return dao.selectAllByid(billid);
    }
    
    public PageInfo<Detail> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Detail> list=dao.selectAll();
    	PageInfo<Detail> page=new PageInfo<Detail>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Detail record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Detail record) {
    	return dao.updateByPrimaryKey(record);
    }

}