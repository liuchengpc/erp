package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Payables;
import com.apatech.domain.Priadetails;
import com.apatech.domain.Priadetails;
import com.apatech.domain.Priadetails;
import com.apatech.mapper.PriadetailsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PriadetailsService {
	@Autowired
	private PriadetailsMapper dao;
	
	public PageInfo<Priadetails> selectByPriabillSupplierName(Integer page,Integer limit,String priabillId){
    	System.out.println("分页的集合："+dao.selectByPriabillSupplierName(priabillId));
    	PageHelper.startPage(page, limit);
    	List<Priadetails> list=dao.selectByPriabillSupplierName(priabillId);

    	PageInfo<Priadetails> pageFy=new PageInfo<Priadetails>(list);
    	return pageFy;
    }
	 
	public PageInfo<Priadetails> selectAllBySupplier(Integer page,Integer limit,String priabillCustom10){
		System.out.println("预付款余额大于0分页的集合："+dao.selectAllBySupplier(priabillCustom10));
    	PageHelper.startPage(page, limit);
    	List<Priadetails> list=dao.selectAllBySupplier(priabillCustom10);

    	PageInfo<Priadetails> pageFy=new PageInfo<Priadetails>(list);
    	return pageFy;
	}
	
	public PageInfo<Priadetails> selectAllBySupplier2(Integer page,Integer limit,String priabillCustom10){
		System.out.println("预付款余额大于0分页的集合："+dao.selectAllBySupplier2(priabillCustom10));
    	PageHelper.startPage(page, limit);
    	List<Priadetails> list=dao.selectAllBySupplier2(priabillCustom10);

    	PageInfo<Priadetails> pageFy=new PageInfo<Priadetails>(list);
    	return pageFy;
	}
	
	public List<Priadetails>  selectByPrimaryKey2(String priabillId){
    	return dao.selectByPrimaryKey2(priabillId);
    }
	
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String priadetailsId){
    	return dao.deleteByPrimaryKey(priadetailsId);
    }

    public int deleteByPrimaryKeyXuzhe(String priabillId) {
    	return dao.deleteByPrimaryKeyXuzhe(priabillId);
    }
    
    public int insert(Priadetails record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Priadetails record){
    	return dao.insertSelective(record);
    }
    
    //Xz新增+删除
    public int insertAndDelete(Priadetails record){
    	//先删除
    	int i = dao.deleteByPrimaryKey(record.getPriadetailsId());
    	System.out.println("PriadetailsService预付款明细--删除成功");
		int ins = dao.insertSelective(record);
		if(ins>0) {
			System.out.println("PriadetailsService预付款明细新--增成功");
			return 1;
		}else {
			return 0;
		}
    }

    public Priadetails selectByPrimaryKey(String priadetailsId){
    	return dao.selectByPrimaryKey(priadetailsId);
    }

    public int updateByPrimaryKeySelective(Priadetails record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Priadetails record){
    	return dao.updateByPrimaryKey(record);
    }
    
    public int selectCount() {
    	return dao.selectCount();
    }
}