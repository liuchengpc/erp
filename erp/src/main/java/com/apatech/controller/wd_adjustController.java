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
import com.apatech.domain.Dull_section;
import com.apatech.domain.Sales_out_warehouse;
import com.apatech.domain.Sales_out_warehouse_detailed;
import com.apatech.domain.Team;
import com.apatech.domain.Updown_program;
import com.apatech.domain.wdQueryTaiz;
import com.apatech.domain.wdQueryTaizDetail;
import com.apatech.domain.wd_Adjust_detail;
import com.apatech.domain.wd_Adjust_price;
import com.apatech.domain.wd_dull;
import com.apatech.domain.wd_inorout;
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
	
	@RequestMapping("/doQueryTaiz")
	@ResponseBody
	public List<wdQueryTaiz>doQueryTaiz(String matterBegin,String matterEnd,String warehouseBegin,String warehouseEnd,String dateBegin,String dateEnd){
		System.out.println("进来了耶~");
		System.out.println(matterBegin+","+matterEnd+","+warehouseBegin+","+warehouseEnd+","+dateBegin+","+dateEnd);
		return wddao.doQueryTaiz(matterBegin,matterEnd,warehouseBegin,warehouseEnd,dateBegin,dateEnd);
		
	}
	
	@RequestMapping("/queryNum")
	@ResponseBody
	public List<wdQueryTaizDetail>queryNum(String matterId,String warehouseId){
		System.out.println("matterId:"+matterId+"warehouseId:"+warehouseId);
		return wddao.queryNum(matterId,warehouseId);
	}
	
	
	
	
	@RequestMapping("/doQueryTaizAll")
	@ResponseBody
	public List<wdQueryTaiz>doQueryTaiz(){
		System.out.println("进来了~");
		//System.out.println(wddao.doQueryTaiz(matterBegin,matterEnd,warehouseBegin,warehouseEnd,dateBegin,dateEnd));
		return wddao.doQueryTaizAll();
		 
	}
	
	
	
	@RequestMapping("/tzqueryMatter")
	@ResponseBody
	public List<wdQueryTaiz>tzqueryMatter(){
		return wddao.tzqueryMatter();
	}
	
	@RequestMapping("/tzqueryWarehouse")
	@ResponseBody
	public List<wdQueryTaiz>tzqueryWarehouse(){
		return wddao.tzqueryWarehouse();
	}
	
	//querySection呆滞品区间查询
	@RequestMapping("/querySection")
	@ResponseBody
	public List<Dull_section>querySection(){
		return dao.querySection();
	}
	
	//QueryDull呆滞品查询
	@RequestMapping("/QueryDull")
	@ResponseBody
	public List<wd_dull>QueryDull(String matterBegin,String matterEnd,String dulldate,String dullSdate,String dullEdate){
		return dao.QueryDull(matterBegin,matterEnd,dulldate,dullSdate,dullEdate);
	}
	
	
	
	
	
	//进出库明细
	@RequestMapping("/selinorout")
	@ResponseBody
	public List<wd_inorout>selinorout(){
		System.out.println("进出明细");
		return wddao.selinorout();
		
	}
	@RequestMapping("/selinoroutDetail")
	@ResponseBody
	public List<wd_inorout>selinoroutDetail(String matterId,String warehouseName,String wdDate){
		System.out.println("进出明细单个:"+matterId+","+warehouseName+","+wdDate);
		return wddao.selinoroutDetail(matterId,warehouseName,wdDate);
		
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
		//dao.insertupd(updownmids,upname,apDateid,doname);
		System.out.println("新增主单："+apId+apDateid+updownmids+apdoworkman+apRecheckman+apAuditing+apYn+apCustom6);
		int i=dao.insert(apId,apDateid,apdoworkman,apRecheckman,apAuditing,apYn,apCustom6);
		if(i>0) {
			for (wd_Adjust_detail item : record.getList()) {
				String dMatterid=item.getMatterId();
				String dAdjustprice=item.getdAdjustprice();
				String dDecoration=item.getdDecoration();
				String dApId=item.getApId();
				System.out.println("新增详单："+dMatterid+dAdjustprice+dDecoration+dApId);
				wddao.inserts(dMatterid,dAdjustprice,dDecoration,dApId);
				//修改价格
				wddao.updateMoney(dAdjustprice,dMatterid);
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
		
		String upId=record.getUpId();
		String upIds=upId;
		System.out.println("upId"+upId);
		String doId=record.getUpCustom5();
		String upname=record.getUpName();
		String doname=record.getUpCustom6();
		String apdoworkman=record.getApDoworkman();
		String apRecheckman=record.getApRecheckman();
		
		//修改科目
		//System.out.println("修改增减值科目"+upId+upname+doId+doname+upIds+apDateid);
		int i=wddao.updatekm(upname,doname,upIds,apDateid);
		//修改制单人复核人
		int j=wddao.updatepeople(apdoworkman,apRecheckman,apDateid);
		System.out.println("制单人复核人："+apdoworkman+apRecheckman);
		//修改调价价格

		for (wd_Adjust_detail item : record.getList()) {
			String dadjustprice=item.getdAdjustprice();
			String dapid=item.getdApid();
			
			
			String dMatterid=item.getMatterId();
			String dDecoration=item.getdDecoration();
			String dApId=record.getApId();
			System.out.println("修改箱单："+dadjustprice+dDecoration+dMatterid+dApId);
			wddao.updateprice(dadjustprice,dDecoration,dMatterid,dApId);
			//修改调价价格
			wddao.updateMoney(dadjustprice,dMatterid);
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
		int i=wddao.updateAuding(apDateId);
		System.out.println(i);
		return i;
				
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