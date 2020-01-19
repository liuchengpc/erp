package com.apatech.domain;

import java.util.Date;

/**
 * 销售折让确认主表
 * @author 刘成
 *
 */
public class Sales_discount {
    private String sdId;//id（主键 唯一）
    private String customerId;//客户id
    private String pdAttributionOfAccount;//账款归属（供应商id）
    private Date pdAccountsMonth;//账款月份
    private String psId;//采购入库单号(外键)
    private String warehouseId;//仓库id
    private Date sdDocumentDate;//单据日期
    private String sdDocumentNumber;//单据号码
    private String currencyId;//币别id
    private Float sdExchangeRate;//汇率
    private String sdCertificateNumber;//凭证编号
    private Integer sdSunnum;//总数量
    private Float sdSunmoney;//总金额
    private Float sdTax;//总税额
    private Float sdIncludingTaxAmount;//总含税金额
    private String sdDeliveryAddress;//送货地址
    private String sdBuyer;//采购人员
    private String sdBelongsSection;//所属部门
    private String sdBelongsProject;//所属项目
    private String sdForm;//制单人员
    private String sdCheckagainStaff;//复核人员
    private String sdProject;//所属项目
    private String sdHeaderProvision;//表头条文
    private String sdEndClause;//表尾条文
    private String sdRemark;//备注
    private String sdAuditing;//是否审核
    private String sdYn;//是否删除（0 否 1 是 ，默认0）
    private String sdCustom1;//自定义1
    private String sdCustom2;//自定义2
    private String sdCustom3;//自定义3
    private String sdCustom4;//自定义4
    private String sdCustom5;//自定义5
    private String sdCustom6;//自定义6
    
    
    

    public Sales_discount() {
		super();
	}

	@Override
	public String toString() {
		return "Sales_discount [sdId=" + sdId + ", customerId=" + customerId + ", pdAttributionOfAccount="
				+ pdAttributionOfAccount + ", pdAccountsMonth=" + pdAccountsMonth + ", psId=" + psId + ", warehouseId="
				+ warehouseId + ", sdDocumentDate=" + sdDocumentDate + ", sdDocumentNumber=" + sdDocumentNumber
				+ ", currencyId=" + currencyId + ", sdExchangeRate=" + sdExchangeRate + ", sdCertificateNumber="
				+ sdCertificateNumber + ", sdSunnum=" + sdSunnum + ", sdSunmoney=" + sdSunmoney + ", sdTax=" + sdTax
				+ ", sdIncludingTaxAmount=" + sdIncludingTaxAmount + ", sdDeliveryAddress=" + sdDeliveryAddress
				+ ", sdBuyer=" + sdBuyer + ", sdBelongsSection=" + sdBelongsSection + ", sdBelongsProject="
				+ sdBelongsProject + ", sdForm=" + sdForm + ", sdCheckagainStaff=" + sdCheckagainStaff + ", sdProject="
				+ sdProject + ", sdHeaderProvision=" + sdHeaderProvision + ", sdEndClause=" + sdEndClause
				+ ", sdRemark=" + sdRemark + ", sdAuditing=" + sdAuditing + ", sdYn=" + sdYn + ", sdCustom1="
				+ sdCustom1 + ", sdCustom2=" + sdCustom2 + ", sdCustom3=" + sdCustom3 + ", sdCustom4=" + sdCustom4
				+ ", sdCustom5=" + sdCustom5 + ", sdCustom6=" + sdCustom6 + "]";
	}

	public String getSdId() {
        return sdId;
    }

