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

import com.apatech.domain.Assessment_procurement_detailed;
import com.apatech.domain.Assessment_procurement_detailed;
import com.apatech.domain.Assessment_procurement_detailed;
import com.apatech.mapper.Assessment_procurement_detailedMapper;
import com.apatech.service.Assessment_procurement_detailedService;
@Controller
@RequestMapping("Assessment_procurement_detailedController")
public class Assessment_procurement_detailedController {
	@Autowired
	private Assessment_procurement_detailedService dao;
	
	
	/**
	 * 根据主键查询
	 * @param Assessment_procurement_detailedid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Assessment_procurement_detailed selectByPrimaryKey(String apdId) {
		System.out.println("进入Assessment_procurement_detailedController根据主键查询");
		System.out.println("apdId="+apdId);
    	return dao.selectByPrimaryKey(apdId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Assessment_procurement_detailed record) {
		System.out.println("进入Assessment_procurement_detailedController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Assessment_procurement_detailed record) {
		System.out.println("进入Assessment_procurement_detailedController根据主键修改");
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
	 * @param Assessment_procurement_detailedid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String apdId,Model model) {
		System.out.println("进入Assessment_procurement_detailedController根据主键删除");
		System.out.println("apdId："+apdId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(apdId);
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