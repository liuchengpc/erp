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
import com.apatech.domain.Commoditysize;
import com.apatech.service.CommoditydetailService;
import com.apatech.service.CommoditysizeService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("CommoditysizeController")
public class CommoditysizeController {
	@Autowired
	private CommoditysizeService dao;	
	@Autowired
	private CommoditydetailService dao2;	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Commoditysize> selectAll(Model model) {
		System.out.println("进入CommoditysizeController查询全部");
		List<Commoditysize> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Commoditysize selectByPrimaryKey(Integer commoditysizeid) {
		System.out.println("进入CommoditysizeController根据主键查询");
		System.out.println("billid="+commoditysizeid);
    	return dao.selectByPrimaryKey(commoditysizeid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Commoditysize> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入CommoditysizeController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Commoditysize> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Commoditysize record) {
		System.out.println("进入CommoditysizeController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Commoditysize record) {
		System.out.println("进入CommoditysizeController根据主键修改");
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
    public Map<String, String> deleteByPrimaryKey(Integer commoditysizeid,Model model) {
		System.out.println("进入CommoditysizeController根据主键删除");
		System.out.println("commoditysizeid："+commoditysizeid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(commoditysizeid);
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
	 * 根据主键删除2
	 * @param billid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey2",method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> deleteByPrimaryKey2(Integer commoditysizeid,Model model) {
		System.out.println("进入CommoditysizeController根据主键删除2");
		System.out.println("commoditysizeid："+commoditysizeid);
		Map<String, String> map=new HashMap<String,String>();
		
		List<Commoditydetail> list= dao2.selectAll();
		for (Commoditydetail cd : list) {
			if(cd.getCommoditysizeid()==commoditysizeid){
				map.put("code", "3");
				map.put("message", "此尺码占用，不能删除！");
				return map;
			}
		}
		
		int i =dao.deleteByPrimaryKey(commoditysizeid);
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