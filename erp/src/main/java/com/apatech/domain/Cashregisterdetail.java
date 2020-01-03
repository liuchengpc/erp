package com.apatech.domain;
/**
 * 订单详表
 * @author 刘成
 *
 */
public class Cashregisterdetail {
    private String cashregisterdetailid;//编号，主键
    private String cashregisterid;//商品主表id
    private String commodityname;//商品名称
    private String commoditydetailid;//商品详表ID
    private String specifications;//规格
    private Float price;//单价
    private Float sbtotal;//小计
    private Integer count;//数量
    private Integer zhekou;//折扣
    private Float moneyamt;//总金额
    private Commoditydetail commoditydetail;	//商品详情对象
    private Commodity commodity;	//商品主表对象
    
    
    private String productcodeid;//商品主表id
    private String commodityimg;//商品图片
    private String name;//商品名
    private Integer spxqcount;//商品库存
    
    private String color;//颜色
    private String  commoditysize;//尺码
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
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getZhekou() {
		return zhekou;
	}
	public void setZhekou(Integer zhekou) {
		this.zhekou = zhekou;
	}
	public Float getMoneyamt() {
		return moneyamt;
	}
	public void setMoneyamt(Float moneyamt) {
		this.moneyamt = moneyamt;
	}
	public Commoditydetail getCommoditydetail() {
		return commoditydetail;
	}
	public void setCommoditydetail(Commoditydetail commoditydetail) {
		this.commoditydetail = commoditydetail;
	}
	public Commodity getCommodity() {
		return commodity;
	}
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}
	public String getProductcodeid() {
		return productcodeid;
	}
	public void setProductcodeid(String productcodeid) {
		this.productcodeid = productcodeid;
	}
	public String getCommodityimg() {
		return commodityimg;
	}
	public void setCommodityimg(String commodityimg) {
		this.commodityimg = commodityimg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSpxqcount() {
		return spxqcount;
	}
	public void setSpxqcount(Integer spxqcount) {
		this.spxqcount = spxqcount;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCommoditysize() {
		return commoditysize;
	}
	public void setCommoditysize(String commoditysize) {
		this.commoditysize = commoditysize;
	}
	@Override
	public String toString() {
		return "Cashregisterdetail [cashregisterdetailid=" + cashregisterdetailid + ", cashregisterid=" + cashregisterid
				+ ", commodityname=" + commodityname + ", commoditydetailid=" + commoditydetailid + ", specifications="
				+ specifications + ", price=" + price + ", sbtotal=" + sbtotal + ", count=" + count + ", zhekou="
				+ zhekou + ", moneyamt=" + moneyamt + ", commoditydetail=" + commoditydetail + ", commodity="
				+ commodity + ", productcodeid=" + productcodeid + ", commodityimg=" + commodityimg + ", name=" + name
				+ ", spxqcount=" + spxqcount + ", color=" + color + ", commoditysize=" + commoditysize + "]";
	}
	public Cashregisterdetail(String cashregisterdetailid, String cashregisterid, String commodityname,
			String commoditydetailid, String specifications, Float price, Float sbtotal, Integer count, Integer zhekou,
			Float moneyamt, Commoditydetail commoditydetail, Commodity commodity, String productcodeid,
			String commodityimg, String name, Integer spxqcount, String color, String commoditysize) {
		super();
		this.cashregisterdetailid = cashregisterdetailid;
		this.cashregisterid = cashregisterid;
		this.commodityname = commodityname;
		this.commoditydetailid = commoditydetailid;
		this.specifications = specifications;
		this.price = price;
		this.sbtotal = sbtotal;
		this.count = count;
		this.zhekou = zhekou;
		this.moneyamt = moneyamt;
		this.commoditydetail = commoditydetail;
		this.commodity = commodity;
		this.productcodeid = productcodeid;
		this.commodityimg = commodityimg;
		this.name = name;
		this.spxqcount = spxqcount;
		this.color = color;
		this.commoditysize = commoditysize;
	}
	
	public Cashregisterdetail() {
		super();
	}

	
}