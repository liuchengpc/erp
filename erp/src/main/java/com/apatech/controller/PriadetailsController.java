package com.apatech.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
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

import com.apatech.domain.Priadetails;
import com.apatech.domain.Priadetails;
import com.apatech.domain.Priadetails;
import com.apatech.domain.Priadetails;
import com.apatech.mapper.PriadetailsMapper;
import com.apatech.service.PriadetailsService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("PriadetailsController")
public class PriadetailsController {
	@Autowired
	private PriadetailsService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectByPriabillSupplierName",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Priadetails> selectByPriabillSupplierName(Integer page,Integer limit,String priabillId){
		System.out.println(" 进入Priadetails查询--"+page+"/"+limit);
		System.out.println("预付款主表ID："+priabillId);
		PageInfo<Priadetails> pageFy = dao.selectByPriabillSupplierName(page, limit,priabillId);
		return pageFy;
    }
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllBySupplier",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Priadetails> selectAllBySupplier(Integer page,Integer limit,String priabillCustom10){
		System.out.println(" 进入Priadetails查询--"+page+"/"+limit);
		System.out.println("预付款主表部门："+priabillCustom10);
		PageInfo<Priadetails> pageFy = dao.selectAllBySupplier(page, limit,priabillCustom10);
		return pageFy;
    }
	
	/**
	 * 分页 2
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllBySupplier2",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Priadetails> selectAllBySupplier2(Integer page,Integer limit,String priabillCustom10,String payablesId){
		System.out.println(" 进入Priadetails查询--"+page+"/"+limit);
		System.out.println("预付款主表部门："+priabillCustom10+",应付款主表ID："+payablesId);
		PageInfo<Priadetails> pageFy = dao.selectAllBySupplier2(page, limit,priabillCustom10,payablesId);
		return pageFy;
    }
	
	/**
	 * 新增+删除 Xz专属
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertAndDelete",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertAndDelete(@RequestBody Priadetails record) {
		System.out.println("进入PriadetailsController新增");
		System.out.println("实体："+record.toString());
		String string = new SimpleDateFormat("yyyyMMdd").format(new Date()).toString();
		System.out.println("自定义一："+string);
		record.setPriabillCustom1(string);
		Map<String, String> map=new HashMap<String,String>();
    	int i=dao.insertAndDelete(record);
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
	 * @param priadetailsId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Priadetails selectByPrimaryKey(String priadetailsId) {
		System.out.println("进入PriadetailsController根据主键查询");
		System.out.println("priadetailsId="+priadetailsId);
    	return dao.selectByPrimaryKey(priadetailsId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Priadetails record) {
		System.out.println("进入PriadetailsController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Priadetails record) {
		System.out.println("进入PriadetailsController根据主键修改");
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
    public Map<String, String> updateByPrimaryKeySelective2(String priadetailsId,String priabillCustom9) {
		System.out.println("进入PriadetailsController根据主键修改 预付款主余额");
		Priadetails p = dao.selectByPrimaryKey3(priadetailsId);		
		Float priabillCustom99=(Float.parseFloat(p.getPriabillCustom9())+Float.parseFloat(priabillCustom9));
		Map<String, String> map=new HashMap<String, String>();
		Priadetails record = new Priadetails();
		record.setPriadetailsId(priadetailsId);
		record.setPriabillCustom9(priabillCustom99.toString());
    	int i=dao.updateByPrimaryKeySelective2(record);
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
	 * @param priadetailsId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String priadetailsId,Model model) {
		System.out.println("进入PriadetailsController根据主键删除");
		System.out.println("priadetailsId："+priadetailsId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(priadetailsId);
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
	 * 根据主键删除  Xz专属
	 * @param priadetailsId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKeyXuzhe",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKeyXuzhe(String priabillId,Model model) {
		System.out.println("进入PriadetailsController根据主键删除");
		System.out.println("priabillId："+priabillId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKeyXuzhe(priabillId);
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