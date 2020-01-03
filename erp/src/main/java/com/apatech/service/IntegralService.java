package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Integral;
import com.apatech.mapper.IntegralMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class IntegralService {
	@Autowired
	private IntegralMapper dao;

	public Integral queryByIntegral() {
		
		return dao.queryByIntegral();
	}
	
    public int deleteByPrimaryKey(Integer integralid) {
    	return dao.deleteByPrimaryKey(integralid);
    }

    public int insert(Integral record) {
    	return dao.insert(record);
    }


    public int insertSelective(Integral record) {
    	return dao.insertSelective(record);
    }


    public Integral selectByPrimaryKey(Integer integralid) {
    	return dao.selectByPrimaryKey(integralid);
    }
    
    public List<Integral> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Integral> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Integral> list=dao.selectAll();
    	PageInfo<Integral> page=new PageInfo<Integral>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Integral record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Integral record) {
    	return dao.updateByPrimaryKey(record);
    }

}