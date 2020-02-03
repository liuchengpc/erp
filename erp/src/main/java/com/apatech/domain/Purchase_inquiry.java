package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 采购询价主表
 * @author 刘成
 *
 */
public class Purchase_inquiry {
    private String piId;//id（主键 唯一）
    private String supplierId;//供应商id
    private String piSupplierAddress;//供应商地址
    private String pitId;//采购订单类型id
    private String piPriceIncludeTax;//单价是否含税
    private String piSingleStatus;//单况
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date piDocumentDate;//单据日期
    private String piDocumentNumber;//单据号码
    private String currencyId;//币别id
    private Float piExchangeRate;//汇率
    private Integer piSunnum;//总数量
    private Float piSunmoney;//总金额
    private Float piTax;//总税额
    private Float piIncludeTaxAmount;//总含税金额
    private String piDeliveryAddress;//送货地址
    private String piBuyer;//采购人员
    private String piBelongsSection;//所属部门
    private String piBelongsProject;//所属项目
    private String piExecutor;//制单人员
    private String piCheckagainStaff;//复核人员
    private String piHeaderProvision;//表头条文
    private String piEndClause;//表尾条文
    private String piRemark;//备注
    private String piAudition;//是否审核
    private String piYn;//是否删除（0 否 1 是 ，默认0）
    private String piCustom1;//自定义1
    private String piCustom2;//自定义2
    private String piCustom3;//自定义3
    private String piCustom4;//自定义4
    private String piCustom5;//自定义5
    private String piCustom6;//自定义6
    
    

    public Purchase_inquiry() {
		super();
	}

	@Override
	public String toString() {
		return "Purchase_inquiry [piId=" + piId + ", supplierId=" + supplierId + ", piSupplierAddress="
				+ piSupplierAddress + ", pitId=" + pitId + ", piPriceIncludeTax=" + piPriceIncludeTax
				+ ", piSingleStatus=" + piSingleStatus + ", piDocumentDate=" + piDocumentDate + ", piDocumentNumber="
				+ piDocumentNumber + ", currencyId=" + currencyId + ", piExchangeRate=" + piExchangeRate + ", piSunnum="
				+ piSunnum + ", piSunmoney=" + piSunmoney + ", piTax=" + piTax + ", piIncludeTaxAmount="
				+ piIncludeTaxAmount + ", piDeliveryAddress=" + piDeliveryAddress + ", piBuyer=" + piBuyer
				+ ", piBelongsSection=" + piBelongsSection + ", piBelongsProject=" + piBelongsProject + ", piExecutor="
				+ piExecutor + ", piCheckagainStaff=" + piCheckagainStaff + ", piHeaderProvision=" + piHeaderProvision
				+ ", piEndClause=" + piEndClause + ", piRemark=" + piRemark + ", piAudition=" + piAudition + ", piYn="
				+ piYn + ", piCustom1=" + piCustom1 + ", piCustom2=" + piCustom2 + ", piCustom3=" + piCustom3
				+ ", piCustom4=" + piCustom4 + ", piCustom5=" + piCustom5 + ", piCustom6=" + piCustom6 + "]";
	}

	public String getPiId() {
        return piId;
    }

