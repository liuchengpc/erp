package com.apatech.domain;
/**
 * 商品尺码表
 * @author 刘成
 *
 */
public class Commoditysize {
    private Integer commoditysizeid;//编号，主键
    private String commoditysize;//商品尺码
    
    

    @Override
	public String toString() {
		return "Commoditysize [commoditysizeid=" + commoditysizeid + ", commoditysize=" + commoditysize + "]";
	}

	public Commoditysize() {
		super();
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
        this.commoditysize = commoditysize == null ? null : commoditysize.trim();
    }
}