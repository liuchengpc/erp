package com.apatech.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Bill;
import com.apatech.domain.Commodity;
import com.apatech.domain.Detail;
import com.apatech.mapper.BillMapper;
import com.apatech.mapper.CommodityMapper;
import com.apatech.mapper.CommoditydetailMapper;
import com.apatech.mapper.DetailMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class BillService {
	@Autowired
	private BillMapper dao;
	
	@Autowired
	private CommodityMapper dao2;
	@Autowired
	private DetailMapper dao3;

    public int deleteByPrimaryKey(String billid) {
    	return dao.deleteByPrimaryKey(billid);
    }

    public int insert(Bill record) {
    	return dao.insert(record);
    }


    public int insertSelective(Bill record) {
    	return dao.insertSelective(record);
    }


    public Bill selectByPrimaryKey(String billid) {
    	return dao.selectByPrimaryKey(billid);
    }
    
    public List<Bill> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Bill> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Bill> list=dao.selectAll();
    	PageInfo<Bill> page=new PageInfo<Bill>(list);
    	return page;
    }

    public List<Commodity> selectAll2(
    		Integer shopid,//店铺
 			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date oldtime,//开始时间
 			@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date newtime,//结束时间
			String selectqb//查找
	){
	List<Commodity> li=dao2.selectAll3(shopid, oldtime, newtime, selectqb);
    	for (int i = 0; i < li.size(); i++) {//根据主表的id将详情表的数据添加到主表的对应对象的list
    		List<Detail> li2=dao3.selectByid(li.get(i).getBillid());
    		Double cgdje=0.0;//采购单金额
    		for (Detail detail : li2) {
				cgdje+=(detail.getCount()*detail.getCostprice());
			}
    		
    		System.out.println("商品详情："+li2.toString());
    		li.get(i).setCgdsl(li2.size());
    		li.get(i).setCgdje(cgdje);
			li.get(i).setBilllist(li2);
		}
    	return li;
    }

    public int updateByPrimaryKeySelective(Bill record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Bill record) {
    	return dao.updateByPrimaryKey(record);
    }

}