    public void setSdId(String sdId) {
        this.sdId = sdId == null ? null : sdId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
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

    public Date getSdDocumentDate() {
        return sdDocumentDate;
    }

    public void setSdDocumentDate(Date sdDocumentDate) {
        this.sdDocumentDate = sdDocumentDate;
    }

    public String getSdDocumentNumber() {
        return sdDocumentNumber;
    }

    public void setSdDocumentNumber(String sdDocumentNumber) {
        this.sdDocumentNumber = sdDocumentNumber == null ? null : sdDocumentNumber.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public Float getSdExchangeRate() {
        return sdExchangeRate;
    }

    public void setSdExchangeRate(Float sdExchangeRate) {
        this.sdExchangeRate = sdExchangeRate;
    }

    public String getSdCertificateNumber() {
        return sdCertificateNumber;
    }

    public void setSdCertificateNumber(String sdCertificateNumber) {
        this.sdCertificateNumber = sdCertificateNumber == null ? null : sdCertificateNumber.trim();
    }

    public Integer getSdSunnum() {
        return sdSunnum;
    }

    public void setSdSunnum(Integer sdSunnum) {
        this.sdSunnum = sdSunnum;
    }

    public Float getSdSunmoney() {
        return sdSunmoney;
    }

    public void setSdSunmoney(Float sdSunmoney) {
        this.sdSunmoney = sdSunmoney;
    }

    public Float getSdTax() {
        return sdTax;
    }

    public void setSdTax(Float sdTax) {
        this.sdTax = sdTax;
    }

    public Float getSdIncludingTaxAmount() {
        return sdIncludingTaxAmount;
    }

    public void setSdIncludingTaxAmount(Float sdIncludingTaxAmount) {
        this.sdIncludingTaxAmount = sdIncludingTaxAmount;
    }

    public String getSdDeliveryAddress() {
        return sdDeliveryAddress;
    }

    public void setSdDeliveryAddress(String sdDeliveryAddress) {
        this.sdDeliveryAddress = sdDeliveryAddress == null ? null : sdDeliveryAddress.trim();
    }

    public String getSdBuyer() {
        return sdBuyer;
    }

    public void setSdBuyer(String sdBuyer) {
        this.sdBuyer = sdBuyer == null ? null : sdBuyer.trim();
    }

    public String getSdBelongsSection() {
        return sdBelongsSection;
    }

    public void setSdBelongsSection(String sdBelongsSection) {
        this.sdBelongsSection = sdBelongsSection == null ? null : sdBelongsSection.trim();
    }

    public String getSdBelongsProject() {
        return sdBelongsProject;
    }

    public void setSdBelongsProject(String sdBelongsProject) {
        this.sdBelongsProject = sdBelongsProject == null ? null : sdBelongsProject.trim();
    }

    public String getSdForm() {
        return sdForm;
    }

    public void setSdForm(String sdForm) {
        this.sdForm = sdForm == null ? null : sdForm.trim();
    }

    public String getSdCheckagainStaff() {
        return sdCheckagainStaff;
    }

    public void setSdCheckagainStaff(String sdCheckagainStaff) {
        this.sdCheckagainStaff = sdCheckagainStaff == null ? null : sdCheckagainStaff.trim();
    }

    public String getSdProject() {
        return sdProject;
    }

    public void setSdProject(String sdProject) {
        this.sdProject = sdProject == null ? null : sdProject.trim();
    }

    public String getSdHeaderProvision() {
        return sdHeaderProvision;
    }

    public void setSdHeaderProvision(String sdHeaderProvision) {
        this.sdHeaderProvision = sdHeaderProvision == null ? null : sdHeaderProvision.trim();
    }

    public String getSdEndClause() {
        return sdEndClause;
    }

    public void setSdEndClause(String sdEndClause) {
        this.sdEndClause = sdEndClause == null ? null : sdEndClause.trim();
    }

    public String getSdRemark() {
        return sdRemark;
    }

    public void setSdRemark(String sdRemark) {
        this.sdRemark = sdRemark == null ? null : sdRemark.trim();
    }

    public String getSdAuditing() {
        return sdAuditing;
    }

    public void setSdAuditing(String sdAuditing) {
        this.sdAuditing = sdAuditing == null ? null : sdAuditing.trim();
    }

    public String getSdYn() {
        return sdYn;
    }

    public void setSdYn(String sdYn) {
        this.sdYn = sdYn == null ? null : sdYn.trim();
    }

    public String getSdCustom1() {
        return sdCustom1;
    }

    public void setSdCustom1(String sdCustom1) {
        this.sdCustom1 = sdCustom1 == null ? null : sdCustom1.trim();
    }

    public String getSdCustom2() {
        return sdCustom2;
    }

    public void setSdCustom2(String sdCustom2) {
        this.sdCustom2 = sdCustom2 == null ? null : sdCustom2.trim();
    }

    public String getSdCustom3() {
        return sdCustom3;
    }

    public void setSdCustom3(String sdCustom3) {
        this.sdCustom3 = sdCustom3 == null ? null : sdCustom3.trim();
    }

    public String getSdCustom4() {
        return sdCustom4;
    }

    public void setSdCustom4(String sdCustom4) {
        this.sdCustom4 = sdCustom4 == null ? null : sdCustom4.trim();
    }

    public String getSdCustom5() {
        return sdCustom5;
    }

    public void setSdCustom5(String sdCustom5) {
        this.sdCustom5 = sdCustom5 == null ? null : sdCustom5.trim();
    }

    public String getSdCustom6() {
        return sdCustom6;
    }

    public void setSdCustom6(String sdCustom6) {
        this.sdCustom6 = sdCustom6 == null ? null : sdCustom6.trim();
    }
}