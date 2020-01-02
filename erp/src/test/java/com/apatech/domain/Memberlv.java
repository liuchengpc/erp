package com.apatech.domain;
/**
 * 会员等级设置表
 * @author 刘成
 *
 */
public class Memberlv {
    private Integer memberlvid;//编号，主键
    private String name;//等级名称
    private Float discount;//优惠折扣
    private Float moneylv;//会员消费  升级标准
    
    private Float startmoney;	//原本的消费等级金额 （用来对比）  XZ

	public Integer getMemberlvid() {
		return memberlvid;
	}

	public void setMemberlvid(Integer memberlvid) {
		this.memberlvid = memberlvid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Float getMoneylv() {
		return moneylv;
	}

	public void setMoneylv(Float moneylv) {
		this.moneylv = moneylv;
	}

	public Float getStartmoney() {
		return startmoney;
	}

	public void setStartmoney(Float startmoney) {
		this.startmoney = startmoney;
	}

	@Override
	public String toString() {
		return "Memberlv [memberlvid=" + memberlvid + ", name=" + name + ", discount=" + discount + ", moneylv="
				+ moneylv + ", startmoney=" + startmoney + "]";
	}

	public Memberlv(Integer memberlvid, String name, Float discount, Float moneylv, Float startmoney) {
		super();
		this.memberlvid = memberlvid;
		this.name = name;
		this.discount = discount;
		this.moneylv = moneylv;
		this.startmoney = startmoney;
	}

	public Memberlv() {
		super();
	}
}