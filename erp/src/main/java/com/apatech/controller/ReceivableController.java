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

import com.apatech.domain.Receivable;
import com.apatech.domain.Receivable;
import com.apatech.domain.Receivable;
import com.apatech.domain.Receivable;
import com.apatech.mapper.ReceivableMapper;
import com.apatech.service.ReceivableService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("ReceivableController")
public class ReceivableController {
	@Autowired
	private ReceivableService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Receivable> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入ReceivableController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Receivable> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	
	/**
	 * 判断是预收款或应收款 分页 刘成
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpagelc",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Receivable> selectAllpagelc( Integer pageNum,Integer pageSize,String payablesCustom2){
		System.out.println("进入ReceivableController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Receivable> page=dao.selectAllpagelc(pageNum, pageSize,payablesCustom2);
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
	 * @param receivableId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Receivable selectByPrimaryKey(String receivableId) {
		System.out.println("进入ReceivableController根据主键查询");
		System.out.println("receivableId="+receivableId);
    	return dao.selectByPrimaryKey(receivableId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Receivable record) {
		System.out.println("进入ReceivableController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Receivable record) {
		System.out.println("进入ReceivableController根据主键修改");
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
	 * @param receivableId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String receivableId,Model model) {
		System.out.println("进入ReceivableController根据主键删除");//*
		System.out.println("receivableId："+receivableId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(receivableId);
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
	 * 3
	 * 7
	 */
}