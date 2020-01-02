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

import com.apatech.domain.Member;
import com.apatech.domain.Memberlv;
import com.apatech.service.IntegralService;
import com.apatech.service.MemberService;
import com.apatech.service.MemberlvService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("MemberController")
public class MemberController {
	@Autowired
	private MemberService dao;	
	
	@Autowired
	private MemberlvService dao2;
	
	@Autowired
	private IntegralService dao3;
	
	
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey222",method = RequestMethod.GET)
	@ResponseBody
    public Member selectByPrimaryKey222(Integer memberid) {
		System.out.println("进入MemberController根据主键查询");
		System.out.println("memberid="+memberid);
		Member m = dao.selectByPrimaryKey(memberid);
		m.setLv(dao2.selectByPrimaryKey(m.getMemberlvid()));
    	return m;
    }
	
	/**
	 * 根据主键修改
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective2",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective2(Member record) {
		System.out.println("进入MemberController根据主键修改");
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
	 *根据会员号查询会员信息2
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/queryMemberByPhoneTwo2",method=RequestMethod.GET)
	@ResponseBody
	public Member queryMemberByPhoneTwo2(String phone,String password) {
		Member m = dao.queryMemberByPhone(phone,password);
		m.setIt(dao3.selectByPrimaryKey(1));
		m.setLv(dao2.selectByPrimaryKey(m.getMemberlvid()));
		return m;
	}
	
	/**
	 *根据会员号查询会员信息
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/queryMemberByPhoneTwo",method=RequestMethod.GET)
	@ResponseBody
	public Member queryMemberByPhoneTwo(String phone,String password) {
		Member m = dao.queryMemberByPhone(phone,password);
		System.out.println(m);
		m.setIt(dao3.selectByPrimaryKey(1));
		m.setLv(dao2.selectByPrimaryKey(m.getMemberlvid()));
		System.out.println("haha"+m.getLv());
		return m;
	}
	
	/**
	 *根据会员号查询会员信息
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/queryMemberByPhone",method=RequestMethod.GET)
	@ResponseBody
	public int queryMemberByPhone(String phone,String password) {
		Member m = dao.queryMemberByPhone(phone,password);
		if(m==null) {
			return 0;
		}else {
			m.setLv(dao2.queryMemberLvByMemberLvID(m.getMemberid()));
			return 1;
		}
	}
	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Member> selectAll(Model model) {
		System.out.println("进入MemberController查询全部");
		List<Member> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Member selectByPrimaryKey(Integer memberid) {
		System.out.println("进入MemberController根据主键查询");
		System.out.println("memberid="+memberid);
    	return dao.selectByPrimaryKey(memberid);
    }
	
	
	/**
	 * 根据等级id
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByMemberLvid",method = RequestMethod.GET)
	@ResponseBody
    public Member selectByMemberLvid(Integer memberlvid) {
		System.out.println("进入MemberController根据memberlvid查询");
		System.out.println("memberlvid="+memberlvid);
    	return dao.selectByMemberLvid(memberlvid);
    }
	
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Member> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入MemberController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Member> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	/**
	 * 连表分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "queryAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Member> queryAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入MemberController连表分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Member> page=dao.queryAllpage(pageNum, pageSize);
    	return page;
    }
	
	/**
	 * 连表多条件分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "queryAllBypage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Member> queryAllBypage( Integer pageNum,Integer pageSize,Integer lvid,String PhoneOrName){
		System.out.println("进入MemberController连表多条件分页");
		System.out.println(pageNum+"/"+pageSize);
		System.out.println("等级id"+lvid+"电话或姓名"+PhoneOrName);
    	PageInfo<Member> page=dao.queryAllBypage(pageNum, pageSize,lvid,PhoneOrName);
    	return page;
    }
	
	/**
	 * 按电话号码查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "queryAllByPhone",method = RequestMethod.GET)
	@ResponseBody
	public Member queryAllByPhone(String Phone){
		System.out.println("进入MemberController按手机号查询");
		System.out.println("电话"+Phone);
    	Member page=dao.queryAllByPhone(Phone);
    	return page;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "/insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Member record) {
		System.out.println("进入MemberController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Member record) {
		System.out.println("进入MemberController根据主键修改");
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
    public Map<String, String> deleteByPrimaryKey(Integer billmemberidid,Model model) {
		System.out.println("进入MemberController根据主键删除");
		System.out.println("billmemberidid："+billmemberidid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(billmemberidid);
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