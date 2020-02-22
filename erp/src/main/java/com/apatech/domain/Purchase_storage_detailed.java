package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 采购入库详表
 * @author 刘成
 *
 */
public class Purchase_storage_detailed {
    private String psdId;//id（主键 唯一）
    private String psId;//采购入库id（外键 ）
    private String matterId;//物料编号
    private String psdEngname;//物料名称
    private String psdRemark;//规格型号
    private String psdPriceIncludeTax;//单位名称
    private Integer psdSingleStatus;//数量
    private float psdDocumentDate;//折扣前单价
    private String psdDocumentNumber;//折数
    private Float psdPrice;//单价
    private Float psdMoney;//金额
    private Float psdTaxRate;//税率
    private Float psdTaxAmount;//税额
    private Float psdIncludingTaxAmount;//含税金额
    private String psdBatchNumber;//批号
    private String psdIfgift;//是否是赠品（0 否 1 是）
    private String psdInvoiceDetails;//发票明细
    private String psdRemarks;//分录备注
    private String psdSourceOrder;//来源单别
    private String psdSourceNo;//来源单号
    private String psdAuditing;//是否审核
    private String psdYn;//是否删除（0 否 1 是 ，默认0）
    private String psdCustom1;//自定义1
    private String psdCustom2;//自定义2
    private String psdCustom3;//自定义3
    private String psdCustom4;//自定义4
    private String psdCustom5;//自定义5
    private String psdCustom6;//自定义6
    
    

    public Purchase_storage_detailed() {
		super();
	}

	

	@Override
	public String toString() {
		return "Purchase_storage_detailed [psdId=" + psdId + ", psId=" + psId + ", matterId=" + matterId
				+ ", psdEngname=" + psdEngname + ", psdRemark=" + psdRemark + ", psdPriceIncludeTax="
				+ psdPriceIncludeTax + ", psdSingleStatus=" + psdSingleStatus + ", psdDocumentDate=" + psdDocumentDate
				+ ", psdDocumentNumber=" + psdDocumentNumber + ", psdPrice=" + psdPrice + ", psdMoney=" + psdMoney
				+ ", psdTaxRate=" + psdTaxRate + ", psdTaxAmount=" + psdTaxAmount + ", psdIncludingTaxAmount="
				+ psdIncludingTaxAmount + ", psdBatchNumber=" + psdBatchNumber + ", psdIfgift=" + psdIfgift
				+ ", psdInvoiceDetails=" + psdInvoiceDetails + ", psdRemarks=" + psdRemarks + ", psdSourceOrder="
				+ psdSourceOrder + ", psdSourceNo=" + psdSourceNo + ", psdAuditing=" + psdAuditing + ", psdYn=" + psdYn
				+ ", psdCustom1=" + psdCustom1 + ", psdCustom2=" + psdCustom2 + ", psdCustom3=" + psdCustom3
				+ ", psdCustom4=" + psdCustom4 + ", psdCustom5=" + psdCustom5 + ", psdCustom6=" + psdCustom6 + "]";
	}



	public String getPsdId() {
        return psdId;
    }

    public void setPsdId(String psdId) {
        this.psdId = psdId == null ? null : psdId.trim();
    }

    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId == null ? null : psId.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getPsdEngname() {
        return psdEngname;
    }

    public void setPsdEngname(String psdEngname) {
        this.psdEngname = psdEngname == null ? null : psdEngname.trim();
    }

    public String getPsdRemark() {
        return psdRemark;
    }

    public void setPsdRemark(String psdRemark) {
        this.psdRemark = psdRemark == null ? null : psdRemark.trim();
    }

    public String getPsdPriceIncludeTax() {
        return psdPriceIncludeTax;
    }

    public void setPsdPriceIncludeTax(String psdPriceIncludeTax) {
        this.psdPriceIncludeTax = psdPriceIncludeTax == null ? null : psdPriceIncludeTax.trim();
    }

    public Integer getPsdSingleStatus() {
        return psdSingleStatus;
    }

    public void setPsdSingleStatus(Integer psdSingleStatus) {
        this.psdSingleStatus = psdSingleStatus;
    }

  

    public float getPsdDocumentDate() {
		return psdDocumentDate;
	}



	public void setPsdDocumentDate(float psdDocumentDate) {
		this.psdDocumentDate = psdDocumentDate;
	}



	public String getPsdDocumentNumber() {
        return psdDocumentNumber;
    }

