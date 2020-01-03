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

import com.apatech.domain.Role;
import com.apatech.domain.Users;
import com.apatech.service.RoleService;
import com.apatech.service.UsersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("RoleController")
public class RoleController {
	@Autowired
	private RoleService dao;	
	
	@Autowired
	private UsersService dao2;
	
	@RequestMapping(value="/queryRoleByID",method=RequestMethod.GET)
	@ResponseBody
	public Role queryRoleByID(Role role) {
		
		return dao.queryRoleByID(role);
	}
	
	@RequestMapping(value="/queryRole2",method=RequestMethod.GET)
	@ResponseBody
	public Role queryRole2(Role role) {
		//11111111111111111111
		Role r = dao.queryRole(role);
		Integer roleid = role.getRoleid();
		
		List<Users> list = dao2.queryUsersByRoleID(roleid);
		for (Users u : list) {
			roleid = r.getRoleid();
			String userid = u.getUserid();
			Users user1 = new Users();
			user1.setRoleid(roleid);
			user1.setUserid(userid);
			int s = dao2.updateByPrimaryKeySelective(user1);
		}
		return r;
	}
	
	@RequestMapping(value="/queryRole",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,String> queryRole(Role role) {
		Map<String,String> map = new HashMap<String,String>();
		Role r = dao.queryRole(role);
		if(r==null) {
			map.put("code", "1");
			map.put("message", "继续新增");
		}else {
			map.put("code", "2");
			map.put("message", "不可继续新增");
		}
		return map;
	}
	
	@RequestMapping(value="/insertRole",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> insertRole(Role role) {
		Map<String,String> map = new HashMap<String,String>();
		int i = dao.insertRole(role);
		if(i>0) {
			map.put("code", "1");
			map.put("message", "新增成功！");
		}else {
			map.put("code", "2");
			map.put("message", "新增失败");
		}
		return map;
	} 
	
	@RequestMapping(value="/queryRolePage",method=RequestMethod.GET)
	@ResponseBody
	public PageInfo<Role> queryRolePage(Integer pageNum,Integer pageSize,Integer roleid){
		
		
		return dao.queryRolePage(pageNum, pageSize,roleid);
	}
	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Role> selectAll(Model model) {
		System.out.println("进入RoleController查询全部");
		List<Role> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Role selectByPrimaryKey(Integer roleid) {
		System.out.println("进入RoleController根据主键查询");
		System.out.println("roleid="+roleid);
    	return dao.selectByPrimaryKey(roleid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Role> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入RoleController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Role> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Role record) {
		System.out.println("进入RoleController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Role record) {
		System.out.println("进入RoleController根据主键修改");
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
    public Map<String, String> deleteByPrimaryKey(Integer roleid,Model model) {
		System.out.println("进入RoleController根据主键删除");
		System.out.println("roleid："+roleid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(roleid);
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