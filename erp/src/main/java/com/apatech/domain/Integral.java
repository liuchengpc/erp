package com.apatech.domain;
/**
 * 积分表
 * @author 刘成
 *
 */
public class Integral {
    private Integer integralid;//编号，主键
    private Float integral;//积分
    private Float price;//可抵扣的钱
    
    

    @Override
	public String toString() {
		return "Integral [integralid=" + integralid + ", integral=" + integral + ", price=" + price + "]";
	}

	public Integral() {
		super();
	}

	public Integer getIntegralid() {
        return integralid;
    }

    public void setIntegralid(Integer integralid) {
        this.integralid = integralid;
    }

    public Float getIntegral() {
        return integral;
    }

    public void setIntegral(Float integral) {
        this.integral = integral;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}