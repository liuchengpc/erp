package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 应付冲款单主表
 * @author 刘成                                                                                                                                                                                                                                                                                                                                                       
 *
 */
public class Payables {
    private String payablesId;//应付冲款单id（主键      唯一）
    private String supplierId;//供应商表id，外键
    private Integer scsId;//结算方式id，外键
    private String staffId;//部门员工表id，外键
    private String currencyId;//币别类型表id，外键
    private String projectId;//项目表id，外键
    private String payablesSupplierName;//供应商表
    private Integer payablesSatName1;//结算方式表，默认值：转账
    private Float payablesPrice1;//默认值：0.00
    private Integer payablesSatName2;//结算方式表，默认值：汇票
    private Float payablesPrice2;//默认值：0.00
    private Integer payablesSatName3;//结算方式表
    private Float payablesPrice3;//默认值：0.00
    private Integer payablesZhekou;//折扣率，默认值：0.00
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date payablesEndtime;//终止账月，默认值：当前年月
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date payablesPayablestime;//单据日期，默认值：当前日期
    private String payablesCurrencyName;//币别类型表快照
    private String payablesCurrencyInexchange;//币别类型表快照
    private String payablesType;//应付冲款类型，默认值：付款冲款
    private String payablesVoucherno;//凭证编号
    private String payablesTeamName;//部门表
    private String payablesProjectName;//项目表
    private String payablesBillpersonnel;//制单人员，默认值：当前人员
    private String payablesReviewers;//复核人员
    private String payablesRemarks;//备注
    private Integer payablesAuditstatus;//审核状态，0:未审核，1:已结案
    private String payablesAuditing;//是否审核
    private String payablesYn;//是否删除（0 否 1 是 ，默认0）
    private String payablesCustom1;//自定栏1
    private String payablesCustom2;//自定栏2-- 单据号码
    private String payablesCustom3;//自定栏3
    private String payablesCustom4;//自定栏4
    private String payablesCustom5;//自定栏5
    private String payablesCustom6;//自定栏6
    private String payablesCustom7;//自定栏7
    private String payablesCustom8;//自定栏8	--部门ID
    private String payablesCustom10;//自定栏10
    
    
    

    public Payables() {
		super();
	}

