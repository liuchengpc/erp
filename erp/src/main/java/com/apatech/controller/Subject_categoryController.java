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

import com.apatech.domain.Subject_category;
import com.apatech.domain.Subject_category;
import com.apatech.domain.Subject_category;
import com.apatech.domain.Subject_category;
import com.apatech.mapper.Subject_categoryMapper;
import com.apatech.service.Subject_categoryService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Subject_categoryController")
public class Subject_categoryController {
	@Autowired
	private Subject_categoryService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Subject_category> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Subject_categoryController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Subject_category> page=dao.selectAllpage(pageNum, pageSize);
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
	 * @param scId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Subject_category selectByPrimaryKey(String scId) {
		System.out.println("进入Subject_categoryController根据主键查询");
		System.out.println("scId="+scId);
    	return dao.selectByPrimaryKey(scId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Subject_category record) {
		System.out.println("进入Subject_categoryController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Subject_category record) {
		System.out.println("进入Subject_categoryController根据主键修改");
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
	 * @param scId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String scId,Model model) {
		System.out.println("进入Subject_categoryController根据主键删除");
		System.out.println("scId："+scId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(scId);
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