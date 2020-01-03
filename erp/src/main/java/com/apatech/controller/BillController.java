package com.apatech.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Bill;
import com.apatech.domain.Commodity;
import com.apatech.domain.Commoditydetail;
import com.apatech.domain.Detail;
import com.apatech.domain.Supplier;
import com.apatech.mapper.CommodityMapper;
import com.apatech.service.BillService;
import com.apatech.service.CommodityService;
import com.apatech.service.CommoditydetailService;
import com.apatech.service.DetailService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("BillController")
public class BillController {
	@Autowired
	private BillService dao;	
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
	public List<Bill> selectAll(Model model) {
		System.out.println("进入BillController查询全部");
		List<Bill> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Bill selectByPrimaryKey(String billid) {
		System.out.println("进入BillController根据主键查询");
		System.out.println("billid="+billid);
    	return dao.selectByPrimaryKey(billid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Bill> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入BillController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Bill> page=dao.selectAllpage(pageNum, pageSize);
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
	public List<Commodity> selectAll2(
			Integer shopid,//店铺
 			@DateTimeFormat(pattern = "yyyy-MM-dd")Date oldtime,//开始时间
 			@DateTimeFormat(pattern = "yyyy-MM-dd")Date newtime,//结束时间
			String selectqb//查找
	){
		System.out.println("进入BillController根据条件查询");
		System.out.println(shopid+"/"+oldtime+"/"+newtime+"/"+selectqb);
    	List<Commodity> list=dao.selectAll2(shopid, oldtime, newtime, selectqb);
    	return list;
    }
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> insertSelective(@RequestBody Bill record) {
		System.out.println("进入BillController新增");
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
	 * 新增采购单主详表
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective2",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective2(@RequestBody Bill record) {
		System.out.println("进入BillController2新增采购单主详表");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String,String>();
    	int i=dao.insertSelective(record);//新增主表
    	if (i>0) {
			List<Detail> list=record.getList();
			for (Detail detail : list) {
				detail.setBillid(record.getBillid());
				int i2=dao2.insertSelective(detail);//新增详表
				if (i2>0) {
				
					
//					Commoditydetail list2=dao3.selectByPrimaryKey(detail.getCommoditydetailid());//根据主键id获取当前商品详情对象
//					list2.setCount(list2.getCount()+detail.getCount());
//					//修改商品详表库存
//					dao3.updateByPrimaryKeySelective(list2);
				
					map.put("code", "1");
					map.put("message", "新增成功！");
					
				}else {
					map.put("code", "2");
					map.put("message", "新增失败！");
				}
			}
    	}else {
			map.put("code", "2");
			map.put("message", "新增失败！");
		}
		return map;
    }

	/**
	 * 修改采购单主详表
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective2",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective2(@RequestBody Bill record) {
		System.out.println("进入updateByPrimaryKeySelective2修改采购单主详表");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String,String>();
    	int i=dao.updateByPrimaryKeySelective(record);//修改主表
    	if (i>0) {
			List<Detail> list=record.getList();
			dao2.deleteByid(record.getBillid());//新增详表//根据采购单主表id删除所有详表数据
			for (Detail detail : list) {
				detail.setBillid(record.getBillid());
				int i2=dao2.insertSelective(detail);//新增详表
				if (i2>0) {
					map.put("code", "1");
					map.put("message", "修改成功！");
				
				}else {
					map.put("code", "2");
					map.put("message", "修改失败！");
				}
			}
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Bill record) {
		System.out.println("进入BillController根据主键修改");
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
	 * 审核采购单
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updatecgdsh",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> updatecgdsh(@RequestBody Bill record) {
		System.out.println("进入BillController审核采购单");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String, String>();
		int i=dao.updateByPrimaryKeySelective(record);
		if (i>0) {
			
			List<Detail> list=dao2.selectAllByid(record.getBillid());//根据采购单主表id获取采购单详表集合
			for (int j = 0; j < list.size(); j++) {//循环采购单详表集合
				Commoditydetail detail=dao4.selectByPrimaryKey(list.get(j).getCommoditydetailid());//根据采购单详表中的商品详表id查询商品详表对象
				detail.setCount(detail.getCount()+list.get(j).getCount());//修改商品详表对象的数量
				dao4.updateByPrimaryKey(detail);//根据商品详表修改商品详表
			}
			
//			统计商品总计
			List<Commodity> commodity =dao3.selectAll();//查询所有商品主表
			for (Commodity c2 : commodity) {
				List<Commoditydetail> detail=dao4.selectByPrimaryKey3(c2.getProductcodeid());//根据商品主表id查询所有商品详表信息
				int count=0;//设置添加数据
				for (Commoditydetail d2 : detail) {//循环详表数据
					count+=d2.getCount();
				}
				c2.setStockcount(count);//把计算的数量添加到主表
				int i2=dao3.updateByPrimaryKey(c2);//修改主表
				if (i2>0) {
					map.put("code", "1");
					map.put("message", "修改成功！");
				} else {
					map.put("code", "2");
					map.put("message", "修改失败！");
				}
			}
//			统计商品总计			
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
    public Map<String, String> deleteByPrimaryKey(String billid,Model model) {
		System.out.println("进入BillController根据主键删除");
		System.out.println("billid："+billid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(billid);
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