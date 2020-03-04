package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 币别表
 * @author 刘成
 *
 */
public class Currency {
    private String currencyId;//币别id（主键 唯一）
    private String currencyName;//币别名称
    private String currencyEasyname;//币别简称
    private String currencyEngname;//英文名称
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date currencyTransactionday;//异动日期
    private Float currencyStandardexchange;//固定汇率
    private Float currencyInexchange;//买进汇率
    private Float currencyOutexchange;//卖出汇率
    private Integer currencyIfthousand;//千位逗号，每三位数用逗号隔开（0,1表示）
    private Integer currencyMpointset;//小数点设置，保留小数点后几位（默认值，2）
    private String currencyAuditing;//是否审核
    private String urrencyYn;//是否删除（0 否 1 是 ，默认0）
    private String currencyCustom1;//自定栏1
    private String currencyCustom2;//自定栏2
    private String currencyCustom3;//自定栏3
    private String currencyCustom4;//自定栏4
    private String currencyCustom5;//自定栏5
    private String currencyCustom6;//自定栏6
    
    

    public Currency() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Currency [currencyId=" + currencyId + ", currencyName=" + currencyName + ", currencyEasyname="
				+ currencyEasyname + ", currencyEngname=" + currencyEngname + ", currencyTransactionday="
				+ currencyTransactionday + ", currencyStandardexchange=" + currencyStandardexchange
				+ ", currencyInexchange=" + currencyInexchange + ", currencyOutexchange=" + currencyOutexchange
				+ ", currencyIfthousand=" + currencyIfthousand + ", currencyMpointset=" + currencyMpointset
				+ ", currencyAuditing=" + currencyAuditing + ", urrencyYn=" + urrencyYn + ", currencyCustom1="
				+ currencyCustom1 + ", currencyCustom2=" + currencyCustom2 + ", currencyCustom3=" + currencyCustom3
				+ ", currencyCustom4=" + currencyCustom4 + ", currencyCustom5=" + currencyCustom5 + ", currencyCustom6="
				+ currencyCustom6 + "]";
	}



	public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName == null ? null : currencyName.trim();
    }

    public String getCurrencyEasyname() {
        return currencyEasyname;
    }

    public void setCurrencyEasyname(String currencyEasyname) {
        this.currencyEasyname = currencyEasyname == null ? null : currencyEasyname.trim();
    }

    public String getCurrencyEngname() {
        return currencyEngname;
    }

    public void setCurrencyEngname(String currencyEngname) {
        this.currencyEngname = currencyEngname == null ? null : currencyEngname.trim();
    }

    public Date getCurrencyTransactionday() {
        return currencyTransactionday;
    }

    public void setCurrencyTransactionday(Date currencyTransactionday) {
        this.currencyTransactionday = currencyTransactionday;
    }

    public Float getCurrencyStandardexchange() {
        return currencyStandardexchange;
    }

    public void setCurrencyStandardexchange(Float currencyStandardexchange) {
        this.currencyStandardexchange = currencyStandardexchange;
    }

    public Float getCurrencyInexchange() {
        return currencyInexchange;
    }

    public void setCurrencyInexchange(Float currencyInexchange) {
        this.currencyInexchange = currencyInexchange;
    }

    public Float getCurrencyOutexchange() {
        return currencyOutexchange;
    }

    public void setCurrencyOutexchange(Float currencyOutexchange) {
        this.currencyOutexchange = currencyOutexchange;
    }

    public Integer getCurrencyIfthousand() {
        return currencyIfthousand;
    }

    public void setCurrencyIfthousand(Integer currencyIfthousand) {
        this.currencyIfthousand = currencyIfthousand;
    }

    public Integer getCurrencyMpointset() {
        return currencyMpointset;
    }

    public void setCurrencyMpointset(Integer currencyMpointset) {
        this.currencyMpointset = currencyMpointset;
    }

    public String getCurrencyAuditing() {
        return currencyAuditing;
    }

    public void setCurrencyAuditing(String currencyAuditing) {
        this.currencyAuditing = currencyAuditing == null ? null : currencyAuditing.trim();
    }

    public String getUrrencyYn() {
        return urrencyYn;
    }

    public void setUrrencyYn(String urrencyYn) {
        this.urrencyYn = urrencyYn == null ? null : urrencyYn.trim();
    }

    public String getCurrencyCustom1() {
        return currencyCustom1;
    }

    public void setCurrencyCustom1(String currencyCustom1) {
        this.currencyCustom1 = currencyCustom1 == null ? null : currencyCustom1.trim();
    }

    public String getCurrencyCustom2() {
        return currencyCustom2;
    }

    public void setCurrencyCustom2(String currencyCustom2) {
        this.currencyCustom2 = currencyCustom2 == null ? null : currencyCustom2.trim();
    }

    public String getCurrencyCustom3() {
        return currencyCustom3;
    }

    public void setCurrencyCustom3(String currencyCustom3) {
        this.currencyCustom3 = currencyCustom3 == null ? null : currencyCustom3.trim();
    }

    public String getCurrencyCustom4() {
        return currencyCustom4;
    }

    public void setCurrencyCustom4(String currencyCustom4) {
        this.currencyCustom4 = currencyCustom4 == null ? null : currencyCustom4.trim();
    }

    public String getCurrencyCustom5() {
        return currencyCustom5;
    }

    public void setCurrencyCustom5(String currencyCustom5) {
        this.currencyCustom5 = currencyCustom5 == null ? null : currencyCustom5.trim();
    }

    public String getCurrencyCustom6() {
        return currencyCustom6;
    }

    public void setCurrencyCustom6(String currencyCustom6) {
        this.currencyCustom6 = currencyCustom6 == null ? null : currencyCustom6.trim();
    }
}