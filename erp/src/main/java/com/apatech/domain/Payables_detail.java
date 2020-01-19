package com.apatech.domain;

import java.util.Date;

/**
 * 应付冲款内容详表
 * @author 刘成
 *
 */
public class Payables_detail {
    private String paydetailId;//应付冲款单明细表id,主键
    private String payablesId;//应付冲款单主表id, 外键
    private String supplierId;//供应商表id，外键
    private String staffId;//部门员工表id，外键
    private String currencyId;//币别类型表id，外键
    private String projectId;//项目表id，外键
    private String padeSourcelist;//来源单别
    private Date padeSourcetime;//来源日期
    private String padeSourcenumber;//来源单号
    private String padeInvoiceno;//发票号码
    private String padeTransaction;//交易对象
    private String padeTransactionname;//交易对象名称
    private String padeTeamName;//员工部门名称表
    private String padeStaffName;//员工名称部门表
    private String padeProjectName;//项目表
    private String padeCurrencyName;//币别类型表
    private Integer padeCurrencyInexchange;//币别类型表
    private Float padePrice;//汇率
    private Float padeCurrentbalance;//现行余额
    private Float padeDiscountamount;//折让金额
    private Float padeAmountcharged;//冲款金额
    private Float padeOffsetamount;//冲抵金额
    private String padeAuditing;//是否审核
    private String padeYn;//是否删除（0 否 1 是 ，默认0）
    private String padeCustom1;//自定栏1
    private String padeCustom2;//自定栏2
    private String padeCustom3;//自定栏3
    private String padeCustom4;//自定栏4
    private String padeCustom5;//自定栏5
    private String padeCustom6;//自定栏6
    private String padeCustom7;//自定栏7
    private String padeCustom8;//自定栏8
    private String padeCustom9;//自定栏9
    private String padeCustom10;//自定栏10
    
    

    public Payables_detail() {
		super();
	}

	@Override
	public String toString() {
		return "Payables_detail [paydetailId=" + paydetailId + ", payablesId=" + payablesId + ", supplierId="
				+ supplierId + ", staffId=" + staffId + ", currencyId=" + currencyId + ", projectId=" + projectId
				+ ", padeSourcelist=" + padeSourcelist + ", padeSourcetime=" + padeSourcetime + ", padeSourcenumber="
				+ padeSourcenumber + ", padeInvoiceno=" + padeInvoiceno + ", padeTransaction=" + padeTransaction
				+ ", padeTransactionname=" + padeTransactionname + ", padeTeamName=" + padeTeamName + ", padeStaffName="
				+ padeStaffName + ", padeProjectName=" + padeProjectName + ", padeCurrencyName=" + padeCurrencyName
				+ ", padeCurrencyInexchange=" + padeCurrencyInexchange + ", padePrice=" + padePrice
				+ ", padeCurrentbalance=" + padeCurrentbalance + ", padeDiscountamount=" + padeDiscountamount
				+ ", padeAmountcharged=" + padeAmountcharged + ", padeOffsetamount=" + padeOffsetamount
				+ ", padeAuditing=" + padeAuditing + ", padeYn=" + padeYn + ", padeCustom1=" + padeCustom1
				+ ", padeCustom2=" + padeCustom2 + ", padeCustom3=" + padeCustom3 + ", padeCustom4=" + padeCustom4
				+ ", padeCustom5=" + padeCustom5 + ", padeCustom6=" + padeCustom6 + ", padeCustom7=" + padeCustom7
				+ ", padeCustom8=" + padeCustom8 + ", padeCustom9=" + padeCustom9 + ", padeCustom10=" + padeCustom10
				+ "]";
	}

	public String getPaydetailId() {
        return paydetailId;
    }

    public void setPaydetailId(String paydetailId) {
        this.paydetailId = paydetailId == null ? null : paydetailId.trim();
    }

    public String getPayablesId() {
        return payablesId;
    }

