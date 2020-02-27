package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 预付款单主表
 * @author 刘成
 *
 */
public class Priabill {
    private String priabillId;//预付款单主表id（主键  唯一）
    private String supplierId;//供应商表id，外键
    private Integer scsId;//结算方式id，外键
    private String staffId;//部门员工表id，外键
    private String currencyId;//币别类型表id，外键
    private String projectId;//项目表id，外键
    private String priabillSupplierName;//供应商表
    private String priabillSatName1;//结算方式表，默认值：转账
    private Float priabillPrice1;//默认值：0.00
    private String priabillSatName2;//结算方式表，默认值：汇票
    private Float priabillPrice2;//默认值：0.00
    private String priabillSatName3;//结算方式表
    private Float priabillPrice3;//默认值：0.00
    private Integer priabillZhekou;//折扣率，默认值：0.00
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date priabillEndtime;//终止账月，默认值：当前年月
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date priabillPayablestime;//单据日期，默认值：当前日期
    private String priabillCurrencyName;//币别类型表快照    
    private String priabillCurrencyInexchange;//币别类型表快照
    private String priabillType;//应付冲款类型，默认值：付款冲款
    private String priabillVoucherno;//凭证编号
    private String priabillTeamName;//部门表
    private String priabillProjectName;//项目表
    private String priabillBillpersonnel;//制单人员，默认值：当前人员
    private String priabillReviewers;//复核人员
    private String priabillRemarks;//备注
    private Integer priabillAuditstatus;//审核状态，0:未审核，1:已结案
    private String priabillAuditing;//是否审核
    private String priabillYn;//是否删除（0 否 1 是 ，默认0）
    private String tpriabillCustom1;//自定义1
    private String priabillCustom2;//自定义2  --单据编号
    private String priabillCustom3;//自定义3
    private String priabillCustom4;//自定义4
    private String priabillCustom5;//自定义5
    private String priabillCustom6;//自定义6
    private String priabillCustom7;//自定义7
    private String priabillCustom8;//自定义8
    private String priabillCustom9;//自定义9 --部门表ID
    private String priabillCustom10;//自定义10
    
    

    public Priabill() {
		super();
	}

	@Override
	public String toString() {
		return "Priabill [priabillId=" + priabillId + ", supplierId=" + supplierId + ", scsId=" + scsId + ", staffId="
				+ staffId + ", currencyId=" + currencyId + ", projectId=" + projectId + ", priabillSupplierName="
				+ priabillSupplierName + ", priabillSatName1=" + priabillSatName1 + ", priabillPrice1=" + priabillPrice1
				+ ", priabillSatName2=" + priabillSatName2 + ", priabillPrice2=" + priabillPrice2
				+ ", priabillSatName3=" + priabillSatName3 + ", priabillPrice3=" + priabillPrice3 + ", priabillZhekou="
				+ priabillZhekou + ", priabillEndtime=" + priabillEndtime + ", priabillPayablestime="
				+ priabillPayablestime + ", priabillCurrencyName=" + priabillCurrencyName
				+ ", priabillCurrencyInexchange=" + priabillCurrencyInexchange + ", priabillType=" + priabillType
				+ ", priabillVoucherno=" + priabillVoucherno + ", priabillTeamName=" + priabillTeamName
				+ ", priabillProjectName=" + priabillProjectName + ", priabillBillpersonnel=" + priabillBillpersonnel
				+ ", priabillReviewers=" + priabillReviewers + ", priabillRemarks=" + priabillRemarks
				+ ", priabillAuditstatus=" + priabillAuditstatus + ", priabillAuditing=" + priabillAuditing
				+ ", priabillYn=" + priabillYn + ", tpriabillCustom1=" + tpriabillCustom1 + ", priabillCustom2="
				+ priabillCustom2 + ", priabillCustom3=" + priabillCustom3 + ", priabillCustom4=" + priabillCustom4
				+ ", priabillCustom5=" + priabillCustom5 + ", priabillCustom6=" + priabillCustom6 + ", priabillCustom7="
				+ priabillCustom7 + ", priabillCustom8=" + priabillCustom8 + ", priabillCustom9=" + priabillCustom9
				+ ", priabillCustom10=" + priabillCustom10 + "]";
	}

