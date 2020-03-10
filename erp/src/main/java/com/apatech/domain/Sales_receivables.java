package com.apatech.domain;

import java.util.Date;

/**
 * 应收账款明细表
 * @author 刘成
 *
 */
public class Sales_receivables {
    private Integer srId;//预收账款明细表id，主键
    private String srType;//单别
    private String srNumber;//原单单号
    private Date srDate;//原单日期
    private String srPcId;//交易对象客户表id,外键
    private String srPcName;//交易对象名称
    private String srTeamId;//部门表id，外键
    private String srTeamName;//部门名称
    private String srBuyer;//业务人员
    private String srProjectName;//项目名称
    private String srCurrency;//币别表id,外键
    private Float srExchangeRate;//币别表汇率（买进）
    private Double srPayablesmainPrice;//原单金额
    private Float srCurrentbalance;//现行余额
    private Float srDiscountamount;//折让金额
    private Float srAmountcharged;//冲款金额
    private Float srOffsetamount;//冲抵金额
    private String srAuditing;//是否审核
    private String srYn;//是否删除 0是 1否 默认0
    private String srCustom1;//自定义栏一
    private String srCustom2;//自定义栏二
    private String srCustom3;//自定义栏三
    private String srCustom4;//自定义栏四
    private String srCustom5;//自定义栏五
    private String srCustom6;//自定义栏六
    private String srCustom7;//表状态（0 商品记录表，1 应收账款明细表）
    private String srCustom8;//币别名
    private String srCustom9;//自定义栏九
    private String srCustom10;//主表id
    
    public Sales_receivables() {
    	super();
    }
    public Sales_receivables(Integer srId, String srType, String srNumber, Date srDate, String srPcId, String srPcName,
			String srTeamId, String srTeamName, String srBuyer, String srProjectName, String srCurrency,
			Float srExchangeRate, Double srPayablesmainPrice, Float srCurrentbalance, Float srDiscountamount,
			Float srAmountcharged, Float srOffsetamount, String srAuditing, String srYn, String srCustom1,
			String srCustom2, String srCustom3, String srCustom4, String srCustom5, String srCustom6, String srCustom7,
			String srCustom8, String srCustom9, String srCustom10) {
		super();
		this.srId = srId;
		this.srType = srType;
		this.srNumber = srNumber;
		this.srDate = srDate;
		this.srPcId = srPcId;
		this.srPcName = srPcName;
		this.srTeamId = srTeamId;
		this.srTeamName = srTeamName;
		this.srBuyer = srBuyer;
		this.srProjectName = srProjectName;
		this.srCurrency = srCurrency;
		this.srExchangeRate = srExchangeRate;
		this.srPayablesmainPrice = srPayablesmainPrice;
		this.srCurrentbalance = srCurrentbalance;
		this.srDiscountamount = srDiscountamount;
		this.srAmountcharged = srAmountcharged;
		this.srOffsetamount = srOffsetamount;
		this.srAuditing = srAuditing;
		this.srYn = srYn;
		this.srCustom1 = srCustom1;
		this.srCustom2 = srCustom2;
		this.srCustom3 = srCustom3;
		this.srCustom4 = srCustom4;
		this.srCustom5 = srCustom5;
		this.srCustom6 = srCustom6;
		this.srCustom7 = srCustom7;
		this.srCustom8 = srCustom8;
		this.srCustom9 = srCustom9;
		this.srCustom10 = srCustom10;
	}
	

    public Integer getSrId() {
        return srId;
    }

    public void setSrId(Integer srId) {
        this.srId = srId;
    }

    public String getSrType() {
        return srType;
    }

    public void setSrType(String srType) {
        this.srType = srType == null ? null : srType.trim();
    }

    public String getSrNumber() {
        return srNumber;
    }

    public void setSrNumber(String srNumber) {
        this.srNumber = srNumber == null ? null : srNumber.trim();
    }

    public Date getSrDate() {
        return srDate;
    }

    public void setSrDate(Date srDate) {
        this.srDate = srDate;
    }

    public String getSrPcId() {
        return srPcId;
    }

    public void setSrPcId(String srPcId) {
        this.srPcId = srPcId == null ? null : srPcId.trim();
    }

    public String getSrPcName() {
        return srPcName;
    }

    public void setSrPcName(String srPcName) {
        this.srPcName = srPcName == null ? null : srPcName.trim();
    }

    public String getSrTeamId() {
        return srTeamId;
    }

