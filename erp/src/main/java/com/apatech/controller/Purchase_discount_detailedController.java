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

import com.apatech.domain.Purchase_discount_detailed;
import com.apatech.domain.Purchase_discount_detailed;
import com.apatech.domain.Purchase_discount_detailed;
import com.apatech.domain.Purchase_discount_detailed;
import com.apatech.mapper.Purchase_discount_detailedMapper;
import com.apatech.service.Purchase_discount_detailedService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Purchase_discount_detailedController")
public class Purchase_discount_detailedController {
	@Autowired
	private Purchase_discount_detailedService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Purchase_discount_detailed> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Purchase_discount_detailedController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Purchase_discount_detailed> page=dao.selectAllpage(pageNum, pageSize);
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
	 * @param pddId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Purchase_discount_detailed selectByPrimaryKey(String pddId) {
		System.out.println("进入Purchase_discount_detailedController根据主键查询");
		System.out.println("pddId="+pddId);
    	return dao.selectByPrimaryKey(pddId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Purchase_discount_detailed record) {
		System.out.println("进入Purchase_discount_detailedController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Purchase_discount_detailed record) {
		System.out.println("进入Purchase_discount_detailedController根据主键修改");
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
	 * @param pddId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String pddId,Model model) {
		System.out.println("进入Purchase_discount_detailedController根据主键删除");
		System.out.println("pddId："+pddId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(pddId);
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