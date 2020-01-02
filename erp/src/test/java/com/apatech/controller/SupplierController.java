package com.apatech.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Supplier;
import com.apatech.service.CommodityService;
import com.apatech.service.CommoditydetailService;
import com.apatech.service.DetailService;
import com.apatech.service.SupplierService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("SupplierController")
public class SupplierController {
	@Autowired
	private SupplierService dao;	
	
	@Autowired
	private DetailService dao2;	
	@Autowired
	private CommodityService dao3;	
	@Autowired
	private CommoditydetailService dao4;	
	
	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Supplier> selectAll(Model model) {
		System.out.println("进入SupplierController查询全部");
		List<Supplier> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Supplier selectByPrimaryKey(Integer supplierid) {
		System.out.println("进入SupplierController根据主键查询");
		System.out.println("supplierid="+supplierid);
    	return dao.selectByPrimaryKey(supplierid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Supplier> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入SupplierController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Supplier> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	/**
	 * 根据条件查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAll2",method = RequestMethod.GET)
	@ResponseBody
	public List<Supplier> selectAll2(
			String province,//省（地址）
			String city,//省（地址）
			String region,//地区（地址）
			String selectqb){
		System.out.println("进入CommodityController根据条件查询");
		System.out.println(province+"/"+city+"/"+region+"/"+selectqb);
    	List<Supplier> list=dao.selectAll2(province,city,region, selectqb);
    	return list;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Supplier record) {
		System.out.println("进入SupplierController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Supplier record) {
		System.out.println("进入SupplierController根据主键修改");
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
	 * @param billid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(Integer supplierid,Model model) {
		System.out.println("进入SupplierController根据主键删除");
		System.out.println("supplierid："+supplierid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(supplierid);
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