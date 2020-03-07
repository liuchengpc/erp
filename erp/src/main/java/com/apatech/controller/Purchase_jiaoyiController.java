package com.apatech.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Purchase_jiaoyi;
import com.apatech.service.Purchase_jiaoyiService;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("Purchase_jiaoyiController")
public class Purchase_jiaoyiController {
	@Autowired
	private Purchase_jiaoyiService dao;

	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Purchase_jiaoyi> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Purchase_jiaoyiController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Purchase_jiaoyi> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	/**
	 * 分页 Xz专属
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpageXz",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Purchase_jiaoyi> selectAllpageXz( Integer page,Integer limit){
		System.out.println("进入Purchase_jiaoyiController分页");
		System.out.println(page+"/"+limit);
    	PageInfo<Purchase_jiaoyi> pageFv=dao.selectAllpage(page, limit);
    	return pageFv;
    }
	
	/**
	 * 分页 Xz专属
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value = "selectAllpageXz2",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Purchase_jiaoyi> selectAllpageXz2( Integer page,Integer limit,Purchase_jiaoyi jiaoyi) throws ParseException{
		System.out.println("进入Purchase_jiaoyiController分页 Xz2");
		System.out.println(page+"/"+limit);
    	PageInfo<Purchase_jiaoyi> pageFv=dao.selectAllpage(page, limit,jiaoyi);
    	return pageFv;
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
	 * @param Purchase_jiaoyiid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Purchase_jiaoyi selectByPrimaryKey(Integer apId) {
		System.out.println("进入Purchase_jiaoyiController根据主键查询");
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
    public Map<String, String> insertSelective(@RequestBody Purchase_jiaoyi record) {
		System.out.println("进入Purchase_jiaoyiController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Purchase_jiaoyi record) {
		System.out.println("进入Purchase_jiaoyiController根据主键修改");
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
	 * @param Purchase_jiaoyiid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(Integer apId,Model model) {
		System.out.println("进入Purchase_jiaoyiController根据主键删除");
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
	
	/**
	 * 根据单号删除
	 * @param Purchase_jiaoyiid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey3",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey3(String jyNumber,Model model) {
		System.out.println("进入Purchase_jiaoyiController根据主键删除");
		System.out.println("jyNumber："+jyNumber);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey3(jyNumber);
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