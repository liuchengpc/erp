package com.apatech.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Sales_out_warehouse;
import com.apatech.domain.Sales_out_warehouse_detailed;
import com.apatech.domain.Sales_out_warehouse;
import com.apatech.domain.Sales_out_warehouse;
import com.apatech.domain.Sales_out_warehouse;
import com.apatech.mapper.Sales_out_warehouseMapper;
import com.apatech.service.Sales_out_warehouseService;
import com.apatech.service.Sales_out_warehouse_detailedService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Sales_out_warehouseController")
public class Sales_out_warehouseController {
	@Autowired
	private Sales_out_warehouseService dao;
	
	@Autowired
	private Sales_out_warehouse_detailedService daoo;	
	
	@RequestMapping("/update")
	@ResponseBody
	public int update(@RequestBody Sales_out_warehouse stu) {
		daoo.deletelist(stu.getSowId());
		for (Sales_out_warehouse_detailed item : stu.getList()) {
			item.setSowId(stu.getSowId());
			daoo.insert(item);
		}
		return dao.updateByPrimaryKey(stu);
		
	}
	
	@RequestMapping("/autddert")
	@ResponseBody
	public int autddert(String id,String sid) {
		return dao.selectlist(id, sid);
		
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public int delete(String sowId) {
		return dao.deletelist(sowId);
				
	}
	
	
	@RequestMapping("/insert")
	@ResponseBody
	public int insert(@RequestBody Sales_out_warehouse record) {
		int i=dao.insert(record);
		if(i>0) {
			for (Sales_out_warehouse_detailed item : record.getList()) {
				item.setSowId(record.getSowId());
				daoo.insert(item);
			}
			return 1;
		}else {
			return 0;
		}
	}
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Sales_out_warehouse> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Sales_out_warehouseController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Sales_out_warehouse> page=dao.selectAllpage(pageNum, pageSize);
    	for (Sales_out_warehouse item : page.getList()) {
			item.setList(daoo.selectlist(item.getSowId()));
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
	 * @param sowId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Sales_out_warehouse selectByPrimaryKey(String sowId) {
		System.out.println("进入Sales_out_warehouseController根据主键查询");
		System.out.println("sowId="+sowId);
    	return dao.selectByPrimaryKey(sowId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Sales_out_warehouse record) {
		System.out.println("进入Sales_out_warehouseController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Sales_out_warehouse record) {
		System.out.println("进入Sales_out_warehouseController根据主键修改");
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
	 * @param sowId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String sowId,Model model) {
		System.out.println("进入Sales_out_warehouseController根据主键删除");
		System.out.println("sowId："+sowId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(sowId);
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