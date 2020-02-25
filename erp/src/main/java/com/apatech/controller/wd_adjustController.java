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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.apatech.domain.Adjust_price;
import com.apatech.domain.Sales_out_warehouse;
import com.apatech.domain.Sales_out_warehouse_detailed;
import com.apatech.domain.Team;
import com.apatech.domain.Updown_program;
import com.apatech.domain.wd_Adjust_detail;
import com.apatech.domain.wd_Adjust_price;
import com.apatech.domain.Adjust_price;
import com.apatech.service.Adjust_priceService;
import com.apatech.service.wd_Adjust_priceService;
import com.github.pagehelper.PageInfo;
@Controller
@RequestMapping("wd_adjustController")
public class wd_adjustController {
	@Autowired
	private Adjust_priceService dao;
	
	@Autowired
	private wd_Adjust_priceService wddao;
	
	
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<wd_Adjust_price> selectAllpage( Integer pageNum,Integer pageSize){
	
    	System.out.println(pageNum+"/"+pageSize);
		PageInfo<wd_Adjust_price> page=wddao.wdselectAllpage(pageNum, pageSize);
    	for (wd_Adjust_price item : page.getList()) {
			item.setList(wddao.selectlist(item.getApDateid()));
		}
    	
	    System.out.println("page:"+page.toString());
	    System.out.println("page.list:"+page.getList().toString());
    	return page;
    }
	
	/**
	 * 查询科目
	 * 
	 */
	@RequestMapping(value = "selectkm",method = RequestMethod.GET)
	@ResponseBody
	public List<Updown_program> selectkm(){
		System.out.println("进入查询科目");
		return wddao.selectkm();
    }
	
	/**
	 * 根据单号id查询物料
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "queryMater",method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> queryMater(String matterCustom6){
		//System.out.println("查询物料信息！ 查询ID"+matterCustom6);
		List<wd_Adjust_price> data=wddao.queryMater(matterCustom6);
		HashMap<String,Object> map=new HashMap<String,Object>();
		  map.put("code",0);
		  map.put("msg","");
		  map.put("count",1000);
		  map.put("data",data);
		  System.out.println(map);
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


	
	@RequestMapping("/selectcount")
	@ResponseBody
	public int selectcount() {
		return wddao.selectcount();
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public int insert(@RequestBody wd_Adjust_price record) {
		int apId=selectcount()+1;
		String apDateid=record.getApDateid();
		String updownmid=record.getUpdowmid();
		String updownmids=updownmid+1;
		String apdoworkman=record.getApDoworkman();
		String apRecheckman=record.getApRecheckman();
		String apAuditing="0";
		String apYn="0";
		String apCustom6=record.getApCustom6();
		
		String upname=record.getUpName();
		String doname=record.getUpCustom6();
		System.out.println("新增增减值科目"+updownmids+upname+apDateid+doname);
		dao.insertupd(updownmids,upname,apDateid,doname);
		System.out.println("新增主单："+apId+apDateid+updownmids+apdoworkman+apRecheckman+apAuditing+apYn+apCustom6);
		int i=dao.insert(apId,apDateid,updownmids,apdoworkman,apRecheckman,apAuditing,apYn,apCustom6);
		if(i>0) {
			for (wd_Adjust_detail item : record.getList()) {
				//item.setdApid(record.getApId());
				String dMatterid=item.getdMatterid();
				String dAdjustprice=item.getdAdjustprice();
				String dDecoration=item.getdDecoration();
				String dApId=item.getdApid();
				System.out.println("新增详单："+dMatterid+dAdjustprice+dDecoration+dApId);
				wddao.inserts(dMatterid,dAdjustprice,dDecoration,dApId);
			}
			return 1;
		}else {
			return 0;
		}
	}
	
	
	
	
	
	
	
	
	@RequestMapping("/update")
	@ResponseBody
	public int update(@RequestBody wd_Adjust_price record) {
		String updowmid=record.getUpdowmid();
		String apDateid=record.getApDateid();
		//1
		String upId=record.getUpId();
		System.out.println("upId"+upId);
		//空：不知道为啥
		String upname=record.getUpName();
		System.out.println("upname"+upname);
		String doId=record.getUpCustom5();
		String doname=record.getUpCustom6();
		System.out.println("upid:"+upId);
		//修改科目
		int i=wddao.updatekm(upId,upname,doId,doname,updowmid,apDateid);
		
		//修改调价价格

		for (wd_Adjust_detail item : record.getList()) {
			String dadjustprice=item.getdAdjustprice();
			String dapid=item.getdApid();
			String apid=item.getApId();
			String dMatterid=item.getdMatterid();
			String dDecoration=item.getdDecoration();
			//item.setdApid(record.getApDateid());
			wddao.updateprice(dadjustprice,dDecoration,dMatterid,apid);
		}
		//return dao.updateByPrimaryKey(record);
		return wddao.updatelist(apDateid,updowmid);
		
	}	
	
	

	
	
	@RequestMapping("/updateByPrimaryKeySelective")
	@ResponseBody
	public int delete(String apDateId) {
		System.out.println("进");
		return wddao.updateByPrimaryKeySelectives(apDateId);
				
	}
    
	@RequestMapping("/updateAuding")
	@ResponseBody
	public int updateAuding(String apDateId) {
		System.out.println("进");
		return wddao.updateAuding(apDateId);
				
	}

	@RequestMapping("/deupdateAuding")
	@ResponseBody
	public int deupdateAuding(String apDateId) {
		System.out.println("进");
		return wddao.deupdateAuding(apDateId);
				
	}
	
	
	@RequestMapping("/wdupdatekm")
	@ResponseBody
	public int wdupdatekm(String upname,String downname,String apDateid) {
		System.out.println("进");
		return wddao.wdupdatekm(upname,downname,apDateid);
				
	}
	
	
	
	@RequestMapping(value = "wdupdateByPrimaryKeySelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> wdupdateByPrimaryKeySelective(@RequestBody wd_Adjust_price record) {
		System.out.println("进入");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String, String>();
    	int i=wddao.wdupdateByPrimaryKeySelective(record);
    	if (i>0) {
			map.put("code", "1");
			map.put("message", "修改成功！");
		}else {
			map.put("code", "2");
			map.put("message", "修改失败！");
		}
		return map;
	}
}