package com.apatech.domain;
/**
 * 商品类型表 
 * @author 刘成
 *
 */
public class Commoditytype {
    private Integer commoditytypeid;//编号，主键
    private String commoditytypename;//商品类型
    
    

    @Override
	public String toString() {
		return "Commoditytype [commoditytypeid=" + commoditytypeid + ", commoditytypename=" + commoditytypename + "]";
	}

	public Commoditytype() {
		super();
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
        this.commoditytypename = commoditytypename == null ? null : commoditytypename.trim();
    }
}