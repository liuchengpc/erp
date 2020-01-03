package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Commoditysize;
import com.apatech.mapper.CommoditysizeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CommoditysizeService {
	@Autowired
	private CommoditysizeMapper dao;

    public int deleteByPrimaryKey(Integer commoditysizeid) {
    	return dao.deleteByPrimaryKey(commoditysizeid);
    }

    public int insert(Commoditysize record) {
    	return dao.insert(record);
    }


    public int insertSelective(Commoditysize record) {
    	return dao.insertSelective(record);
    }


    public Commoditysize selectByPrimaryKey(Integer commoditysizeid) {
    	return dao.selectByPrimaryKey(commoditysizeid);
    }
    
    public List<Commoditysize> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Commoditysize> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Commoditysize> list=dao.selectAll();
    	PageInfo<Commoditysize> page=new PageInfo<Commoditysize>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Commoditysize record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Commoditysize record) {
    	return dao.updateByPrimaryKey(record);
    }

}