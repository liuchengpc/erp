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

import com.apatech.domain.Currency;
import com.apatech.domain.Currency;
import com.apatech.domain.Currency;
import com.apatech.domain.Currency;
import com.apatech.mapper.CurrencyMapper;
import com.apatech.service.CurrencyService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("CurrencyController")
public class CurrencyController {
	@Autowired
	private CurrencyService dao;
	
	//查询所有货币
	@RequestMapping("selectAll")
	@ResponseBody
	public List<Currency> selectAll(){
		return dao.selectAll();
	}
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Currency> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入CurrencyController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Currency> page=dao.selectAllpage(pageNum, pageSize);
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
	public PageInfo<Currency> selectAllpageXz( Integer page,Integer limit){
		System.out.println("进入CurrencyController分页");
		System.out.println(page+"/"+limit);
    	PageInfo<Currency> pageFy=dao.selectAllpage(page, limit);
    	return pageFy;
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
	 * @param Currencyid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Currency selectByPrimaryKey(String currencyId) {
		System.out.println("进入CurrencyController根据主键查询");
		System.out.println("currencyId="+currencyId);
    	return dao.selectByPrimaryKey(currencyId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Currency record) {
		System.out.println("进入CurrencyController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Currency record) {
		System.out.println("进入CurrencyController根据主键修改");
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
	 * @param Currencyid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String currencyId,Model model) {
		System.out.println("进入CurrencyController根据主键删除");
		System.out.println("currencyId："+currencyId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(currencyId);
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