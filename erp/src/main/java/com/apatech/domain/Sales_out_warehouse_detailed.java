package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 销售出库详表
 * @author 刘成
 *
 */
public class Sales_out_warehouse_detailed {
    private String sowdId;//id（主键 唯一）
    private String sowId;//销售出库id（外键）
    private String matterId;//物料编号
    private String sowdEngname;//物料名称
    private String sowdRemark;//规格型号
    private String sowdPriceIncludeTax;//单位名称
    private Integer sowdSingleStatus;//数量
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Float sowdDocumentDate;//折扣前单价
    private Float sowdDocumentNumber;//折数
    private Float sowdPrice;//单价
    private Float sowdMoney;//金额
    private Float sowdTaxRate;//税率
    private Float sowdTaxAmount;//税额
    private Float sowdIncludingTaxAmount;//含税金额
    private String sowdBatchNumber;//批号
    private String sowdMaterialCombination;//物料组合
    private String sowdIfgift;//是否是赠品（0 否 1 是）
    private String sowdInvoiceDetails;//发票明细
    private Integer sowdNomakeInvoiceNum;//未开票数量
    private String sowdRemarks;//分录备注
    private String sowdSourceOrder;//来源单别
    private String sowdSourceNo;//来源单号
    private String sowdAuditing;//是否审核
    private String sowdYn;//是否删除（0 否 1 是 ，默认0）
    private String sowdCustom1;//自定义1
    private String sowdCustom2;//自定义2
    private String sowdCustom3;//自定义3
    private String sowdCustom4;//自定义4
    private String sowdCustom5;//自定义5
    private String sowdCustom6;//自定义6
    
    
    

    public Sales_out_warehouse_detailed() {
		super();
	}



	@Override
	public String toString() {
		return "Sales_out_warehouse_detailed [sowdId=" + sowdId + ", sowId=" + sowId + ", matterId=" + matterId
				+ ", sowdEngname=" + sowdEngname + ", sowdRemark=" + sowdRemark + ", sowdPriceIncludeTax="
				+ sowdPriceIncludeTax + ", sowdSingleStatus=" + sowdSingleStatus + ", sowdDocumentNumber="
				+ sowdDocumentNumber + ", sowdPrice=" + sowdPrice + ", sowdMoney=" + sowdMoney + ", sowdTaxRate="
				+ sowdTaxRate + ", sowdTaxAmount=" + sowdTaxAmount + ", sowdIncludingTaxAmount="
				+ sowdIncludingTaxAmount + ", sowdBatchNumber=" + sowdBatchNumber + ", sowdMaterialCombination="
				+ sowdMaterialCombination + ", sowdIfgift=" + sowdIfgift + ", sowdInvoiceDetails=" + sowdInvoiceDetails
				+ ", sowdNomakeInvoiceNum=" + sowdNomakeInvoiceNum + ", sowdRemarks=" + sowdRemarks
				+ ", sowdSourceOrder=" + sowdSourceOrder + ", sowdSourceNo=" + sowdSourceNo + ", sowdAuditing="
				+ sowdAuditing + ", sowdYn=" + sowdYn + ", sowdCustom1=" + sowdCustom1 + ", sowdCustom2=" + sowdCustom2
				+ ", sowdCustom3=" + sowdCustom3 + ", sowdCustom4=" + sowdCustom4 + ", sowdCustom5=" + sowdCustom5
				+ ", sowdCustom6=" + sowdCustom6 + "]";
	}



	public String getSowdId() {
        return sowdId;
    }

    public void setSowdId(String sowdId) {
        this.sowdId = sowdId == null ? null : sowdId.trim();
    }

    public String getSowId() {
        return sowId;
    }

