package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Adjust_price;
import com.apatech.domain.wd_Adjust_price;
import com.apatech.mapper.Adjust_priceMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class wd_Adjust_priceService {
	@Autowired
	private Adjust_priceMapper dao;
	
	 	public PageInfo<wd_Adjust_price> wdselectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.wdselectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);	
    	List<wd_Adjust_price> list=dao.wdselectAll();
    	PageInfo<wd_Adjust_price> page=new PageInfo<wd_Adjust_price>(list);
//	    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public List<wd_Adjust_price> queryMater(String matterCustom6){
	    
	    	List<wd_Adjust_price> list=dao.queryMater(matterCustom6);
	    	
	    	return list;
	    }
	 
	 
}
