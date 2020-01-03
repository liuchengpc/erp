package com.apatech.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Recharge;
import com.apatech.service.RechargeService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("RechargeController")
public class RechargeController {
	@Autowired
	private RechargeService dao;	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Recharge> selectAll(Model model) {
		System.out.println("进入RechargeController查询全部");
		List<Recharge> list = dao.selectAll();
		return list;
	}
	
	/**
	 * 多条件查询
	 * @param model
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value = "/selectByAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Recharge> selectByAll(String startTime,String endTime,String PhoneOrName) throws ParseException {
		System.out.println("进入RechargeController多条件");
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
		Date stTime=f.parse(startTime);
		Date edTime=f.parse(endTime);
		System.out.println(stTime+"////////"+edTime+"//////"+PhoneOrName);
		List<Recharge> list = dao.selectByAll(stTime,edTime,PhoneOrName);
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Recharge selectByPrimaryKey(Integer rechargeid) {
		System.out.println("进入RechargeController根据主键查询");
		System.out.println("rechargeid="+rechargeid);
    	return dao.selectByPrimaryKey(rechargeid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Recharge> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入RechargeController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Recharge> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "/insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Recharge record) {
		System.out.println("进入RechargeController新增");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		//设置为东八区
//		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
//		try {
//			record.setRechargedate(sdf.parse((sdf.format(new Date()))));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		/*
		 * @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
		 * 
		 * @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") public Date aaa=new Date();
		 */
		System.out.println("时间为"+new Date());
	
		record.setRechargedate(new Date());
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Recharge record) {
		System.out.println("进入RechargeController根据主键修改");
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
    public Map<String, String> deleteByPrimaryKey(Integer rechargeid,Model model) {
		System.out.println("进入RechargeController根据主键删除");
		System.out.println("rechargeid："+rechargeid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(rechargeid);
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