    public void setPiId(String piId) {
        this.piId = piId == null ? null : piId.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getPiSupplierAddress() {
        return piSupplierAddress;
    }

    public void setPiSupplierAddress(String piSupplierAddress) {
        this.piSupplierAddress = piSupplierAddress == null ? null : piSupplierAddress.trim();
    }

    public String getPitId() {
        return pitId;
    }

    public void setPitId(String pitId) {
        this.pitId = pitId == null ? null : pitId.trim();
    }

    public String getPiPriceIncludeTax() {
        return piPriceIncludeTax;
    }

    public void setPiPriceIncludeTax(String piPriceIncludeTax) {
        this.piPriceIncludeTax = piPriceIncludeTax == null ? null : piPriceIncludeTax.trim();
    }

    public String getPiSingleStatus() {
        return piSingleStatus;
    }

    public void setPiSingleStatus(String piSingleStatus) {
        this.piSingleStatus = piSingleStatus == null ? null : piSingleStatus.trim();
    }

    public Date getPiDocumentDate() {
        return piDocumentDate;
    }

    public void setPiDocumentDate(Date piDocumentDate) {
        this.piDocumentDate = piDocumentDate;
    }

    public String getPiDocumentNumber() {
        return piDocumentNumber;
    }

    public void setPiDocumentNumber(String piDocumentNumber) {
        this.piDocumentNumber = piDocumentNumber == null ? null : piDocumentNumber.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public Float getPiExchangeRate() {
        return piExchangeRate;
    }

    public void setPiExchangeRate(Float piExchangeRate) {
        this.piExchangeRate = piExchangeRate;
    }

    public Integer getPiSunnum() {
        return piSunnum;
    }

    public void setPiSunnum(Integer piSunnum) {
        this.piSunnum = piSunnum;
    }

    public Float getPiSunmoney() {
        return piSunmoney;
    }

    public void setPiSunmoney(Float piSunmoney) {
        this.piSunmoney = piSunmoney;
    }

    public Float getPiTax() {
        return piTax;
    }

    public void setPiTax(Float piTax) {
        this.piTax = piTax;
    }

    public Float getPiIncludeTaxAmount() {
        return piIncludeTaxAmount;
    }

    public void setPiIncludeTaxAmount(Float piIncludeTaxAmount) {
        this.piIncludeTaxAmount = piIncludeTaxAmount;
    }

    public String getPiDeliveryAddress() {
        return piDeliveryAddress;
    }

    public void setPiDeliveryAddress(String piDeliveryAddress) {
        this.piDeliveryAddress = piDeliveryAddress == null ? null : piDeliveryAddress.trim();
    }

    public String getPiBuyer() {
        return piBuyer;
    }

    public void setPiBuyer(String piBuyer) {
        this.piBuyer = piBuyer == null ? null : piBuyer.trim();
    }

    public String getPiBelongsSection() {
        return piBelongsSection;
    }

    public void setPiBelongsSection(String piBelongsSection) {
        this.piBelongsSection = piBelongsSection == null ? null : piBelongsSection.trim();
    }

    public String getPiBelongsProject() {
        return piBelongsProject;
    }

    public void setPiBelongsProject(String piBelongsProject) {
        this.piBelongsProject = piBelongsProject == null ? null : piBelongsProject.trim();
    }

    public String getPiExecutor() {
        return piExecutor;
    }

    public void setPiExecutor(String piExecutor) {
        this.piExecutor = piExecutor == null ? null : piExecutor.trim();
    }

    public String getPiCheckagainStaff() {
        return piCheckagainStaff;
    }

    public void setPiCheckagainStaff(String piCheckagainStaff) {
        this.piCheckagainStaff = piCheckagainStaff == null ? null : piCheckagainStaff.trim();
    }

    public String getPiHeaderProvision() {
        return piHeaderProvision;
    }

    public void setPiHeaderProvision(String piHeaderProvision) {
        this.piHeaderProvision = piHeaderProvision == null ? null : piHeaderProvision.trim();
    }

    public String getPiEndClause() {
        return piEndClause;
    }

    public void setPiEndClause(String piEndClause) {
        this.piEndClause = piEndClause == null ? null : piEndClause.trim();
    }

    public String getPiRemark() {
        return piRemark;
    }

    public void setPiRemark(String piRemark) {
        this.piRemark = piRemark == null ? null : piRemark.trim();
    }

    public String getPiAudition() {
        return piAudition;
    }

    public void setPiAudition(String piAudition) {
        this.piAudition = piAudition == null ? null : piAudition.trim();
    }

    public String getPiYn() {
        return piYn;
    }

    public void setPiYn(String piYn) {
        this.piYn = piYn == null ? null : piYn.trim();
    }

    public String getPiCustom1() {
        return piCustom1;
    }

    public void setPiCustom1(String piCustom1) {
        this.piCustom1 = piCustom1 == null ? null : piCustom1.trim();
    }

    public String getPiCustom2() {
        return piCustom2;
    }

    public void setPiCustom2(String piCustom2) {
        this.piCustom2 = piCustom2 == null ? null : piCustom2.trim();
    }

    public String getPiCustom3() {
        return piCustom3;
    }

    public void setPiCustom3(String piCustom3) {
        this.piCustom3 = piCustom3 == null ? null : piCustom3.trim();
    }

    public String getPiCustom4() {
        return piCustom4;
    }

    public void setPiCustom4(String piCustom4) {
        this.piCustom4 = piCustom4 == null ? null : piCustom4.trim();
    }

    public String getPiCustom5() {
        return piCustom5;
    }

    public void setPiCustom5(String piCustom5) {
        this.piCustom5 = piCustom5 == null ? null : piCustom5.trim();
    }

    public String getPiCustom6() {
        return piCustom6;
    }

    public void setPiCustom6(String piCustom6) {
        this.piCustom6 = piCustom6 == null ? null : piCustom6.trim();
    }
}