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

import com.apatech.domain.Staff;
import com.apatech.domain.Updown_program;
import com.apatech.domain.Updown_program;
import com.apatech.domain.Updown_program;
import com.apatech.domain.Updown_program;
import com.apatech.mapper.Updown_programMapper;
import com.apatech.service.Updown_programService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("Updown_programController")
public class Updown_programController {
	@Autowired
	private Updown_programService dao;
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Updown_program> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入Updown_programController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Updown_program> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	/**
	 * 查询所有
	 */
	@RequestMapping("selectAll")
	@ResponseBody
	public List<Updown_program> selectAll(){
		System.out.println("进入StaffController查询所有");
		return dao.selectAll();
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
	 * @param upId
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Updown_program selectByPrimaryKey(String upId) {
		System.out.println("进入Updown_programController根据主键查询");
		System.out.println("upId="+upId);
    	return dao.selectByPrimaryKey(upId);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Updown_program record) {
		System.out.println("进入Updown_programController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Updown_program record) {
		System.out.println("进入Updown_programController根据主键修改");
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
	 * @param upId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String upId,Model model) {
		System.out.println("进入Updown_programController根据主键删除");
		System.out.println("upId："+upId);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(upId);
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