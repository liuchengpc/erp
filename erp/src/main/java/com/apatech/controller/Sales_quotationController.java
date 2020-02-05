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

import com.alibaba.fastjson.JSON;
import com.apatech.domain.Sales_quotation;
import com.apatech.domain.Sales_quotation_details;
import com.apatech.domain.Team;
import com.apatech.domain.Sales_quotation;
import com.apatech.domain.Sales_quotation;
import com.apatech.domain.Sales_quotation;
import com.apatech.domain.Sales_quotation;
import com.apatech.mapper.Sales_quotationMapper;
import com.apatech.service.Sales_quotationService;
import com.apatech.service.Sales_quotation_detailsService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Sales_quotationController")
public class Sales_quotationController {
	@Autowired
	private Sales_quotationService dao;
	@Autowired
	private Sales_quotation_detailsService dao1;
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Sales_quotation> selectAllpage( Integer pageNum,Integer pageSize){
		if(pageNum==null) {
			pageNum=1;
		}
		if(pageSize==null){
			pageSize=1;
		}
		System.out.println("进入Sales_quotationController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Sales_quotation> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	/*
	 * 根据id获取详表数据
	 * */
	@RequestMapping(value = "querybysqid",method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> querybysqid(String sqlid){
		System.out.println("进入详表查询方法！ 查询ID"+sqlid);
		List<Sales_quotation_details> data=dao1.querybysqlid(sqlid);
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
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Sales_quotation record) {
		System.out.println("进入Sales_quotationController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Sales_quotation record) {
		System.out.println("进入Sales_quotationController根据主键修改");
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
	 * @param sqId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String sqId,Model model){
		System.out.println("进入Sales_quotationController根据主键删除");
		System.out.println("sqId："+sqId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(sqId);
		if (i>0) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		}else{
			map.put("code", "2");
			map.put("message", "删除失败！");
		}
		return map;
    }
}