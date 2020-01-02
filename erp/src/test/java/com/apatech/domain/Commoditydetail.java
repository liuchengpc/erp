package com.apatech.domain;

import java.util.List;

/**
 * 商品详表 
 * @author 刘成
 *
 */
public class Commoditydetail {
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
    private Integer spxj;//是否下架

    private List<Commodity> productcodelist;//集合
    
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
    

    // 	XZ //
    private Commodity commodityXZ;	//

    private Commoditysize commoditysizeXZ;

	private Color colorXZ;

	
	
	
	
	public Commoditydetail(String commoditydetailid, Integer count) {
		super();
		this.commoditydetailid = commoditydetailid;
		this.count = count;
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

	public Commodity getCommodityXZ() {
		return commodityXZ;
	}

	public void setCommodityXZ(Commodity commodityXZ) {
		this.commodityXZ = commodityXZ;
	}

	public Commoditysize getCommoditysizeXZ() {
		return commoditysizeXZ;
	}

	public void setCommoditysizeXZ(Commoditysize commoditysizeXZ) {
		this.commoditysizeXZ = commoditysizeXZ;
	}

	public Color getColorXZ() {
		return colorXZ;
	}

	public void setColorXZ(Color colorXZ) {
		this.colorXZ = colorXZ;
	}

	@Override
	public String toString() {
		return "Commoditydetail [productcodeid=" + productcodeid + ", brand=" + brand + ", name=" + name + ", price="
				+ price + ", costprice=" + costprice + ", commodityimg=" + commodityimg + ", stockcount=" + stockcount
				+ ", infomation=" + infomation + ", shoptype=" + shoptype + ", productcodelist=" + productcodelist
				+ ", spkc=" + spkc + ", commoditydetailid=" + commoditydetailid + ", count=" + count
				+ ", commoditysizeid=" + commoditysizeid + ", commoditysize=" + commoditysize + ", commoditytypeid="
				+ commoditytypeid + ", commoditytypename=" + commoditytypename + ", colorid=" + colorid + ", color="
				+ color + ", colorimg=" + colorimg + ", rgb=" + rgb + ", colortypeid=" + colortypeid + ", colortype="
				+ colortype + ", supplierid=" + supplierid + ", companyname=" + companyname + ", companyabbreviation="
				+ companyabbreviation + ", contacts=" + contacts + ", phone=" + phone + ", email=" + email
				+ ", telephone=" + telephone + ", province=" + province + ", city=" + city + ", region=" + region
				+ ", street=" + street + ", commodityXZ=" + commodityXZ + ", commoditysizeXZ=" + commoditysizeXZ
				+ ", colorXZ=" + colorXZ + "]";
	}

	public Commoditydetail(String productcodeid, String brand, String name, Float price, Float costprice,
			String commodityimg, Integer stockcount, String infomation, String shoptype,
			List<Commodity> productcodelist, Integer spkc, String commoditydetailid, Integer count,
			Integer commoditysizeid, String commoditysize, Integer commoditytypeid, String commoditytypename,
			Integer colorid, String color, String colorimg, String rgb, Integer colortypeid, String colortype,
			Integer supplierid, String companyname, String companyabbreviation, String contacts, String phone,
			String email, String telephone, String province, String city, String region, String street,
			Commodity commodityXZ, Commoditysize commoditysizeXZ, Color colorXZ) {
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
		this.commodityXZ = commodityXZ;
		this.commoditysizeXZ = commoditysizeXZ;
		this.colorXZ = colorXZ;
	}

	public Commoditydetail() {
		super();
	}

	public Integer getSpxj() {
		return spxj;
	}

	public void setSpxj(Integer spxj) {
		this.spxj = spxj;
	}
	
	
}