    public void setSrTeamId(String srTeamId) {
        this.srTeamId = srTeamId == null ? null : srTeamId.trim();
    }

    public String getSrTeamName() {
        return srTeamName;
    }

    public void setSrTeamName(String srTeamName) {
        this.srTeamName = srTeamName == null ? null : srTeamName.trim();
    }

    public String getSrBuyer() {
        return srBuyer;
    }

    public void setSrBuyer(String srBuyer) {
        this.srBuyer = srBuyer == null ? null : srBuyer.trim();
    }

    public String getSrProjectName() {
        return srProjectName;
    }

    public void setSrProjectName(String srProjectName) {
        this.srProjectName = srProjectName == null ? null : srProjectName.trim();
    }

    public String getSrCurrency() {
        return srCurrency;
    }

    public void setSrCurrency(String srCurrency) {
        this.srCurrency = srCurrency == null ? null : srCurrency.trim();
    }

    public Float getSrExchangeRate() {
        return srExchangeRate;
    }

    public void setSrExchangeRate(Float srExchangeRate) {
        this.srExchangeRate = srExchangeRate;
    }

    public Double getSrPayablesmainPrice() {
        return srPayablesmainPrice;
    }

    public void setSrPayablesmainPrice(Double srPayablesmainPrice) {
        this.srPayablesmainPrice = srPayablesmainPrice;
    }

    public Float getSrCurrentbalance() {
        return srCurrentbalance;
    }

    public void setSrCurrentbalance(Float srCurrentbalance) {
        this.srCurrentbalance = srCurrentbalance;
    }

    public Float getSrDiscountamount() {
        return srDiscountamount;
    }

    public void setSrDiscountamount(Float srDiscountamount) {
        this.srDiscountamount = srDiscountamount;
    }

    public Float getSrAmountcharged() {
        return srAmountcharged;
    }

    public void setSrAmountcharged(Float srAmountcharged) {
        this.srAmountcharged = srAmountcharged;
    }

    public Float getSrOffsetamount() {
        return srOffsetamount;
    }

    public void setSrOffsetamount(Float srOffsetamount) {
        this.srOffsetamount = srOffsetamount;
    }

    public String getSrAuditing() {
        return srAuditing;
    }

    public void setSrAuditing(String srAuditing) {
        this.srAuditing = srAuditing == null ? null : srAuditing.trim();
    }

    public String getSrYn() {
        return srYn;
    }

    public void setSrYn(String srYn) {
        this.srYn = srYn == null ? null : srYn.trim();
    }

    public String getSrCustom1() {
        return srCustom1;
    }

    public void setSrCustom1(String srCustom1) {
        this.srCustom1 = srCustom1 == null ? null : srCustom1.trim();
    }

    public String getSrCustom2() {
        return srCustom2;
    }

    public void setSrCustom2(String srCustom2) {
        this.srCustom2 = srCustom2 == null ? null : srCustom2.trim();
    }

    public String getSrCustom3() {
        return srCustom3;
    }

    public void setSrCustom3(String srCustom3) {
        this.srCustom3 = srCustom3 == null ? null : srCustom3.trim();
    }

    public String getSrCustom4() {
        return srCustom4;
    }

    public void setSrCustom4(String srCustom4) {
        this.srCustom4 = srCustom4 == null ? null : srCustom4.trim();
    }

    public String getSrCustom5() {
        return srCustom5;
    }

    public void setSrCustom5(String srCustom5) {
        this.srCustom5 = srCustom5 == null ? null : srCustom5.trim();
    }

    public String getSrCustom6() {
        return srCustom6;
    }

    public void setSrCustom6(String srCustom6) {
        this.srCustom6 = srCustom6 == null ? null : srCustom6.trim();
    }

    public String getSrCustom7() {
        return srCustom7;
    }

    public void setSrCustom7(String srCustom7) {
        this.srCustom7 = srCustom7 == null ? null : srCustom7.trim();
    }

    public String getSrCustom8() {
        return srCustom8;
    }

    public void setSrCustom8(String srCustom8) {
        this.srCustom8 = srCustom8 == null ? null : srCustom8.trim();
    }

    public String getSrCustom9() {
        return srCustom9;
    }

    public void setSrCustom9(String srCustom9) {
        this.srCustom9 = srCustom9 == null ? null : srCustom9.trim();
    }

    public String getSrCustom10() {
        return srCustom10;
    }

    public void setSrCustom10(String srCustom10) {
        this.srCustom10 = srCustom10 == null ? null : srCustom10.trim();
    }
}