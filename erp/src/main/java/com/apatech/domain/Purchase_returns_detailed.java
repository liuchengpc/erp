package com.apatech.domain;

import java.util.Date;

/**
 * 采购退货详表
 * @author 刘成
 *
 */
public class Purchase_returns_detailed {
    private String puredId;//id（主键 唯一）
    private String pureId;//采购退货id（外键）
    private String matterId;//物料编号
    private String puredEngname;//物料名称
    private String puredRemark;//规格型号
    private String puredPriceIncludeTax;//单位名称
    private Integer puredSingleStatus;//数量
    private Date puredDocumentDate;//折扣前单价
    private String puredDocumentNumber;//折数
    private Float puredPrice;//单价
    private Float puredMoney;//金额
    private Float puredTaxRate;//税率
    private Float puredTaxAmount;//税额
    private Float puredIncludingTaxAmount;//含税金额
    private String puredBatchNumber;//批号
    private String puredIfgift;//是否是赠品（0 否 1 是）
    private String puredInvoiceDetails;//发票明细
    private String puredRemarks;//分录备注
    private String puredSourceOrder;//来源单别
    private String puredSourceNo;//来源单别
    private String puredAuditing;//是否审核
    private String puredYn;//是否删除（0 否 1 是 ，默认0）
    private String puredCustom1;//自定义1
    private String puredCustom2;//自定义2
    private String puredCustom3;//自定义3
    private String puredCustom4;//自定义4
    private String puredCustom5;//自定义5
    private String puredCustom6;//自定义6
    
    

    public Purchase_returns_detailed() {
		super();
	}

	@Override
	public String toString() {
		return "Purchase_returns_detailed [puredId=" + puredId + ", pureId=" + pureId + ", matterId=" + matterId
				+ ", puredEngname=" + puredEngname + ", puredRemark=" + puredRemark + ", puredPriceIncludeTax="
				+ puredPriceIncludeTax + ", puredSingleStatus=" + puredSingleStatus + ", puredDocumentDate="
				+ puredDocumentDate + ", puredDocumentNumber=" + puredDocumentNumber + ", puredPrice=" + puredPrice
				+ ", puredMoney=" + puredMoney + ", puredTaxRate=" + puredTaxRate + ", puredTaxAmount=" + puredTaxAmount
				+ ", puredIncludingTaxAmount=" + puredIncludingTaxAmount + ", puredBatchNumber=" + puredBatchNumber
				+ ", puredIfgift=" + puredIfgift + ", puredInvoiceDetails=" + puredInvoiceDetails + ", puredRemarks="
				+ puredRemarks + ", puredSourceOrder=" + puredSourceOrder + ", puredSourceNo=" + puredSourceNo
				+ ", puredAuditing=" + puredAuditing + ", puredYn=" + puredYn + ", puredCustom1=" + puredCustom1
				+ ", puredCustom2=" + puredCustom2 + ", puredCustom3=" + puredCustom3 + ", puredCustom4=" + puredCustom4
				+ ", puredCustom5=" + puredCustom5 + ", puredCustom6=" + puredCustom6 + "]";
	}

	public String getPuredId() {
        return puredId;
    }

    public void setPuredId(String puredId) {
        this.puredId = puredId == null ? null : puredId.trim();
    }

    public String getPureId() {
        return pureId;
    }

