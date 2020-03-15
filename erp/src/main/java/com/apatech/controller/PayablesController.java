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

import com.apatech.domain.Payables;
import com.apatech.domain.Purchase_jiaoyi;
import com.apatech.domain.Payables;
import com.apatech.domain.Payables;
import com.apatech.domain.Payables;
import com.apatech.mapper.PayablesMapper;
import com.apatech.service.PayablesService;
import com.apatech.service.Purchase_jiaoyiService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("PayablesController")
public class PayablesController {
	@Autowired
	private PayablesService dao;
	
	@Autowired
	private Purchase_jiaoyiService daoJy;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Payables> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入PayablesController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Payables> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	/**
	 * 查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAll2",method = RequestMethod.GET)
	@ResponseBody
	public int selectAll2(String payablesSupplierName){
		System.out.println("进入PayablesController查询");
		System.out.println(dao.selectAll2(payablesSupplierName));
    	if(dao.selectAll2(payablesSupplierName).isEmpty()) {
    		System.out.println("0");
    		return 0;
    	}
    	System.out.println("1");
    	return 1;
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
	 * @param payablesId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Payables selectByPrimaryKey(String payablesId) {
		System.out.println("进入PayablesController根据主键查询");
		System.out.println("payablesId="+payablesId);
    	return dao.selectByPrimaryKey(payablesId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Payables record) {
		System.out.println("进入PayablesController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Payables record) {
		System.out.println("进入PayablesController根据主键修改");
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
	 * 根据主键修改
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective2",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective2(@RequestBody Payables record) {
		System.out.println("进入PayablesController根据主键修改");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String, String>();
    	int i=dao.updateByPrimaryKeySelective(record);
    	if (i>0) {
    		Purchase_jiaoyi jy = new Purchase_jiaoyi();
    		jy.setJyData(record.getPayablesPayablestime());
    		jy.setJySupplierName(record.getPayablesSupplierName());
    		jy.setJyNumber(record.getPayablesCustom2());
    		jy.setJyType("应付冲款单(冲款)");
    		jy.setJyPayables(0-record.getPayablesPrice1());
    		jy.setJyPayablesBb(0-record.getPayablesPrice1());
    		jy.setJyCustom3(record.getPayablesId());
    		int u = daoJy.insertSelective(jy);
    		if(u>0) {
    			System.out.println("供应商预付款明细新增成功！");
    		}else {
    			System.out.println("供应商预付款明细新增失败！");
    		}
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
	 * @param payablesId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String payablesId,Model model) {
		System.out.println("进入PayablesController根据主键删除");
		System.out.println("payablesId："+payablesId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(payablesId);
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
	 * 根据主键删除 Xz专属
	 * @param payablesId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey2",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey2(String payablesSupplierName,Model model) {
		System.out.println("进入PayablesController根据主键删除");
		System.out.println("payablesSupplierName："+payablesSupplierName);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey2(payablesSupplierName);
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