package com.apatech.domain;

import java.util.Date;

/**
 * 销售报价表详表
 * @author 刘成
 *
 */
public class Sales_quotation_details {
    private String sqdId;//id（主键 唯一）
    private Date sqdDocumentTime;//单据时间（默认为创建时间）
    private String sqdDocumentnumber;//单据号码（根据单据时间自动生成的单据号如（2019122001））
    private String sqdDeliveryAddress;//送货地址（根据客户编号自动带入送货地址如果没有也可手动添加）
    private String sotId;//销售订单类型
    private String sqdCustomerorder;//客户订单
    private Integer sqdTax;//是否含税（1=是，0=否）
    private String currencyId;//币别id
    private Integer sqdOderStatic;//单况（0=未结案，1=已结案，2=无效）默认为0
    private String staffId;//业务人员编号
    private String teamId;//所属部门编号（根据业务员自动获取所属部门，也可以根据部门自动获取业务人员）
    private String sqdMonograph;//制单人（根据登录的账号获取制单人员）(人员表 外键)
    private String sqdReviewer;//复核人员（根据复核人员获取的复核人员名称、）(人员表 外键)
    private String sqdSubordinate;//所属项目
    private String sqdWatchword;//表头条文
    private String sqdTailclause;//表尾条文
    private String sqdRemark;//备注
    private String sqdAccountOwnership;//账款归属
    private Date sqdCollectionTime;//收款时间（自动获取开单时间）
    private Date sqdCollectionMonth;//收款月份
    private String sqdCollectionTerms;//收款条件
    private String sqdCollectionTermsDay;//收款条件天数
    private String sqdAuditing;//是否审核
    private String sqdYn;//是否删除（0 否 1 是 ，默认0）
    private String sqdCustom1;//自定义1
    private String sqdCustom2;//自定义2
    private String sqdCustom3;//自定义3
    private String sqdCustom4;//自定义4
    private String sqdCustom5;//自定义5
    private String sqdCustom6;//自定义6
    
    

    public Sales_quotation_details() {
		super();
	}

	@Override
	public String toString() {
		return "Sales_quotation_details [sqdId=" + sqdId + ", sqdDocumentTime=" + sqdDocumentTime
				+ ", sqdDocumentnumber=" + sqdDocumentnumber + ", sqdDeliveryAddress=" + sqdDeliveryAddress + ", sotId="
				+ sotId + ", sqdCustomerorder=" + sqdCustomerorder + ", sqdTax=" + sqdTax + ", currencyId=" + currencyId
				+ ", sqdOderStatic=" + sqdOderStatic + ", staffId=" + staffId + ", teamId=" + teamId + ", sqdMonograph="
				+ sqdMonograph + ", sqdReviewer=" + sqdReviewer + ", sqdSubordinate=" + sqdSubordinate
				+ ", sqdWatchword=" + sqdWatchword + ", sqdTailclause=" + sqdTailclause + ", sqdRemark=" + sqdRemark
				+ ", sqdAccountOwnership=" + sqdAccountOwnership + ", sqdCollectionTime=" + sqdCollectionTime
				+ ", sqdCollectionMonth=" + sqdCollectionMonth + ", sqdCollectionTerms=" + sqdCollectionTerms
				+ ", sqdCollectionTermsDay=" + sqdCollectionTermsDay + ", sqdAuditing=" + sqdAuditing + ", sqdYn="
				+ sqdYn + ", sqdCustom1=" + sqdCustom1 + ", sqdCustom2=" + sqdCustom2 + ", sqdCustom3=" + sqdCustom3
				+ ", sqdCustom4=" + sqdCustom4 + ", sqdCustom5=" + sqdCustom5 + ", sqdCustom6=" + sqdCustom6 + "]";
	}

	public String getSqdId() {
        return sqdId;
    }

    public void setSqdId(String sqdId) {
        this.sqdId = sqdId == null ? null : sqdId.trim();
    }

    public Date getSqdDocumentTime() {
        return sqdDocumentTime;
    }

    public void setSqdDocumentTime(Date sqdDocumentTime) {
        this.sqdDocumentTime = sqdDocumentTime;
    }

    public String getSqdDocumentnumber() {
        return sqdDocumentnumber;
    }

    public void setSqdDocumentnumber(String sqdDocumentnumber) {
        this.sqdDocumentnumber = sqdDocumentnumber == null ? null : sqdDocumentnumber.trim();
    }

    public String getSqdDeliveryAddress() {
        return sqdDeliveryAddress;
    }

    public void setSqdDeliveryAddress(String sqdDeliveryAddress) {
        this.sqdDeliveryAddress = sqdDeliveryAddress == null ? null : sqdDeliveryAddress.trim();
    }

    public String getSotId() {
        return sotId;
    }

    public void setSotId(String sotId) {
        this.sotId = sotId == null ? null : sotId.trim();
    }

    public String getSqdCustomerorder() {
        return sqdCustomerorder;
    }

