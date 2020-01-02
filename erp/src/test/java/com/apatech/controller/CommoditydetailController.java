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

import com.apatech.domain.Commodity;
import com.apatech.domain.Commoditydetail;
import com.apatech.service.CommoditydetailService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("CommoditydetailController")
public class CommoditydetailController {
	@Autowired
	private CommoditydetailService dao;	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Commoditydetail> selectAll(Model model) {
		System.out.println("进入CommoditydetailController查询全部");
		List<Commoditydetail> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Commoditydetail selectByPrimaryKey(String commoditydetailid) {
		System.out.println("进入CommoditydetailController根据主键查询");
		System.out.println("commoditydetailid="+commoditydetailid);
    	return dao.selectByPrimaryKey(commoditydetailid);
    }
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Commoditydetail> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入CommoditydetailController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Commoditydetail> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Commoditydetail record) {
		System.out.println("进入CommoditydetailController新增");
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
	 * 根据条件查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAll2",method = RequestMethod.GET)
	@ResponseBody
	public List<Commoditydetail> selectAll2(Integer commoditytypeid,String selectqb){
		System.out.println("进入CommodityController根据条件查询");
		System.out.println(commoditytypeid+"/"+selectqb);
    	List<Commoditydetail> list=dao.selectAll2(commoditytypeid, selectqb);
    	return list;
    }
	/**
	 * 根据主键修改
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Commoditydetail record) {
		System.out.println("进入CommoditydetailController根据主键修改");
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
    public Map<String, String> deleteByPrimaryKey(String commoditydetailid,Model model) {
		System.out.println("进入CommoditydetailController根据主键删除");
		System.out.println("commoditydetailid："+commoditydetailid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(commoditydetailid);
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