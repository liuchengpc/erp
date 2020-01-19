package com.apatech.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Sales_out_warehouse_type;
import com.apatech.domain.Sales_out_warehouse_type;
import com.apatech.domain.Sales_out_warehouse_type;
import com.apatech.mapper.Sales_out_warehouse_typeMapper;
import com.apatech.service.Sales_out_warehouse_typeService;

@Controller
@RequestMapping("Sales_out_warehouse_typeController")
public class Sales_out_warehouse_typeController {
	@Autowired
	private Sales_out_warehouse_typeService dao;
	
	
	/**
	 * 根据主键查询
	 * @param sowtId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Sales_out_warehouse_type selectByPrimaryKey(String sowtId) {
		System.out.println("进入Sales_out_warehouse_typeController根据主键查询");
		System.out.println("sowtId="+sowtId);
    	return dao.selectByPrimaryKey(sowtId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Sales_out_warehouse_type record) {
		System.out.println("进入Sales_out_warehouse_typeController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Sales_out_warehouse_type record) {
		System.out.println("进入Sales_out_warehouse_typeController根据主键修改");
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
	 * @param sowtId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String sowtId,Model model) {
		System.out.println("进入Sales_out_warehouse_typeController根据主键删除");
		System.out.println("sowtId："+sowtId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(sowtId);
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