package com.apatech.domain;


import java.util.List;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * 商品主表
 * @author 刘成
 *
 */
public class Commodity {
//	商品主表
    private String productcodeid;//商品货号
//    private Integer supplierid;//供应商id
    private String brand;//商品品牌
    private String name;//商品名称
    private Float price;//商品单价
    private Float costprice;//成本价
//    private Integer commoditytypeid;//商品类型ID
    private String commodityimg;//商品图片
    private Integer stockcount;//库存
    private String infomation;//商品信息
    private String shoptype;//商品类型
    private String shopID;//店铺id
    
    private Integer spxj;//是否下架
    	
    private List<Commodity> productcodelist;//集合
    private List<Commoditydetail> productcodelist2;//集合
    
    private Integer spkc  ;//商品库存
    
//    商品详表
    private String commoditydetailid;//条形码，主键
//    private String productcodeid;//商品主表ID
//    private Integer colorid;//商品颜色ID
//    private Integer commoditysizeid;//商品尺码
    private Integer count;//数量
    
//    商品尺码表
    private Integer commoditysizeid;//编号，主键
    private String commoditysize;//商品尺码
    
//    商品类型表 
    private Integer commoditytypeid;//编号，主键
    private String commoditytypename;//商品类型
    
//    商品颜色表
    private Integer colorid;//编号，主键
//    private Integer colortypeid;//颜色色系id
    private String color;//颜色名
    private String colorimg;//颜色图片
    private String rgb;//色值
    
//    商品色系表
    private Integer colortypeid;//编号，主键
    private String colortype;//颜色色系
    
//    供应商表
    private Integer supplierid;//编号，主键
    private String companyname;//公司名称
    private String companyabbreviation;//公司简称
    private String contacts;//联系人
    private String phone;//手机号
    private String email;//邮箱
    private String telephone;//电话
    private String province;//省（地址）
    private String city;//省（地址）
    private String region;//地区（地址）
    private String street;//街道
    
    //采购单主表
    private String billid;//编号，主键
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date deliverytime;//交期
//    private Integer supplierid;//供应商ID
    private String userid;//制表人id
    private String remarks;//备注
    private List<Detail> billlist;//集合
    private int cgdsl;//采购单数量
    private Double cgdje;//采购单金额
    private int shenhe;//审核
    
    
    
//    采购明细表
    private Integer detailid;//编号，主键
//    private String billid;//采购单ID
//    private String commoditydetailid;//商品详表id
    private String cgname;//商品
    private String specifications;//规格
    private Float cgcostprice;//单价
    private Integer cgcount;//数量
    private Float moneyamt;//金额
    
//  店铺表
    private String shopid;//编号，主键
//    private String userid;//用户编号，外键
    private String shopname;//店铺名称
    private String dpcontacts;//联系人
    private String phonenumber;//手机号
    private String fixedtelephone;//固定电话
    private String starttime;//营业开始时间
    private String endtime;//营业结束时间
    private String dpprovince;//省（地址）
    private String dpcity;//市（地址）
    private String dpregion;//地区（地址）
    private String address;//详细地址
    private String introduction;//简介
    private String shopimg;//图片


    //	XZ	//
    List<Commoditydetail> commoditydetailXZ;	//商品详情对象
    Color colorXZ;	//颜色对象
    Commoditysize commoditysizeXZ;	//尺码对象
    Commoditytype commoditytypeXZ;	//商品类型对象







	

	public Commodity(String productcodeid, Integer stockcount) {
		super();
		this.productcodeid = productcodeid;
		this.stockcount = stockcount;
	}