    public void setPayablesId(String payablesId) {
        this.payablesId = payablesId == null ? null : payablesId.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getPadeSourcelist() {
        return padeSourcelist;
    }

    public void setPadeSourcelist(String padeSourcelist) {
        this.padeSourcelist = padeSourcelist == null ? null : padeSourcelist.trim();
    }

    public Date getPadeSourcetime() {
        return padeSourcetime;
    }

    public void setPadeSourcetime(Date padeSourcetime) {
        this.padeSourcetime = padeSourcetime;
    }

    public String getPadeSourcenumber() {
        return padeSourcenumber;
    }

    public void setPadeSourcenumber(String padeSourcenumber) {
        this.padeSourcenumber = padeSourcenumber == null ? null : padeSourcenumber.trim();
    }

    public String getPadeInvoiceno() {
        return padeInvoiceno;
    }

    public void setPadeInvoiceno(String padeInvoiceno) {
        this.padeInvoiceno = padeInvoiceno == null ? null : padeInvoiceno.trim();
    }

    public String getPadeTransaction() {
        return padeTransaction;
    }

    public void setPadeTransaction(String padeTransaction) {
        this.padeTransaction = padeTransaction == null ? null : padeTransaction.trim();
    }

    public String getPadeTransactionname() {
        return padeTransactionname;
    }

    public void setPadeTransactionname(String padeTransactionname) {
        this.padeTransactionname = padeTransactionname == null ? null : padeTransactionname.trim();
    }

    public String getPadeTeamName() {
        return padeTeamName;
    }

    public void setPadeTeamName(String padeTeamName) {
        this.padeTeamName = padeTeamName == null ? null : padeTeamName.trim();
    }

    public String getPadeStaffName() {
        return padeStaffName;
    }

    public void setPadeStaffName(String padeStaffName) {
        this.padeStaffName = padeStaffName == null ? null : padeStaffName.trim();
    }

    public String getPadeProjectName() {
        return padeProjectName;
    }

    public void setPadeProjectName(String padeProjectName) {
        this.padeProjectName = padeProjectName == null ? null : padeProjectName.trim();
    }

    public String getPadeCurrencyName() {
        return padeCurrencyName;
    }

    public void setPadeCurrencyName(String padeCurrencyName) {
        this.padeCurrencyName = padeCurrencyName == null ? null : padeCurrencyName.trim();
    }

    public Integer getPadeCurrencyInexchange() {
        return padeCurrencyInexchange;
    }

    public void setPadeCurrencyInexchange(Integer padeCurrencyInexchange) {
        this.padeCurrencyInexchange = padeCurrencyInexchange;
    }

    public Float getPadePrice() {
        return padePrice;
    }

    public void setPadePrice(Float padePrice) {
        this.padePrice = padePrice;
    }

    public Float getPadeCurrentbalance() {
        return padeCurrentbalance;
    }

    public void setPadeCurrentbalance(Float padeCurrentbalance) {
        this.padeCurrentbalance = padeCurrentbalance;
    }

    public Float getPadeDiscountamount() {
        return padeDiscountamount;
    }

    public void setPadeDiscountamount(Float padeDiscountamount) {
        this.padeDiscountamount = padeDiscountamount;
    }

    public Float getPadeAmountcharged() {
        return padeAmountcharged;
    }

    public void setPadeAmountcharged(Float padeAmountcharged) {
        this.padeAmountcharged = padeAmountcharged;
    }

    public Float getPadeOffsetamount() {
        return padeOffsetamount;
    }

    public void setPadeOffsetamount(Float padeOffsetamount) {
        this.padeOffsetamount = padeOffsetamount;
    }

    public String getPadeAuditing() {
        return padeAuditing;
    }

    public void setPadeAuditing(String padeAuditing) {
        this.padeAuditing = padeAuditing == null ? null : padeAuditing.trim();
    }

    public String getPadeYn() {
        return padeYn;
    }

    public void setPadeYn(String padeYn) {
        this.padeYn = padeYn == null ? null : padeYn.trim();
    }

    public String getPadeCustom1() {
        return padeCustom1;
    }

    public void setPadeCustom1(String padeCustom1) {
        this.padeCustom1 = padeCustom1 == null ? null : padeCustom1.trim();
    }

    public String getPadeCustom2() {
        return padeCustom2;
    }

    public void setPadeCustom2(String padeCustom2) {
        this.padeCustom2 = padeCustom2 == null ? null : padeCustom2.trim();
    }

    public String getPadeCustom3() {
        return padeCustom3;
    }

    public void setPadeCustom3(String padeCustom3) {
        this.padeCustom3 = padeCustom3 == null ? null : padeCustom3.trim();
    }

    public String getPadeCustom4() {
        return padeCustom4;
    }

    public void setPadeCustom4(String padeCustom4) {
        this.padeCustom4 = padeCustom4 == null ? null : padeCustom4.trim();
    }

    public String getPadeCustom5() {
        return padeCustom5;
    }

    public void setPadeCustom5(String padeCustom5) {
        this.padeCustom5 = padeCustom5 == null ? null : padeCustom5.trim();
    }

    public String getPadeCustom6() {
        return padeCustom6;
    }

    public void setPadeCustom6(String padeCustom6) {
        this.padeCustom6 = padeCustom6 == null ? null : padeCustom6.trim();
    }

    public String getPadeCustom7() {
        return padeCustom7;
    }

    public void setPadeCustom7(String padeCustom7) {
        this.padeCustom7 = padeCustom7 == null ? null : padeCustom7.trim();
    }

    public String getPadeCustom8() {
        return padeCustom8;
    }

    public void setPadeCustom8(String padeCustom8) {
        this.padeCustom8 = padeCustom8 == null ? null : padeCustom8.trim();
    }

    public String getPadeCustom9() {
        return padeCustom9;
    }

    public void setPadeCustom9(String padeCustom9) {
        this.padeCustom9 = padeCustom9 == null ? null : padeCustom9.trim();
    }

    public String getPadeCustom10() {
        return padeCustom10;
    }

    public void setPadeCustom10(String padeCustom10) {
        this.padeCustom10 = padeCustom10 == null ? null : padeCustom10.trim();
    }
}