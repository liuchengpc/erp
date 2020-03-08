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

import com.apatech.domain.Sales_quotation_details;
import com.apatech.domain.Sales_quotation_details;
import com.apatech.domain.Sales_quotation_details;
import com.apatech.domain.Sales_quotation_details;
import com.apatech.mapper.Sales_quotation_detailsMapper;
import com.apatech.service.Sales_quotation_detailsService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Sales_quotation_detailsController")
public class Sales_quotation_detailsController {
	@Autowired
	private Sales_quotation_detailsService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Sales_quotation_details> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Sales_quotation_detailsController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Sales_quotation_details> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	//根据关联订单的id修改
	@RequestMapping(value = "updateBysqlid",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateBysqlid(@RequestBody Sales_quotation_details record) {
		System.out.println("进入Sales_quotation_detailsController根据主键修改");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String, String>();
    	int i=dao.updateBysqlid(record);
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
	//获取当前查到的最后一条数据的id
	//tzl
	@RequestMapping(value="selectlimet",method=RequestMethod.GET)
	@ResponseBody
	 public Sales_quotation_details selectlimet(){
    	return dao.selectlimet();
    }
	/**
	 * 根据主键查询
	 * @param sqdId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Sales_quotation_details selectByPrimaryKey(String sqdId) {
		System.out.println("进入Sales_quotation_detailsController根据主键查询");
		System.out.println("sqdId="+sqdId);
    	return dao.selectByPrimaryKey(sqdId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Sales_quotation_details record) {
		System.out.println("进入Sales_quotation_detailsController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Sales_quotation_details record) {
		System.out.println("进入Sales_quotation_detailsController根据主键修改");
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
	 * @param sqdId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String sqdId,Model model) {
		System.out.println("进入Sales_quotation_detailsController根据主键删除");
		System.out.println("sqdId："+sqdId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(sqdId);
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