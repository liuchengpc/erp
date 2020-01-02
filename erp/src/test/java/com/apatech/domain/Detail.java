package com.apatech.domain;
/**
 * 采购明细表
 * @author 刘成
 *
 */
public class Detail {
    private Integer detailid;//编号，主键
    private String billid;//采购单ID
    private String commoditydetailid;//商品详表id
    private String name;//商品
    private String specifications;//规格
    private Float costprice;//单价
    private Integer count;//数量
    private Float moneyamt;//金额
    
    private String productcodeid;//商品主表id

   
    
    

    private String commodityimg;//商品图片



	

	@Override
	public String toString() {
		return "Detail [detailid=" + detailid + ", billid=" + billid + ", commoditydetailid=" + commoditydetailid
				+ ", name=" + name + ", specifications=" + specifications + ", costprice=" + costprice + ", count="
				+ count + ", moneyamt=" + moneyamt + ", productcodeid=" + productcodeid + "]";
	}

	public Detail() {
		super();
	}

	public Detail(String billid, String commoditydetailid, String name, String specifications, Float costprice,
			Integer count, Float moneyamt) {
		super();
		this.billid = billid;
		this.commoditydetailid = commoditydetailid;
		this.name = name;
		this.specifications = specifications;
		this.costprice = costprice;
		this.count = count;
		this.moneyamt = moneyamt;
	}







	public Integer getDetailid() {
        return detailid;
    }

    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid == null ? null : billid.trim();
    }

    public String getCommoditydetailid() {
        return commoditydetailid;
    }

    public void setCommoditydetailid(String commoditydetailid) {
        this.commoditydetailid = commoditydetailid == null ? null : commoditydetailid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public Float getCostprice() {
        return costprice;
    }

    public void setCostprice(Float costprice) {
        this.costprice = costprice;
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
    
    
}