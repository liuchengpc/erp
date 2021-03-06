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

import com.apatech.domain.Customer;
import com.apatech.domain.Supplier;
import com.apatech.domain.Customer;
import com.apatech.domain.Customer;
import com.apatech.domain.Customer;
import com.apatech.mapper.CustomerMapper;
import com.apatech.service.CustomerService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("CustomerController")
public class CustomerController {
	@Autowired
	private CustomerService dao;
	
	//查询所有客户
	@RequestMapping("selectAll")
	@ResponseBody
	public List<Customer> selectAll(){
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
	public PageInfo<Customer> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入CustomerController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Customer> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	/**
	 * 分页 刘成专属
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpagelc",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Customer> selectAllpagelc( Integer page,Integer limit){
		System.out.println("进入CustomerController分页");
		System.out.println(page+"/"+limit);
    	PageInfo<Customer> pageFy=dao.selectAllpage(page, limit);
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
	 * @param customerId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Customer selectByPrimaryKey(String customerId) {
		System.out.println("进入CustomerController根据主键查询");
		System.out.println("customerId="+customerId);
    	return dao.selectByPrimaryKey(customerId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Customer record) {
		System.out.println("进入CustomerController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Customer record) {
		System.out.println("进入CustomerController根据主键修改");
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
	 * @param customerId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String customerId,Model model) {
		System.out.println("进入CustomerController根据主键删除");
		System.out.println("customerId："+customerId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(customerId);
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