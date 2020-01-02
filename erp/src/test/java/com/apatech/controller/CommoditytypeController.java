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
import com.apatech.domain.Commoditytype;
import com.apatech.service.CommodityService;
import com.apatech.service.CommoditytypeService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("CommoditytypeController")
public class CommoditytypeController {
	@Autowired
	private CommoditytypeService dao;	
	@Autowired
	private CommodityService dao2;	
	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/queryCommodityType",method=RequestMethod.GET)
	@ResponseBody
	public PageInfo<Commoditytype> queryCommodityType(Integer pageNum,Integer pageSize){
		return dao.queryCommodityType(pageNum, pageSize);
	}
	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Commoditytype> selectAll(Model model) {
		System.out.println("进入CommoditytypeController查询全部");
		List<Commoditytype> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Commoditytype selectByPrimaryKey(Integer commoditytypeid) {
		System.out.println("进入CommoditytypeController根据主键查询");
		System.out.println("commoditytypeid="+commoditytypeid);
    	return dao.selectByPrimaryKey(commoditytypeid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Commoditytype> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入CommoditytypeController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Commoditytype> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Commoditytype record) {
		System.out.println("进入CommoditytypeController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Commoditytype record) {
		System.out.println("进入CommoditytypeController根据主键修改");
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
    public Map<String, String> deleteByPrimaryKey(Integer commoditytypeid,Model model) {
		System.out.println("进入CommoditytypeController根据主键删除");
		System.out.println("commoditytypeid："+commoditytypeid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(commoditytypeid);
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
	 * 查询商品表是否有引用type
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selecttypeid",method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> selecttypeid(Model model,Integer commoditytypeid) {
		System.out.println("进入查询商品表是否有引用type");
		System.out.println("进入CommoditytypeController根据主键删除");
		System.out.println("commoditytypeid："+commoditytypeid);
		Map<String, String> map=new HashMap<String,String>();
		List<Commodity> list = dao2.selectAll();
		for (Commodity cd : list) {
			if(cd.getCommoditytypeid()==commoditytypeid) {
				
		    	int i =dao.deleteByPrimaryKey(commoditytypeid);
				if (i>0) {
					map.put("code", "1");
					map.put("message", "删除成功！");
				}else {
					map.put("code", "2");
					map.put("message", "删除失败！");
				}
			}else {
				map.put("code", "2");
				map.put("message", "该类型被引用，不能删除！");
			}
		}
		return map;
	}

}