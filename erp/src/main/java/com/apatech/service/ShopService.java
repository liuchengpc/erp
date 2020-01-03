package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Role;
import com.apatech.domain.Shop;
import com.apatech.domain.Users;
import com.apatech.mapper.ShopMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ShopService {
	@Autowired
	private ShopMapper dao;

	public Shop queryshopnameByshopid(String shopid) {
		
		return dao.queryshopnameByshopid(shopid);
	}
	
	public List<Role> queryByRoleName() {
		
		return dao.queryByRoleName();
	}
	
	
	public List<Shop> queryByAll2(){
		
		return dao.queryByAll2();
	}
	
	public int queryByCount(String shopid) {
		
		return dao.queryByCount(shopid);
	}
	
	public PageInfo<Shop> queryByShopPage(Integer pageNum,Integer pageSize,Shop shop){
		PageHelper.startPage(pageNum, pageSize);
		List<Shop> list = dao.queryByShopPage(shop);
		PageInfo<Shop> page = new PageInfo<Shop>(list);
		return page;
	}
	
    public int deleteByPrimaryKey(String shopid) {
    	return dao.deleteByPrimaryKey(shopid);
    }

    public int insert(Shop record) {
    	return dao.insert(record);
    }


    public int insertSelective(Shop record) {
    	return dao.insertSelective(record);
    }


    public Shop selectByPrimaryKey(String shopid) {
    	return dao.selectByPrimaryKey(shopid);
    }
    
    public List<Shop> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Shop> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Shop> list=dao.selectAll();
    	PageInfo<Shop> page=new PageInfo<Shop>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Shop record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Shop record) {
    	return dao.updateByPrimaryKey(record);
    }

}