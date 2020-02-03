package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 采购折让确认主表
 * @author 刘成
 *
 */
public class Purchase_discount {
    private String pdId;//id（主键 唯一）
    private String supplierId;//供应商id
    private String pdAttributionOfAccount;//账款归属（供应商id）
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date pdAccountsMonth;//账款月份
    private String pdSupplierAddress;//
    private String psId;//采购入库单号(外键)
    private String warehouseId;//仓库id
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date pdDocumentDate;//单据日期
    private String pdDocumentNumber;//单据号码
    private String currencyId;//币别id
    private Float pdExchangeRate;//汇率
    private String pdSingleStatus;//凭证编号
    private Integer pdSunnum;//总数量
    private Float pdSunmoney;//总金额
    private Float pdTax;//总税额
    private Float pdIncludeTaxAmount;//总含税金额
    private String pdDeliveryAddress;//送货地址
    private String pdBuyer;//采购人员
    private String pdBelongsSection;//所属部门
    private String pdBelongsProject;//所属项目
    private String pdExecutor;//制单人员
    private String pdCheckagainStaff;//复核人员
    private String pdHeaderProvision;//表头条文
    private String pdEndClause;//表尾条文
    private String pdRemark;//备注
    private String pdAudition;//是否审核
    private String pdYn;//是否删除（0 否 1 是 ，默认0）
    private String pdCustom1;//自定义1
    private String pdCustom2;//自定义2
    private String pdCustom3;//自定义3
    private String pdCustom4;//自定义4
    private String pdCustom5;//自定义5
    private String pdCustom6;//自定义6
    
    

    public Purchase_discount() {
		super();
	}

	@Override
	public String toString() {
		return "Purchase_discount [pdId=" + pdId + ", supplierId=" + supplierId + ", pdAttributionOfAccount="
				+ pdAttributionOfAccount + ", pdAccountsMonth=" + pdAccountsMonth + ", pdSupplierAddress="
				+ pdSupplierAddress + ", psId=" + psId + ", warehouseId=" + warehouseId + ", pdDocumentDate="
				+ pdDocumentDate + ", pdDocumentNumber=" + pdDocumentNumber + ", currencyId=" + currencyId
				+ ", pdExchangeRate=" + pdExchangeRate + ", pdSingleStatus=" + pdSingleStatus + ", pdSunnum=" + pdSunnum
				+ ", pdSunmoney=" + pdSunmoney + ", pdTax=" + pdTax + ", pdIncludeTaxAmount=" + pdIncludeTaxAmount
				+ ", pdDeliveryAddress=" + pdDeliveryAddress + ", pdBuyer=" + pdBuyer + ", pdBelongsSection="
				+ pdBelongsSection + ", pdBelongsProject=" + pdBelongsProject + ", pdExecutor=" + pdExecutor
				+ ", pdCheckagainStaff=" + pdCheckagainStaff + ", pdHeaderProvision=" + pdHeaderProvision
				+ ", pdEndClause=" + pdEndClause + ", pdRemark=" + pdRemark + ", pdAudition=" + pdAudition + ", pdYn="
				+ pdYn + ", pdCustom1=" + pdCustom1 + ", pdCustom2=" + pdCustom2 + ", pdCustom3=" + pdCustom3
				+ ", pdCustom4=" + pdCustom4 + ", pdCustom5=" + pdCustom5 + ", pdCustom6=" + pdCustom6 + "]";
	}

	public String getPdId() {
        return pdId;
    }

