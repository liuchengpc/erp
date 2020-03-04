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

import com.apatech.domain.Requisition;
import com.apatech.domain.Requisition;
import com.apatech.domain.Requisition;
import com.apatech.domain.Requisition;
import com.apatech.mapper.RequisitionMapper;
import com.apatech.service.RequisitionService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("RequisitionController")
public class RequisitionController {
	@Autowired
	private RequisitionService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Requisition> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入RequisitionController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Requisition> page=dao.selectAllpage(pageNum, pageSize);
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
	 * @param requisitionId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Requisition selectByPrimaryKey(String requisitionId) {
		System.out.println("进入RequisitionController根据主键查询");
		System.out.println("requisitionId="+requisitionId);
    	return dao.selectByPrimaryKey(requisitionId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Requisition record) {
		System.out.println("进入RequisitionController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Requisition record) {
		System.out.println("进入RequisitionController根据主键修改");
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
	 * @param requisitionId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String requisitionId,Model model) {
		System.out.println("进入RequisitionController根据主键删除");
		System.out.println("requisitionId："+requisitionId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(requisitionId);
		if (i>0) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		}else {
			map.put("code", "2");
			map.put("message", "删除失败！");
		}
		return map;
    }
	
	
	/**
	 * 主详表分页联查
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "queryAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Requisition> queryAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入RequisitionController主详表分页联查");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Requisition> page=dao.queryAllpage(pageNum, pageSize);
    	System.out.println("出RequisitionController主详表分页联查的数据为"+page.toString());
    	return page;
    	
    }
	
	
	
	/**
	 * 主详表新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertzx",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertzx(@RequestBody Requisition record) {
		System.out.println("进入RequisitionController主详表新增");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String,String>();
    	int i=dao.insertSelective2(record);
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
	 * 根据主键联表修改
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective2",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective2(@RequestBody Requisition record) {
		System.out.println("进入RequisitionController根据主键联表修改");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String, String>();
    	int i=dao.updateByPrimaryKeySelective2(record);
    	if (i>0) {
			map.put("code", "1");
			map.put("message", "修改成功！");
		}else {
			map.put("code", "2");
			map.put("message", "修改失败！");
		}
		return map;
    }
}