package com.apatech.domain;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import com.apatech.mapper.MemberMapper;
import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 订单主表
 * @author 刘成
 *
 */
public class Cashregister {
    private String ashregisterid;//订单主表键
    @DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm:ss" )
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss" , timezone = "GMT+8")
    private Date time;//日期
//    private String shopid;//店铺ID
    private Integer count;//购买数量
    private Float moneyamt;//合计
//    private Integer memberid;//会员ID
    private String cashregistername;//收银人员
    private Integer ispresent;//是否付款    (0:否 默认：0  1:是)
    private List<Cashregisterdetail> list;//集合
    private List<Cashregister> list2;//集合
    
    private String ddnf;//订单年份
    private String ddyf;//订单月份
    private Double ddsumprice;//订单销售金额
    private Integer ddcount;//订单数

    private Member member;	//会员对象
    private Memberlv memberlv;	//会员等级对象
    

    private String cashregisterdetailid;//编号，主键
    private String cashregisterid;//商品主表id
    private String commodityname;//商品名称
    private String commoditydetailid;//商品详表ID
    private String specifications;//规格
    private Float price;//单价
    private Float sbtotal;//小计
    private Integer xbcount;//数量
    private Integer zhekou;//折扣
    private Float xbmoneyamt;//总金额
    
    
    private Integer memberid;//编号，主键
    private String name;//会员名称
    private Float hyprice;//余额
    
    private String shopid;//编号，主键
    private String shopname;//店铺名称
    
     
    private String commodityimg;//商品图片
    private String spname;//商品名字
    private String stockcount;//商品库存
    private Integer spsccount;//商品售出数量
    private Double spsccprice;//商品售出金额
 
    
    private String commoditysize;//尺码
    private String color;//颜色
    
    private Integer dds;//订单数
	private Double  xsje;//销售金额
	private Double  cz;//充值

	@Override
	public String toString() {
		return "Cashregister [ashregisterid=" + ashregisterid + ", time=" + time + ", count=" + count + ", moneyamt="
				+ moneyamt + ", cashregistername=" + cashregistername + ", ispresent=" + ispresent + ", list=" + list
				+ ", member=" + member + ", memberlv=" + memberlv + ", cashregisterdetailid=" + cashregisterdetailid
				+ ", cashregisterid=" + cashregisterid + ", commodityname=" + commodityname + ", commoditydetailid="
				+ commoditydetailid + ", specifications=" + specifications + ", price=" + price + ", sbtotal=" + sbtotal
				+ ", xbcount=" + xbcount + ", zhekou=" + zhekou + ", xbmoneyamt=" + xbmoneyamt + ", memberid="
				+ memberid + ", name=" + name + ", hyprice=" + hyprice + ", shopid=" + shopid + ", shopname=" + shopname
				+ ", commodityimg=" + commodityimg + ", spname=" + spname + ", stockcount=" + stockcount
				+ ", spsccount=" + spsccount + ", spsccprice=" + spsccprice + ", commoditysize=" + commoditysize
				+ ", color=" + color + ", dds=" + dds + ", xsje=" + xsje + ", cz=" + cz + "]";
	}
	public Cashregister(String ashregisterid, Date time, Integer count, Float moneyamt, String cashregistername,
			Integer ispresent, List<Cashregisterdetail> list, Member member, Memberlv memberlv,
			String cashregisterdetailid, String cashregisterid, String commodityname, String commoditydetailid,
			String specifications, Float price, Float sbtotal, Integer xbcount, Integer zhekou, Float xbmoneyamt,
			Integer memberid, String name, Float hyprice, String shopid, String shopname, String commodityimg,
			String spname, String stockcount, Integer spsccount, Double spsccprice, String commoditysize, String color,
			Integer dds, Double xsje, Double cz) {
		super();
		this.ashregisterid = ashregisterid;
		this.time = time;
		this.count = count;
		this.moneyamt = moneyamt;
		this.cashregistername = cashregistername;
		this.ispresent = ispresent;
		this.list = list;
		this.member = member;
		this.memberlv = memberlv;
		this.cashregisterdetailid = cashregisterdetailid;
		this.cashregisterid = cashregisterid;
		this.commodityname = commodityname;
		this.commoditydetailid = commoditydetailid;
		this.specifications = specifications;
		this.price = price;
		this.sbtotal = sbtotal;
		this.xbcount = xbcount;
		this.zhekou = zhekou;
		this.xbmoneyamt = xbmoneyamt;
		this.memberid = memberid;
		this.name = name;
		this.hyprice = hyprice;
		this.shopid = shopid;
		this.shopname = shopname;
		this.commodityimg = commodityimg;
		this.spname = spname;
		this.stockcount = stockcount;
		this.spsccount = spsccount;
		this.spsccprice = spsccprice;
		this.commoditysize = commoditysize;
		this.color = color;
		this.dds = dds;
		this.xsje = xsje;
		this.cz = cz;
	}
	