    public void setPsdDocumentNumber(String psdDocumentNumber) {
        this.psdDocumentNumber = psdDocumentNumber == null ? null : psdDocumentNumber.trim();
    }

    public Float getPsdPrice() {
        return psdPrice;
    }

    public void setPsdPrice(Float psdPrice) {
        this.psdPrice = psdPrice;
    }

    public Float getPsdMoney() {
        return psdMoney;
    }

    public void setPsdMoney(Float psdMoney) {
        this.psdMoney = psdMoney;
    }

    public Float getPsdTaxRate() {
        return psdTaxRate;
    }

    public void setPsdTaxRate(Float psdTaxRate) {
        this.psdTaxRate = psdTaxRate;
    }

    public Float getPsdTaxAmount() {
        return psdTaxAmount;
    }

    public void setPsdTaxAmount(Float psdTaxAmount) {
        this.psdTaxAmount = psdTaxAmount;
    }

    public Float getPsdIncludingTaxAmount() {
        return psdIncludingTaxAmount;
    }

    public void setPsdIncludingTaxAmount(Float psdIncludingTaxAmount) {
        this.psdIncludingTaxAmount = psdIncludingTaxAmount;
    }

    public String getPsdBatchNumber() {
        return psdBatchNumber;
    }

    public void setPsdBatchNumber(String psdBatchNumber) {
        this.psdBatchNumber = psdBatchNumber == null ? null : psdBatchNumber.trim();
    }

    public String getPsdIfgift() {
        return psdIfgift;
    }

    public void setPsdIfgift(String psdIfgift) {
        this.psdIfgift = psdIfgift == null ? null : psdIfgift.trim();
    }

    public String getPsdInvoiceDetails() {
        return psdInvoiceDetails;
    }

    public void setPsdInvoiceDetails(String psdInvoiceDetails) {
        this.psdInvoiceDetails = psdInvoiceDetails == null ? null : psdInvoiceDetails.trim();
    }

    public String getPsdRemarks() {
        return psdRemarks;
    }

    public void setPsdRemarks(String psdRemarks) {
        this.psdRemarks = psdRemarks == null ? null : psdRemarks.trim();
    }

    public String getPsdSourceOrder() {
        return psdSourceOrder;
    }

    public void setPsdSourceOrder(String psdSourceOrder) {
        this.psdSourceOrder = psdSourceOrder == null ? null : psdSourceOrder.trim();
    }

    public String getPsdSourceNo() {
        return psdSourceNo;
    }

    public void setPsdSourceNo(String psdSourceNo) {
        this.psdSourceNo = psdSourceNo == null ? null : psdSourceNo.trim();
    }

    public String getPsdAuditing() {
        return psdAuditing;
    }

    public void setPsdAuditing(String psdAuditing) {
        this.psdAuditing = psdAuditing == null ? null : psdAuditing.trim();
    }

    public String getPsdYn() {
        return psdYn;
    }

    public void setPsdYn(String psdYn) {
        this.psdYn = psdYn == null ? null : psdYn.trim();
    }

    public String getPsdCustom1() {
        return psdCustom1;
    }

    public void setPsdCustom1(String psdCustom1) {
        this.psdCustom1 = psdCustom1 == null ? null : psdCustom1.trim();
    }

    public String getPsdCustom2() {
        return psdCustom2;
    }

    public void setPsdCustom2(String psdCustom2) {
        this.psdCustom2 = psdCustom2 == null ? null : psdCustom2.trim();
    }

    public String getPsdCustom3() {
        return psdCustom3;
    }

    public void setPsdCustom3(String psdCustom3) {
        this.psdCustom3 = psdCustom3 == null ? null : psdCustom3.trim();
    }

    public String getPsdCustom4() {
        return psdCustom4;
    }

    public void setPsdCustom4(String psdCustom4) {
        this.psdCustom4 = psdCustom4 == null ? null : psdCustom4.trim();
    }

    public String getPsdCustom5() {
        return psdCustom5;
    }

    public void setPsdCustom5(String psdCustom5) {
        this.psdCustom5 = psdCustom5 == null ? null : psdCustom5.trim();
    }

    public String getPsdCustom6() {
        return psdCustom6;
    }

    public void setPsdCustom6(String psdCustom6) {
        this.psdCustom6 = psdCustom6 == null ? null : psdCustom6.trim();
    }
}