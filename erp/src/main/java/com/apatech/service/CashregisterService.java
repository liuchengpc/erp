package com.apatech.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Cashregister;
import com.apatech.domain.Cashregisterdetail;
import com.apatech.domain.Commoditydetail;
import com.apatech.domain.Recharge;
import com.apatech.mapper.CashregisterMapper;
import com.apatech.mapper.CashregisterdetailMapper;
import com.apatech.mapper.CommoditydetailMapper;
import com.apatech.mapper.MemberMapper;
import com.apatech.mapper.RechargeMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CashregisterService {
	@Autowired
	private CashregisterMapper dao;
	@Autowired
	private CashregisterdetailMapper dao2;
	@Autowired
	private RechargeMapper dao3;
	@Autowired 
	private MemberMapper mdao;
	@Autowired
	private CommoditydetailMapper cddao;

	public List<Cashregister> queryByMemberID(Integer memberid){
		
		return dao.queryByMemberID(memberid);
	}
	
	public List<Cashregister> queryByGd(String ashregisterid){

		return dao.queryByGd(ashregisterid);
	}
	
	public int insertCashregister(Cashregister cash) {
		
		return dao.insertCashregister(cash);
	}
	
    public int deleteByPrimaryKey(String ashregisterid) {
    	return dao.deleteByPrimaryKey(ashregisterid);
    }

    public int insert(Cashregister record) {
    	return dao.insert(record);
    }


    public int insertSelective(Cashregister record) {
    	return dao.insertSelective(record);
    }


    public Cashregister selectByPrimaryKey(String ashregisterid) {
    	return dao.selectByPrimaryKey(ashregisterid);
    }
    
    public List<Cashregister> selectAll() {
    	return dao.selectAll();
    }
    public List<Cashregister> selectddnf() {
    	return dao.selectddnf();
    }
    
 
// 	日期/time,	        
// 	订单号/ashregisterid,	       
// 	店铺/shopname,	        	   
// 	会员名称/name,	        		   
// 	数量/count,	   
//  结算金额/moneyamt
// 	余额/ price,
// 	收银员/cashRegisterName,	   
// 	详表集合/list,
    
    
    
    
    
    
    public List<Cashregister> selectAll2(
    		String shopid,//店铺
 			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date oldtime,//开始时间
 			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date newtime,//结束时间
			String selectqb,//查找
			String ddnf//订单年份
	){
    	List<Cashregister> li=dao.selectAll3(shopid, oldtime, newtime, selectqb,ddnf);
    	for (int i = 0; i < li.size(); i++) {//根据主表的id将详情表的数据添加到主表的对应对象的list
    		li.get(i).setList(dao2.selectByid(li.get(i).getAshregisterid())); 
		}
    	return li;
    }
    public List<Cashregister> selectxstjt(
    		String shopid,//店铺
    		String ddnf//订单年份
    		){
    	List<Cashregister> li=dao.selectxstjt(shopid,ddnf);
    	return li;
    }
    	
    public List<Cashregister> selectAll3(
    		String shopid,//店铺
 			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date oldtime,//开始时间
 			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date newtime,//结束时间
			String selectqb//查找
	){
    	List<Cashregister> li=dao.selectAll4(shopid, oldtime, newtime, selectqb);
    
    	System.out.println("进入1");
    	for (int i = 0; i < li.size(); i++) {//根据主表的id将详情表的数据添加到主表的对应对象的list
    		System.out.println("进入2");
    		int dds=0;//订单数
        	Double xsje=0.0;//销售金额
			List<Cashregister> li2= dao.selectBydpid(li.get(i).getShopid()); //根据店铺id查询信息
			for (Cashregister cashregister : li2) {
				dds+=cashregister.getCount();//销售金额
				xsje+=cashregister.getMoneyamt();//销售金额
			}
			li.get(i).setDds(dds);//订单数
			li.get(i).setXsje(xsje);//销售金额
        	li.get(i).setList2(li2); //赋值list集合
		}
    	return li;
    }
    
    
    public List<Cashregister> selectAll4(
    		String shopid,//店铺
    		@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date oldtime,//开始时间
    		@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date newtime,//结束时间
    		String selectqb,//查找
    		Integer commoditytypeid//商品类别id
    		){
    	List<Cashregister> li=dao.selectAll5(shopid, oldtime, newtime, selectqb, commoditytypeid);
    
    	
    	for (int i = 0; i < li.size(); i++) {//根据主表的id将详情表的数据添加到主表的对应对象的list
    		int dds=0;//订单数
        	Double xsje=0.0;//销售金额
        	System.out.println("进入1");
    		
    		System.out.println("进入2");
    		List<Cashregisterdetail> li2= dao2.selectByid2(li.get(i).getCommoditydetailid()); //根据商品详表id查询订单    	
    		
    		
    		for (Cashregisterdetail cashregister : li2) {
				dds+=cashregister.getCount();//销售金额
				xsje+=cashregister.getMoneyamt();//销售金额
			}
			li.get(i).setDds(dds);//订单数
			li.get(i).setXsje(xsje);//销售金额
    		
    		
    		li.get(i).setList(li2); //赋值list集合
    	}
    	
    	
    	
    	
    	return li;
    }
    
    public PageInfo<Cashregister> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Cashregister> list=dao.selectAll();
    	PageInfo<Cashregister> page=new PageInfo<Cashregister>(list);
    	return page;
    }
    /**
     * 主详详查询
     */
	
	  public PageInfo<Cashregister> queryAll(Integer pageNum,Integer pageSize){
		  Page<Cashregister> page = PageHelper.startPage(pageNum, pageSize);
		  List<Cashregister> list=dao.queryAll(); 
		  
		  for(Cashregister cashregister :list) { 
			/*
			 * System.out.println("对象cashregister"+cashregister);
			 */			  
			  List<Cashregisterdetail>l=dao2.selectByCashregisterId(cashregister.getAshregisterid());
			/*
			 * for (Cashregisterdetail cashregisterdetail : l) { Commoditydetail
			 * cd=cddao.selectByPrimaryKey(cashregisterdetail.getCommoditydetailid());
			 * cashregisterdetail.setCommodityname(cd.getName()); }
			 */
			  cashregister.setList(l); 
		  }
		  return page.toPageInfo(); 
	  }
	 
    /**
     * 多条件分页查询
     * @param pageNum
     * @param pageSize
     * @param PhoneOrName
     * @param startTime
     * @param endTime
     * @return
     */
    public PageInfo<Cashregister> selectByAllpage(Integer pageNum,Integer pageSize,String PhoneOrName,Date startTime,Date endTime){
    	Page<Cashregister> page = PageHelper.startPage(pageNum, pageSize);
    	List<Cashregister> list=dao.selectByAll(PhoneOrName,startTime,endTime);
    		for (Cashregister cashregister : list) {
    			cashregister.setMember(mdao.selectByPrimaryKey(cashregister.getMemberid()));
			}
    	return page.toPageInfo();
    }


    public int updateByPrimaryKeySelective(Cashregister record) {
    	return dao.updateByPrimaryKeySelective(record);
    }
 

    public int updateByPrimaryKey(Cashregister record) {
    	return dao.updateByPrimaryKey(record);
    }

}