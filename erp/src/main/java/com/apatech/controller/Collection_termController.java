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

import com.apatech.domain.Collection_term;
import com.apatech.domain.Collection_term;
import com.apatech.domain.Collection_term;
import com.apatech.domain.Collection_term;
import com.apatech.mapper.Collection_termMapper;
import com.apatech.service.Collection_termService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Collection_termController")
public class Collection_termController {
	@Autowired
	private Collection_termService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Collection_term> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Collection_termController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Collection_term> page=dao.selectAllpage(pageNum, pageSize);
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
	 * @param Collection_termid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Collection_term selectByPrimaryKey(String coteId) {
		System.out.println("进入Collection_termController根据主键查询");
		System.out.println("coteId="+coteId);
    	return dao.selectByPrimaryKey(coteId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Collection_term record) {
		System.out.println("进入Collection_termController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Collection_term record) {
		System.out.println("进入Collection_termController根据主键修改");
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
	 * @param Collection_termid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String coteId,Model model) {
		System.out.println("进入Collection_termController根据主键删除");
		System.out.println("coteId："+coteId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(coteId);
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