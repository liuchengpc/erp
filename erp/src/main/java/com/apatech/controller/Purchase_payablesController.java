package com.apatech.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Payables_detail;
import com.apatech.domain.Purchase_payables;
import com.apatech.domain.Supplier;
import com.apatech.domain.Purchase_payables;
import com.apatech.service.Purchase_payablesService;
import com.apatech.service.SupplierService;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("Purchase_payablesController")
public class Purchase_payablesController {
	@Autowired
	private Purchase_payablesService dao;

	@Autowired
	private SupplierService ss;

	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Purchase_payables> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Purchase_payablesController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Purchase_payables> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	/**
	 * 分页 Xz专属
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectByPayablesbillSupplierName",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Purchase_payables> selectByPayablesbillSupplierName(Integer page,Integer limit,String ppCustom8){
		System.out.println(" 进入Purchase_payablesController查询--"+page+"/"+limit);
		System.out.println("账款明细的应付款ID："+ppCustom8);
		PageInfo<Purchase_payables> pageFy = dao.selectByPayablesbillSupplierName(page, limit,ppCustom8);
		return pageFy;
    }
	
	/**
	 * 分页 Xz专属2
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectByPayablesbillSupplierName2",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Purchase_payables> selectByPayablesbillSupplierName2(Integer page,Integer limit,String ppPcName){
		System.out.println(" 进入Purchase_payablesController22查询--"+page+"/"+limit);
		System.out.println("供应商名称22："+ppPcName);
		PageInfo<Purchase_payables> pageFy = dao.selectByPayablesbillSupplierName2(page, limit,ppPcName);
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
	 * @param Purchase_payablesid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Purchase_payables selectByPrimaryKey(Integer Purchase_payablesId) {
		System.out.println("进入Purchase_payablesController根据主键查询");
		System.out.println("Purchase_payablesId="+Purchase_payablesId);
    	return dao.selectByPrimaryKey(Purchase_payablesId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Purchase_payables record) {
		System.out.println("进入Purchase_payablesController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Purchase_payables record) {
		System.out.println("进入Purchase_payablesController根据主键修改");
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
	 * 根据主键修改--审核后的各种表的新增修改+判断
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective2",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective2(@RequestBody Purchase_payables record) {
		System.out.println("进入Purchase_payablesController根据主键修改");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String, String>();
    	int i=dao.updateByPrimaryKeySelective(record);
    	if (i>0) {
    		System.out.println("审核明细账款ID："+record.getPpCustom7());
    		System.out.println("审核明细账款现行余额："+record.getPpCurrentbalance());
    		Purchase_payables pp = new Purchase_payables();
    		pp.setPpId(Integer.parseInt(record.getPpCustom7()));
    		System.out.println("ID："+pp.getPpId());
    		pp.setPpCurrentbalance(record.getPpCurrentbalance());
    		System.out.println("现行余额："+pp.getPpCurrentbalance());
    		pp.setPpAmountcharged(record.getPpAmountcharged());
    		System.out.println("冲款金额："+pp.getPpAmountcharged());
    		pp.setPpOffsetamount(record.getPpOffsetamount());
    		System.out.println("冲抵金额："+pp.getPpOffsetamount());
    		if(record.getPpCurrentbalance()==0) {
    			System.out.println("");
    			pp.setPpAuditing("1");
    		}else {
    			pp.setPpAuditing("0");
    		}
    		//修改账款明细表（出库入库审核后的表）
    		int a = dao.updateByPrimaryKeySelective22(pp);
    		if(a>0) {
    			System.out.println("结算明细账款成功！审核状态："+pp.getPpAuditing()+",现行余额:"+pp.getPpCurrentbalance()+",冲款金额:"+pp.getPpAmountcharged()+",冲抵金额:"+pp.getPpOffsetamount());
    			System.out.println("进入"+record.getPpPcName()+"供应商查询修改付款信息");
    			Supplier sp = ss.selectByPrimaryKey(record.getPpPcId());
    			System.out.println("查询结果:"+sp);
    			System.out.println("期末应付款："+(sp.getSupplierCuendshouldcollect()-record.getPpAmountcharged()));
    			System.out.println("a:"+sp.getSupplierCuendcollect()+",b:"+record.getPpAmountcharged());
    			sp.setSupplierCuendshouldcollect((sp.getSupplierCuendshouldcollect()-record.getPpAmountcharged()));
    			System.out.println("剩余额度："+(sp.getSupplierResiduemonet()+record.getPpAmountcharged()));
    			sp.setSupplierResiduemonet((sp.getSupplierResiduemonet()+record.getPpAmountcharged()));
    			System.out.println("修改供应商:"+sp.getSupplierName());
    			int h = ss.updateByPrimaryKeySelective(sp);
    			if(h>0) {
    				map.put("code", "1");
        			map.put("message", "审核成功！");
    			}
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
	 * 根据主键删除
	 * @param Purchase_payablesid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(Integer Purchase_payablesId,Model model) {
		System.out.println("进入Purchase_payablesController根据主键删除");
		System.out.println("Purchase_payablesid："+Purchase_payablesId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(Purchase_payablesId);
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