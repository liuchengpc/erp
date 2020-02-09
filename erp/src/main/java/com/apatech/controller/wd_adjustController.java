package com.apatech.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.apatech.domain.Adjust_price;
import com.apatech.domain.wd_Adjust_price;
import com.apatech.domain.Adjust_price;
import com.apatech.service.Adjust_priceService;
import com.apatech.service.wd_Adjust_priceService;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("wd_adjustController")
public class wd_adjustController {
	@Autowired
	private Adjust_priceService dao;
	
	@Autowired
	private wd_Adjust_priceService wddao;
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<wd_Adjust_price> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<wd_Adjust_price> page=wddao.wdselectAllpage(pageNum, pageSize);
    	return page;
    }
	
	
	@RequestMapping(value = "queryMater",method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> queryMater(String matterCustom6){
		System.out.println("查询物料信息！ 查询ID"+matterCustom6);
		List<wd_Adjust_price> data=wddao.queryMater(matterCustom6);
		HashMap<String,Object> map=new HashMap<String,Object>();
		  map.put("code",0);
		  map.put("msg","");
		  map.put("count",1000);
		  map.put("data",data);
		  System.out.println(map);
		     return map;
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
	 * @param Adjust_priceid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Adjust_price selectByPrimaryKey(String apId) {
		System.out.println("进入Adjust_priceController根据主键查询");
		System.out.println("apId="+apId);
    	return dao.selectByPrimaryKey(apId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Adjust_price record) {
		System.out.println("进入Adjust_priceController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Adjust_price record) {
		System.out.println("进入Adjust_priceController根据主键修改");
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
	 * @param Adjust_priceid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String apId,Model model) {
		System.out.println("进入Adjust_priceController根据主键删除");
		System.out.println("apId："+apId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(apId);
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