    public void setSowId(String sowId) {
        this.sowId = sowId == null ? null : sowId.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getSowdEngname() {
        return sowdEngname;
    }

    public void setSowdEngname(String sowdEngname) {
        this.sowdEngname = sowdEngname == null ? null : sowdEngname.trim();
    }

    public String getSowdRemark() {
        return sowdRemark;
    }

    public void setSowdRemark(String sowdRemark) {
        this.sowdRemark = sowdRemark == null ? null : sowdRemark.trim();
    }

    public String getSowdPriceIncludeTax() {
        return sowdPriceIncludeTax;
    }

    public void setSowdPriceIncludeTax(String sowdPriceIncludeTax) {
        this.sowdPriceIncludeTax = sowdPriceIncludeTax == null ? null : sowdPriceIncludeTax.trim();
    }

    public Integer getSowdSingleStatus() {
        return sowdSingleStatus;
    }

    public void setSowdSingleStatus(Integer sowdSingleStatus) {
        this.sowdSingleStatus = sowdSingleStatus;
    }

    public Float getSowdDocumentDate() {
        return sowdDocumentDate;
    }

    public void setSowdDocumentDate(Float sowdDocumentDate) {
        this.sowdDocumentDate = sowdDocumentDate;
    }

    public Float getSowdDocumentNumber() {
        return sowdDocumentNumber;
    }

    public void setSowdDocumentNumber(Float sowdDocumentNumber) {
        this.sowdDocumentNumber = sowdDocumentNumber;
    }

    public Float getSowdPrice() {
        return sowdPrice;
    }

    public void setSowdPrice(Float sowdPrice) {
        this.sowdPrice = sowdPrice;
    }

    public Float getSowdMoney() {
        return sowdMoney;
    }

    public void setSowdMoney(Float sowdMoney) {
        this.sowdMoney = sowdMoney;
    }

    public Float getSowdTaxRate() {
        return sowdTaxRate;
    }

    public void setSowdTaxRate(Float sowdTaxRate) {
        this.sowdTaxRate = sowdTaxRate;
    }

    public Float getSowdTaxAmount() {
        return sowdTaxAmount;
    }

    public void setSowdTaxAmount(Float sowdTaxAmount) {
        this.sowdTaxAmount = sowdTaxAmount;
    }

    public Float getSowdIncludingTaxAmount() {
        return sowdIncludingTaxAmount;
    }

    public void setSowdIncludingTaxAmount(Float sowdIncludingTaxAmount) {
        this.sowdIncludingTaxAmount = sowdIncludingTaxAmount;
    }

    public String getSowdBatchNumber() {
        return sowdBatchNumber;
    }

    public void setSowdBatchNumber(String sowdBatchNumber) {
        this.sowdBatchNumber = sowdBatchNumber == null ? null : sowdBatchNumber.trim();
    }

    public String getSowdMaterialCombination() {
        return sowdMaterialCombination;
    }

    public void setSowdMaterialCombination(String sowdMaterialCombination) {
        this.sowdMaterialCombination = sowdMaterialCombination == null ? null : sowdMaterialCombination.trim();
    }

    public String getSowdIfgift() {
        return sowdIfgift;
    }

    public void setSowdIfgift(String sowdIfgift) {
        this.sowdIfgift = sowdIfgift == null ? null : sowdIfgift.trim();
    }

    public String getSowdInvoiceDetails() {
        return sowdInvoiceDetails;
    }

    public void setSowdInvoiceDetails(String sowdInvoiceDetails) {
        this.sowdInvoiceDetails = sowdInvoiceDetails == null ? null : sowdInvoiceDetails.trim();
    }

    public Integer getSowdNomakeInvoiceNum() {
        return sowdNomakeInvoiceNum;
    }

    public void setSowdNomakeInvoiceNum(Integer sowdNomakeInvoiceNum) {
        this.sowdNomakeInvoiceNum = sowdNomakeInvoiceNum;
    }

    public String getSowdRemarks() {
        return sowdRemarks;
    }

    public void setSowdRemarks(String sowdRemarks) {
        this.sowdRemarks = sowdRemarks == null ? null : sowdRemarks.trim();
    }

    public String getSowdSourceOrder() {
        return sowdSourceOrder;
    }

    public void setSowdSourceOrder(String sowdSourceOrder) {
        this.sowdSourceOrder = sowdSourceOrder == null ? null : sowdSourceOrder.trim();
    }

    public String getSowdSourceNo() {
        return sowdSourceNo;
    }

    public void setSowdSourceNo(String sowdSourceNo) {
        this.sowdSourceNo = sowdSourceNo == null ? null : sowdSourceNo.trim();
    }

    public String getSowdAuditing() {
        return sowdAuditing;
    }

    public void setSowdAuditing(String sowdAuditing) {
        this.sowdAuditing = sowdAuditing == null ? null : sowdAuditing.trim();
    }

    public String getSowdYn() {
        return sowdYn;
    }

    public void setSowdYn(String sowdYn) {
        this.sowdYn = sowdYn == null ? null : sowdYn.trim();
    }

    public String getSowdCustom1() {
        return sowdCustom1;
    }

    public void setSowdCustom1(String sowdCustom1) {
        this.sowdCustom1 = sowdCustom1 == null ? null : sowdCustom1.trim();
    }

    public String getSowdCustom2() {
        return sowdCustom2;
    }

    public void setSowdCustom2(String sowdCustom2) {
        this.sowdCustom2 = sowdCustom2 == null ? null : sowdCustom2.trim();
    }

    public String getSowdCustom3() {
        return sowdCustom3;
    }

    public void setSowdCustom3(String sowdCustom3) {
        this.sowdCustom3 = sowdCustom3 == null ? null : sowdCustom3.trim();
    }

    public String getSowdCustom4() {
        return sowdCustom4;
    }

    public void setSowdCustom4(String sowdCustom4) {
        this.sowdCustom4 = sowdCustom4 == null ? null : sowdCustom4.trim();
    }

    public String getSowdCustom5() {
        return sowdCustom5;
    }

    public void setSowdCustom5(String sowdCustom5) {
        this.sowdCustom5 = sowdCustom5 == null ? null : sowdCustom5.trim();
    }

    public String getSowdCustom6() {
        return sowdCustom6;
    }

    public void setSowdCustom6(String sowdCustom6) {
        this.sowdCustom6 = sowdCustom6 == null ? null : sowdCustom6.trim();
    }
}