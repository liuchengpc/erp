package com.apatech.domain;

/**
 * 采购折让确认详表
 * @author 刘成
 *
 */
public class Purchase_discount_detailed {
    private String pddId;//id（主键 唯一）
    private String pdId;//采购折让id（外键）
    private String pddMatterId;//物料编号
    private String pddMatterName;//物料名称
    private String pddSpecifications;//规格型号
    private String pddCompanyName;//单位名称
    private Integer pddAmount;//数量
    private Float pddPrice;//单价
    private Float pddMoney;//金额
    private Float pddTaxRate;//税率
    private Float pddTaxAmount;//税额
    private Float pddDiscountAmount;//折让金额
    private String pddDiscountTax;//折让税额
    private Integer pddTotalDiscount;//折让总额
    private String pddDeferredBalance;//折后余额
    private String psdInvoiceDetails;//发票明细
    private String pddAudition;//是否审核
    private String pddYn;//是否删除（0 否 1 是 ，默认0）
    private String pddCustom1;//自定义1
    private String pddCustom2;//自定义2
    private String pddCustom3;//自定义3
    private String pddCustom4;//自定义4
    private String pddCustom5;//自定义5
    private String pddCustom6;//自定义6
    
    
    

    public Purchase_discount_detailed() {
		super();
	}

	@Override
	public String toString() {
		return "Purchase_discount_detailed [pddId=" + pddId + ", pdId=" + pdId + ", pddMatterId=" + pddMatterId
				+ ", pddMatterName=" + pddMatterName + ", pddSpecifications=" + pddSpecifications + ", pddCompanyName="
				+ pddCompanyName + ", pddAmount=" + pddAmount + ", pddPrice=" + pddPrice + ", pddMoney=" + pddMoney
				+ ", pddTaxRate=" + pddTaxRate + ", pddTaxAmount=" + pddTaxAmount + ", pddDiscountAmount="
				+ pddDiscountAmount + ", pddDiscountTax=" + pddDiscountTax + ", pddTotalDiscount=" + pddTotalDiscount
				+ ", pddDeferredBalance=" + pddDeferredBalance + ", psdInvoiceDetails=" + psdInvoiceDetails
				+ ", pddAudition=" + pddAudition + ", pddYn=" + pddYn + ", pddCustom1=" + pddCustom1 + ", pddCustom2="
				+ pddCustom2 + ", pddCustom3=" + pddCustom3 + ", pddCustom4=" + pddCustom4 + ", pddCustom5="
				+ pddCustom5 + ", pddCustom6=" + pddCustom6 + "]";
	}

	public String getPddId() {
        return pddId;
    }

    public void setPddId(String pddId) {
        this.pddId = pddId == null ? null : pddId.trim();
    }

    public String getPdId() {
        return pdId;
    }

    public void setPdId(String pdId) {
        this.pdId = pdId == null ? null : pdId.trim();
    }

    public String getPddMatterId() {
        return pddMatterId;
    }

    public void setPddMatterId(String pddMatterId) {
        this.pddMatterId = pddMatterId == null ? null : pddMatterId.trim();
    }

    public String getPddMatterName() {
        return pddMatterName;
    }

    public void setPddMatterName(String pddMatterName) {
        this.pddMatterName = pddMatterName == null ? null : pddMatterName.trim();
    }

    public String getPddSpecifications() {
        return pddSpecifications;
    }

    public void setPddSpecifications(String pddSpecifications) {
        this.pddSpecifications = pddSpecifications == null ? null : pddSpecifications.trim();
    }

    public String getPddCompanyName() {
        return pddCompanyName;
    }

    public void setPddCompanyName(String pddCompanyName) {
        this.pddCompanyName = pddCompanyName == null ? null : pddCompanyName.trim();
    }

    public Integer getPddAmount() {
        return pddAmount;
    }

    public void setPddAmount(Integer pddAmount) {
        this.pddAmount = pddAmount;
    }

    public Float getPddPrice() {
        return pddPrice;
    }

    public void setPddPrice(Float pddPrice) {
        this.pddPrice = pddPrice;
    }

    public Float getPddMoney() {
        return pddMoney;
    }

    public void setPddMoney(Float pddMoney) {
        this.pddMoney = pddMoney;
    }

    public Float getPddTaxRate() {
        return pddTaxRate;
    }

    public void setPddTaxRate(Float pddTaxRate) {
        this.pddTaxRate = pddTaxRate;
    }

    public Float getPddTaxAmount() {
        return pddTaxAmount;
    }

    public void setPddTaxAmount(Float pddTaxAmount) {
        this.pddTaxAmount = pddTaxAmount;
    }

    public Float getPddDiscountAmount() {
        return pddDiscountAmount;
    }

    public void setPddDiscountAmount(Float pddDiscountAmount) {
        this.pddDiscountAmount = pddDiscountAmount;
    }

    public String getPddDiscountTax() {
        return pddDiscountTax;
    }

    public void setPddDiscountTax(String pddDiscountTax) {
        this.pddDiscountTax = pddDiscountTax == null ? null : pddDiscountTax.trim();
    }

    public Integer getPddTotalDiscount() {
        return pddTotalDiscount;
    }

    public void setPddTotalDiscount(Integer pddTotalDiscount) {
        this.pddTotalDiscount = pddTotalDiscount;
    }

    public String getPddDeferredBalance() {
        return pddDeferredBalance;
    }

    public void setPddDeferredBalance(String pddDeferredBalance) {
        this.pddDeferredBalance = pddDeferredBalance == null ? null : pddDeferredBalance.trim();
    }

    public String getPsdInvoiceDetails() {
        return psdInvoiceDetails;
    }

    public void setPsdInvoiceDetails(String psdInvoiceDetails) {
        this.psdInvoiceDetails = psdInvoiceDetails == null ? null : psdInvoiceDetails.trim();
    }

    public String getPddAudition() {
        return pddAudition;
    }

    public void setPddAudition(String pddAudition) {
        this.pddAudition = pddAudition == null ? null : pddAudition.trim();
    }

    public String getPddYn() {
        return pddYn;
    }

    public void setPddYn(String pddYn) {
        this.pddYn = pddYn == null ? null : pddYn.trim();
    }

    public String getPddCustom1() {
        return pddCustom1;
    }

    public void setPddCustom1(String pddCustom1) {
        this.pddCustom1 = pddCustom1 == null ? null : pddCustom1.trim();
    }

    public String getPddCustom2() {
        return pddCustom2;
    }

    public void setPddCustom2(String pddCustom2) {
        this.pddCustom2 = pddCustom2 == null ? null : pddCustom2.trim();
    }

    public String getPddCustom3() {
        return pddCustom3;
    }

    public void setPddCustom3(String pddCustom3) {
        this.pddCustom3 = pddCustom3 == null ? null : pddCustom3.trim();
    }

    public String getPddCustom4() {
        return pddCustom4;
    }

    public void setPddCustom4(String pddCustom4) {
        this.pddCustom4 = pddCustom4 == null ? null : pddCustom4.trim();
    }

    public String getPddCustom5() {
        return pddCustom5;
    }

    public void setPddCustom5(String pddCustom5) {
        this.pddCustom5 = pddCustom5 == null ? null : pddCustom5.trim();
    }

    public String getPddCustom6() {
        return pddCustom6;
    }

    public void setPddCustom6(String pddCustom6) {
        this.pddCustom6 = pddCustom6 == null ? null : pddCustom6.trim();
    }
}