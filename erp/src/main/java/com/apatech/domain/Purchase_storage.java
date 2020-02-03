package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 采购入库类型表
 * @author 刘成
 *
 */
public class Purchase_storage {
    private String psId;//id（主键 唯一）
    private String supplierId;//供应商id
    private String psEngname;//供应商地址
    private String pstId;//采购入库类型id
    private String psPriceIncludeTax;//单价是否含税
    private Integer warehouseId;//仓库id
    private String psSingleStatus;//凭证编号
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date psDocumentDate;//单据日期
    private String psDocumentNumber;//单据号码
    private String currencyId;//币别id
    private Float psExchangeRate;//汇率
    private Integer psForeignTrade;//国外贸易（默认否）
    private Integer psSunnum;//总数量
    private Float psSunmoney;//总金额
    private Float psTax;//总税额
    private Float psIncludeTaxAmount;//总含税金额
    private String psDeliveryAddress;//送货地址
    private String psBuyer;//采购人员
    private String psBelongsSection;//所属部门
    private String psBelongsProject;//所属项目
    private String psExecutor;//制单人员
    private String psCheckagainStaff;//复核人员
    private String psHeaderProvision;//表头条文
    private String psEndClause;//表尾条文
    private String psRemark;//备注
    private String psAudition;//是否审核
    private String psYn;//是否删除（0 否 1 是 ，默认0）
    private String psCustom1;//自定义1
    private String psCustom2;//自定义2
    private String psCustom3;//自定义3
    private String psCustom4;//自定义4
    private String psCustom5;//自定义5
    private String psCustom6;//自定义6
    
    

    public Purchase_storage() {
		super();
	}

	@Override
	public String toString() {
		return "Purchase_storage [psId=" + psId + ", supplierId=" + supplierId + ", psEngname=" + psEngname + ", pstId="
				+ pstId + ", psPriceIncludeTax=" + psPriceIncludeTax + ", warehouseId=" + warehouseId
				+ ", psSingleStatus=" + psSingleStatus + ", psDocumentDate=" + psDocumentDate + ", psDocumentNumber="
				+ psDocumentNumber + ", currencyId=" + currencyId + ", psExchangeRate=" + psExchangeRate
				+ ", psForeignTrade=" + psForeignTrade + ", psSunnum=" + psSunnum + ", psSunmoney=" + psSunmoney
				+ ", psTax=" + psTax + ", psIncludeTaxAmount=" + psIncludeTaxAmount + ", psDeliveryAddress="
				+ psDeliveryAddress + ", psBuyer=" + psBuyer + ", psBelongsSection=" + psBelongsSection
				+ ", psBelongsProject=" + psBelongsProject + ", psExecutor=" + psExecutor + ", psCheckagainStaff="
				+ psCheckagainStaff + ", psHeaderProvision=" + psHeaderProvision + ", psEndClause=" + psEndClause
				+ ", psRemark=" + psRemark + ", psAudition=" + psAudition + ", psYn=" + psYn + ", psCustom1="
				+ psCustom1 + ", psCustom2=" + psCustom2 + ", psCustom3=" + psCustom3 + ", psCustom4=" + psCustom4
				+ ", psCustom5=" + psCustom5 + ", psCustom6=" + psCustom6 + "]";
	}

	public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId == null ? null : psId.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getPsEngname() {
        return psEngname;
    }

    public void setPsEngname(String psEngname) {
        this.psEngname = psEngname == null ? null : psEngname.trim();
    }

    public String getPstId() {
        return pstId;
    }

    public void setPstId(String pstId) {
        this.pstId = pstId == null ? null : pstId.trim();
    }

    public String getPsPriceIncludeTax() {
        return psPriceIncludeTax;
    }