	@Override
	public String toString() {
		return "Payables [payablesId=" + payablesId + ", supplierId=" + supplierId + ", scsId=" + scsId + ", staffId="
				+ staffId + ", currencyId=" + currencyId + ", projectId=" + projectId + ", payablesSupplierName="
				+ payablesSupplierName + ", payablesSatName1=" + payablesSatName1 + ", payablesPrice1=" + payablesPrice1
				+ ", payablesSatName2=" + payablesSatName2 + ", payablesPrice2=" + payablesPrice2
				+ ", payablesSatName3=" + payablesSatName3 + ", payablesPrice3=" + payablesPrice3 + ", payablesZhekou="
				+ payablesZhekou + ", payablesEndtime=" + payablesEndtime + ", payablesPayablestime="
				+ payablesPayablestime + ", payablesCurrencyName=" + payablesCurrencyName
				+ ", payablesCurrencyInexchange=" + payablesCurrencyInexchange + ", payablesType=" + payablesType
				+ ", payablesVoucherno=" + payablesVoucherno + ", payablesTeamName=" + payablesTeamName
				+ ", payablesProjectName=" + payablesProjectName + ", payablesBillpersonnel=" + payablesBillpersonnel
				+ ", payablesReviewers=" + payablesReviewers + ", payablesRemarks=" + payablesRemarks
				+ ", payablesAuditstatus=" + payablesAuditstatus + ", payablesAuditing=" + payablesAuditing
				+ ", payablesYn=" + payablesYn + ", payablesCustom1=" + payablesCustom1 + ", payablesCustom2="
				+ payablesCustom2 + ", payablesCustom3=" + payablesCustom3 + ", payablesCustom4=" + payablesCustom4
				+ ", payablesCustom5=" + payablesCustom5 + ", payablesCustom6=" + payablesCustom6 + ", payablesCustom7="
				+ payablesCustom7 + ", payablesCustom8=" + payablesCustom8 + ", payablesCustom10=" + payablesCustom10
				+ "]";
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

    public Integer getScsId() {
        return scsId;
    }

    public void setScsId(Integer scsId) {
        this.scsId = scsId;
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

    public String getPayablesSupplierName() {
        return payablesSupplierName;
    }

    public void setPayablesSupplierName(String payablesSupplierName) {
        this.payablesSupplierName = payablesSupplierName == null ? null : payablesSupplierName.trim();
    }

    public Integer getPayablesSatName1() {
        return payablesSatName1;
    }

    public void setPayablesSatName1(Integer payablesSatName1) {
        this.payablesSatName1 = payablesSatName1;
    }

    public Float getPayablesPrice1() {
        return payablesPrice1;
    }

    public void setPayablesPrice1(Float payablesPrice1) {
        this.payablesPrice1 = payablesPrice1;
    }

    public Integer getPayablesSatName2() {
        return payablesSatName2;
    }

    public void setPayablesSatName2(Integer payablesSatName2) {
        this.payablesSatName2 = payablesSatName2;
    }

    public Float getPayablesPrice2() {
        return payablesPrice2;
    }

    public void setPayablesPrice2(Float payablesPrice2) {
        this.payablesPrice2 = payablesPrice2;
    }

    public Integer getPayablesSatName3() {
        return payablesSatName3;
    }

    public void setPayablesSatName3(Integer payablesSatName3) {
        this.payablesSatName3 = payablesSatName3;
    }

    public Float getPayablesPrice3() {
        return payablesPrice3;
    }

    public void setPayablesPrice3(Float payablesPrice3) {
        this.payablesPrice3 = payablesPrice3;
    }

    public Integer getPayablesZhekou() {
        return payablesZhekou;
    }

    public void setPayablesZhekou(Integer payablesZhekou) {
        this.payablesZhekou = payablesZhekou;
    }

    public Date getPayablesEndtime() {
        return payablesEndtime;
    }

    public void setPayablesEndtime(Date payablesEndtime) {
        this.payablesEndtime = payablesEndtime;
    }

    public Date getPayablesPayablestime() {
        return payablesPayablestime;
    }

    public void setPayablesPayablestime(Date payablesPayablestime) {
        this.payablesPayablestime = payablesPayablestime;
    }

    public String getPayablesCurrencyName() {
        return payablesCurrencyName;
    }

    public void setPayablesCurrencyName(String payablesCurrencyName) {
        this.payablesCurrencyName = payablesCurrencyName == null ? null : payablesCurrencyName.trim();
    }

    public String getPayablesCurrencyInexchange() {
        return payablesCurrencyInexchange;
    }

    public void setPayablesCurrencyInexchange(String payablesCurrencyInexchange) {
        this.payablesCurrencyInexchange = payablesCurrencyInexchange == null ? null : payablesCurrencyInexchange.trim();
    }

    public String getPayablesType() {
        return payablesType;
    }

    public void setPayablesType(String payablesType) {
        this.payablesType = payablesType == null ? null : payablesType.trim();
    }

    public String getPayablesVoucherno() {
        return payablesVoucherno;
    }

    public void setPayablesVoucherno(String payablesVoucherno) {
        this.payablesVoucherno = payablesVoucherno == null ? null : payablesVoucherno.trim();
    }

    public String getPayablesTeamName() {
        return payablesTeamName;
    }

    public void setPayablesTeamName(String payablesTeamName) {
        this.payablesTeamName = payablesTeamName == null ? null : payablesTeamName.trim();
    }

    public String getPayablesProjectName() {
        return payablesProjectName;
    }

    public void setPayablesProjectName(String payablesProjectName) {
        this.payablesProjectName = payablesProjectName == null ? null : payablesProjectName.trim();
    }

    public String getPayablesBillpersonnel() {
        return payablesBillpersonnel;
    }

    public void setPayablesBillpersonnel(String payablesBillpersonnel) {
        this.payablesBillpersonnel = payablesBillpersonnel == null ? null : payablesBillpersonnel.trim();
    }

    public String getPayablesReviewers() {
        return payablesReviewers;
    }

    public void setPayablesReviewers(String payablesReviewers) {
        this.payablesReviewers = payablesReviewers == null ? null : payablesReviewers.trim();
    }

    public String getPayablesRemarks() {
        return payablesRemarks;
    }

    public void setPayablesRemarks(String payablesRemarks) {
        this.payablesRemarks = payablesRemarks == null ? null : payablesRemarks.trim();
    }

    public Integer getPayablesAuditstatus() {
        return payablesAuditstatus;
    }

    public void setPayablesAuditstatus(Integer payablesAuditstatus) {
        this.payablesAuditstatus = payablesAuditstatus;
    }

    public String getPayablesAuditing() {
        return payablesAuditing;
    }

    public void setPayablesAuditing(String payablesAuditing) {
        this.payablesAuditing = payablesAuditing == null ? null : payablesAuditing.trim();
    }

    public String getPayablesYn() {
        return payablesYn;
    }

    public void setPayablesYn(String payablesYn) {
        this.payablesYn = payablesYn == null ? null : payablesYn.trim();
    }

    public String getPayablesCustom1() {
        return payablesCustom1;
    }

    public void setPayablesCustom1(String payablesCustom1) {
        this.payablesCustom1 = payablesCustom1 == null ? null : payablesCustom1.trim();
    }

    public String getPayablesCustom2() {
        return payablesCustom2;
    }

    public void setPayablesCustom2(String payablesCustom2) {
        this.payablesCustom2 = payablesCustom2 == null ? null : payablesCustom2.trim();
    }

    public String getPayablesCustom3() {
        return payablesCustom3;
    }

    public void setPayablesCustom3(String payablesCustom3) {
        this.payablesCustom3 = payablesCustom3 == null ? null : payablesCustom3.trim();
    }

    public String getPayablesCustom4() {
        return payablesCustom4;
    }

    public void setPayablesCustom4(String payablesCustom4) {
        this.payablesCustom4 = payablesCustom4 == null ? null : payablesCustom4.trim();
    }

    public String getPayablesCustom5() {
        return payablesCustom5;
    }

    public void setPayablesCustom5(String payablesCustom5) {
        this.payablesCustom5 = payablesCustom5 == null ? null : payablesCustom5.trim();
    }

    public String getPayablesCustom6() {
        return payablesCustom6;
    }

    public void setPayablesCustom6(String payablesCustom6) {
        this.payablesCustom6 = payablesCustom6 == null ? null : payablesCustom6.trim();
    }

    public String getPayablesCustom7() {
        return payablesCustom7;
    }

    public void setPayablesCustom7(String payablesCustom7) {
        this.payablesCustom7 = payablesCustom7 == null ? null : payablesCustom7.trim();
    }

    public String getPayablesCustom8() {
        return payablesCustom8;
    }

    public void setPayablesCustom8(String payablesCustom8) {
        this.payablesCustom8 = payablesCustom8 == null ? null : payablesCustom8.trim();
    }

    public String getPayablesCustom10() {
        return payablesCustom10;
    }

    public void setPayablesCustom10(String payablesCustom10) {
        this.payablesCustom10 = payablesCustom10 == null ? null : payablesCustom10.trim();
    }
}