	@Override
	public String toString() {
		return "Commodity [productcodeid=" + productcodeid + ", brand=" + brand + ", name=" + name + ", price=" + price
				+ ", costprice=" + costprice + ", commodityimg=" + commodityimg + ", stockcount=" + stockcount
				+ ", infomation=" + infomation + ", shoptype=" + shoptype + ", shopID=" + shopID + ", productcodelist="
				+ productcodelist + ", productcodelist2=" + productcodelist2 + ", spkc=" + spkc + ", commoditydetailid="
				+ commoditydetailid + ", count=" + count + ", commoditysizeid=" + commoditysizeid + ", commoditysize="
				+ commoditysize + ", commoditytypeid=" + commoditytypeid + ", commoditytypename=" + commoditytypename
				+ ", colorid=" + colorid + ", color=" + color + ", colorimg=" + colorimg + ", rgb=" + rgb
				+ ", colortypeid=" + colortypeid + ", colortype=" + colortype + ", supplierid=" + supplierid
				+ ", companyname=" + companyname + ", companyabbreviation=" + companyabbreviation + ", contacts="
				+ contacts + ", phone=" + phone + ", email=" + email + ", telephone=" + telephone + ", province="
				+ province + ", city=" + city + ", region=" + region + ", street=" + street + ", billid=" + billid
				+ ", deliverytime=" + deliverytime + ", userid=" + userid + ", remarks=" + remarks + ", billlist="
				+ billlist + ", cgdsl=" + cgdsl + ", cgdje=" + cgdje + ", shenhe=" + shenhe + ", detailid=" + detailid
				+ ", cgname=" + cgname + ", specifications=" + specifications + ", cgcostprice=" + cgcostprice
				+ ", cgcount=" + cgcount + ", moneyamt=" + moneyamt + ", shopid=" + shopid + ", shopname=" + shopname
				+ ", dpcontacts=" + dpcontacts + ", phonenumber=" + phonenumber + ", fixedtelephone=" + fixedtelephone
				+ ", starttime=" + starttime + ", endtime=" + endtime + ", dpprovince=" + dpprovince + ", dpcity="
				+ dpcity + ", dpregion=" + dpregion + ", address=" + address + ", introduction=" + introduction
				+ ", shopimg=" + shopimg + ", commoditydetailXZ=" + commoditydetailXZ + ", colorXZ=" + colorXZ
				+ ", commoditysizeXZ=" + commoditysizeXZ + ", commoditytypeXZ=" + commoditytypeXZ + "]";
	}

	public Commodity() {
		super();
	}