	public Cashregister() {
		super();
	}
	public String getAshregisterid() {
		return ashregisterid;
	}
	public void setAshregisterid(String ashregisterid) {
		this.ashregisterid = ashregisterid;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Float getMoneyamt() {
		return moneyamt;
	}
	public void setMoneyamt(Float moneyamt) {
		this.moneyamt = moneyamt;
	}
	public String getCashregistername() {
		return cashregistername;
	}
	public void setCashregistername(String cashregistername) {
		this.cashregistername = cashregistername;
	}
	public Integer getIspresent() {
		return ispresent;
	}
	public void setIspresent(Integer ispresent) {
		this.ispresent = ispresent;
	}
	public List<Cashregisterdetail> getList() {
		return list;
	}
	public void setList(List<Cashregisterdetail> list) {
		this.list = list;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Memberlv getMemberlv() {
		return memberlv;
	}
	public void setMemberlv(Memberlv memberlv) {
		this.memberlv = memberlv;
	}
	public String getCashregisterdetailid() {
		return cashregisterdetailid;
	}
	public void setCashregisterdetailid(String cashregisterdetailid) {
		this.cashregisterdetailid = cashregisterdetailid;
	}
	public String getCashregisterid() {
		return cashregisterid;
	}
	public void setCashregisterid(String cashregisterid) {
		this.cashregisterid = cashregisterid;
	}
	public String getCommodityname() {
		return commodityname;
	}
	public void setCommodityname(String commodityname) {
		this.commodityname = commodityname;
	}
	public String getCommoditydetailid() {
		return commoditydetailid;
	}
	public void setCommoditydetailid(String commoditydetailid) {
		this.commoditydetailid = commoditydetailid;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getSbtotal() {
		return sbtotal;
	}
	public void setSbtotal(Float sbtotal) {
		this.sbtotal = sbtotal;
	}
	public Integer getXbcount() {
		return xbcount;
	}
	public void setXbcount(Integer xbcount) {
		this.xbcount = xbcount;
	}
	public Integer getZhekou() {
		return zhekou;
	}
	public void setZhekou(Integer zhekou) {
		this.zhekou = zhekou;
	}
	public Float getXbmoneyamt() {
		return xbmoneyamt;
	}
	public void setXbmoneyamt(Float xbmoneyamt) {
		this.xbmoneyamt = xbmoneyamt;
	}
	public Integer getMemberid() {
		return memberid;
	}
	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getHyprice() {
		return hyprice;
	}
	public void setHyprice(Float hyprice) {
		this.hyprice = hyprice;
	}
	public String getShopid() {
		return shopid;
	}
	public void setShopid(String shopid) {
		this.shopid = shopid;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getCommodityimg() {
		return commodityimg;
	}
	public void setCommodityimg(String commodityimg) {
		this.commodityimg = commodityimg;
	}
	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	public String getStockcount() {
		return stockcount;
	}
	public void setStockcount(String stockcount) {
		this.stockcount = stockcount;
	}
	public Integer getSpsccount() {
		return spsccount;
	}
	public void setSpsccount(Integer spsccount) {
		this.spsccount = spsccount;
	}
	public Double getSpsccprice() {
		return spsccprice;
	}
	public void setSpsccprice(Double spsccprice) {
		this.spsccprice = spsccprice;
	}
	public String getCommoditysize() {
		return commoditysize;
	}
	public void setCommoditysize(String commoditysize) {
		this.commoditysize = commoditysize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getDds() {
		return dds;
	}
	public void setDds(Integer dds) {
		this.dds = dds;
	}
	public Double getXsje() {
		return xsje;
	}
	public void setXsje(Double xsje) {
		this.xsje = xsje;
	}
	public Double getCz() {
		return cz;
	}
	public void setCz(Double cz) {
		this.cz = cz;
	}
	public List<Cashregister> getList2() {
		return list2;
	}
	public void setList2(List<Cashregister> list2) {
		this.list2 = list2;
	}
	public String getDdnf() {
		return ddnf;
	}
	public void setDdnf(String ddnf) {
		this.ddnf = ddnf;
	}
	public String getDdyf() {
		return ddyf;
	}
	public void setDdyf(String ddyf) {
		this.ddyf = ddyf;
	}
	public Double getDdsumprice() {
		return ddsumprice;
	}
	public void setDdsumprice(Double ddsumprice) {
		this.ddsumprice = ddsumprice;
	}
	public Integer getDdcount() {
		return ddcount;
	}
	public void setDdcount(Integer ddcount) {
		this.ddcount = ddcount;
	}
	
	
	
	
    
}