    public void setPureId(String pureId) {
        this.pureId = pureId == null ? null : pureId.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getPuredEngname() {
        return puredEngname;
    }

    public void setPuredEngname(String puredEngname) {
        this.puredEngname = puredEngname == null ? null : puredEngname.trim();
    }

    public String getPuredRemark() {
        return puredRemark;
    }

    public void setPuredRemark(String puredRemark) {
        this.puredRemark = puredRemark == null ? null : puredRemark.trim();
    }

    public String getPuredPriceIncludeTax() {
        return puredPriceIncludeTax;
    }

    public void setPuredPriceIncludeTax(String puredPriceIncludeTax) {
        this.puredPriceIncludeTax = puredPriceIncludeTax == null ? null : puredPriceIncludeTax.trim();
    }

    public Integer getPuredSingleStatus() {
        return puredSingleStatus;
    }

    public void setPuredSingleStatus(Integer puredSingleStatus) {
        this.puredSingleStatus = puredSingleStatus;
    }

    public Date getPuredDocumentDate() {
        return puredDocumentDate;
    }

    public void setPuredDocumentDate(Date puredDocumentDate) {
        this.puredDocumentDate = puredDocumentDate;
    }

    public String getPuredDocumentNumber() {
        return puredDocumentNumber;
    }

    public void setPuredDocumentNumber(String puredDocumentNumber) {
        this.puredDocumentNumber = puredDocumentNumber == null ? null : puredDocumentNumber.trim();
    }

    public Float getPuredPrice() {
        return puredPrice;
    }

    public void setPuredPrice(Float puredPrice) {
        this.puredPrice = puredPrice;
    }

    public Float getPuredMoney() {
        return puredMoney;
    }

    public void setPuredMoney(Float puredMoney) {
        this.puredMoney = puredMoney;
    }

    public Float getPuredTaxRate() {
        return puredTaxRate;
    }

    public void setPuredTaxRate(Float puredTaxRate) {
        this.puredTaxRate = puredTaxRate;
    }

    public Float getPuredTaxAmount() {
        return puredTaxAmount;
    }

    public void setPuredTaxAmount(Float puredTaxAmount) {
        this.puredTaxAmount = puredTaxAmount;
    }

    public Float getPuredIncludingTaxAmount() {
        return puredIncludingTaxAmount;
    }

    public void setPuredIncludingTaxAmount(Float puredIncludingTaxAmount) {
        this.puredIncludingTaxAmount = puredIncludingTaxAmount;
    }

    public String getPuredBatchNumber() {
        return puredBatchNumber;
    }

    public void setPuredBatchNumber(String puredBatchNumber) {
        this.puredBatchNumber = puredBatchNumber == null ? null : puredBatchNumber.trim();
    }

    public String getPuredIfgift() {
        return puredIfgift;
    }

    public void setPuredIfgift(String puredIfgift) {
        this.puredIfgift = puredIfgift == null ? null : puredIfgift.trim();
    }

    public String getPuredInvoiceDetails() {
        return puredInvoiceDetails;
    }

    public void setPuredInvoiceDetails(String puredInvoiceDetails) {
        this.puredInvoiceDetails = puredInvoiceDetails == null ? null : puredInvoiceDetails.trim();
    }

    public String getPuredRemarks() {
        return puredRemarks;
    }

    public void setPuredRemarks(String puredRemarks) {
        this.puredRemarks = puredRemarks == null ? null : puredRemarks.trim();
    }

    public String getPuredSourceOrder() {
        return puredSourceOrder;
    }

    public void setPuredSourceOrder(String puredSourceOrder) {
        this.puredSourceOrder = puredSourceOrder == null ? null : puredSourceOrder.trim();
    }

    public String getPuredSourceNo() {
        return puredSourceNo;
    }

    public void setPuredSourceNo(String puredSourceNo) {
        this.puredSourceNo = puredSourceNo == null ? null : puredSourceNo.trim();
    }

    public String getPuredAuditing() {
        return puredAuditing;
    }

    public void setPuredAuditing(String puredAuditing) {
        this.puredAuditing = puredAuditing == null ? null : puredAuditing.trim();
    }

    public String getPuredYn() {
        return puredYn;
    }

    public void setPuredYn(String puredYn) {
        this.puredYn = puredYn == null ? null : puredYn.trim();
    }

    public String getPuredCustom1() {
        return puredCustom1;
    }

    public void setPuredCustom1(String puredCustom1) {
        this.puredCustom1 = puredCustom1 == null ? null : puredCustom1.trim();
    }

    public String getPuredCustom2() {
        return puredCustom2;
    }

    public void setPuredCustom2(String puredCustom2) {
        this.puredCustom2 = puredCustom2 == null ? null : puredCustom2.trim();
    }

    public String getPuredCustom3() {
        return puredCustom3;
    }

    public void setPuredCustom3(String puredCustom3) {
        this.puredCustom3 = puredCustom3 == null ? null : puredCustom3.trim();
    }

    public String getPuredCustom4() {
        return puredCustom4;
    }

    public void setPuredCustom4(String puredCustom4) {
        this.puredCustom4 = puredCustom4 == null ? null : puredCustom4.trim();
    }

    public String getPuredCustom5() {
        return puredCustom5;
    }

    public void setPuredCustom5(String puredCustom5) {
        this.puredCustom5 = puredCustom5 == null ? null : puredCustom5.trim();
    }

    public String getPuredCustom6() {
        return puredCustom6;
    }

    public void setPuredCustom6(String puredCustom6) {
        this.puredCustom6 = puredCustom6 == null ? null : puredCustom6.trim();
    }
}