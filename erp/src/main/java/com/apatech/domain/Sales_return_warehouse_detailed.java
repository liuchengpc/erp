package com.apatech.domain;

import java.util.Date;

/**
 * 销售退货详表
 * @author 刘成
 *
 */
public class Sales_return_warehouse_detailed {
    private String srwdId;//id（主键 唯一）
    private String srwId;//销售退货id（外键）
    private String matterId;//物料编号
    private String srwdEngname;//物料名称
    private String srwdRemark;//规格型号
    private String srwdPriceIncludeTax;//单位名称
    private Integer srwdSingleStatus;//数量
    private Date srwdDocumentDate;//折扣前单价
    private Float srwdDocumentNumber;//折数
    private Float srwdPrice;//单价
    private Float srwdMoney;//金额
    private Float srwdTaxRate;//税率
    private Float srwdTaxAmount;//税额
    private Float srwdIncludingTaxAmount;//含税金额
    private String srwdBatchNumber;//批号
    private String srwdIfgift;//是否是赠品（0 否 1 是）
    private String srwdInvoiceDetails;//发票明细
    private Integer srwdNomakeInvoiceNum;//未开票数量
    private String srwdRemarks;//分录备注
    private String srwdSourceOrder;//来源单别
    private String srwdSourceNo;//来源单号
    private String srwdAuditing;//是否审核
    private String srwdYn;//是否删除（0 否 1 是 ，默认0）
    private String srwdCustom1;//自定义1
    private String srwdCustom2;//自定义2
    private String srwdCustom3;//自定义3
    private String srwdCustom4;//自定义4
    private String srwdCustom5;//自定义5
    private String srwdCustom6;//自定义6
    
    

    public Sales_return_warehouse_detailed() {
		super();
	}

	@Override
	public String toString() {
		return "Sales_return_warehouse_detailed [srwdId=" + srwdId + ", srwId=" + srwId + ", matterId=" + matterId
				+ ", srwdEngname=" + srwdEngname + ", srwdRemark=" + srwdRemark + ", srwdPriceIncludeTax="
				+ srwdPriceIncludeTax + ", srwdSingleStatus=" + srwdSingleStatus + ", srwdDocumentDate="
				+ srwdDocumentDate + ", srwdDocumentNumber=" + srwdDocumentNumber + ", srwdPrice=" + srwdPrice
				+ ", srwdMoney=" + srwdMoney + ", srwdTaxRate=" + srwdTaxRate + ", srwdTaxAmount=" + srwdTaxAmount
				+ ", srwdIncludingTaxAmount=" + srwdIncludingTaxAmount + ", srwdBatchNumber=" + srwdBatchNumber
				+ ", srwdIfgift=" + srwdIfgift + ", srwdInvoiceDetails=" + srwdInvoiceDetails
				+ ", srwdNomakeInvoiceNum=" + srwdNomakeInvoiceNum + ", srwdRemarks=" + srwdRemarks
				+ ", srwdSourceOrder=" + srwdSourceOrder + ", srwdSourceNo=" + srwdSourceNo + ", srwdAuditing="
				+ srwdAuditing + ", srwdYn=" + srwdYn + ", srwdCustom1=" + srwdCustom1 + ", srwdCustom2=" + srwdCustom2
				+ ", srwdCustom3=" + srwdCustom3 + ", srwdCustom4=" + srwdCustom4 + ", srwdCustom5=" + srwdCustom5
				+ ", srwdCustom6=" + srwdCustom6 + "]";
	}

	public String getSrwdId() {
        return srwdId;
    }

    public void setSrwdId(String srwdId) {
        this.srwdId = srwdId == null ? null : srwdId.trim();
    }

    public String getSrwId() {
        return srwId;
    }

