package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Commodity;
import com.apatech.domain.Commoditydetail;
import com.apatech.domain.Supplier;
import com.apatech.mapper.CommodityMapper;
import com.apatech.mapper.CommoditydetailMapper;
import com.apatech.mapper.SupplierMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SupplierService {
	@Autowired
	private SupplierMapper dao;

    public int deleteByPrimaryKey(Integer supplierid) {
    	return dao.deleteByPrimaryKey(supplierid);
    }

    public int insert(Supplier record) {
    	return dao.insert(record);
    }


    public int insertSelective(Supplier record) {
    	return dao.insertSelective(record);
    }


    public Supplier selectByPrimaryKey(Integer supplierid) {
    	return dao.selectByPrimaryKey(supplierid);
    }
    
    public List<Supplier> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Supplier> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Supplier> list=dao.selectAll();
    	PageInfo<Supplier> page=new PageInfo<Supplier>(list);
    	return page;
    }
    
    public List<Supplier> selectAll2(
    		 String province,//省（地址）
			 String city,//省（地址）
			 String region,//地区（地址）
			String selectqb
    		){
    	List<Supplier> li=dao.selectAll2(province,city,region, selectqb);
    	
    	return li;
    }


    public int updateByPrimaryKeySelective(Supplier record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Supplier record) {
    	return dao.updateByPrimaryKey(record);
    }

}