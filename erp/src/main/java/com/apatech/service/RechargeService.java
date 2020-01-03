package com.apatech.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Recharge;
import com.apatech.mapper.RechargeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class RechargeService {
	@Autowired
	private RechargeMapper dao;

    public int deleteByPrimaryKey(Integer rechargeid) {
    	return dao.deleteByPrimaryKey(rechargeid);
    }

    public int insert(Recharge record) {
    	return dao.insert(record);
    }


    public int insertSelective(Recharge record) {
    	return dao.insertSelective(record);
    }


    public Recharge selectByPrimaryKey(Integer rechargeid) {
    	return dao.selectByPrimaryKey(rechargeid);
    }
    
    public List<Recharge> selectAll() {
    	return dao.selectAll();
    }
    

    public List<Recharge> selectByAll(Date startTime,Date endTime,String PhoneOrName) {
    	return dao.selectByAll(startTime,endTime,PhoneOrName);
    }
    
    public PageInfo<Recharge> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Recharge> list=dao.selectAll();
    	PageInfo<Recharge> page=new PageInfo<Recharge>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Recharge record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Recharge record) {
    	return dao.updateByPrimaryKey(record);
    }

}