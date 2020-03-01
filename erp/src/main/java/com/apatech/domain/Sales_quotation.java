package com.apatech.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 销售报价主表
 * @author 刘成
 *
 */
public class Sales_quotation {
	private  String sqId;//id（主键 唯一）
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date sqDocumentTime;//单据时间（默认创建时间）
    private String currencyId;//币别id
    private Float sqExchangeRate;//汇率(根据币别编号获取的汇率)
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date sqEffectiveTime;//有效时间（该报价单截止时间）
    private Integer sqTax;//是否含税（1=是，0=否）默认为0
    private String customerId;//客户编号
    private String sqDeliveryAddress;//送货地址（根据客户编号自动带入送货地址如果没有也可手动添加）
    private String staffId;//业务人员编号
    private String teamId;//所属部门编号（根据业务员自动获取所属部门，也可以根据部门自动获取业务人员）
    private String sqMonograph;//制单人（根据登录的账号获取制单人员）(人员表 外键)
    private String sqReviewer;//复核人员（根据复核人员获取的复核人员名称、）(人员表 外键)
    private String sqWatchword;//表头条文
    private String sqTailclause;//表尾条文
    private String sqRemark;//备注
    private String sqAuditing;//是否审核
    private String sqYn;//是否删除（0 否 1 是 ，默认0）
    private String sqCustom1;//自定义1
    private String sqCustom2;//自定义2
    private String sqCustom3;//自定义3
    private String sqCustom4;//自定义4
    private String sqCustom5;//自定义4
    private String sqCustom6;//自定义5
    
    private String teamName;//连表查部门姓名
    
    /**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Sales_quotation() {
		super();
	}

	@Override
	public String toString() {
		return "Sales_quotation [sqId=" + sqId + ", sqDocumentTime=" + sqDocumentTime + ", currencyId=" + currencyId
				+ ", sqExchangeRate=" + sqExchangeRate + ", sqEffectiveTime=" + sqEffectiveTime + ", sqTax=" + sqTax
				+ ", customerId=" + customerId + ", sqDeliveryAddress=" + sqDeliveryAddress + ", staffId=" + staffId
				+ ", teamId=" + teamId + ", sqMonograph=" + sqMonograph + ", sqReviewer=" + sqReviewer
				+ ", sqWatchword=" + sqWatchword + ", sqTailclause=" + sqTailclause + ", sqRemark=" + sqRemark
				+ ", sqAuditing=" + sqAuditing + ", sqYn=" + sqYn + ", sqCustom1=" + sqCustom1 + ", sqCustom2="
				+ sqCustom2 + ", sqCustom3=" + sqCustom3 + ", sqCustom4=" + sqCustom4 + ", sqCustom5=" + sqCustom5
				+ ", sqCustom6=" + sqCustom6 + "]";
	}

	public  String getSqId(){
        return sqId;
    }

    public void setSqId(String sqId) {
        this.sqId = sqId == null ? null : sqId.trim();
    }

    public Date getSqDocumentTime() {
        return sqDocumentTime;
    }

    public void setSqDocumentTime(Date sqDocumentTime) {
        this.sqDocumentTime = sqDocumentTime;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public Float getSqExchangeRate() {
        return sqExchangeRate;
    }

    public void setSqExchangeRate(Float sqExchangeRate) {
        this.sqExchangeRate = sqExchangeRate;
    }

    public Date getSqEffectiveTime() {
        return sqEffectiveTime;
    }

    public void setSqEffectiveTime(Date sqEffectiveTime) {
        this.sqEffectiveTime = sqEffectiveTime;
    }

    public Integer getSqTax() {
        return sqTax;
    }

    public void setSqTax(Integer sqTax) {
        this.sqTax = sqTax;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getSqDeliveryAddress() {
        return sqDeliveryAddress;
    }

    public void setSqDeliveryAddress(String sqDeliveryAddress) {
        this.sqDeliveryAddress = sqDeliveryAddress == null ? null : sqDeliveryAddress.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public String getSqMonograph() {
        return sqMonograph;
    }

    public void setSqMonograph(String sqMonograph) {
        this.sqMonograph = sqMonograph == null ? null : sqMonograph.trim();
    }

    public String getSqReviewer() {
        return sqReviewer;
    }

    public void setSqReviewer(String sqReviewer) {
        this.sqReviewer = sqReviewer == null ? null : sqReviewer.trim();
    }

    public String getSqWatchword() {
        return sqWatchword;
    }

    public void setSqWatchword(String sqWatchword) {
        this.sqWatchword = sqWatchword == null ? null : sqWatchword.trim();
    }

    public String getSqTailclause() {
        return sqTailclause;
    }

    public void setSqTailclause(String sqTailclause) {
        this.sqTailclause = sqTailclause == null ? null : sqTailclause.trim();
    }

    public String getSqRemark() {
        return sqRemark;
    }

    public void setSqRemark(String sqRemark) {
        this.sqRemark = sqRemark == null ? null : sqRemark.trim();
    }

    public String getSqAuditing() {
        return sqAuditing;
    }

    public void setSqAuditing(String sqAuditing) {
        this.sqAuditing = sqAuditing == null ? null : sqAuditing.trim();
    }

    public String getSqYn() {
        return sqYn;
    }

    public void setSqYn(String sqYn) {
        this.sqYn = sqYn == null ? null : sqYn.trim();
    }

    public String getSqCustom1() {
        return sqCustom1;
    }

    public void setSqCustom1(String sqCustom1) {
        this.sqCustom1 = sqCustom1 == null ? null : sqCustom1.trim();
    }

    public String getSqCustom2() {
        return sqCustom2;
    }

    public void setSqCustom2(String sqCustom2) {
        this.sqCustom2 = sqCustom2 == null ? null : sqCustom2.trim();
    }

    public String getSqCustom3() {
        return sqCustom3;
    }

    public void setSqCustom3(String sqCustom3) {
        this.sqCustom3 = sqCustom3 == null ? null : sqCustom3.trim();
    }

    public String getSqCustom4() {
        return sqCustom4;
    }

    public void setSqCustom4(String sqCustom4) {
        this.sqCustom4 = sqCustom4 == null ? null : sqCustom4.trim();
    }

    public String getSqCustom5() {
        return sqCustom5;
    }

    public void setSqCustom5(String sqCustom5) {
        this.sqCustom5 = sqCustom5 == null ? null : sqCustom5.trim();
    }

    public String getSqCustom6() {
        return sqCustom6;
    }

    public void setSqCustom6(String sqCustom6) {
        this.sqCustom6 = sqCustom6 == null ? null : sqCustom6.trim();
    }
}