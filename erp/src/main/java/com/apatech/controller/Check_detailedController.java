package com.apatech.controller;

import java.util.HashMap;
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

import com.apatech.domain.Check_detailed;
import com.apatech.domain.KucunDanjia;
import com.apatech.domain.Check_detailed;
import com.apatech.domain.Check_detailed;
import com.apatech.domain.Check_detailed;
import com.apatech.mapper.Check_detailedMapper;
import com.apatech.service.Check_detailedService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Check_detailedController")
public class Check_detailedController {
	@Autowired
	private Check_detailedService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Check_detailed> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Check_detailedController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Check_detailed> page=dao.selectAllpage(pageNum, pageSize);
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
	 * @param Check_detailedid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Check_detailed selectByPrimaryKey(String ccId) {
		System.out.println("进入Check_detailedController根据主键查询");
		System.out.println("ccId="+ccId);
    	return dao.selectByPrimaryKey(ccId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Check_detailed record) {
		System.out.println("进入Check_detailedController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Check_detailed record) {
		System.out.println("进入Check_detailedController根据主键修改");
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
	 * @param Check_detailedid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String ccId,Model model) {
		System.out.println("进入Check_detailedController根据主键删除");
		System.out.println("ccId："+ccId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(ccId);
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
	 * 查询目前库存及单价
	 * @param Check_detailedid
	 * @return
	 */
	@RequestMapping(value = "queryBykc",method = RequestMethod.GET)
	@ResponseBody
    public KucunDanjia queryBykc(String ckid,String wlid) {
		System.out.println("进入Check_detailedController查询库存及单价");
		System.out.println("ckid="+ckid+",wlid="+wlid);
    	return dao.queryBykc(ckid,wlid);
	}
}