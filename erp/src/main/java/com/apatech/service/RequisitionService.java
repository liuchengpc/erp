package com.apatech.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Check;
import com.apatech.domain.Check_detailed;
import com.apatech.domain.Requisition;
import com.apatech.domain.Requisition_detailed;
import com.apatech.domain.Warehouse_detail;
import com.apatech.domain.Requisition;
import com.apatech.domain.Requisition;
import com.apatech.mapper.RequisitionMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class RequisitionService {
	@Autowired
	private RequisitionMapper dao;
	
	@Autowired
	private Requisition_detailedService Rd_dao;
	
	@Autowired
	private WarehouseService Wh_dao;
	
	@Autowired
	private Warehouse_detailService whd_dao;
	
	@Autowired
	private Check_detailedService cd_dao;
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Requisition> selectAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.selectAll().toString());
		 
    	PageHelper.startPage(pageNum, pageSize);
    	List<Requisition> list=dao.selectAll();

    	PageInfo<Requisition> page=new PageInfo<Requisition>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	
	
	/**
	 * 分页联表查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Requisition> queryAllpage(Integer pageNum,Integer pageSize){
    	System.out.println("分页的集合："+dao.queryAllByTime().toString());
    	PageHelper.startPage(pageNum, pageSize);
    	List<Requisition> list=dao.queryAllByTime();
    	System.out.println("循环前数据为"+dao.queryAllByTime());
    	//加入调拨详表和仓库的名称
    	for (Requisition requisition : list) {
    		System.out.println("第一句前");
			requisition.setRd_list(Rd_dao.queryAllByR_Id(requisition.getRequisitionId()));
			System.out.println("第一句"+Rd_dao.queryAllByR_Id(requisition.getRequisitionId()).toString());
			requisition.setRequisitionOutWarehouseName(Wh_dao.selectByPrimaryKey(requisition.getRequisitionOutWarehouse()).getWarehouseName());
			System.out.println("第二句");
			requisition.setRequisitionInputWarehouseName(Wh_dao.selectByPrimaryKey(requisition.getRequisitionInputWarehouse()).getWarehouseName());
			System.out.println("第三句");
		}
    	System.out.println("循环后数据为"+list.toString());
    	PageInfo<Requisition> page=new PageInfo<Requisition>(list);
//		    	System.out.println("分页的集合2："+page.getList().toString());
    	return page;
    }
	 
	 public String getno(String billdate){
	    	return dao.getno(billdate);
    }
	
    public int deleteByPrimaryKey(String requisitionId){
    	return dao.deleteByPrimaryKey(requisitionId);
    }

    public int insert(Requisition record){
    	return dao.insert(record);
    }
    
    public int insertSelective(Requisition record){
    	return dao.insertSelective(record);
    }

    public Requisition selectByPrimaryKey(String requisitionId){
    	return dao.selectByPrimaryKey(requisitionId);
    }

    public int updateByPrimaryKeySelective(Requisition record){
    	return dao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Requisition record){
    	return dao.updateByPrimaryKey(record);
    }
    
    
    public int insertSelective2(Requisition record){
    	int a=0;
    	record.setRequisitionAuditing("0");
    	record.setRequisitionYn("0");
    	a=dao.insertSelective2(record);
    	for(Requisition_detailed c:record.getRd_list()) {
    		c.setRequisitionId(record.getRequisitionId());
    		List<Requisition_detailed> list=Rd_dao.selectAll();
    		int id=Integer.parseInt(list.get(0).getRdId())+1;
    		c.setRdId(Integer.toString(id));
    		c.setRdAuditing("0");
    		c.setRdYn("0");
    		if(Rd_dao.insertSelective2(c)<=0) {
    			return 0;
    		}
    	}
    	return a;
    }
    
    
    public int updateByPrimaryKeySelective2(Requisition record){
    	int a=0;
    	a=dao.updateByPrimaryKeySelective2(record);
    	if(Rd_dao.deleteByrequisitionId(record.getRequisitionId())<=0) {
    		return 0;
    	}
    	for(Requisition_detailed c:record.getRd_list()) {
    		c.setRequisitionId(record.getRequisitionId());
    		List<Requisition_detailed> list=Rd_dao.selectAll();
    		int id=Integer.parseInt(list.get(0).getRdId())+1;
    		c.setRdId(Integer.toString(id));
    		c.setRdAuditing("0");
    		c.setRdYn("0");
    		if(Rd_dao.insertSelective2(c)<=0) {
    			return 0;
    		}
    	}
    	return a;
    }
    /**
     * 	审核
     * @param r
     * @return
     */
    public int sh(Requisition r) {
    	int a=1;
    	if(ck(r)<=0) {
    		return 0;
    	}
    	if(rk(r)<=0) {
    		return 0;
    	}
    	r.setRequisitionAuditing("1");
    	if(dao.updateByPrimaryKeySelective2(r)<=0) {
    		return 0;
    	}
    	return a;
    }
    
    /**
     * 	取消审核
     * @param r
     * @return
     */
    public int qxsh(Requisition r) {
    	int a=1;
    	if(ck2(r)<=0) {
    		return 0;
    	}
    	if(rk2(r)<=0) {
    		return 0;
    	}
    	r.setRequisitionAuditing("0");
    	r.setIsReviewStaff(null);
    	if(dao.updateByPrimaryKeySelective3(r)<=0) {
    		return 0;
    	}
    	return a;
    }
    
    /**
     *	 新增出库记录
     * @return
     */
    public int ck(Requisition r) {
    	int a=1;
    	for(int i=0;i<r.getRd_list().size();i++) {
    		Warehouse_detail wd=new Warehouse_detail();
    		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
    		String time=df.format(new Date());// new Date()为获取当前系统时间
    		//id
    		wd.setWdId(time+whd_dao.getno(time));
    		//出库的仓库id
    		wd.setWarehouseId(r.getRequisitionOutWarehouse());
    		//出库的物料id
    		wd.setMtId(r.getRd_list().get(i).getMatterId());
    		//出库的数量
    		wd.setWdNumber(r.getRd_list().get(i).getRdSingleNum());
    		//状态为出库
    		wd.setWdInorout(1);
    		//出库时的单价
    		wd.setWdUnitRice(cd_dao.queryBykc(r.getRequisitionOutWarehouse(), r.getRd_list().get(i).getMatterId()).getDan_jia());
    		//出库前的上期结存数
    		wd.setWdLastbalancenumber(cd_dao.queryBykc(r.getRequisitionOutWarehouse(), r.getRd_list().get(i).getMatterId()).getKu_cun());
    		//设置状态为未删除
    		wd.setWdYn("0");
    		//为自定义1赋值
    		wd.setWdCustom1(time);
    		if(whd_dao.insertSelective(wd)<=0) {
    			return 0;
    		}
    	}
    	return a;
    }
    /**
     *	 新增入库记录
     * @return
     */
    public int rk(Requisition r) {
    	int a=1;
    	for(int i=0;i<r.getRd_list().size();i++) {
    		Warehouse_detail wd=new Warehouse_detail();
    		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
    		String time=df.format(new Date());// new Date()为获取当前系统时间
    		//id
    		wd.setWdId(time+whd_dao.getno(time));
    		//入库的仓库id
    		wd.setWarehouseId(r.getRequisitionInputWarehouse());
    		//入库的物料id
    		wd.setMtId(r.getRd_list().get(i).getMatterId());
    		//入库的数量
    		wd.setWdNumber(r.getRd_list().get(i).getRdSingleNum());
    		//状态为入库
    		wd.setWdInorout(0);
    		//入库时的单价
    		wd.setWdUnitRice(cd_dao.queryBykc(r.getRequisitionInputWarehouse(), r.getRd_list().get(i).getMatterId()).getDan_jia());
    		//入库前的上期结存数
    		wd.setWdLastbalancenumber(cd_dao.queryBykc(r.getRequisitionInputWarehouse(), r.getRd_list().get(i).getMatterId()).getKu_cun());
    		//设置状态为未删除
    		wd.setWdYn("0");
    		//为自定义1赋值
    		wd.setWdCustom1(time);
    		if(whd_dao.insertSelective(wd)<=0) {
    			return 0;
    		}
    	}
    	return a;
    }
    
    
    
    /**
     *	 新增出库记录(取消审核)
     * @return
     */
    public int ck2(Requisition r) {
    	int a=1;
    	for(int i=0;i<r.getRd_list().size();i++) {
    		Warehouse_detail wd=new Warehouse_detail();
    		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
    		String time=df.format(new Date());// new Date()为获取当前系统时间
    		//id
    		wd.setWdId(time+whd_dao.getno(time));
    		//出库的仓库id
    		wd.setWarehouseId(r.getRequisitionInputWarehouse());
    		//出库的物料id
    		wd.setMtId(r.getRd_list().get(i).getMatterId());
    		//出库的数量
    		wd.setWdNumber(r.getRd_list().get(i).getRdSingleNum());
    		//状态为出库
    		wd.setWdInorout(1);
    		//出库时的单价
    		wd.setWdUnitRice(cd_dao.queryBykc(r.getRequisitionInputWarehouse(), r.getRd_list().get(i).getMatterId()).getDan_jia());
    		//出库前的上期结存数
    		wd.setWdLastbalancenumber(cd_dao.queryBykc(r.getRequisitionInputWarehouse(), r.getRd_list().get(i).getMatterId()).getKu_cun());
    		//设置状态为未删除
    		wd.setWdYn("0");
    		//为自定义1赋值
    		wd.setWdCustom1(time);
    		if(whd_dao.insertSelective(wd)<=0) {
    			return 0;
    		}
    	}
    	return a;
    }
    /**
     *	 新增入库记录(取消审核)
     * @return
     */
    public int rk2(Requisition r) {
    	int a=1;
    	for(int i=0;i<r.getRd_list().size();i++) {
    		Warehouse_detail wd=new Warehouse_detail();
    		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
    		String time=df.format(new Date());// new Date()为获取当前系统时间
    		//id
    		wd.setWdId(time+whd_dao.getno(time));
    		//入库的仓库id
    		wd.setWarehouseId(r.getRequisitionOutWarehouse());
    		//入库的物料id
    		wd.setMtId(r.getRd_list().get(i).getMatterId());
    		//入库的数量
    		wd.setWdNumber(r.getRd_list().get(i).getRdSingleNum());
    		//状态为入库
    		wd.setWdInorout(0);
    		//入库时的单价
    		wd.setWdUnitRice(cd_dao.queryBykc(r.getRequisitionOutWarehouse(), r.getRd_list().get(i).getMatterId()).getDan_jia());
    		//入库前的上期结存数
    		wd.setWdLastbalancenumber(cd_dao.queryBykc(r.getRequisitionOutWarehouse(), r.getRd_list().get(i).getMatterId()).getKu_cun());
    		//设置状态为未删除
    		wd.setWdYn("0");
    		//为自定义1赋值
    		wd.setWdCustom1(time);
    		if(whd_dao.insertSelective(wd)<=0) {
    			return 0;
    		}
    	}
    	return a;
    }
    
}