	public String getPriabillId() {
        return priabillId;
    }

    public void setPriabillId(String priabillId) {
        this.priabillId = priabillId == null ? null : priabillId.trim();
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

    public String getPriabillSupplierName() {
        return priabillSupplierName;
    }

    public void setPriabillSupplierName(String priabillSupplierName) {
        this.priabillSupplierName = priabillSupplierName == null ? null : priabillSupplierName.trim();
    }

    public String getPriabillSatName1() {
        return priabillSatName1;
    }

    public void setPriabillSatName1(String priabillSatName1) {
        this.priabillSatName1 = priabillSatName1;
    }

    public Float getPriabillPrice1() {
        return priabillPrice1;
    }

    public void setPriabillPrice1(Float priabillPrice1) {
        this.priabillPrice1 = priabillPrice1;
    }

    public String getPriabillSatName2() {
        return priabillSatName2;
    }

    public void setPriabillSatName2(String priabillSatName2) {
        this.priabillSatName2 = priabillSatName2;
    }

    public Float getPriabillPrice2() {
        return priabillPrice2;
    }

    public void setPriabillPrice2(Float priabillPrice2) {
        this.priabillPrice2 = priabillPrice2;
    }

    public String getPriabillSatName3() {
        return priabillSatName3;
    }

    public void setPriabillSatName3(String priabillSatName3) {
        this.priabillSatName3 = priabillSatName3;
    }

    public Float getPriabillPrice3() {
        return priabillPrice3;
    }

    public void setPriabillPrice3(Float priabillPrice3) {
        this.priabillPrice3 = priabillPrice3;
    }

    public Integer getPriabillZhekou() {
        return priabillZhekou;
    }

    public void setPriabillZhekou(Integer priabillZhekou) {
        this.priabillZhekou = priabillZhekou;
    }

    public Date getPriabillEndtime() {
        return priabillEndtime;
    }

    public void setPriabillEndtime(Date priabillEndtime) {
        this.priabillEndtime = priabillEndtime;
    }

    public Date getPriabillPayablestime() {
        return priabillPayablestime;
    }

    public void setPriabillPayablestime(Date priabillPayablestime) {
        this.priabillPayablestime = priabillPayablestime;
    }

    public String getPriabillCurrencyName() {
        return priabillCurrencyName;
    }

    public void setPriabillCurrencyName(String priabillCurrencyName) {
        this.priabillCurrencyName = priabillCurrencyName == null ? null : priabillCurrencyName.trim();
    }

    public String getPriabillCurrencyInexchange() {
        return priabillCurrencyInexchange;
    }

    public void setPriabillCurrencyInexchange(String priabillCurrencyInexchange) {
        this.priabillCurrencyInexchange = priabillCurrencyInexchange == null ? null : priabillCurrencyInexchange.trim();
    }

    public String getPriabillType() {
        return priabillType;
    }

    public void setPriabillType(String priabillType) {
        this.priabillType = priabillType == null ? null : priabillType.trim();
    }

    public String getPriabillVoucherno() {
        return priabillVoucherno;
    }

    public void setPriabillVoucherno(String priabillVoucherno) {
        this.priabillVoucherno = priabillVoucherno == null ? null : priabillVoucherno.trim();
    }

    public String getPriabillTeamName() {
        return priabillTeamName;
    }

    public void setPriabillTeamName(String priabillTeamName) {
        this.priabillTeamName = priabillTeamName == null ? null : priabillTeamName.trim();
    }

    public String getPriabillProjectName() {
        return priabillProjectName;
    }

    public void setPriabillProjectName(String priabillProjectName) {
        this.priabillProjectName = priabillProjectName == null ? null : priabillProjectName.trim();
    }

    public String getPriabillBillpersonnel() {
        return priabillBillpersonnel;
    }

    public void setPriabillBillpersonnel(String priabillBillpersonnel) {
        this.priabillBillpersonnel = priabillBillpersonnel == null ? null : priabillBillpersonnel.trim();
    }

    public String getPriabillReviewers() {
        return priabillReviewers;
    }

    public void setPriabillReviewers(String priabillReviewers) {
        this.priabillReviewers = priabillReviewers == null ? null : priabillReviewers.trim();
    }

    public String getPriabillRemarks() {
        return priabillRemarks;
    }

    public void setPriabillRemarks(String priabillRemarks) {
        this.priabillRemarks = priabillRemarks == null ? null : priabillRemarks.trim();
    }

    public Integer getPriabillAuditstatus() {
        return priabillAuditstatus;
    }

    public void setPriabillAuditstatus(Integer priabillAuditstatus) {
        this.priabillAuditstatus = priabillAuditstatus;
    }

    public String getPriabillAuditing() {
        return priabillAuditing;
    }

    public void setPriabillAuditing(String priabillAuditing) {
        this.priabillAuditing = priabillAuditing == null ? null : priabillAuditing.trim();
    }

    public String getPriabillYn() {
        return priabillYn;
    }

    public void setPriabillYn(String priabillYn) {
        this.priabillYn = priabillYn == null ? null : priabillYn.trim();
    }

    public String getTpriabillCustom1() {
        return tpriabillCustom1;
    }

    public void setTpriabillCustom1(String tpriabillCustom1) {
        this.tpriabillCustom1 = tpriabillCustom1 == null ? null : tpriabillCustom1.trim();
    }

    public String getPriabillCustom2() {
        return priabillCustom2;
    }

    public void setPriabillCustom2(String priabillCustom2) {
        this.priabillCustom2 = priabillCustom2 == null ? null : priabillCustom2.trim();
    }

    public String getPriabillCustom3() {
        return priabillCustom3;
    }

    public void setPriabillCustom3(String priabillCustom3) {
        this.priabillCustom3 = priabillCustom3 == null ? null : priabillCustom3.trim();
    }

    public String getPriabillCustom4() {
        return priabillCustom4;
    }

    public void setPriabillCustom4(String priabillCustom4) {
        this.priabillCustom4 = priabillCustom4 == null ? null : priabillCustom4.trim();
    }

    public String getPriabillCustom5() {
        return priabillCustom5;
    }

    public void setPriabillCustom5(String priabillCustom5) {
        this.priabillCustom5 = priabillCustom5 == null ? null : priabillCustom5.trim();
    }

    public String getPriabillCustom6() {
        return priabillCustom6;
    }

    public void setPriabillCustom6(String priabillCustom6) {
        this.priabillCustom6 = priabillCustom6 == null ? null : priabillCustom6.trim();
    }

    public String getPriabillCustom7() {
        return priabillCustom7;
    }

    public void setPriabillCustom7(String priabillCustom7) {
        this.priabillCustom7 = priabillCustom7 == null ? null : priabillCustom7.trim();
    }

    public String getPriabillCustom8() {
        return priabillCustom8;
    }

    public void setPriabillCustom8(String priabillCustom8) {
        this.priabillCustom8 = priabillCustom8 == null ? null : priabillCustom8.trim();
    }

    public String getPriabillCustom9() {
        return priabillCustom9;
    }

    public void setPriabillCustom9(String priabillCustom9) {
        this.priabillCustom9 = priabillCustom9 == null ? null : priabillCustom9.trim();
    }

    public String getPriabillCustom10() {
        return priabillCustom10;
    }

    public void setPriabillCustom10(String priabillCustom10) {
        this.priabillCustom10 = priabillCustom10 == null ? null : priabillCustom10.trim();
    }
}