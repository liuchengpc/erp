package com.apatech.domain;

/**
 * 采购询价详表
 * @author 刘成
 *
 */
public class Purchase_inquiry_detailed {
    private String didId;//id（主键 唯一）
    private String piId;//采购询价id（外键）
    private String didMatterId;//物料编号
    private String didMatterName;//物料名称
    private String didSpecifications;//规格型号
    private String didCompanyName;//单位名称
    private Integer didAmount;//数量
    private Float didMoneyDiscountBefore;//折扣前单价
    private String didDiscountNumber;//折数
    private Float didPrice;//单价
    private Float didMoney;//金额
    private Float didTaxRate;//税率
    private Float didTaxAmount;//税额
    private Float didIncludeTaxAmount;//含税金额
    private String didIfgift;//是否是赠品（0 否 1 是）
    private String didRemarks;//分录备注
    private String didSourceOrder;//来源单别
    private String didSourceNo;//来源单号
    private String didAudition;//是否审核
    private String didYn;//是否删除（0 否 1 是 ，默认0）
    private String didCustom1;//自定义1
    private String didCustom2;//自定义2
    private String didCustom3;//自定义3
    private String didCustom4;//自定义4
    private String didCustom5;//自定义5
    private String didCustom6;//自定义6
    
    

    public Purchase_inquiry_detailed() {
		super();
	}

	@Override
	public String toString() {
		return "Purchase_inquiry_detailed [didId=" + didId + ", piId=" + piId + ", didMatterId=" + didMatterId
				+ ", didMatterName=" + didMatterName + ", didSpecifications=" + didSpecifications + ", didCompanyName="
				+ didCompanyName + ", didAmount=" + didAmount + ", didMoneyDiscountBefore=" + didMoneyDiscountBefore
				+ ", didDiscountNumber=" + didDiscountNumber + ", didPrice=" + didPrice + ", didMoney=" + didMoney
				+ ", didTaxRate=" + didTaxRate + ", didTaxAmount=" + didTaxAmount + ", didIncludeTaxAmount="
				+ didIncludeTaxAmount + ", didIfgift=" + didIfgift + ", didRemarks=" + didRemarks + ", didSourceOrder="
				+ didSourceOrder + ", didSourceNo=" + didSourceNo + ", didAudition=" + didAudition + ", didYn=" + didYn
				+ ", didCustom1=" + didCustom1 + ", didCustom2=" + didCustom2 + ", didCustom3=" + didCustom3
				+ ", didCustom4=" + didCustom4 + ", didCustom5=" + didCustom5 + ", didCustom6=" + didCustom6 + "]";
	}

	public String getDidId() {
        return didId;
    }

    public void setDidId(String didId) {
        this.didId = didId == null ? null : didId.trim();
    }

    public String getPiId() {
        return piId;
    }

    public void setPiId(String piId) {
        this.piId = piId == null ? null : piId.trim();
    }

    public String getDidMatterId() {
        return didMatterId;
    }

    public void setDidMatterId(String didMatterId) {
        this.didMatterId = didMatterId == null ? null : didMatterId.trim();
    }

    public String getDidMatterName() {
        return didMatterName;
    }

    public void setDidMatterName(String didMatterName) {
        this.didMatterName = didMatterName == null ? null : didMatterName.trim();
    }

    public String getDidSpecifications() {
        return didSpecifications;
    }

    public void setDidSpecifications(String didSpecifications) {
        this.didSpecifications = didSpecifications == null ? null : didSpecifications.trim();
    }

    public String getDidCompanyName() {
        return didCompanyName;
    }

    public void setDidCompanyName(String didCompanyName) {
        this.didCompanyName = didCompanyName == null ? null : didCompanyName.trim();
    }

    public Integer getDidAmount() {
        return didAmount;
    }

    public void setDidAmount(Integer didAmount) {
        this.didAmount = didAmount;
    }

    public Float getDidMoneyDiscountBefore() {
        return didMoneyDiscountBefore;
    }

    public void setDidMoneyDiscountBefore(Float didMoneyDiscountBefore) {
        this.didMoneyDiscountBefore = didMoneyDiscountBefore;
    }

    public String getDidDiscountNumber() {
        return didDiscountNumber;
    }

    public void setDidDiscountNumber(String didDiscountNumber) {
        this.didDiscountNumber = didDiscountNumber == null ? null : didDiscountNumber.trim();
    }

    public Float getDidPrice() {
        return didPrice;
    }

    public void setDidPrice(Float didPrice) {
        this.didPrice = didPrice;
    }

    public Float getDidMoney() {
        return didMoney;
    }

    public void setDidMoney(Float didMoney) {
        this.didMoney = didMoney;
    }

    public Float getDidTaxRate() {
        return didTaxRate;
    }

    public void setDidTaxRate(Float didTaxRate) {
        this.didTaxRate = didTaxRate;
    }

    public Float getDidTaxAmount() {
        return didTaxAmount;
    }

    public void setDidTaxAmount(Float didTaxAmount) {
        this.didTaxAmount = didTaxAmount;
    }

    public Float getDidIncludeTaxAmount() {
        return didIncludeTaxAmount;
    }

    public void setDidIncludeTaxAmount(Float didIncludeTaxAmount) {
        this.didIncludeTaxAmount = didIncludeTaxAmount;
    }

    public String getDidIfgift() {
        return didIfgift;
    }

    public void setDidIfgift(String didIfgift) {
        this.didIfgift = didIfgift == null ? null : didIfgift.trim();
    }

    public String getDidRemarks() {
        return didRemarks;
    }

    public void setDidRemarks(String didRemarks) {
        this.didRemarks = didRemarks == null ? null : didRemarks.trim();
    }

    public String getDidSourceOrder() {
        return didSourceOrder;
    }

    public void setDidSourceOrder(String didSourceOrder) {
        this.didSourceOrder = didSourceOrder == null ? null : didSourceOrder.trim();
    }

    public String getDidSourceNo() {
        return didSourceNo;
    }

    public void setDidSourceNo(String didSourceNo) {
        this.didSourceNo = didSourceNo == null ? null : didSourceNo.trim();
    }

    public String getDidAudition() {
        return didAudition;
    }

    public void setDidAudition(String didAudition) {
        this.didAudition = didAudition == null ? null : didAudition.trim();
    }

    public String getDidYn() {
        return didYn;
    }

    public void setDidYn(String didYn) {
        this.didYn = didYn == null ? null : didYn.trim();
    }

    public String getDidCustom1() {
        return didCustom1;
    }

    public void setDidCustom1(String didCustom1) {
        this.didCustom1 = didCustom1 == null ? null : didCustom1.trim();
    }

    public String getDidCustom2() {
        return didCustom2;
    }

    public void setDidCustom2(String didCustom2) {
        this.didCustom2 = didCustom2 == null ? null : didCustom2.trim();
    }

    public String getDidCustom3() {
        return didCustom3;
    }

    public void setDidCustom3(String didCustom3) {
        this.didCustom3 = didCustom3 == null ? null : didCustom3.trim();
    }

    public String getDidCustom4() {
        return didCustom4;
    }

    public void setDidCustom4(String didCustom4) {
        this.didCustom4 = didCustom4 == null ? null : didCustom4.trim();
    }

    public String getDidCustom5() {
        return didCustom5;
    }

    public void setDidCustom5(String didCustom5) {
        this.didCustom5 = didCustom5 == null ? null : didCustom5.trim();
    }

    public String getDidCustom6() {
        return didCustom6;
    }

    public void setDidCustom6(String didCustom6) {
        this.didCustom6 = didCustom6 == null ? null : didCustom6.trim();
    }
}