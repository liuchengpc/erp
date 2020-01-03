package com.apatech.controller;

import java.net.Authenticator.RequestorType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Cashregister;
import com.apatech.domain.Cashregisterdetail;
import com.apatech.domain.Commodity;
import com.apatech.domain.Commoditydetail;
import com.apatech.domain.Member;
import com.apatech.service.CashregisterService;
import com.apatech.service.CashregisterdetailService;
import com.apatech.service.CommodityService;
import com.apatech.service.CommoditydetailService;
import com.apatech.service.MemberService;
import com.apatech.service.MemberlvService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("CashregisterController")
public class CashregisterController {
	@Autowired
	private CashregisterService dao;
	
	@Autowired
	private CashregisterdetailService dao2;
	
	@Autowired
	private MemberService dao3;
	
	@Autowired
	private MemberlvService dao4;
	
	@Autowired
	private CommoditydetailService dao5;
	
	@Autowired
	private CommodityService dao6;
	
	@RequestMapping(value="/deleteZByX",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,String> deleteZByX(String ashregisterid){
		System.out.println("删除的主订单号："+ashregisterid);
		Map<String,String> map = new HashMap<String,String>();
		int i = dao.deleteByPrimaryKey(ashregisterid);
		System.out.println("第一次删除："+i);
		if(i>0) {
			String cashregisterdetailid = ashregisterid;
			System.out.println("删除的详订单号："+cashregisterdetailid);
			int s = dao2.deleteByid(cashregisterdetailid);
			System.out.println("第二次删除："+s);
			if(s>0) {
				map.put("code", "1");
				map.put("message", "删除成功");
				return map;
			}else {
				map.put("code", "0");
				map.put("message", "删除失败");
				return map;
			}
		}else {
			map.put("code", "0");
			map.put("message", "删除失败");
			return map;
		}
	}
	
	@RequestMapping(value="/queryByMemberID",method=RequestMethod.GET)
	@ResponseBody
	public Float queryByMemberID(Integer memberid){
		System.out.println("进入查询会员所有消费");
		Float moneyamt = Float.parseFloat("0");
		List<Cashregister> list = dao.queryByMemberID(memberid);
		for (Cashregister cashregister : list) {
			moneyamt += cashregister.getMoneyamt();
		}
		
		return moneyamt;
	}
	
	@RequestMapping(value="/insertCashregister4",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> insertCashregister4(@RequestBody Cashregister dataTwo) throws ParseException {
		System.out.println("进来了会员用户结账");	
		System.out.println(dataTwo);
		System.out.println(dataTwo.getList());
		Integer scount = 0;
		Date time = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time2 = df.parse(df.format(new Date())); 
        dataTwo.setTime(time2);
		System.out.println(dataTwo);
		Map<String,String> map = new HashMap<String,String>();
		int i = dao.insertCashregister(dataTwo);
		if(i>0) {
			System.out.println("进来了");
			for (Cashregisterdetail cs : dataTwo.getList()) {
				int f = dao2.insertCashregisterDetail(cs);
				if(f<=0) {
					map.put("code", "0");
					map.put("message", "结账失败");
					return map;
				}
				Commoditydetail com = dao5.selectByPrimaryKey(cs.getCommoditydetailid());
				
				//商品详情库存修改
				System.out.println("正在需改商品详情库存");
				Integer num = com.getCount();
				Integer count = num - cs.getCount();
				String commoditydetailid = cs.getCommoditydetailid(); 
				Commoditydetail com2 = new Commoditydetail();
				com2.setCount(count);
				com2.setCommoditydetailid(commoditydetailid);
				int i2 = dao5.updateByPrimaryKeySelective(com2);
				if(i2<0) {
					map.put("code", "0");
					map.put("message", "结账失败");
					return map;
				}else {
					System.out.println("商品详情库存修改成功！");
				}
				
				//商品主表总库存修改
				String productcodeid = com.getProductcodeid();
				System.out.println("商品编号："+productcodeid);
				Commodity co = dao6.selectByPrimaryKey(productcodeid);
				Integer stockcount = co.getStockcount();
				stockcount -= cs.getCount();
				System.out.println("总库存："+stockcount);
				Commodity co2 = new Commodity();
				co2.setStockcount(stockcount);
				co2.setProductcodeid(productcodeid);
				int h = dao6.updateByPrimaryKeySelective(co2);
				if(h<0) {
					map.put("code", "0");
					map.put("message", "结账失败");
					return map;
				}else {
					System.out.println("商品主表库存修改成功！");
				}
				
			}
			
		}else {
			map.put("code", "0");
			map.put("message", "结账失败");
			return map;
		}
		
		map.put("code", "1");
		map.put("message", "结账成功");
		return map;
	}
	
	@RequestMapping(value="/insertCashregister3",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> insertCashregister3(@RequestBody Cashregister dataTwo) throws ParseException {
		System.out.println("进来了会员用户结账");	
		Integer scount = 0;
		Date time = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time2 = df.parse(df.format(new Date())); 
        dataTwo.setTime(time2);
		System.out.println(dataTwo);
		Map<String,String> map = new HashMap<String,String>();
		int i = dao.insertCashregister(dataTwo);
		if(i>0) {
			System.out.println("进来了");
			for (Cashregisterdetail cs : dataTwo.getList()) {
				int f = dao2.insertCashregisterDetail(cs);
				if(f<=0) {
					map.put("code", "0");
					map.put("message", "结账失败");
					return map;
				}
				Commoditydetail com = dao5.selectByPrimaryKey(cs.getCommoditydetailid());
				
				//商品详情库存修改
				System.out.println("正在需改商品详情库存");
				Integer num = com.getCount();
				Integer count = num - cs.getCount();
				String commoditydetailid = cs.getCommoditydetailid(); 
				Commoditydetail com2 = new Commoditydetail();
				com2.setCount(count);
				com2.setCommoditydetailid(commoditydetailid);
				int i2 = dao5.updateByPrimaryKeySelective(com2);
				if(i2<0) {
					map.put("code", "0");
					map.put("message", "结账失败");
					return map;
				}else {
					System.out.println("商品详情库存修改成功！");
				}
				
				//商品主表总库存修改
				String productcodeid = com.getProductcodeid();
				System.out.println("商品编号："+productcodeid);
				Commodity co = dao6.selectByPrimaryKey(productcodeid);
				Integer stockcount = co.getStockcount();
				stockcount -= cs.getCount();
				System.out.println("总库存："+stockcount);
				Commodity co2 = new Commodity();
				co2.setStockcount(stockcount);
				co2.setProductcodeid(productcodeid);
				int h = dao6.updateByPrimaryKeySelective(co2);
				if(h<0) {
					map.put("code", "0");
					map.put("message", "结账失败");
					return map;
				}else {
					System.out.println("商品主表库存修改成功！");
				}
			}
			Member m2 = new Member();
			Float f = new Float(dataTwo.getMoneyamt());
			int d = f.intValue();
			Member m3 = dao3.selectByPrimaryKey(dataTwo.getMemberid());
			System.out.println("总消费金额："+dataTwo.getMoneyamt());
			System.out.println("会员余额："+m3.getPrice());
			System.out.println("会员ID："+dataTwo.getMemberid());
			m2.setMemberid(dataTwo.getMemberid());
			d = d+m3.getIntegral();
			m2.setIntegral(d);
			m2.setPrice(m3.getPrice()-dataTwo.getMoneyamt());
			
			System.out.println("积分"+d);
			int g = dao3.updateByPrimaryKeySelective(m2);
			if(g<0) {
				map.put("code", "0");
				map.put("message", "结账失败");
				return map;
			}
			map.put("code", "1");
			map.put("message", "结账成功！");
			return map;
		}else {
			map.put("code", "0");
			map.put("message", "结账失败");
			return map;
		}
		
	}
	
	@RequestMapping(value="/insertCashregister2",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> insertCashregister2(@RequestBody Cashregister dataTwo) throws ParseException {
		System.out.println("进来了普通用户结账");	
		Date time = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time2 = df.parse(df.format(new Date())); 
        dataTwo.setTime(time2);
		System.out.println(dataTwo);
		Map<String,String> map = new HashMap<String,String>();
		int i = dao.insertCashregister(dataTwo);
		if(i>0) {
			for (Cashregisterdetail cs : dataTwo.getList()) {
				int f = dao2.insertCashregisterDetail(cs);
				if(f<=0) {
					map.put("code", "0");
					map.put("message", "结账失败");
					return map;
				}
			}
			map.put("code", "1");
			map.put("message", "结账成功！");
			return map;
		}else {
			map.put("code", "0");
			map.put("message", "结账失败");
			return map;
		}
		
	}
	
	/**
	 * 根据订单主键编号 查询会员
	 * @param model
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value="queryByao2",method=RequestMethod.GET)
	@ResponseBody
	public Cashregister queryByao2(String ashregisterid) throws ParseException{
		Cashregister register = dao.selectByPrimaryKey(ashregisterid);
		List<Cashregisterdetail> list = dao2.queryByDetail(register.getAshregisterid());
		if(register.getMemberid()!=0) {
			register.setMember(dao3.selectByPrimaryKey(register.getMemberid()));
			register.setMemberlv(dao4.selectByPrimaryKey(register.getMember().getMemberlvid()));
		}
		for (Cashregisterdetail ca : list) {
			ca.setCommoditydetail(dao5.selectByPrimaryKey(ca.getCommoditydetailid()));
			ca.setCommodity(dao6.selectByPrimaryKey(ca.getCommoditydetail().getProductcodeid()));
		}
		register.setList(list);
		return register;
	}
	
	/**
	 * 根据订单主键编号 查询会员是否存在
	 * @param model
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value="queryByao",method=RequestMethod.GET)
	@ResponseBody
	public int queryByao(String ashregisterid) throws ParseException{
		Cashregister register = dao.selectByPrimaryKey(ashregisterid);
		if(register.getMemberid()==0) {
			return 0;
		}else {
			return register.getMemberid();
		}
	}
	
	/**
	 * 根据订单主键编号 查询订单详表信息、会员信息、会员等级信息
	 * @param model
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value="queryBy",method=RequestMethod.GET)
	@ResponseBody
	public Cashregister queryBy(String ashregisterid) throws ParseException{
		Cashregister register = dao.selectByPrimaryKey(ashregisterid);
		Date time = new Date();
		List<Cashregisterdetail> list = dao2.queryByDetail(register.getAshregisterid());
		register.setMember(dao3.selectByPrimaryKey(register.getMemberid()));
		System.out.println(dao4.queryMemberLvByMemberLvID(register.getMember().getMemberlvid()));
		register.setMemberlv(dao4.queryMemberLvByMemberLvID(register.getMember().getMemberlvid()));
		for (Cashregisterdetail ca : list) {
			ca.setCommoditydetail(dao5.selectByPrimaryKey(ca.getCommoditydetailid()));
			ca.setCommodity(dao6.selectByPrimaryKey(ca.getCommoditydetail().getProductcodeid()));
		}
		register.setList(list);
		return register;
	}
	
	@RequestMapping(value="queryByGd",method=RequestMethod.GET)
	@ResponseBody
	public List<Cashregister> queryByGd(String ashregisterid){
		System.out.println("进来了");
		
		return dao.queryByGd(ashregisterid);
	}
	
	@RequestMapping(value="/insertCashregister",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> insertCashregister(@RequestBody Cashregister dataTwo) throws ParseException {
		System.out.println("进来了CashregisterController");	
		Date time = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time2 = df.parse(df.format(new Date())); 
        dataTwo.setTime(time2);
		System.out.println(dataTwo);
		Map<String,String> map = new HashMap<String,String>();
		int i = dao.insertCashregister(dataTwo);
		if(i>0) {
			for (Cashregisterdetail cs : dataTwo.getList()) {
				int f = dao2.insertCashregisterDetail(cs);
				if(f<=0) {
					map.put("code", "0");
					map.put("message", "挂单失败");
					return map;
				}
			}
			map.put("code", "1");
			map.put("message", "挂单成功！");
			return map;
		}else {
			map.put("code", "0");
			map.put("message", "挂单失败");
			return map;
		}
		
	}
	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Cashregister> selectAll(Model model) {
		System.out.println("进入CashregisterController查询全部");
		List<Cashregister> list = dao.selectAll();
		return list;
	}
	/**
	 * 查询订单年份
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectddnf",method = RequestMethod.GET)
	@ResponseBody
	public List<Cashregister> selectddnf(Model model) {
		System.out.println("进入CashregisterController查询全部");
		List<Cashregister> list = dao.selectddnf();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Cashregister selectByPrimaryKey(String ashregisterid) {
		System.out.println("进入CashregisterController根据主键查询");
		System.out.println("ashregisterid="+ashregisterid);
    	return dao.selectByPrimaryKey(ashregisterid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Cashregister> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入CashregisterController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Cashregister> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	
	
	/**
	 * 根据条件查询采购单主详表(销售统计)
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAll2",method = RequestMethod.GET)
	@ResponseBody
	public List<Cashregister> selectAll2(
			String shopid,//店铺
 			@DateTimeFormat(pattern = "yyyy-MM-dd")Date oldtime,//开始时间
 			@DateTimeFormat(pattern = "yyyy-MM-dd")Date newtime,//结束时间
 			String selectqb,//查找
			String ddnf//订单年份
	){
		System.out.println("进入CommodityController根据条件查询采购单主详表(销售统计)");
		System.out.println(shopid+"/"+oldtime+"/"+newtime+"/"+selectqb+"/"+ddnf);
    	List<Cashregister> list=dao.selectAll2(shopid, oldtime, newtime, selectqb,ddnf);
    	System.out.println(list.toString());
    	return list;
    }
	/**
	 * 根据条件查询采购单主详表(销售统计图)
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectxstjt",method = RequestMethod.GET)
	@ResponseBody
	public List<Cashregister> selectxstjt(
			String shopid,//店铺
			String ddnf//订单年份
			){
		System.out.println("进入CommodityController根据条件查询采购单主详表(销售统计图)");
		System.out.println(shopid+"/"+ddnf);
		List<Cashregister> list=dao.selectxstjt(shopid,ddnf);
		System.out.println(list.toString());
		return list;
	}
	/**
	 * 根据条件查询采购单主详表(营收概况)
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAll3",method = RequestMethod.GET)
	@ResponseBody
	public List<Cashregister> selectAll3(
			String shopid,//店铺
 			@DateTimeFormat(pattern = "yyyy-MM-dd")Date oldtime,//开始时间
 			@DateTimeFormat(pattern = "yyyy-MM-dd")Date newtime,//结束时间
			String selectqb//查找
	){
		System.out.println("进入CommodityController根据条件查询采购单主详表(营收概况)");
		System.out.println(shopid+"/"+oldtime+"/"+newtime+"/"+selectqb);
    	List<Cashregister> list=dao.selectAll3(shopid, oldtime, newtime, selectqb);
    	System.out.println(list.toString());
    	return list;
    }
	/**
	 * 根据条件查询采购单主详表(热销商品)
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAll4",method = RequestMethod.GET)
	@ResponseBody
	public List<Cashregister> selectAll4(
			String shopid,//店铺
			@DateTimeFormat(pattern = "yyyy-MM-dd")Date oldtime,//开始时间
			@DateTimeFormat(pattern = "yyyy-MM-dd")Date newtime,//结束时间
			String selectqb,//查找
			Integer commoditytypeid//商品类别
			){
		System.out.println("进入CommodityController根据条件查询采购单主详表(营收概况)");
		System.out.println(shopid+"/"+oldtime+"/"+newtime+"/"+selectqb+"/"+commoditytypeid);
		List<Cashregister> list=dao.selectAll4(shopid, oldtime, newtime, selectqb, commoditytypeid);
		System.out.println(list.toString());
		return list;
	}
	
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Cashregister record) {
		System.out.println("进入CashregisterController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Cashregister record) {
		System.out.println("进入CashregisterController根据主键修改");
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
    public Map<String, String> deleteByPrimaryKey(String ashregisterid,Model model) {
		System.out.println("进入CashregisterController根据主键删除");
		System.out.println("ashregisterid："+ashregisterid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(ashregisterid);
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
	 * 多条件分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value = "/selectByAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Cashregister> selectByAllpage( Integer pageNum,Integer pageSize,String PhoneOrName,String startTime,String endTime) throws ParseException{
		System.out.println("进入CashregisterController多条件分页");
		System.out.println(pageNum+"/"+pageSize);
		System.out.println("电话或姓名:"+PhoneOrName+"开始时间:"+startTime+"结束时间:"+endTime);
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
		Date stTime=null;
		if(startTime!=null&&!startTime.equals("")) {
			stTime=f.parse(startTime);
		}
		Date edTime=null;
		if(endTime!=null&&!endTime.equals("")) {
			edTime=f.parse(endTime);
		}
    	PageInfo<Cashregister> page=dao.selectByAllpage(pageNum, pageSize,PhoneOrName,stTime,edTime);
    	return page;
    }
	/**
	 * 查询所有主详中详查询
	 */
	@RequestMapping(value = "/queryAll",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Cashregister> queryAll(Integer pageNum,Integer pageSize){
		System.out.println("进入主详详查询");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Cashregister> page=dao.queryAll(pageNum, pageSize);
		/* System.out.println(page); */
    	
    	return page;
	}
}