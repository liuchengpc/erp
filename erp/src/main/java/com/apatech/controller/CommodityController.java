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
import com.apatech.mapper.ColorMapper;
import com.apatech.mapper.CommoditydetailMapper;
import com.apatech.mapper.CommoditysizeMapper;
import com.apatech.mapper.CommoditytypeMapper;
import com.apatech.service.CommodityService;
import com.apatech.service.CommoditydetailService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("CommodityController")
public class CommodityController {
	@Autowired
	private CommodityService dao;	
	@Autowired
	private CommoditydetailService dao2;	
	@Autowired
	private CommoditydetailMapper ct;
	
	@Autowired
	private CommoditytypeMapper cp;
	
	@Autowired
	private CommoditysizeMapper cs;
	
	@Autowired
	private ColorMapper cr;
	
	@RequestMapping(value="/queryCommodityXZ",method=RequestMethod.GET)
	@ResponseBody
	public List<Commodity> queryCommodityXZ(Commodity c){
		System.out.println("进入查询收银");
		List<Commodity> list = dao.queryCommodityXZ(c);	//查询所有商品
		for (Commodity commodity : list) {
			//根据商品主表ID 查询商品详情
			commodity.setCommoditydetailXZ(ct.queryCommodityDetailByProductCodeID(commodity.getProductcodeid())); 
			System.out.println(commodity.getCommoditydetailXZ());
			//根据商品详情尺码ID，查询商品尺码
			for (Commoditydetail listDetail2 : commodity.getCommoditydetailXZ()) {
				//根据商品详情尺码ID，查询商品尺码
				listDetail2.setCommoditysize(cs.selectByPrimaryKey(listDetail2.getCommoditysizeid()).getCommoditysize());
				listDetail2.setCommoditysizeid(cs.selectByPrimaryKey(listDetail2.getCommoditysizeid()).getCommoditysizeid());
				//根据商品详情颜色ID，查询商品颜色
				listDetail2.setColorid(cr.selectByPrimaryKey(listDetail2.getColorid()).getColorid());
				listDetail2.setColor(cr.selectByPrimaryKey(listDetail2.getColorid()).getColor());
			}
			//根据商品主表的商品类型ID 查询商品类型
			commodity.setCommoditytypeXZ(cp.selectByPrimaryKey(commodity.getCommoditytypeid()));
		}
		
		return list;
	}
	



	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Commodity> selectAll(Model model) {
		System.out.println("进入CommodityController查询全部");
		List<Commodity> list = dao.selectAll();
		return list;
	}
	

	
	
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Commodity selectByPrimaryKey(String productcodeid) {
		System.out.println("进入CommodityController根据主键查询");
		System.out.println("productcodeid="+productcodeid);
    	return dao.selectByPrimaryKey(productcodeid);
    }
	/**
	 * 根据店铺id查询所有商品
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectAllBydpid",method = RequestMethod.GET)
	@ResponseBody
	public List<Commodity> selectAllBydpid(String supplierid) {
		System.out.println("进入CommodityController根据主键查询");
		System.out.println("supplierid="+supplierid);
		return dao.selectAllBydpid(supplierid);
	}
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Commodity> selectAllpage( Integer pageNum,Integer pageSize,Integer commoditytypeid,String selectqb){
		System.out.println("进入CommodityController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Commodity> page=dao.selectAllpage(pageNum, pageSize);
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
	public List<Commodity> selectAll2(Integer commoditytypeid,String selectqb){
		System.out.println("进入CommodityController根据条件查询");
		System.out.println(commoditytypeid+"/"+selectqb);
    	List<Commodity> list=dao.selectAll2(commoditytypeid, selectqb);
    	return list;
    }
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Commodity record) {
		System.out.println("进入CommodityController新增");
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
	 * 新增商品主表
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective2",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective2(@RequestBody Commodity record) {
		System.out.println("进入CommodityController2新增采购单主表");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String,String>();
    	int i=dao.insertSelective(record);//新增主表
    	if (i>0) {
			if (i>0) {
				map.put("code", "1");
				map.put("message", "新增主表成功！");
			}else {
				map.put("code", "2");
				map.put("message", "新增主表失败！");
			}
    	}else {
			map.put("code", "2");
			map.put("message", "新增失败！");
		}
		return map;
    }
	/**
	 * 新增商品详表3
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective3",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> insertSelective3(@RequestBody List<Commoditydetail> record) {
		System.out.println("进入CommodityController3新增采购单详表");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String,String>();
		
	
		List<Commoditydetail> record2=dao2.selectByPrimaryKey3(record.get(0).getProductcodeid());
		for (int i = 0; i < record.size(); i++) {
			for (int j = 0; j < record2.size(); j++) {
				System.out.println(record.get(i).getCommoditydetailid()+"/"+record2.get(j).getCommoditydetailid());
				if (record.get(i).getCommoditydetailid().equals(record2.get(j).getCommoditydetailid())) {
					map.put("code", "1");
					map.put("message", "新增详表成功222222222！");
					return map;
				} 
			}
		}
		
		//防止添加相同的详表
		for (int i = 0; i < record.size(); i++) {
			for (int j = 0; j < record2.size(); j++) {
				if (record.get(i).getColorid()==record2.get(j).getColorid()&&record.get(i).getCommoditysizeid()==record2.get(j).getCommoditysizeid()) {
					//record2.get(j).setCount(record2.get(j).getCount()+record.get(i).getCount());
					dao2.updateByPrimaryKey(record2.get(j));
					record.remove(i);
					break;
				}
			}
		}
		
		if (record!=null) {
			for (Commoditydetail detail : record) {
				int i2=dao2.insertSelective(detail);//新增详表
				if (i2>0) {
					map.put("code", "1");
					map.put("message", "新增详表成功！");
				}else {
					map.put("code", "2");
					map.put("message", "新增详表失败！");
				}
			}
		}else {
			map.put("code", "1");	
			map.put("message", "新增详表成功！");
		}
		return map;
	}

	/**
	 * 修改采购单主表
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective2",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective2(@RequestBody Commodity record) {
		System.out.println("进入updateByPrimaryKeySelective2修改采购单主表");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String,String>();
    	int i=dao.updateByPrimaryKeySelective(record);//修改主表
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
	@RequestMapping(value = "updateByPrimaryKeySelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Commodity record) {
		System.out.println("进入CommodityController根据主键修改");
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
    public Map<String, String> deleteByPrimaryKey(String productcodeid,Model model) {
		System.out.println("进入CommodityController根据主键删除");
		System.out.println("productcodeid："+productcodeid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(productcodeid);
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