    public void setPsPriceIncludeTax(String psPriceIncludeTax) {
        this.psPriceIncludeTax = psPriceIncludeTax == null ? null : psPriceIncludeTax.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getPsSingleStatus() {
        return psSingleStatus;
    }

    public void setPsSingleStatus(String psSingleStatus) {
        this.psSingleStatus = psSingleStatus == null ? null : psSingleStatus.trim();
    }

    public Date getPsDocumentDate() {
        return psDocumentDate;
    }

    public void setPsDocumentDate(Date psDocumentDate) {
        this.psDocumentDate = psDocumentDate;
    }

    public String getPsDocumentNumber() {
        return psDocumentNumber;
    }

    public void setPsDocumentNumber(String psDocumentNumber) {
        this.psDocumentNumber = psDocumentNumber == null ? null : psDocumentNumber.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public Float getPsExchangeRate() {
        return psExchangeRate;
    }

    public void setPsExchangeRate(Float psExchangeRate) {
        this.psExchangeRate = psExchangeRate;
    }

    public Integer getPsForeignTrade() {
        return psForeignTrade;
    }

    public void setPsForeignTrade(Integer psForeignTrade) {
        this.psForeignTrade = psForeignTrade;
    }

    public Integer getPsSunnum() {
        return psSunnum;
    }

    public void setPsSunnum(Integer psSunnum) {
        this.psSunnum = psSunnum;
    }

    public Float getPsSunmoney() {
        return psSunmoney;
    }

    public void setPsSunmoney(Float psSunmoney) {
        this.psSunmoney = psSunmoney;
    }

    public Float getPsTax() {
        return psTax;
    }

    public void setPsTax(Float psTax) {
        this.psTax = psTax;
    }

    public Float getPsIncludeTaxAmount() {
        return psIncludeTaxAmount;
    }

    public void setPsIncludeTaxAmount(Float psIncludeTaxAmount) {
        this.psIncludeTaxAmount = psIncludeTaxAmount;
    }

    public String getPsDeliveryAddress() {
        return psDeliveryAddress;
    }

    public void setPsDeliveryAddress(String psDeliveryAddress) {
        this.psDeliveryAddress = psDeliveryAddress == null ? null : psDeliveryAddress.trim();
    }

    public String getPsBuyer() {
        return psBuyer;
    }

    public void setPsBuyer(String psBuyer) {
        this.psBuyer = psBuyer == null ? null : psBuyer.trim();
    }

    public String getPsBelongsSection() {
        return psBelongsSection;
    }

    public void setPsBelongsSection(String psBelongsSection) {
        this.psBelongsSection = psBelongsSection == null ? null : psBelongsSection.trim();
    }

    public String getPsBelongsProject() {
        return psBelongsProject;
    }

    public void setPsBelongsProject(String psBelongsProject) {
        this.psBelongsProject = psBelongsProject == null ? null : psBelongsProject.trim();
    }

    public String getPsExecutor() {
        return psExecutor;
    }

    public void setPsExecutor(String psExecutor) {
        this.psExecutor = psExecutor == null ? null : psExecutor.trim();
    }

    public String getPsCheckagainStaff() {
        return psCheckagainStaff;
    }

    public void setPsCheckagainStaff(String psCheckagainStaff) {
        this.psCheckagainStaff = psCheckagainStaff == null ? null : psCheckagainStaff.trim();
    }

    public String getPsHeaderProvision() {
        return psHeaderProvision;
    }

    public void setPsHeaderProvision(String psHeaderProvision) {
        this.psHeaderProvision = psHeaderProvision == null ? null : psHeaderProvision.trim();
    }

    public String getPsEndClause() {
        return psEndClause;
    }

    public void setPsEndClause(String psEndClause) {
        this.psEndClause = psEndClause == null ? null : psEndClause.trim();
    }

    public String getPsRemark() {
        return psRemark;
    }

    public void setPsRemark(String psRemark) {
        this.psRemark = psRemark == null ? null : psRemark.trim();
    }

    public String getPsAudition() {
        return psAudition;
    }

    public void setPsAudition(String psAudition) {
        this.psAudition = psAudition == null ? null : psAudition.trim();
    }

    public String getPsYn() {
        return psYn;
    }

    public void setPsYn(String psYn) {
        this.psYn = psYn == null ? null : psYn.trim();
    }

    public String getPsCustom1() {
        return psCustom1;
    }

    public void setPsCustom1(String psCustom1) {
        this.psCustom1 = psCustom1 == null ? null : psCustom1.trim();
    }

    public String getPsCustom2() {
        return psCustom2;
    }

    public void setPsCustom2(String psCustom2) {
        this.psCustom2 = psCustom2 == null ? null : psCustom2.trim();
    }

    public String getPsCustom3() {
        return psCustom3;
    }

    public void setPsCustom3(String psCustom3) {
        this.psCustom3 = psCustom3 == null ? null : psCustom3.trim();
    }

    public String getPsCustom4() {
        return psCustom4;
    }

    public void setPsCustom4(String psCustom4) {
        this.psCustom4 = psCustom4 == null ? null : psCustom4.trim();
    }

    public String getPsCustom5() {
        return psCustom5;
    }

    public void setPsCustom5(String psCustom5) {
        this.psCustom5 = psCustom5 == null ? null : psCustom5.trim();
    }

    public String getPsCustom6() {
        return psCustom6;
    }

    public void setPsCustom6(String psCustom6) {
        this.psCustom6 = psCustom6 == null ? null : psCustom6.trim();
    }
}