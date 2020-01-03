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
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Privilegetype;
import com.apatech.domain.Ptmanagement;
import com.apatech.service.PrivilegetypeService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("PrivilegetypeController")
public class PrivilegetypeController {
	@Autowired
	private PrivilegetypeService dao;
	
	/**
	 * 权限
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/queryPrivilegeType",method=RequestMethod.GET)
	@ResponseBody
	public List<Privilegetype> queryPrivilegeType(){
		
		return dao.queryPrivilegeType();
	}
	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Privilegetype> selectAll(Model model) {
		System.out.println("进入PrivilegetypeController查询全部");
		List<Privilegetype> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Privilegetype selectByPrimaryKey(Integer privilegetypeid) {
		System.out.println("进入PrivilegetypeController根据主键查询");
		System.out.println("privilegetypeid="+privilegetypeid);
    	return dao.selectByPrimaryKey(privilegetypeid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Privilegetype> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入PrivilegetypeController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Privilegetype> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Privilegetype record) {
		System.out.println("进入PrivilegetypeController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Privilegetype record) {
		System.out.println("进入PrivilegetypeController根据主键修改");
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
	 * @param billid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(Integer privilegetypeid,Model model) {
		System.out.println("进入PrivilegetypeController根据主键删除");
		System.out.println("privilegetypeid："+privilegetypeid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(privilegetypeid);
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