	public String getProductcodeid() {
		return productcodeid;
	}
	public void setProductcodeid(String productcodeid) {
		this.productcodeid = productcodeid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getCostprice() {
		return costprice;
	}
	public void setCostprice(Float costprice) {
		this.costprice = costprice;
	}
	public String getCommodityimg() {
		return commodityimg;
	}
	public void setCommodityimg(String commodityimg) {
		this.commodityimg = commodityimg;
	}
	public Integer getStockcount() {
		return stockcount;
	}
	public void setStockcount(Integer stockcount) {
		this.stockcount = stockcount;
	}
	public String getInfomation() {
		return infomation;
	}
	public void setInfomation(String infomation) {
		this.infomation = infomation;
	}
	public String getShoptype() {
		return shoptype;
	}
	public void setShoptype(String shoptype) {
		this.shoptype = shoptype;
	}
	public String getShopID() {
		return shopID;
	}
	public void setShopID(String shopID) {
		this.shopID = shopID;
	}
	public List<Commodity> getProductcodelist() {
		return productcodelist;
	}
	public void setProductcodelist(List<Commodity> productcodelist) {
		this.productcodelist = productcodelist;
	}
	public Integer getSpkc() {
		return spkc;
	}
	public void setSpkc(Integer spkc) {
		this.spkc = spkc;
	}
	public String getCommoditydetailid() {
		return commoditydetailid;
	}
	public void setCommoditydetailid(String commoditydetailid) {
		this.commoditydetailid = commoditydetailid;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getCommoditysizeid() {
		return commoditysizeid;
	}
	public void setCommoditysizeid(Integer commoditysizeid) {
		this.commoditysizeid = commoditysizeid;
	}
	public String getCommoditysize() {
		return commoditysize;
	}
	public void setCommoditysize(String commoditysize) {
		this.commoditysize = commoditysize;
	}
	public Integer getCommoditytypeid() {
		return commoditytypeid;
	}
	public void setCommoditytypeid(Integer commoditytypeid) {
		this.commoditytypeid = commoditytypeid;
	}
	public String getCommoditytypename() {
		return commoditytypename;
	}
	public void setCommoditytypename(String commoditytypename) {
		this.commoditytypename = commoditytypename;
	}
	public Integer getColorid() {
		return colorid;
	}
	public void setColorid(Integer colorid) {
		this.colorid = colorid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColorimg() {
		return colorimg;
	}
	public void setColorimg(String colorimg) {
		this.colorimg = colorimg;
	}
	public String getRgb() {
		return rgb;
	}
	public void setRgb(String rgb) {
		this.rgb = rgb;
	}
	public Integer getColortypeid() {
		return colortypeid;
	}
	public void setColortypeid(Integer colortypeid) {
		this.colortypeid = colortypeid;
	}
	public String getColortype() {
		return colortype;
	}
	public void setColortype(String colortype) {
		this.colortype = colortype;
	}
	public Integer getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyabbreviation() {
		return companyabbreviation;
	}
	public void setCompanyabbreviation(String companyabbreviation) {
		this.companyabbreviation = companyabbreviation;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBillid() {
		return billid;
	}
	public void setBillid(String billid) {
		this.billid = billid;
	}
	public Date getDeliverytime() {
		return deliverytime;
	}
	public void setDeliverytime(Date deliverytime) {
		this.deliverytime = deliverytime;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public List<Detail> getBilllist() {
		return billlist;
	}
	public void setBilllist(List<Detail> billlist) {
		this.billlist = billlist;
	}
	public int getCgdsl() {
		return cgdsl;
	}
	public void setCgdsl(int cgdsl) {
		this.cgdsl = cgdsl;
	}
	public Double getCgdje() {
		return cgdje;
	}
	public void setCgdje(Double cgdje) {
		this.cgdje = cgdje;
	}
	public int getShenhe() {
		return shenhe;
	}
	public void setShenhe(int shenhe) {
		this.shenhe = shenhe;
	}
	public Integer getDetailid() {
		return detailid;
	}
	public void setDetailid(Integer detailid) {
		this.detailid = detailid;
	}
	public String getCgname() {
		return cgname;
	}
	public void setCgname(String cgname) {
		this.cgname = cgname;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public Float getCgcostprice() {
		return cgcostprice;
	}
	public void setCgcostprice(Float cgcostprice) {
		this.cgcostprice = cgcostprice;
	}
	public Integer getCgcount() {
		return cgcount;
	}
	public void setCgcount(Integer cgcount) {
		this.cgcount = cgcount;
	}
	public Float getMoneyamt() {
		return moneyamt;
	}
	public void setMoneyamt(Float moneyamt) {
		this.moneyamt = moneyamt;
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
	public String getDpcontacts() {
		return dpcontacts;
	}
	public void setDpcontacts(String dpcontacts) {
		this.dpcontacts = dpcontacts;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getFixedtelephone() {
		return fixedtelephone;
	}
	public void setFixedtelephone(String fixedtelephone) {
		this.fixedtelephone = fixedtelephone;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getDpprovince() {
		return dpprovince;
	}
	public void setDpprovince(String dpprovince) {
		this.dpprovince = dpprovince;
	}
	public String getDpcity() {
		return dpcity;
	}
	public void setDpcity(String dpcity) {
		this.dpcity = dpcity;
	}
	public String getDpregion() {
		return dpregion;
	}
	public void setDpregion(String dpregion) {
		this.dpregion = dpregion;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getShopimg() {
		return shopimg;
	}
	public void setShopimg(String shopimg) {
		this.shopimg = shopimg;
	}
	public List<Commoditydetail> getCommoditydetailXZ() {
		return commoditydetailXZ;
	}
	public void setCommoditydetailXZ(List<Commoditydetail> commoditydetailXZ) {
		this.commoditydetailXZ = commoditydetailXZ;
	}
	public Color getColorXZ() {
		return colorXZ;
	}
	public void setColorXZ(Color colorXZ) {
		this.colorXZ = colorXZ;
	}
	public Commoditysize getCommoditysizeXZ() {
		return commoditysizeXZ;
	}
	public void setCommoditysizeXZ(Commoditysize commoditysizeXZ) {
		this.commoditysizeXZ = commoditysizeXZ;
	}
	public Commoditytype getCommoditytypeXZ() {
		return commoditytypeXZ;
	}
	public void setCommoditytypeXZ(Commoditytype commoditytypeXZ) {
		this.commoditytypeXZ = commoditytypeXZ;
	}

	public Commodity(String productcodeid, String brand, String name, Float price, Float costprice, String commodityimg,
			Integer stockcount, String infomation, String shoptype, String shopID, List<Commodity> productcodelist,
			Integer spkc, String commoditydetailid, Integer count, Integer commoditysizeid, String commoditysize,
			Integer commoditytypeid, String commoditytypename, Integer colorid, String color, String colorimg,
			String rgb, Integer colortypeid, String colortype, Integer supplierid, String companyname,
			String companyabbreviation, String contacts, String phone, String email, String telephone, String province,
			String city, String region, String street, String billid, Date deliverytime, String userid, String remarks,
			List<Detail> billlist, int cgdsl, Double cgdje, int shenhe, Integer detailid, String cgname,
			String specifications, Float cgcostprice, Integer cgcount, Float moneyamt, String shopid2, String shopname,
			String dpcontacts, String phonenumber, String fixedtelephone, String starttime, String endtime,
			String dpprovince, String dpcity, String dpregion, String address, String introduction, String shopimg,
			List<Commoditydetail> commoditydetailXZ, Color colorXZ, Commoditysize commoditysizeXZ,
			Commoditytype commoditytypeXZ) {
		super();
		this.productcodeid = productcodeid;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.costprice = costprice;
		this.commodityimg = commodityimg;
		this.stockcount = stockcount;
		this.infomation = infomation;
		this.shoptype = shoptype;
		this.shopID = shopID;
		this.productcodelist = productcodelist;
		this.spkc = spkc;
		this.commoditydetailid = commoditydetailid;
		this.count = count;
		this.commoditysizeid = commoditysizeid;
		this.commoditysize = commoditysize;
		this.commoditytypeid = commoditytypeid;
		this.commoditytypename = commoditytypename;
		this.colorid = colorid;
		this.color = color;
		this.colorimg = colorimg;
		this.rgb = rgb;
		this.colortypeid = colortypeid;
		this.colortype = colortype;
		this.supplierid = supplierid;
		this.companyname = companyname;
		this.companyabbreviation = companyabbreviation;
		this.contacts = contacts;
		this.phone = phone;
		this.email = email;
		this.telephone = telephone;
		this.province = province;
		this.city = city;
		this.region = region;
		this.street = street;
		this.billid = billid;
		this.deliverytime = deliverytime;
		this.userid = userid;
		this.remarks = remarks;
		this.billlist = billlist;
		this.cgdsl = cgdsl;
		this.cgdje = cgdje;
		this.shenhe = shenhe;
		this.detailid = detailid;
		this.cgname = cgname;
		this.specifications = specifications;
		this.cgcostprice = cgcostprice;
		this.cgcount = cgcount;
		this.moneyamt = moneyamt;
		shopid = shopid2;
		this.shopname = shopname;
		this.dpcontacts = dpcontacts;
		this.phonenumber = phonenumber;
		this.fixedtelephone = fixedtelephone;
		this.starttime = starttime;
		this.endtime = endtime;
		this.dpprovince = dpprovince;
		this.dpcity = dpcity;
		this.dpregion = dpregion;
		this.address = address;
		this.introduction = introduction;
		this.shopimg = shopimg;
		this.commoditydetailXZ = commoditydetailXZ;
		this.colorXZ = colorXZ;
		this.commoditysizeXZ = commoditysizeXZ;
		this.commoditytypeXZ = commoditytypeXZ;
	}

	public List<Commoditydetail> getProductcodelist2() {
		return productcodelist2;
	}
	public void setProductcodelist2(List<Commoditydetail> productcodelist2) {
		this.productcodelist2 = productcodelist2;
	}

	public Integer getSpxj() {
		return spxj;
	}

	public void setSpxj(Integer spxj) {
		this.spxj = spxj;
	}
	
	

    
}