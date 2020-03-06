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
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Salesorderlist;
import com.apatech.domain.Salesorderlist;
import com.apatech.domain.Salesorderlist;
import com.apatech.domain.Salesorderlist;
import com.apatech.mapper.SalesorderlistMapper;
import com.apatech.service.SalesorderlistService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("SalesorderlistController")
public class SalesorderlistController {
	@Autowired
	private SalesorderlistService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Salesorderlist> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入SalesorderlistController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Salesorderlist> page=dao.selectAllpage(pageNum, pageSize);
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
	 * @param solId
	 * @return
	 */
//	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
//	@ResponseBody
//    public Salesorderlist selectByPrimaryKey(String solId) {
//		System.out.println("进入SalesorderlistController根据主键查询");
//		System.out.println("solId="+solId);
//    	return dao.selectByPrimaryKey(solId);
//	}
	//获取详表数据
	@RequestMapping(value = "selectquerybysolId",method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> selectquerybysolId(String solId){
		System.out.println("进入详表查询方法！ 查询ID:"+solId);
		List<Salesorderlist> data=dao.selectByPrimaryKey(solId);
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("code",0);
		map.put("msg","");
		map.put("count",1000);
		map.put("data",data);
		System.out.println(map);
    	return map;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Salesorderlist record) {
		System.out.println("进入SalesorderlistController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Salesorderlist record) {
		System.out.println("进入SalesorderlistController根据主键修改");
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
	 * @param solId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String solId,Model model) {
		System.out.println("进入SalesorderlistController根据主键删除");
		System.out.println("solId："+solId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(solId);
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