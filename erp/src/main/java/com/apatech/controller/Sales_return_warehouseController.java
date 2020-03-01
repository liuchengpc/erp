package com.apatech.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Sales_out_warehouse;
import com.apatech.domain.Sales_out_warehouse_detailed;
import com.apatech.domain.Sales_return_warehouse;
import com.apatech.domain.Sales_return_warehouse_detailed;
import com.apatech.domain.Warehouse_detail;
import com.apatech.service.Sales_return_warehouse_detailedService;
import com.apatech.service.Warehouse_detailService;
import com.apatech.service.PayablesmainService;
import com.apatech.service.Sales_out_warehouseService;
import com.apatech.service.Sales_return_warehouseService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Sales_return_warehouseController")
public class Sales_return_warehouseController {
	@Autowired
	private Sales_return_warehouseService dao;
	
	@Autowired
	private Sales_return_warehouse_detailedService daoo;	
	
	@Autowired
	private Warehouse_detailService wares;	
	
	@Autowired
	private PayablesmainService pay;	
	
	@Autowired
	private Sales_out_warehouseService sale;	
	
	@RequestMapping("/selectcount")
	@ResponseBody
	public int selectcount() {
		return dao.selectcount();
	}
	
	@RequestMapping("/selectcountby")
	@ResponseBody
	public int selectcountby(String id) {
		return dao.selectcountby(id);
	}
	
	
	
	@RequestMapping("/update")
	@ResponseBody
	public int update(@RequestBody Sales_return_warehouse stu) {
		daoo.deletelist(stu.getSrwId());
		for (Sales_return_warehouse_detailed item : stu.getList()) {
			item.setSrwId(stu.getSrwId());
			daoo.insert(item);
		}
		return dao.updateByPrimaryKey(stu);
		
	}
	
	@RequestMapping("/autddert")
	@ResponseBody
	public int autddert(String id,String sid) {
		int autd=0;
		Sales_return_warehouse stu = dao.selectByPrimaryKey(id);
		stu.setList(daoo.selectlist(stu.getSrwId()));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		if(sid.equals("1")) {	
			if(sale.selectbysh(stu.getSrwDocumentNumber()).equals("1")) {
		int count=wares.selectcount();
		for (Sales_return_warehouse_detailed item : stu.getList()) {
			count+=1;
			int count2=wares.selectbyid(stu.getWarehouseId(), item.getMatterId());
			Warehouse_detail sky=new Warehouse_detail(count+"",stu.getWarehouseId(), item.getMatterId(), item.getSrwdPrice(), item.getSrwdSingleStatus(), 0, count2, "1","0", df.format(new Date()), null, null, null, null, null);
			wares.insert(sky);
		}
		autd=dao.selectlist(id, sid);
			}
		}else {
			if(pay.selectbysh(stu.getSrwDocumentNumber()).equals("0")) {
			int count=wares.selectcount();
			for (Sales_return_warehouse_detailed item : stu.getList()) {
				count+=1;
				int count2=wares.selectbyid(stu.getWarehouseId(), item.getMatterId());
				Warehouse_detail sky=new Warehouse_detail(count+"",stu.getWarehouseId(), item.getMatterId(), item.getSrwdPrice(), item.getSrwdSingleStatus(), 1, count2, "1","0", df.format(new Date()), null, null, null, null, null);
				wares.insert(sky);
			}
			autd=dao.selectlist(id, sid);
			}
		}
		return autd; 
		
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public int delete(String srwId) {
		return dao.deletelist(srwId);
				
	}
	
	
	@RequestMapping("/insert")
	@ResponseBody
	public int insert(@RequestBody Sales_return_warehouse record) {
		int i=dao.insert(record);
		if(i>0) {
			for (Sales_return_warehouse_detailed item : record.getList()) {
				item.setSrwId(record.getSrwId());
				daoo.insert(item);
			}
			return 1;
		}else {
			return 0;
		}
	}
	
	
	/**
	 * 分页ya
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Sales_return_warehouse> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Sales_return_warehouseController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Sales_return_warehouse> page=dao.selectAllpage(pageNum, pageSize);
    	for (Sales_return_warehouse item : page.getList()) {
			item.setList(daoo.selectlist(item.getSrwId()));
		}
    	return page;
    }
	
	/**
	 * 获取单号
	 * @param billdate
	 * @return
	 */
	@RequestMapping(value="getno",method=RequestMethod.GET)
	@ResponseBody
	 public String getno(String billdate){
		System.out.println(billdate);
		System.out.println(dao.getno(billdate));
		String s=dao.getno(billdate);
    	return s;
    }
	
	
	/**
	 * 根据主键查询
	 * @param srwId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Sales_return_warehouse selectByPrimaryKey(String srwId) {
		System.out.println("进入Sales_return_warehouseController根据主键查询");
		System.out.println("srwId="+srwId);
    	return dao.selectByPrimaryKey(srwId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Sales_return_warehouse record) {
		System.out.println("进入Sales_return_warehouseController新增");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String,String>();
    	int i=dao.insertSelective(record);
    	if (i>0) {
			map.put("code", "1");
			map.put("message", "新增成功！");
		}else {
			map.put("code", "2");
			map.put("message", "新增失败！");
		}
		return map;
    }

	/**
	 * 根据主键修改
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Sales_return_warehouse record) {
		System.out.println("进入Sales_return_warehouseController根据主键修改");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String, String>();
    	int i=dao.updateByPrimaryKeySelective(record);
    	if (i>0) {
			map.put("code", "1");
			map.put("message", "修改成功！");
		}else {
			map.put("code", "2");
			map.put("message", "修改失败！");
		}
		return map;
    }
	/**
	 * 根据主键删除
	 * @param srwId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String srwId,Model model) {
		System.out.println("进入Sales_return_warehouseController根据主键删除");
		System.out.println("srwId："+srwId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(srwId);
		if (i>0) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		}else {
			map.put("code", "2");
			map.put("message", "删除失败！");
		}
		return map;
    }
}