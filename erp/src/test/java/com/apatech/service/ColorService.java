package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Color;
import com.apatech.mapper.ColorMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ColorService {
	@Autowired
	private ColorMapper dao;

	public List<Color> queryColorByColorTypeID(Integer colortypeid) {
		
		return dao.queryColorByColorTypeID(colortypeid);
	}
	
    public int deleteByPrimaryKey(Integer colorid) {
    	return dao.deleteByPrimaryKey(colorid);
    }

    public int insert(Color record) {
    	return dao.insert(record);
    }


    public int insertSelective(Color record) {
    	return dao.insertSelective(record);
    }


    public Color selectByPrimaryKey(Integer colorid) {
    	return dao.selectByPrimaryKey(colorid);
    }
    
    public List<Color> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Color> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Color> list=dao.selectAll();
    	PageInfo<Color> page=new PageInfo<Color>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Color record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Color record) {
    	return dao.updateByPrimaryKey(record);
    }

}