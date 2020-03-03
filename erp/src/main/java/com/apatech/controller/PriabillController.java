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

import com.apatech.domain.Priabill;
import com.apatech.domain.Priadetails;
import com.apatech.domain.Supplier;
import com.apatech.domain.Priabill;
import com.apatech.domain.Priabill;
import com.apatech.mapper.PriabillMapper;
import com.apatech.service.PriabillService;
import com.apatech.service.PriadetailsService;
import com.apatech.service.SupplierService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("PriabillController")
public class PriabillController {
	@Autowired
	private PriabillService dao;
	
	@Autowired
	private PriadetailsService daoDetail;
	
	@Autowired
	private SupplierService daoSupp;
	
	/**
	 * 根据主键修改 Xz只专属
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective2",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective2(@RequestBody Priabill record) {
		System.out.println("进入PriabillController根据主键修改");
		System.out.println("实体："+record.toString());
		System.out.println("审核状态："+record.getPriabillAuditing());
		Map<String, String> map=new HashMap<String, String>();
    	int i=dao.updateByPrimaryKeySelective(record);
    	if (i>0) {
    		float price = 0;
    		String priabillId = record.getPriabillId();
    		List<Priadetails> list = daoDetail.selectByPrimaryKey2(priabillId);
    		for(int a=0;a<list.size();a++) {
    			price+=list.get(a).getPriabillPrice();
    		}
    		System.out.println("预付款主表总金额："+price);
    		String supplierId = record.getSupplierId();
    		System.out.println("进入供应商主文件修改剩余额度和期末预付款金额");
    		System.out.println("供应商主文件ID："+supplierId);
    		Supplier supp = daoSupp.selectByPrimaryKey(supplierId);
    		float supplierResiduemonet = supp.getSupplierResiduemonet();
    		System.out.println("供应商原剩余额度："+supplierResiduemonet);
    		supplierResiduemonet += price;
    		System.out.println("增加后剩余额度："+supplierResiduemonet);
    		float supplierCuendcollect = supp.getSupplierCuendcollect();
    		System.out.println("供应商原预付款金额："+supplierCuendcollect);
    		supplierCuendcollect += price;
    		System.out.println("增加后:"+supplierCuendcollect);
    		supp.setSupplierResiduemonet(supplierResiduemonet);
    		supp.setSupplierCuendcollect(supplierCuendcollect);
    		int s = daoSupp.updateByPrimaryKeySelective(supp);
    		if(s>0) {
    			map.put("code", "1");
    			map.put("message", "PriabillController修改成功！");
    		}else {
    			map.put("code", "2");
    			map.put("message", "修改失败！");
    		}
		}else {
			map.put("code", "2");
			map.put("message", "修改失败！");
		}
		return map;
    }
	
	/**
	 * 根据主键修改 Xz只专属22
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective3",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective3(@RequestBody Priabill record) {
		System.out.println("进入PriabillController根据主键修改");
		System.out.println("实体："+record.toString());
		System.out.println("审核状态："+record.getPriabillAuditing());
		Map<String, String> map=new HashMap<String, String>();
    	int i=dao.updateByPrimaryKeySelective(record);
    	if (i>0) {
    		float price = 0;
    		String priabillId = record.getPriabillId();
    		List<Priadetails> list = daoDetail.selectByPrimaryKey2(priabillId);
    		for(int a=0;a<list.size();a++) {
    			price+=list.get(a).getPriabillPrice();
    		}
    		System.out.println("预付款主表总金额："+price);
    		String supplierId = record.getSupplierId();
    		System.out.println("进入供应商主文件修改剩余额度和期末预付款金额");
    		System.out.println("供应商主文件ID："+supplierId);
    		Supplier supp = daoSupp.selectByPrimaryKey(supplierId);
    		float supplierResiduemonet = supp.getSupplierResiduemonet();
    		System.out.println("供应商原剩余额度："+supplierResiduemonet);
    		supplierResiduemonet -= price;
    		System.out.println("减少后剩余额度："+supplierResiduemonet);
    		float supplierCuendcollect = supp.getSupplierCuendcollect();
    		System.out.println("供应商原预付款金额："+supplierCuendcollect);
    		supplierCuendcollect -= price;
    		System.out.println("减少后:"+supplierCuendcollect);
    		supp.setSupplierResiduemonet(supplierResiduemonet);
    		supp.setSupplierCuendcollect(supplierCuendcollect);
    		int s = daoSupp.updateByPrimaryKeySelective(supp);
    		if(s>0) {
    			map.put("code", "1");
    			map.put("message", "PriabillController修改成功！");
    		}else {
    			map.put("code", "2");
    			map.put("message", "修改失败！");
    		}
		}else {
			map.put("code", "2");
			map.put("message", "修改失败！");
		}
		return map;
    }
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Priabill> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入PriabillController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Priabill> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
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
	 * @param priabillId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Priabill selectByPrimaryKey(String priabillId) {
		System.out.println("进入PriabillController根据主键查询");
		System.out.println("priabillId="+priabillId);
    	return dao.selectByPrimaryKey(priabillId);
	}
	
	/**
	 * 根据主键查询  Xz专属
	 * @param priabillId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKeyXuZhe",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> selectByPrimaryKeyXuZhe(String priabillId) {
		System.out.println("进入PriabillController根据主键查询");
		System.out.println("priabillId="+priabillId);
		System.out.println("查出的priabill对象:"+dao.selectByPrimaryKey(priabillId));
		Map<String, String> map=new HashMap<String,String>();
		if(dao.selectByPrimaryKey(priabillId)==null) {
			map.put("code", "1");
			map.put("message", "不存在");
		}else {
			map.put("code", "0");
			map.put("message", "存在");
		}
    	return map;
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Priabill record) {
		System.out.println("进入PriabillController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Priabill record) {
		System.out.println("进入PriabillController根据主键修改");
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
	 * @param priabillId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String priabillId,Model model) {
		System.out.println("进入PriabillController根据主键删除");
		System.out.println("priabillId："+priabillId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(priabillId);
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