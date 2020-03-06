package com.apatech.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Sales_quotation_details;
import com.apatech.domain.Receivablesdetails;
import com.apatech.domain.Sales_quotation;
import com.apatech.domain.Salesorder;
import com.apatech.domain.Salesorderlist;
import com.apatech.domain.Salesorder;
import com.apatech.domain.Salesorder;
import com.apatech.domain.Salesorder;
import com.apatech.mapper.SalesorderMapper;
import com.apatech.service.SalesorderService;
import com.apatech.service.SalesorderlistService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("SalesorderController")
public class SalesorderController {
	@Autowired
	private SalesorderService dao;
	private SalesorderlistService dao1;
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Salesorder> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入SalesorderController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Salesorder> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	
	/**
	 * 根据主表id查询 （刘成）
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpagelc")
	@ResponseBody
	public PageInfo<Salesorder> selectAllpagelc(@RequestParam("page")  Integer page,@RequestParam("limit") Integer limit){
		System.out.println("进入selectAllpagebyidlc分页");
		System.out.println(page+"/"+limit);
		PageInfo<Salesorder> pages=dao.selectAllpage(page, limit);
		return pages;
	}
	
	/**
	 * 查询全部
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAlllc",method = RequestMethod.GET)
	@ResponseBody
	public List<Salesorder> selectAlllc(){
		System.out.println("进入SalesorderController查询全部");
		return dao.selectAll();
	}
	
	/**
	 * 分页2
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllbypage2",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Salesorder> selectAllbypage2( Integer pageNum,Integer pageSize){
		System.out.println("进入SalesorderController2分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Salesorder> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	/*
	 * 根据id查询详表数据
	 * 
	 */
//	@RequestMapping(value = "selectquerybysolId",method = RequestMethod.GET)
//	@ResponseBody
//	public Map<String,Object> selectquerybysolId(String solId){
//		System.out.println("进入详表查询方法！ 查询ID:"+solId);
//		List<Salesorderlist> data=dao1.selectquerybysolId(solId);
//		HashMap<String,Object> map=new HashMap<String,Object>();
//		map.put("code",0);
//		map.put("msg","");
//		map.put("count",1000);
//		map.put("data",data);
//		System.out.println(map);
//    	return map;
//    }
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
	 * @param soId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String,String> selectByPrimaryKey(String soId) {
		System.out.println("进入SalesorderController根据主键查询");
		System.out.println("soId="+soId);
    	Map<String,String> map=new HashMap<String, String>();
    	Salesorder s=dao.selectByPrimaryKey(soId);
		if(s!=null) {
			map.put("msg","200");
		}else {
			map.put("msg","210");
		}
    	return map;
	}
	/**
	 * 新增 保存1
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective1",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective1(@RequestBody Salesorder record) {
		System.out.println("进入SalesorderController1新增");
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
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Salesorder record) {
		System.out.println("进入SalesorderController新增");
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
	 * 根据主键修改信息订单为删除状态
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective3",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective3(@RequestBody Salesorder record) {
		System.out.println("进入SalesorderController2根据主键修改订单为删除状态");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String, String>();
    	int i=dao.updateByPrimaryKeySelective(record);
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
	 * 根据主键修改订单审批状态
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective1",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective1(@RequestBody Salesorder record) {
		System.out.println("进入SalesorderController根据主键修改");
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
	 * 根据主键修改信息
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective2",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective2(@RequestBody Salesorder record) {
		System.out.println("进入SalesorderController2根据主键修改");
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
	 * 根据主键修改
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Salesorder record) {
		System.out.println("进入SalesorderController根据主键修改");
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
	 * @param soId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String soId,Model model) {
		System.out.println("进入SalesorderController根据主键删除");
		System.out.println("soId："+soId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(soId);
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