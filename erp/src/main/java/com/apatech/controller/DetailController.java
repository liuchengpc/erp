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


import com.apatech.domain.Commoditydetail;
import com.apatech.domain.Detail;
import com.apatech.service.CommoditydetailService;
import com.apatech.service.DetailService;
import com.apatech.util.uuid;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("DetailController")
public class DetailController {
	@Autowired
	private DetailService dao;
	@Autowired
	private CommoditydetailService dao2;
	
	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Detail> selectAll(Model model) {
		System.out.println("进入DetailController查询全部");
		List<Detail> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据采购单主表id查询采购单详表集合
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAllByid",method = RequestMethod.GET)
	@ResponseBody
	public List<Detail> selectAllByid(Model model,String billid) {
		System.out.println("进入DetailController查询全部");
		List<Detail> list = dao.selectAllByid(billid);
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Detail selectByPrimaryKey(Integer detailid) {
		System.out.println("进入DetailController根据主键查询");
		System.out.println("detailid="+detailid);
    	return dao.selectByPrimaryKey(detailid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Detail> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入DetailController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Detail> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Detail record) {
		System.out.println("进入DetailController新增");
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
	 * 根据id查询商品详情表后向采购单详表添加数据
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "addxb",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> addxb(
    		String commoditydetailid,//根据商品详情id查询的id
    		String billid//采购单ID
    		) {
		System.out.println("进入DetailController新增");
		Integer a=null;
		Map<String, String> map=new HashMap<String,String>();
		List<Commoditydetail> sp= dao2.selectByPrimaryKey2(commoditydetailid);//获取商品
		
		uuid s=new uuid();		
		String detailid=s.getCode();//采购单ID
		
//		commoditydetailid;//条形码，主键
//		productcodeid;//商品主表ID
//		colorid;//商品颜色ID
//		commoditysizeid;//商品尺码
//		count;//数量
		
//	     Integer detailid;//编号，主键
//	    String billid;//采购单ID
//	    String commoditydetailid;//商品详表id
//	    String name;//商品
//	    String specifications;//规格
//	    Float costprice;//单价
//	    Integer count;//数量
//	    Float moneyamt;//金额
		
		for (int i = 0; i < sp.size(); i++) {
			Detail record=new Detail( billid, commoditydetailid,sp.get(i).getName() ,sp.get(i).getCommoditytypename()+"/"+sp.get(i).getCommoditysize(),sp.get(i).getCostprice() , 1, sp.get(i).getCostprice());
			a=dao.insertSelective(record);
			System.out.println("实体："+record.toString());
		}
	
    	if (a>0) {
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Detail record) {
		System.out.println("进入DetailController根据主键修改");
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
    public Map<String, String> deleteByPrimaryKey(Integer detailid,Model model) {
		System.out.println("进入DetailController根据主键删除");
		System.out.println("detailid："+detailid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(detailid);
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