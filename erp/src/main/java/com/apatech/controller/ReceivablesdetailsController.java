package com.apatech.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import com.apatech.service.ReceivablesdetailsService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("ReceivablesdetailsController")
public class ReceivablesdetailsController {
	@Autowired
	private ReceivablesdetailsService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Receivablesdetails> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入ReceivablesdetailsController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Receivablesdetails> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	
	/**
	 * 根据主表id查询 （刘成）
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpagebyidlc")
	@ResponseBody
	public PageInfo<Receivablesdetails> selectAllpagebyidlc(@RequestParam("page")  Integer page,@RequestParam("limit") Integer limit,String receivablesbillId){
		System.out.println("进入selectAllpagebyidlc分页");
		System.out.println(page+"/"+limit+"/"+receivablesbillId);
		PageInfo<Receivablesdetails> pages=dao.selectAllpagebyidlc(page, limit,receivablesbillId);
		return pages;
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
	 * @param recedetailId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Receivablesdetails selectByPrimaryKey(String recedetailId) {
		System.out.println("进入ReceivablesdetailsController根据主键查询");
		System.out.println("recedetailId="+recedetailId);
    	return dao.selectByPrimaryKey(recedetailId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Receivablesdetails record) {
		System.out.println("进入ReceivablesdetailsController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Receivablesdetails record) {
		System.out.println("进入ReceivablesdetailsController根据主键修改");
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
	 * @param recedetailId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String recedetailId,Model model) {
		System.out.println("进入ReceivablesdetailsController根据主键删除");
		System.out.println("recedetailId："+recedetailId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(recedetailId);
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