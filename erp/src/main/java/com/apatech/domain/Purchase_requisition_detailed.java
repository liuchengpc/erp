package com.apatech.domain;

import java.util.Date;

/**
 * 采购请购详表
 * @author 刘成
 *
 */
public class Purchase_requisition_detailed {
    private String prdId;//id（主键 唯一）
    private String prId;//采购请购id（外键）
    private String prMatterId;//物料编号
    private String prdMatterName;//物料名称
    private String prdSpecifications;//规格型号
    private String prdCompanyName;//单位名称
    private Integer prdAmount;//数量
    private String prdCurrencyId;//币别id
    private Float prdStandardPrice;//标准进价
    private Float prdStandardPurchaseAmount;//标准进价金额
    private Float prdUnitPrice;//单价
    private Float prdIncomingAmount;//进价金额
    private Date prdDemandDate;//需求日期
    private Date prdRecommendedProcurementDate;//建议采购日期
    private Integer prdUnpurchasedQuantity;//未采购量
    private String prdRemarks;//分录备注
    private String prdSourceOrder;//来源单别
    private String prdSourceNo;//来源单号
    private String prdAudition;//是否审核
    private String prdYn;//是否删除（0 否 1 是 ，默认0）
    private String prdCustom1;//自定义1
    private String prdCustom2;//自定义2
    private String prdCustom3;//自定义3
    private String prdCustom4;//自定义4
    private String prdCustom5;//自定义5
    private String prdCustom6;//自定义6
    
    
    

    public Purchase_requisition_detailed() {
		super();
	}

	@Override
	public String toString() {
		return "Purchase_requisition_detailed [prdId=" + prdId + ", prId=" + prId + ", prMatterId=" + prMatterId
				+ ", prdMatterName=" + prdMatterName + ", prdSpecifications=" + prdSpecifications + ", prdCompanyName="
				+ prdCompanyName + ", prdAmount=" + prdAmount + ", prdCurrencyId=" + prdCurrencyId
				+ ", prdStandardPrice=" + prdStandardPrice + ", prdStandardPurchaseAmount=" + prdStandardPurchaseAmount
				+ ", prdUnitPrice=" + prdUnitPrice + ", prdIncomingAmount=" + prdIncomingAmount + ", prdDemandDate="
				+ prdDemandDate + ", prdRecommendedProcurementDate=" + prdRecommendedProcurementDate
				+ ", prdUnpurchasedQuantity=" + prdUnpurchasedQuantity + ", prdRemarks=" + prdRemarks
				+ ", prdSourceOrder=" + prdSourceOrder + ", prdSourceNo=" + prdSourceNo + ", prdAudition=" + prdAudition
				+ ", prdYn=" + prdYn + ", prdCustom1=" + prdCustom1 + ", prdCustom2=" + prdCustom2 + ", prdCustom3="
				+ prdCustom3 + ", prdCustom4=" + prdCustom4 + ", prdCustom5=" + prdCustom5 + ", prdCustom6="
				+ prdCustom6 + "]";
	}

	public String getPrdId() {
        return prdId;
    }

    public void setPrdId(String prdId) {
        this.prdId = prdId == null ? null : prdId.trim();
    }

    public String getPrId() {
        return prId;
    }

    public void setPrId(String prId) {
        this.prId = prId == null ? null : prId.trim();
    }

    public String getPrMatterId() {
        return prMatterId;
    }

    public void setPrMatterId(String prMatterId) {
        this.prMatterId = prMatterId == null ? null : prMatterId.trim();
    }

    public String getPrdMatterName() {
        return prdMatterName;
    }

    public void setPrdMatterName(String prdMatterName) {
        this.prdMatterName = prdMatterName == null ? null : prdMatterName.trim();
    }

    public String getPrdSpecifications() {
        return prdSpecifications;
    }

    public void setPrdSpecifications(String prdSpecifications) {
        this.prdSpecifications = prdSpecifications == null ? null : prdSpecifications.trim();
    }

    public String getPrdCompanyName() {
        return prdCompanyName;
    }

    public void setPrdCompanyName(String prdCompanyName) {
        this.prdCompanyName = prdCompanyName == null ? null : prdCompanyName.trim();
    }

    public Integer getPrdAmount() {
        return prdAmount;
    }

    public void setPrdAmount(Integer prdAmount) {
        this.prdAmount = prdAmount;
    }