    public void setSrwId(String srwId) {
        this.srwId = srwId == null ? null : srwId.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getSrwdEngname() {
        return srwdEngname;
    }

    public void setSrwdEngname(String srwdEngname) {
        this.srwdEngname = srwdEngname == null ? null : srwdEngname.trim();
    }

    public String getSrwdRemark() {
        return srwdRemark;
    }

    public void setSrwdRemark(String srwdRemark) {
        this.srwdRemark = srwdRemark == null ? null : srwdRemark.trim();
    }

    public String getSrwdPriceIncludeTax() {
        return srwdPriceIncludeTax;
    }

    public void setSrwdPriceIncludeTax(String srwdPriceIncludeTax) {
        this.srwdPriceIncludeTax = srwdPriceIncludeTax == null ? null : srwdPriceIncludeTax.trim();
    }

    public Integer getSrwdSingleStatus() {
        return srwdSingleStatus;
    }

    public void setSrwdSingleStatus(Integer srwdSingleStatus) {
        this.srwdSingleStatus = srwdSingleStatus;
    }

    public Date getSrwdDocumentDate() {
        return srwdDocumentDate;
    }

    public void setSrwdDocumentDate(Date srwdDocumentDate) {
        this.srwdDocumentDate = srwdDocumentDate;
    }

    public Float getSrwdDocumentNumber() {
        return srwdDocumentNumber;
    }

    public void setSrwdDocumentNumber(Float srwdDocumentNumber) {
        this.srwdDocumentNumber = srwdDocumentNumber;
    }

    public Float getSrwdPrice() {
        return srwdPrice;
    }

    public void setSrwdPrice(Float srwdPrice) {
        this.srwdPrice = srwdPrice;
    }

    public Float getSrwdMoney() {
        return srwdMoney;
    }

    public void setSrwdMoney(Float srwdMoney) {
        this.srwdMoney = srwdMoney;
    }

    public Float getSrwdTaxRate() {
        return srwdTaxRate;
    }

    public void setSrwdTaxRate(Float srwdTaxRate) {
        this.srwdTaxRate = srwdTaxRate;
    }

    public Float getSrwdTaxAmount() {
        return srwdTaxAmount;
    }

    public void setSrwdTaxAmount(Float srwdTaxAmount) {
        this.srwdTaxAmount = srwdTaxAmount;
    }

    public Float getSrwdIncludingTaxAmount() {
        return srwdIncludingTaxAmount;
    }

    public void setSrwdIncludingTaxAmount(Float srwdIncludingTaxAmount) {
        this.srwdIncludingTaxAmount = srwdIncludingTaxAmount;
    }

    public String getSrwdBatchNumber() {
        return srwdBatchNumber;
    }

    public void setSrwdBatchNumber(String srwdBatchNumber) {
        this.srwdBatchNumber = srwdBatchNumber == null ? null : srwdBatchNumber.trim();
    }

    public String getSrwdIfgift() {
        return srwdIfgift;
    }

    public void setSrwdIfgift(String srwdIfgift) {
        this.srwdIfgift = srwdIfgift == null ? null : srwdIfgift.trim();
    }

    public String getSrwdInvoiceDetails() {
        return srwdInvoiceDetails;
    }

    public void setSrwdInvoiceDetails(String srwdInvoiceDetails) {
        this.srwdInvoiceDetails = srwdInvoiceDetails == null ? null : srwdInvoiceDetails.trim();
    }

    public Integer getSrwdNomakeInvoiceNum() {
        return srwdNomakeInvoiceNum;
    }

    public void setSrwdNomakeInvoiceNum(Integer srwdNomakeInvoiceNum) {
        this.srwdNomakeInvoiceNum = srwdNomakeInvoiceNum;
    }

    public String getSrwdRemarks() {
        return srwdRemarks;
    }

    public void setSrwdRemarks(String srwdRemarks) {
        this.srwdRemarks = srwdRemarks == null ? null : srwdRemarks.trim();
    }

    public String getSrwdSourceOrder() {
        return srwdSourceOrder;
    }

    public void setSrwdSourceOrder(String srwdSourceOrder) {
        this.srwdSourceOrder = srwdSourceOrder == null ? null : srwdSourceOrder.trim();
    }

    public String getSrwdSourceNo() {
        return srwdSourceNo;
    }

    public void setSrwdSourceNo(String srwdSourceNo) {
        this.srwdSourceNo = srwdSourceNo == null ? null : srwdSourceNo.trim();
    }

    public String getSrwdAuditing() {
        return srwdAuditing;
    }

    public void setSrwdAuditing(String srwdAuditing) {
        this.srwdAuditing = srwdAuditing == null ? null : srwdAuditing.trim();
    }

    public String getSrwdYn() {
        return srwdYn;
    }

    public void setSrwdYn(String srwdYn) {
        this.srwdYn = srwdYn == null ? null : srwdYn.trim();
    }

    public String getSrwdCustom1() {
        return srwdCustom1;
    }

    public void setSrwdCustom1(String srwdCustom1) {
        this.srwdCustom1 = srwdCustom1 == null ? null : srwdCustom1.trim();
    }

    public String getSrwdCustom2() {
        return srwdCustom2;
    }

    public void setSrwdCustom2(String srwdCustom2) {
        this.srwdCustom2 = srwdCustom2 == null ? null : srwdCustom2.trim();
    }

    public String getSrwdCustom3() {
        return srwdCustom3;
    }

    public void setSrwdCustom3(String srwdCustom3) {
        this.srwdCustom3 = srwdCustom3 == null ? null : srwdCustom3.trim();
    }

    public String getSrwdCustom4() {
        return srwdCustom4;
    }

    public void setSrwdCustom4(String srwdCustom4) {
        this.srwdCustom4 = srwdCustom4 == null ? null : srwdCustom4.trim();
    }

    public String getSrwdCustom5() {
        return srwdCustom5;
    }

    public void setSrwdCustom5(String srwdCustom5) {
        this.srwdCustom5 = srwdCustom5 == null ? null : srwdCustom5.trim();
    }

    public String getSrwdCustom6() {
        return srwdCustom6;
    }

    public void setSrwdCustom6(String srwdCustom6) {
        this.srwdCustom6 = srwdCustom6 == null ? null : srwdCustom6.trim();
    }
}