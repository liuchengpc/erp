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

import com.apatech.domain.Assessment_procurement_fruit;
import com.apatech.domain.Assessment_procurement_fruit;
import com.apatech.domain.Assessment_procurement_fruit;
import com.apatech.mapper.Assessment_procurement_fruitMapper;
import com.apatech.service.Assessment_procurement_fruitService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Assessment_procurement_fruitController")
public class Assessment_procurement_fruitController {
	@Autowired
	private Assessment_procurement_fruitService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Assessment_procurement_fruit> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Assessment_procurement_fruitController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Assessment_procurement_fruit> page=dao.selectAllpage(pageNum, pageSize);
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
	 * @param Assessment_procurement_fruitid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Assessment_procurement_fruit selectByPrimaryKey(String apfId) {
		System.out.println("进入Assessment_procurement_fruitController根据主键查询");
		System.out.println("apfId="+apfId);
    	return dao.selectByPrimaryKey(apfId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Assessment_procurement_fruit record) {
		System.out.println("进入Assessment_procurement_fruitController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Assessment_procurement_fruit record) {
		System.out.println("进入Assessment_procurement_fruitController根据主键修改");
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
	 * @param Assessment_procurement_fruitid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String apfId,Model model) {
		System.out.println("进入Assessment_procurement_fruitController根据主键删除");
		System.out.println("apfId："+apfId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(apfId);
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