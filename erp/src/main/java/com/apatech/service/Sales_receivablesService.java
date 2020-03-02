package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Sales_receivables;
import com.apatech.domain.Sales_receivables_customerLC;
import com.apatech.mapper.Sales_receivablesMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional
public class Sales_receivablesService {
	@Autowired
	private Sales_receivablesMapper dao;
	
	 public PageInfo<Sales_receivables> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Sales_receivables> list=dao.selectAll();

    	PageInfo<Sales_receivables> page=new PageInfo<Sales_receivables>(list);
//	    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 public PageInfo<Sales_receivables_customerLC> selectAlllc(Integer pageNum,Integer pageSize){
		 System.out.println("分页的集合："+dao.selectAlllc().toString());
		 
		 PageHelper.startPage(pageNum, pageSize);
		 List<Sales_receivables_customerLC> list=dao.selectAlllc();
		 System.out.println(list.size());
		 for (int i = 0; i < list.size(); i++) {
			 System.out.println(list.get(i).getCustomerId());
			 list.get(i).setList(dao.selectAlllc2(list.get(i).getCustomerId()));
		}
		 PageInfo<Sales_receivables_customerLC> page=new PageInfo<Sales_receivables_customerLC>(list);
//	    	System.out.println("分页的集合2："+page.getList().toString());
		 return page;
	 }

	 public PageInfo<Sales_receivables_customerLC> selectAlllc2(Integer pageNum,Integer pageSize,String customerId){
		 System.out.println("分页的集合："+dao.selectAlllc().toString());
		 
		 PageHelper.startPage(pageNum, pageSize);
		 List<Sales_receivables_customerLC> list=dao.selectAlllc2(customerId);
		
		 
		 PageInfo<Sales_receivables_customerLC> page=new PageInfo<Sales_receivables_customerLC>(list);
//	    	System.out.println("分页的集合2："+page.getList().toString());
		 return page;
	 }
	 
	 public PageInfo<Sales_receivables> selectAllpagebyidlc(Integer pageNum,Integer pageSize,String srPcId){
			System.out.println("分页的集合："+dao.selectAllpagebyidlc(srPcId).toString());
			
			PageHelper.startPage(pageNum, pageSize);
			List<Sales_receivables> list=dao.selectAllpagebyidlc(srPcId);
			
			PageInfo<Sales_receivables> page=new PageInfo<Sales_receivables>(list);
//			    	System.out.println("分页的集合2："+page.getList().toString());
			return page;
		}
	 public PageInfo<Sales_receivables> selectAllpagebyidlc2(Integer pageNum,Integer pageSize,String srCustom10){
		 System.out.println("分页的集合2："+dao.selectAllpagebyidlc2(srCustom10).toString());
		 System.out.println("fjoei");
		 PageHelper.startPage(pageNum, pageSize);
		 List<Sales_receivables> list=dao.selectAllpagebyidlc2(srCustom10);
		 
		 PageInfo<Sales_receivables> page=new PageInfo<Sales_receivables>(list);
		 return page;
	 }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
	
    public int deleteByPrimaryKey(Integer apId){
    	return dao.deleteByPrimaryKey(apId);   
	}
    
    public int deleteByzbidlc(String receivablesbillId){
    	return dao.deleteByzbidlc(receivablesbillId);
    }

    public int insert(Sales_receivables record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Sales_receivables record){
    	return dao.insertSelective(record);
    }

    public Sales_receivables selectByPrimaryKey(Integer srId){
    	return dao.selectByPrimaryKey(srId);
    }

    public int updateByPrimaryKeySelective(Sales_receivables record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Sales_receivables record){
    	return dao.updateByPrimaryKey(record);
    }
}