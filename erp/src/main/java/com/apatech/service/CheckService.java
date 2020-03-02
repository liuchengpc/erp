package com.apatech.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Check;
import com.apatech.domain.Check_detailed;
import com.apatech.domain.Check;
import com.apatech.domain.Check;
import com.apatech.mapper.CheckMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CheckService {
	@Autowired
	private CheckMapper dao;
	//仓库表
	@Autowired
	private WarehouseService Wh_dao;
	//盘点详表
	@Autowired
	private Check_detailedService cd_dao;
	//增减科目表
	@Autowired
	private Updown_programService up_dao;
	public PageInfo<Check> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Check> list=dao.selectAll();

    	PageInfo<Check> page=new PageInfo<Check>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 /**
	  * 分页联表查询
	  * @param pageNum
	  * @param pageSize
	  * @return
	  */
	public PageInfo<Check> queryAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.queryAllByTime().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Check> list=dao.queryAllByTime();
    	System.out.println(1);
    	//加入盘点单详表,增值科目名称,减值科目名称,盘点仓库名称
    	for (Check check : list) {
    		System.out.println(2);
    		//盘点单详表
			check.setCd_List(cd_dao.selectAllBycheckId(check.getCheckId()));
			System.out.println(3);
			//增值科目名称
			//System.out.println(up_dao.selectByPrimaryKey("1").toString());
			check.setScAppreciationSubjects_Name(up_dao.selectByPrimaryKey(check.getScAppreciationSubjects()).getUpName());
			System.out.println(4);
			//减值科目名称
			check.setScImpairmentSubjects_Name(up_dao.selectByPrimaryKey(check.getScImpairmentSubjects()).getUpName());
			System.out.println(5);
			//盘点仓库名称
			check.setWarehouse_Name(Wh_dao.selectByPrimaryKey(check.getWarehouseId()).getWarehouseName());
			System.out.println(6);
		}
    	System.out.println(7);
    	PageInfo<Check> page=new PageInfo<Check>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	
	
	
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String checkId){
    	return dao.deleteByPrimaryKey(checkId);
    }

    public int insert(Check record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Check record){
    	return dao.insertSelective(record);
    }
    
    public int insertzx(Check record){
    	int a=0;
    	record.setCheckAuditing("0");
    	record.setCheckYn("0");
    	a=dao.insertSelective2(record);
    	for(Check_detailed c:record.getCd_List()) {
    		c.setCheckId(record.getCheckId());
    		List<Check_detailed> list=cd_dao.selectAll();
    		int id=Integer.parseInt(list.get(0).getCdId())+1;
    		c.setCdId(Integer.toString(id));
    		c.setCdAuditing("0");
    		c.setCdYn("0");
    		if(cd_dao.insertSelective2(c)<=0) {
    			return 0;
    		}
    	}
    	return a;
    }

    public Check selectByPrimaryKey(String checkId){
    	return dao.selectByPrimaryKey(checkId);
    }

    public int updateByPrimaryKeySelective(Check record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Check record){
    	return dao.updateByPrimaryKey(record);
    }
}