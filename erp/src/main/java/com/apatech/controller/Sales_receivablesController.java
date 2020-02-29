package com.apatech.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Receivablesdetails;
import com.apatech.domain.Sales_receivables;
import com.apatech.domain.Sales_receivables;
import com.apatech.service.Sales_receivablesService;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("Sales_receivablesController")
public class Sales_receivablesController {
	@Autowired
	private Sales_receivablesService dao;


	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Sales_receivables> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Sales_receivablesController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Sales_receivables> page=dao.selectAllpage(pageNum, pageSize);
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
	 * @param Sales_receivablesid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Sales_receivables selectByPrimaryKey(Integer Sales_receivablesId) {
		System.out.println("进入Sales_receivablesController根据主键查询");
		System.out.println("Sales_receivablesId="+Sales_receivablesId);
    	return dao.selectByPrimaryKey(Sales_receivablesId);
	}
	
	/**
	 * 查商品记录 （刘成）
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpagebyidlc")
	@ResponseBody
	public PageInfo<Sales_receivables> selectAllpagebyidlc(@RequestParam("page")  Integer page,@RequestParam("limit") Integer limit,String srPcId){
		System.out.println("进入selectAllpagebyidlc分页");
		System.out.println(page+"/"+limit+"/"+srPcId);
		PageInfo<Sales_receivables> pages=dao.selectAllpagebyidlc(page, limit,srPcId);
		return pages;
	}
	
	
	/**
	 * 查详表 （刘成）
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpagebyidlc2")
	@ResponseBody
	public PageInfo<Sales_receivables> selectAllpagebyidlc2(@RequestParam("page")  Integer page,@RequestParam("limit") Integer limit,String srCustom10){
		System.out.println("进入selectAllpagebyidlc分页");
		System.out.println(page+"/"+limit+"/"+srCustom10);
		PageInfo<Sales_receivables> pages=dao.selectAllpagebyidlc2(page, limit,srCustom10);
		return pages;
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Sales_receivables record) {
		System.out.println("进入Sales_receivablesController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Sales_receivables record) {
		System.out.println("进入Sales_receivablesController根据主键修改");
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
	 * @param Sales_receivablesid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(Integer Sales_receivablesId,Model model) {
		System.out.println("进入Sales_receivablesController根据主键删除");
		System.out.println("Sales_receivablesid："+Sales_receivablesId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(Sales_receivablesId);
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
	 * 根据主表id删除
	 * @param recedetailId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByzbidlc",method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> deleteByzbidlc(String receivablesbillId,Model model) {
		System.out.println("进入ReceivablesdetailsController根据主表id删除");
		System.out.println("receivablesbillId："+receivablesbillId);
		Map<String, String> map=new HashMap<String,String>();
		int i =dao.deleteByzbidlc(receivablesbillId);
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