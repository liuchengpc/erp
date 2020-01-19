package com.apatech.domain;

import java.util.Date;

/**
 * 潜在客户需求产品表
 * @author 刘成
 *
 */
public class Customer_demand_products {
    private String cdpId;//物料编号（主键 唯一）
    private String pcId;//潜在客户id
    private String cdpName;//物料名称
    private String cdpSize;//规格型号
    private String cdpUnit;//单位
    private Integer cdpNum;//需求数量
    private Float cdpAffordablePrice;//可承受价
    private Float cdpScheduledQuotation;//预定报价
    private Float cdpCounterpartOffer;//对手报价
    private Date cdpAdvanceDate;//预交日期
    private String cdpRemark;//备注
    private String cdpAuditing;//是否审核
    private String cdpYn;//是否删除（0 否 1 是 ，默认0）
    private String cdpCustom1;//自定栏1
    private String cdpCustom2;//自定栏2
    private String cdpCustom3;//自定栏3
    private String cdpCustom4;//自定栏4
    private String cdpCustom5;//自定栏5
    private String cdpCustom6;//自定栏6
    
    
    

    public Customer_demand_products() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Customer_demand_products [cdpId=" + cdpId + ", pcId=" + pcId + ", cdpName=" + cdpName + ", cdpSize="
				+ cdpSize + ", cdpUnit=" + cdpUnit + ", cdpNum=" + cdpNum + ", cdpAffordablePrice=" + cdpAffordablePrice
				+ ", cdpScheduledQuotation=" + cdpScheduledQuotation + ", cdpCounterpartOffer=" + cdpCounterpartOffer
				+ ", cdpAdvanceDate=" + cdpAdvanceDate + ", cdpRemark=" + cdpRemark + ", cdpAuditing=" + cdpAuditing
				+ ", cdpYn=" + cdpYn + ", cdpCustom1=" + cdpCustom1 + ", cdpCustom2=" + cdpCustom2 + ", cdpCustom3="
				+ cdpCustom3 + ", cdpCustom4=" + cdpCustom4 + ", cdpCustom5=" + cdpCustom5 + ", cdpCustom6="
				+ cdpCustom6 + "]";
	}



	public String getCdpId() {
        return cdpId;
    }

    public void setCdpId(String cdpId) {
        this.cdpId = cdpId == null ? null : cdpId.trim();
    }

    public String getPcId() {
        return pcId;
    }

    public void setPcId(String pcId) {
        this.pcId = pcId == null ? null : pcId.trim();
    }

    public String getCdpName() {
        return cdpName;
    }

    public void setCdpName(String cdpName) {
        this.cdpName = cdpName == null ? null : cdpName.trim();
    }

    public String getCdpSize() {
        return cdpSize;
    }

    public void setCdpSize(String cdpSize) {
        this.cdpSize = cdpSize == null ? null : cdpSize.trim();
    }

    public String getCdpUnit() {
        return cdpUnit;
    }

    public void setCdpUnit(String cdpUnit) {
        this.cdpUnit = cdpUnit == null ? null : cdpUnit.trim();
    }

    public Integer getCdpNum() {
        return cdpNum;
    }

    public void setCdpNum(Integer cdpNum) {
        this.cdpNum = cdpNum;
    }

    public Float getCdpAffordablePrice() {
        return cdpAffordablePrice;
    }

    public void setCdpAffordablePrice(Float cdpAffordablePrice) {
        this.cdpAffordablePrice = cdpAffordablePrice;
    }

    public Float getCdpScheduledQuotation() {
        return cdpScheduledQuotation;
    }

    public void setCdpScheduledQuotation(Float cdpScheduledQuotation) {
        this.cdpScheduledQuotation = cdpScheduledQuotation;
    }

    public Float getCdpCounterpartOffer() {
        return cdpCounterpartOffer;
    }

    public void setCdpCounterpartOffer(Float cdpCounterpartOffer) {
        this.cdpCounterpartOffer = cdpCounterpartOffer;
    }

    public Date getCdpAdvanceDate() {
        return cdpAdvanceDate;
    }

    public void setCdpAdvanceDate(Date cdpAdvanceDate) {
        this.cdpAdvanceDate = cdpAdvanceDate;
    }

    public String getCdpRemark() {
        return cdpRemark;
    }

    public void setCdpRemark(String cdpRemark) {
        this.cdpRemark = cdpRemark == null ? null : cdpRemark.trim();
    }

    public String getCdpAuditing() {
        return cdpAuditing;
    }

    public void setCdpAuditing(String cdpAuditing) {
        this.cdpAuditing = cdpAuditing == null ? null : cdpAuditing.trim();
    }

    public String getCdpYn() {
        return cdpYn;
    }

    public void setCdpYn(String cdpYn) {
        this.cdpYn = cdpYn == null ? null : cdpYn.trim();
    }

    public String getCdpCustom1() {
        return cdpCustom1;
    }

    public void setCdpCustom1(String cdpCustom1) {
        this.cdpCustom1 = cdpCustom1 == null ? null : cdpCustom1.trim();
    }

    public String getCdpCustom2() {
        return cdpCustom2;
    }

    public void setCdpCustom2(String cdpCustom2) {
        this.cdpCustom2 = cdpCustom2 == null ? null : cdpCustom2.trim();
    }

    public String getCdpCustom3() {
        return cdpCustom3;
    }

    public void setCdpCustom3(String cdpCustom3) {
        this.cdpCustom3 = cdpCustom3 == null ? null : cdpCustom3.trim();
    }

    public String getCdpCustom4() {
        return cdpCustom4;
    }

    public void setCdpCustom4(String cdpCustom4) {
        this.cdpCustom4 = cdpCustom4 == null ? null : cdpCustom4.trim();
    }

    public String getCdpCustom5() {
        return cdpCustom5;
    }

    public void setCdpCustom5(String cdpCustom5) {
        this.cdpCustom5 = cdpCustom5 == null ? null : cdpCustom5.trim();
    }

    public String getCdpCustom6() {
        return cdpCustom6;
    }

    public void setCdpCustom6(String cdpCustom6) {
        this.cdpCustom6 = cdpCustom6 == null ? null : cdpCustom6.trim();
    }
}