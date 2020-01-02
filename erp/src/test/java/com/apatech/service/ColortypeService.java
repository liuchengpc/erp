package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Colortype;
import com.apatech.mapper.ColortypeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ColortypeService {
	@Autowired
	private ColortypeMapper dao;

    public int deleteByPrimaryKey(Integer colortypeid) {
    	return dao.deleteByPrimaryKey(colortypeid);
    }

    public int insert(Colortype record) {
    	return dao.insert(record);
    }


    public int insertSelective(Colortype record) {
    	return dao.insertSelective(record);
    }


    public Colortype selectByPrimaryKey(Integer colortypeid) {
    	return dao.selectByPrimaryKey(colortypeid);
    }
    
    public List<Colortype> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Colortype> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Colortype> list=dao.selectAll();
    	PageInfo<Colortype> page=new PageInfo<Colortype>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Colortype record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Colortype record) {
    	return dao.updateByPrimaryKey(record);
    }

}