package com.apatech.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.apatech.domain.Supplier;
import com.apatech.domain.Supplier;
import com.apatech.domain.Supplier;
import com.apatech.domain.Supplier;
import com.apatech.mapper.SupplierMapper;
import com.apatech.service.SupplierService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("SupplierController")
public class SupplierController {
	@Autowired
	private SupplierService dao;
	
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
	 * 分页 Xz专属
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpageXz",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Supplier> selectAllpageXz( Integer page,Integer limit){
		System.out.println("进入SupplierController分页");
		System.out.println(page+"/"+limit);
    	PageInfo<Supplier> pageFy=dao.selectAllpage(page, limit);
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
	 * @param supplierId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Supplier selectByPrimaryKey(String supplierId) {
		System.out.println("进入SupplierController根据主键查询");
		System.out.println("supplierId="+supplierId);
    	return dao.selectByPrimaryKey(supplierId);
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
	 * 根据主键修改
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective2",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective2(String ppPayablesmainPrice,String ppOffsetamount,String payablesSupplierName) {
		System.out.println("进入"+payablesSupplierName+"供应商查询修改付款信息");
		Map<String, String> map=new HashMap<String,String>();
		Supplier sp = dao.selectByPrimaryKey2(payablesSupplierName);
		System.out.println("查询结果:"+sp);
		System.out.println("期末预付款:"+(sp.getSupplierCuendcollect()-Float.parseFloat(ppOffsetamount)));
		sp.setSupplierCuendcollect(sp.getSupplierCuendcollect()-Float.parseFloat(ppOffsetamount));
		System.out.println("期末应付款："+(sp.getSupplierCuendshouldcollect()-Float.parseFloat(ppPayablesmainPrice)));
		sp.setSupplierCuendshouldcollect((sp.getSupplierCuendshouldcollect()-Float.parseFloat(ppPayablesmainPrice)));
		System.out.println("剩余额度："+(sp.getSupplierResiduemonet()+Float.parseFloat(ppPayablesmainPrice)-Float.parseFloat(ppOffsetamount)));
		sp.setSupplierResiduemonet((sp.getSupplierResiduemonet()+Float.parseFloat(ppPayablesmainPrice)-Float.parseFloat(ppOffsetamount)));
		System.out.println("修改供应商:"+sp.getSupplierName());
		int h = dao.updateByPrimaryKeySelective2(sp);
		if(h>0) {
			map.put("code", "1");
			map.put("message", "审核成功！");
		}
		return map;
    }
	
	/**
	 * 根据主键修改
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective3",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective3(String ppPayablesmainPrice,String ppOffsetamount,String payablesSupplierName) {
		System.out.println("进入"+payablesSupplierName+"供应商查询修改付款信息");
		Map<String, String> map=new HashMap<String,String>();
		Supplier sp = dao.selectByPrimaryKey2(payablesSupplierName);
		System.out.println("查询结果:"+sp);
		System.out.println("期末预付款:"+Float.parseFloat(ppOffsetamount));
		sp.setSupplierCuendcollect(Float.parseFloat(ppOffsetamount));
		System.out.println("期末应付款："+(sp.getSupplierCuendshouldcollect()+Float.parseFloat(ppPayablesmainPrice)));
		sp.setSupplierCuendshouldcollect((sp.getSupplierCuendshouldcollect()+Float.parseFloat(ppPayablesmainPrice)));
		System.out.println("剩余额度："+(sp.getSupplierResiduemonet()-Float.parseFloat(ppPayablesmainPrice)+Float.parseFloat(ppOffsetamount)));
		sp.setSupplierResiduemonet((sp.getSupplierResiduemonet()-Float.parseFloat(ppPayablesmainPrice)+Float.parseFloat(ppOffsetamount)));
		System.out.println("修改供应商:"+sp.getSupplierName());
		int h = dao.updateByPrimaryKeySelective2(sp);
		if(h>0) {
			map.put("code", "1");
			map.put("message", "审核成功！");
		}
		return map;
    }
	
	/**
	 * 根据主键删除
	 * @param supplierId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String supplierId,Model model) {
		System.out.println("进入SupplierController根据主键删除");
		System.out.println("supplierId："+supplierId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(supplierId);
		if (i>0) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		}else {
			map.put("code", "2");
			map.put("message", "删除失败！");
		}
		return map;
    }

	@GetMapping("/selectAll")
	@ResponseBody
	public List<Supplier> selectAll() {
		return dao.selectAll();
	}
}