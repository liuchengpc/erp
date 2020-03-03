package com.apatech.controller;

import java.util.HashMap;
import java.util.Map;

import com.apatech.pojo.PurchaseReturnsPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.apatech.domain.Purchase_returns;
import com.apatech.mapper.Purchase_returnsMapper;
import com.apatech.service.Purchase_returnsService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Purchase_returnsController")
public class Purchase_returnsController {
	@Autowired
	private Purchase_returnsService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Purchase_returns> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Purchase_returnsController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Purchase_returns> page=dao.selectAllpage(pageNum, pageSize);
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
	 * @param pureId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Purchase_returns selectByPrimaryKey(String pureId) {
		System.out.println("进入Purchase_returnsController根据主键查询");
		System.out.println("pureId="+pureId);
    	return dao.selectByPrimaryKey(pureId);
	}
	
	/**
	 * 新增
	 * @param record
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Purchase_returns record) {
		System.out.println("进入Purchase_returnsController新增");
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
	 * @param record
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Purchase_returns record) {
		System.out.println("进入Purchase_returnsController根据主键修改");
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
	 * @param pureId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String pureId,Model model) {
		System.out.println("进入Purchase_returnsController根据主键删除");
		System.out.println("pureId："+pureId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(pureId);
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
    public PurchaseReturnsPojo selectLast(){
		return dao.selectLast();
	}

	@GetMapping("/selectPrev")
	@ResponseBody
	public PurchaseReturnsPojo selectPrev(Integer lineId){
		return dao.selectPrev(lineId);
	}

	@GetMapping("/selectNext")
	@ResponseBody
	public PurchaseReturnsPojo selectNext(Integer lineId){
		return dao.selectNext(lineId);
	}

	@GetMapping("/selectFirst")
	@ResponseBody
	public PurchaseReturnsPojo selectFirst(){
		return dao.selectFirst();
	}

	@GetMapping("/selectPureId")
	@ResponseBody
	public String selectPureId(){
		return dao.selectPureId();
	}

	@PutMapping("/updateWithDetails")
	@ResponseBody
	public Map<String,String> updateWithDetails(@RequestBody PurchaseReturnsPojo purchaseReturnsPojo){
		dao.updateWithDetails(purchaseReturnsPojo);
		return null;
	}

	@PostMapping("/insertWithDetails")
	@ResponseBody
	public Map<String,String> insertWithDetails(@RequestBody PurchaseReturnsPojo returnsPojo){
		System.out.println(returnsPojo);
		Map<String, String> map = new HashMap<>();
		try {
			dao.insertWithDetails(returnsPojo);
			map.put("code", "200");
			map.put("message", "success");
		} catch (Exception e) {
			map.put("code", "500");
			map.put("message", "error");
			e.printStackTrace();
		}
		return map;
	}

	@DeleteMapping("/deleteWithDetails")
	@ResponseBody
	public Map<String,String> deleteWithDetails(String pureId) {
		dao.deleteWithDetails(pureId);
		return null;
	}

	@PutMapping("/reviewPureOrder")
	@ResponseBody
	public Map<String,String> reviewPureOrder(@RequestBody PurchaseReturnsPojo returnsPojo){
		return null;
	}

	@PutMapping("/unReviewPureOrder")
	public Map<String,String> unReviewPureOrder(@RequestBody PurchaseReturnsPojo purchaseReturnsPojo){
		return null;
	}
}