    public String getPrdCurrencyId() {
        return prdCurrencyId;
    }

    public void setPrdCurrencyId(String prdCurrencyId) {
        this.prdCurrencyId = prdCurrencyId == null ? null : prdCurrencyId.trim();
    }

    public Float getPrdStandardPrice() {
        return prdStandardPrice;
    }

    public void setPrdStandardPrice(Float prdStandardPrice) {
        this.prdStandardPrice = prdStandardPrice;
    }

    public Float getPrdStandardPurchaseAmount() {
        return prdStandardPurchaseAmount;
    }

    public void setPrdStandardPurchaseAmount(Float prdStandardPurchaseAmount) {
        this.prdStandardPurchaseAmount = prdStandardPurchaseAmount;
    }

    public Float getPrdUnitPrice() {
        return prdUnitPrice;
    }

    public void setPrdUnitPrice(Float prdUnitPrice) {
        this.prdUnitPrice = prdUnitPrice;
    }

    public Float getPrdIncomingAmount() {
        return prdIncomingAmount;
    }

    public void setPrdIncomingAmount(Float prdIncomingAmount) {
        this.prdIncomingAmount = prdIncomingAmount;
    }

    public Date getPrdDemandDate() {
        return prdDemandDate;
    }

    public void setPrdDemandDate(Date prdDemandDate) {
        this.prdDemandDate = prdDemandDate;
    }

    public Date getPrdRecommendedProcurementDate() {
        return prdRecommendedProcurementDate;
    }

    public void setPrdRecommendedProcurementDate(Date prdRecommendedProcurementDate) {
        this.prdRecommendedProcurementDate = prdRecommendedProcurementDate;
    }

    public Integer getPrdUnpurchasedQuantity() {
        return prdUnpurchasedQuantity;
    }

    public void setPrdUnpurchasedQuantity(Integer prdUnpurchasedQuantity) {
        this.prdUnpurchasedQuantity = prdUnpurchasedQuantity;
    }

    public String getPrdRemarks() {
        return prdRemarks;
    }

    public void setPrdRemarks(String prdRemarks) {
        this.prdRemarks = prdRemarks == null ? null : prdRemarks.trim();
    }

    public String getPrdSourceOrder() {
        return prdSourceOrder;
    }

    public void setPrdSourceOrder(String prdSourceOrder) {
        this.prdSourceOrder = prdSourceOrder == null ? null : prdSourceOrder.trim();
    }

    public String getPrdSourceNo() {
        return prdSourceNo;
    }

    public void setPrdSourceNo(String prdSourceNo) {
        this.prdSourceNo = prdSourceNo == null ? null : prdSourceNo.trim();
    }

    public String getPrdAudition() {
        return prdAudition;
    }

    public void setPrdAudition(String prdAudition) {
        this.prdAudition = prdAudition == null ? null : prdAudition.trim();
    }

    public String getPrdYn() {
        return prdYn;
    }

    public void setPrdYn(String prdYn) {
        this.prdYn = prdYn == null ? null : prdYn.trim();
    }

    public String getPrdCustom1() {
        return prdCustom1;
    }

    public void setPrdCustom1(String prdCustom1) {
        this.prdCustom1 = prdCustom1 == null ? null : prdCustom1.trim();
    }

    public String getPrdCustom2() {
        return prdCustom2;
    }

    public void setPrdCustom2(String prdCustom2) {
        this.prdCustom2 = prdCustom2 == null ? null : prdCustom2.trim();
    }

    public String getPrdCustom3() {
        return prdCustom3;
    }

    public void setPrdCustom3(String prdCustom3) {
        this.prdCustom3 = prdCustom3 == null ? null : prdCustom3.trim();
    }

    public String getPrdCustom4() {
        return prdCustom4;
    }

    public void setPrdCustom4(String prdCustom4) {
        this.prdCustom4 = prdCustom4 == null ? null : prdCustom4.trim();
    }

    public String getPrdCustom5() {
        return prdCustom5;
    }

    public void setPrdCustom5(String prdCustom5) {
        this.prdCustom5 = prdCustom5 == null ? null : prdCustom5.trim();
    }

    public String getPrdCustom6() {
        return prdCustom6;
    }

    public void setPrdCustom6(String prdCustom6) {
        this.prdCustom6 = prdCustom6 == null ? null : prdCustom6.trim();
    }
}