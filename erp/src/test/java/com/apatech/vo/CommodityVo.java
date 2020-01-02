package com.apatech.vo;

import java.util.Date;
import java.util.List;

import com.apatech.domain.Cashregisterdetail;
import com.apatech.domain.Commoditydetail;
import com.apatech.domain.Detail;
/**
 * 商品管理模块类
 * @author 刘成
 *
 */
public class CommodityVo {
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
    private List<Commoditydetail> productcodelist;//集合
    
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
    private Date deliverytime;//交期
//    private Integer supplierid;//供应商ID
    private String userid;//制表人id
    private String remarks;//备注
    private List<Detail> list;//集合
    
//    采购明细表
    private Integer detailid;//编号，主键
//    private String billid;//采购单ID
//    private String commoditydetailid;//商品详表id
    private String cgname;//商品
    private String specifications;//规格
    private Float cgcostprice;//单价
    private Integer cgcount;//数量
    private Float moneyamt;//金额
    
    
    
    
	@Override
	public String toString() {
		return "CommodityVo [productcodeid=" + productcodeid + ", brand=" + brand + ", name=" + name + ", price="
				+ price + ", costprice=" + costprice + ", commodityimg=" + commodityimg + ", stockcount=" + stockcount
				+ ", infomation=" + infomation + ", shoptype=" + shoptype + ", productcodelist=" + productcodelist
				+ ", commoditydetailid=" + commoditydetailid + ", count=" + count + ", commoditysizeid="
				+ commoditysizeid + ", commoditysize=" + commoditysize + ", commoditytypeid=" + commoditytypeid
				+ ", commoditytypename=" + commoditytypename + ", colorid=" + colorid + ", color=" + color
				+ ", colorimg=" + colorimg + ", rgb=" + rgb + ", colortypeid=" + colortypeid + ", colortype="
				+ colortype + ", supplierid=" + supplierid + ", companyname=" + companyname + ", companyabbreviation="
				+ companyabbreviation + ", contacts=" + contacts + ", phone=" + phone + ", email=" + email
				+ ", telephone=" + telephone + ", province=" + province + ", city=" + city + ", region=" + region
				+ ", street=" + street + ", billid=" + billid + ", deliverytime=" + deliverytime + ", userid=" + userid
				+ ", remarks=" + remarks + ", list=" + list + ", detailid=" + detailid + ", cgname=" + cgname
				+ ", specifications=" + specifications + ", cgcostprice=" + cgcostprice + ", cgcount=" + cgcount
				+ ", moneyamt=" + moneyamt + "]";
	}
	public CommodityVo() {
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
	public List<Commoditydetail> getProductcodelist() {
		return productcodelist;
	}
	public void setProductcodelist(List<Commoditydetail> productcodelist) {
		this.productcodelist = productcodelist;
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
	public List<Detail> getList() {
		return list;
	}
	public void setList(List<Detail> list) {
		this.list = list;
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
    
    
    
    
    
}