    public void setSqdCustomerorder(String sqdCustomerorder) {
        this.sqdCustomerorder = sqdCustomerorder == null ? null : sqdCustomerorder.trim();
    }

    public Integer getSqdTax() {
        return sqdTax;
    }

    public void setSqdTax(Integer sqdTax) {
        this.sqdTax = sqdTax;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public Integer getSqdOderStatic() {
        return sqdOderStatic;
    }

    public void setSqdOderStatic(Integer sqdOderStatic) {
        this.sqdOderStatic = sqdOderStatic;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public String getSqdMonograph() {
        return sqdMonograph;
    }

    public void setSqdMonograph(String sqdMonograph) {
        this.sqdMonograph = sqdMonograph == null ? null : sqdMonograph.trim();
    }

    public String getSqdReviewer() {
        return sqdReviewer;
    }

    public void setSqdReviewer(String sqdReviewer) {
        this.sqdReviewer = sqdReviewer == null ? null : sqdReviewer.trim();
    }

    public String getSqdSubordinate() {
        return sqdSubordinate;
    }

    public void setSqdSubordinate(String sqdSubordinate) {
        this.sqdSubordinate = sqdSubordinate == null ? null : sqdSubordinate.trim();
    }

    public String getSqdWatchword() {
        return sqdWatchword;
    }

    public void setSqdWatchword(String sqdWatchword) {
        this.sqdWatchword = sqdWatchword == null ? null : sqdWatchword.trim();
    }

    public String getSqdTailclause() {
        return sqdTailclause;
    }

    public void setSqdTailclause(String sqdTailclause) {
        this.sqdTailclause = sqdTailclause == null ? null : sqdTailclause.trim();
    }

    public String getSqdRemark() {
        return sqdRemark;
    }

    public void setSqdRemark(String sqdRemark) {
        this.sqdRemark = sqdRemark == null ? null : sqdRemark.trim();
    }

    public String getSqdAccountOwnership() {
        return sqdAccountOwnership;
    }

    public void setSqdAccountOwnership(String sqdAccountOwnership) {
        this.sqdAccountOwnership = sqdAccountOwnership == null ? null : sqdAccountOwnership.trim();
    }

    public Date getSqdCollectionTime() {
        return sqdCollectionTime;
    }

    public void setSqdCollectionTime(Date sqdCollectionTime) {
        this.sqdCollectionTime = sqdCollectionTime;
    }

    public Date getSqdCollectionMonth() {
        return sqdCollectionMonth;
    }

    public void setSqdCollectionMonth(Date sqdCollectionMonth) {
        this.sqdCollectionMonth = sqdCollectionMonth;
    }

    public String getSqdCollectionTerms() {
        return sqdCollectionTerms;
    }

    public void setSqdCollectionTerms(String sqdCollectionTerms) {
        this.sqdCollectionTerms = sqdCollectionTerms == null ? null : sqdCollectionTerms.trim();
    }

    public String getSqdCollectionTermsDay() {
        return sqdCollectionTermsDay;
    }

    public void setSqdCollectionTermsDay(String sqdCollectionTermsDay) {
        this.sqdCollectionTermsDay = sqdCollectionTermsDay == null ? null : sqdCollectionTermsDay.trim();
    }

    public String getSqdAuditing() {
        return sqdAuditing;
    }

    public void setSqdAuditing(String sqdAuditing) {
        this.sqdAuditing = sqdAuditing == null ? null : sqdAuditing.trim();
    }

    public String getSqdYn() {
        return sqdYn;
    }

    public void setSqdYn(String sqdYn) {
        this.sqdYn = sqdYn == null ? null : sqdYn.trim();
    }

    public String getSqdCustom1() {
        return sqdCustom1;
    }

    public void setSqdCustom1(String sqdCustom1) {
        this.sqdCustom1 = sqdCustom1 == null ? null : sqdCustom1.trim();
    }

    public String getSqdCustom2() {
        return sqdCustom2;
    }

    public void setSqdCustom2(String sqdCustom2) {
        this.sqdCustom2 = sqdCustom2 == null ? null : sqdCustom2.trim();
    }

    public String getSqdCustom3() {
        return sqdCustom3;
    }

    public void setSqdCustom3(String sqdCustom3) {
        this.sqdCustom3 = sqdCustom3 == null ? null : sqdCustom3.trim();
    }

    public String getSqdCustom4() {
        return sqdCustom4;
    }

    public void setSqdCustom4(String sqdCustom4) {
        this.sqdCustom4 = sqdCustom4 == null ? null : sqdCustom4.trim();
    }

    public String getSqdCustom5() {
        return sqdCustom5;
    }

    public void setSqdCustom5(String sqdCustom5) {
        this.sqdCustom5 = sqdCustom5 == null ? null : sqdCustom5.trim();
    }

    public String getSqdCustom6() {
        return sqdCustom6;
    }

    public void setSqdCustom6(String sqdCustom6) {
        this.sqdCustom6 = sqdCustom6 == null ? null : sqdCustom6.trim();
    }
}