    public void setPdId(String pdId) {
        this.pdId = pdId == null ? null : pdId.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getPdAttributionOfAccount() {
        return pdAttributionOfAccount;
    }

    public void setPdAttributionOfAccount(String pdAttributionOfAccount) {
        this.pdAttributionOfAccount = pdAttributionOfAccount == null ? null : pdAttributionOfAccount.trim();
    }

    public Date getPdAccountsMonth() {
        return pdAccountsMonth;
    }

    public void setPdAccountsMonth(Date pdAccountsMonth) {
        this.pdAccountsMonth = pdAccountsMonth;
    }

    public String getPdSupplierAddress() {
        return pdSupplierAddress;
    }

    public void setPdSupplierAddress(String pdSupplierAddress) {
        this.pdSupplierAddress = pdSupplierAddress == null ? null : pdSupplierAddress.trim();
    }

    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId == null ? null : psId.trim();
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public Date getPdDocumentDate() {
        return pdDocumentDate;
    }

    public void setPdDocumentDate(Date pdDocumentDate) {
        this.pdDocumentDate = pdDocumentDate;
    }

    public String getPdDocumentNumber() {
        return pdDocumentNumber;
    }

    public void setPdDocumentNumber(String pdDocumentNumber) {
        this.pdDocumentNumber = pdDocumentNumber == null ? null : pdDocumentNumber.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public Float getPdExchangeRate() {
        return pdExchangeRate;
    }

    public void setPdExchangeRate(Float pdExchangeRate) {
        this.pdExchangeRate = pdExchangeRate;
    }

    public String getPdSingleStatus() {
        return pdSingleStatus;
    }

    public void setPdSingleStatus(String pdSingleStatus) {
        this.pdSingleStatus = pdSingleStatus == null ? null : pdSingleStatus.trim();
    }

    public Integer getPdSunnum() {
        return pdSunnum;
    }

    public void setPdSunnum(Integer pdSunnum) {
        this.pdSunnum = pdSunnum;
    }

    public Float getPdSunmoney() {
        return pdSunmoney;
    }

    public void setPdSunmoney(Float pdSunmoney) {
        this.pdSunmoney = pdSunmoney;
    }

    public Float getPdTax() {
        return pdTax;
    }

    public void setPdTax(Float pdTax) {
        this.pdTax = pdTax;
    }

    public Float getPdIncludeTaxAmount() {
        return pdIncludeTaxAmount;
    }

    public void setPdIncludeTaxAmount(Float pdIncludeTaxAmount) {
        this.pdIncludeTaxAmount = pdIncludeTaxAmount;
    }

    public String getPdDeliveryAddress() {
        return pdDeliveryAddress;
    }

    public void setPdDeliveryAddress(String pdDeliveryAddress) {
        this.pdDeliveryAddress = pdDeliveryAddress == null ? null : pdDeliveryAddress.trim();
    }

    public String getPdBuyer() {
        return pdBuyer;
    }

    public void setPdBuyer(String pdBuyer) {
        this.pdBuyer = pdBuyer == null ? null : pdBuyer.trim();
    }

    public String getPdBelongsSection() {
        return pdBelongsSection;
    }

    public void setPdBelongsSection(String pdBelongsSection) {
        this.pdBelongsSection = pdBelongsSection == null ? null : pdBelongsSection.trim();
    }

    public String getPdBelongsProject() {
        return pdBelongsProject;
    }

    public void setPdBelongsProject(String pdBelongsProject) {
        this.pdBelongsProject = pdBelongsProject == null ? null : pdBelongsProject.trim();
    }

    public String getPdExecutor() {
        return pdExecutor;
    }

    public void setPdExecutor(String pdExecutor) {
        this.pdExecutor = pdExecutor == null ? null : pdExecutor.trim();
    }

    public String getPdCheckagainStaff() {
        return pdCheckagainStaff;
    }

    public void setPdCheckagainStaff(String pdCheckagainStaff) {
        this.pdCheckagainStaff = pdCheckagainStaff == null ? null : pdCheckagainStaff.trim();
    }

    public String getPdHeaderProvision() {
        return pdHeaderProvision;
    }

    public void setPdHeaderProvision(String pdHeaderProvision) {
        this.pdHeaderProvision = pdHeaderProvision == null ? null : pdHeaderProvision.trim();
    }

    public String getPdEndClause() {
        return pdEndClause;
    }

    public void setPdEndClause(String pdEndClause) {
        this.pdEndClause = pdEndClause == null ? null : pdEndClause.trim();
    }

    public String getPdRemark() {
        return pdRemark;
    }

    public void setPdRemark(String pdRemark) {
        this.pdRemark = pdRemark == null ? null : pdRemark.trim();
    }

    public String getPdAudition() {
        return pdAudition;
    }

    public void setPdAudition(String pdAudition) {
        this.pdAudition = pdAudition == null ? null : pdAudition.trim();
    }

    public String getPdYn() {
        return pdYn;
    }

    public void setPdYn(String pdYn) {
        this.pdYn = pdYn == null ? null : pdYn.trim();
    }

    public String getPdCustom1() {
        return pdCustom1;
    }

    public void setPdCustom1(String pdCustom1) {
        this.pdCustom1 = pdCustom1 == null ? null : pdCustom1.trim();
    }

    public String getPdCustom2() {
        return pdCustom2;
    }

    public void setPdCustom2(String pdCustom2) {
        this.pdCustom2 = pdCustom2 == null ? null : pdCustom2.trim();
    }

    public String getPdCustom3() {
        return pdCustom3;
    }

    public void setPdCustom3(String pdCustom3) {
        this.pdCustom3 = pdCustom3 == null ? null : pdCustom3.trim();
    }

    public String getPdCustom4() {
        return pdCustom4;
    }

    public void setPdCustom4(String pdCustom4) {
        this.pdCustom4 = pdCustom4 == null ? null : pdCustom4.trim();
    }

    public String getPdCustom5() {
        return pdCustom5;
    }

    public void setPdCustom5(String pdCustom5) {
        this.pdCustom5 = pdCustom5 == null ? null : pdCustom5.trim();
    }

    public String getPdCustom6() {
        return pdCustom6;
    }

    public void setPdCustom6(String pdCustom6) {
        this.pdCustom6 = pdCustom6 == null ? null : pdCustom6.trim();
    }
}