package com.apatech.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.apatech.pojo.PurchaseStoragePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.apatech.domain.Purchase_storage;
import com.apatech.domain.Purchase_storage;
import com.apatech.domain.Purchase_storage;
import com.apatech.domain.Purchase_storage;
import com.apatech.mapper.Purchase_storageMapper;
import com.apatech.service.Purchase_storageService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Purchase_storageController")
public class Purchase_storageController {
	@Autowired
	private Purchase_storageService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Purchase_storage> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Purchase_storageController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Purchase_storage> page=dao.selectAllpage(pageNum, pageSize);
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
	 * @param psId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Purchase_storage selectByPrimaryKey(String psId) {
		System.out.println("进入Purchase_storageController根据主键查询");
		System.out.println("psId="+psId);
    	return dao.selectByPrimaryKey(psId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Purchase_storage record) {
		System.out.println("进入Purchase_storageController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Purchase_storage record) {
		System.out.println("进入Purchase_storageController根据主键修改");
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
	 * @param psId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String psId,Model model) {
		System.out.println("进入Purchase_storageController根据主键删除");
		System.out.println("psId："+psId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(psId);
		if (i>0) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		}else {
			map.put("code", "2");
			map.put("message", "删除失败！");
		}
		return map;
    }

    @GetMapping("/selectLast")
	@ResponseBody
	public PurchaseStoragePojo selectLast(){
		return dao.selectLast();
	}

	@GetMapping("/selectPrev")
	@ResponseBody
	public PurchaseStoragePojo selectPrev(Integer lineId){
		return dao.selectPrev(lineId);
	}

	@GetMapping("/selectNext")
	@ResponseBody
	public PurchaseStoragePojo selectNext(Integer lineId){
		return dao.selectNext(lineId);
	}

	@GetMapping("/selectFirst")
	@ResponseBody
	public PurchaseStoragePojo selectFirst(){
		return dao.selectFirst();
	}

	@GetMapping("/selectAllReview")
	@ResponseBody
	public List<PurchaseStoragePojo> selectAllReview(){
		return dao.selectAllReview();
	}
}