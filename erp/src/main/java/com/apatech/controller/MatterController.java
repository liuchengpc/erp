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

import com.apatech.domain.Matter;
import com.apatech.domain.Updown_program;
import com.apatech.domain.Matter;
import com.apatech.domain.Matter;
import com.apatech.domain.Matter;
import com.apatech.mapper.MatterMapper;
import com.apatech.service.MatterService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("MatterController")
public class MatterController {
	@Autowired
	private MatterService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Matter> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入MatterController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Matter> page=dao.selectAllpage(pageNum, pageSize);
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
	 * @param matterId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Matter selectByPrimaryKey(String matterId) {
		System.out.println("进入MatterController根据主键查询");
		System.out.println("matterId=" +matterId);
		return dao.selectByPrimaryKey(matterId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Matter record) {
		System.out.println("进入MatterController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Matter record) {
		System.out.println("进入MatterController根据主键修改");
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
	 * @param matterId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String matterId,Model model) {
		System.out.println("进入MatterController根据主键删除");
		System.out.println("matterId："+matterId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(matterId);
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
	 * 联表查询所有(只绑定单位名称)
	 * zhz
	 */
	@RequestMapping("queryAll")
	@ResponseBody
	public List<Matter> queryAll(){
		System.out.println("进入MatterController联表查询所有");
		return dao.queryAll();
    }
	/**
	 * 联表根据主键(只绑定单位名称)
	 *zhz
	 */
	@RequestMapping(value = "queryAllByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Matter queryAllByPrimaryKey(String matterId) {
		System.out.println("进入MatterController 联表根据主键查询");
		System.out.println("matterId=" +matterId);
		System.out.println(dao.queryAllByPrimaryKey(matterId).toString());
		return dao.queryAllByPrimaryKey(matterId);
	}
}