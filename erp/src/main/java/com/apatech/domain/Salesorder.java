package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 销售订单主表
 * @author 刘成
 *
 */
public class Salesorder {
    private String soId;//id（主键 唯一）
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date soDocumentTime;//单据时间
    private String soDocumentnumber;//单据号码（根据单据时间自动生成的单据号如（2019122001））
    private String soDeliveryAddress;//送货地址（根据客户编号自动带入送货地址如果没有也可手动添加）
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private String sotId;//销售订单类型
    private String soCustomerorder;//客户订单
    private String soTax;//是否含税（1=是，0=否）
    private String currencyId;//币别id
    private String soOderStatic;//单况（1=未结案，2=已结案，0=无效）
    private String staffId;//业务人员编号
    private String teamId;//所属部门编号（根据业务员自动获取所属部门，也可以根据部门自动获取业务人员）
    private String soMonograph;//制单人（根据登录的账号获取制单人员）(人员表 外键)
    private String soReviewer;//复核人员（根据复核人员获取的复核人员名称、）(人员表 外键)
    private String soSubordinate;//所属项目
    private String soWatchword;//表头条文
    private String soTailclause;//表尾条文
    private String soRemark;//备注
    private String soAccountOwnership;//账款归属
    private String soCollectionTime;//收款时间（自动获取开单时间）
    private String soCollectionMonth;//收款月份
    private String soCollectionTerms;//收款条件
    private String soCollectionTermsDay;//收款条件天数
    private String soAuditing;//是否审核
    private String soYn;//是否删除（0 否 1 是 ，默认0）
    private String soCustom1;//自定义1
    private String soCustom2;//自定义2
    private String soCustom3;//自定义3
    private String soCustom4;//自定义4
    private String soCustom5;//自定义5
    private String soCustom6;//自定义6
    
    

    public Salesorder() {
		super();
	}

	@Override
	public String toString() {
		return "Salesorder [soId=" + soId + ", soDocumentTime=" + soDocumentTime + ", soDocumentnumber="
				+ soDocumentnumber + ", soDeliveryAddress=" + soDeliveryAddress + ", sotId=" + sotId
				+ ", soCustomerorder=" + soCustomerorder + ", soTax=" + soTax + ", currencyId=" + currencyId
				+ ", soOderStatic=" + soOderStatic + ", staffId=" + staffId + ", teamId=" + teamId + ", soMonograph="
				+ soMonograph + ", soReviewer=" + soReviewer + ", soSubordinate=" + soSubordinate + ", soWatchword="
				+ soWatchword + ", soTailclause=" + soTailclause + ", soRemark=" + soRemark + ", soAccountOwnership="
				+ soAccountOwnership + ", soCollectionTime=" + soCollectionTime + ", soCollectionMonth="
				+ soCollectionMonth + ", soCollectionTerms=" + soCollectionTerms + ", soCollectionTermsDay="
				+ soCollectionTermsDay + ", soAuditing=" + soAuditing + ", soYn=" + soYn + ", soCustom1=" + soCustom1
				+ ", soCustom2=" + soCustom2 + ", soCustom3=" + soCustom3 + ", soCustom4=" + soCustom4 + ", soCustom5="
				+ soCustom5 + ", soCustom6=" + soCustom6 + "]";
	}

	public String getSoId() {
        return soId;
    }

    public void setSoId(String soId) {
        this.soId = soId == null ? null : soId.trim();
    }

    public Date getSoDocumentTime() {
        return soDocumentTime;
    }

    public void setSoDocumentTime(Date soDocumentTime) {
        this.soDocumentTime = soDocumentTime;
    }

    public String getSoDocumentnumber() {
        return soDocumentnumber;
    }

    public void setSoDocumentnumber(String soDocumentnumber) {
        this.soDocumentnumber = soDocumentnumber == null ? null : soDocumentnumber.trim();
    }

    public String getSoDeliveryAddress() {
        return soDeliveryAddress;
    }

    public void setSoDeliveryAddress(String soDeliveryAddress) {
        this.soDeliveryAddress = soDeliveryAddress;
    }

    public String getSotId() {
        return sotId;
    }

    public void setSotId(String sotId) {
        this.sotId = sotId;
    }

    public String getSoCustomerorder() {
        return soCustomerorder;
    }

    public void setSoCustomerorder(String soCustomerorder) {
        this.soCustomerorder = soCustomerorder;
    }

    public String getSoTax() {
        return soTax;
    }

    public void setSoTax(String soTax) {
        this.soTax = soTax == null ? null : soTax.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public String getSoOderStatic() {
        return soOderStatic;
    }

    public void setSoOderStatic(String soOderStatic) {
        this.soOderStatic = soOderStatic == null ? null : soOderStatic.trim();
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

    public String getSoMonograph() {
        return soMonograph;
    }

    public void setSoMonograph(String soMonograph) {
        this.soMonograph = soMonograph == null ? null : soMonograph.trim();
    }

    public String getSoReviewer() {
        return soReviewer;
    }

    public void setSoReviewer(String soReviewer) {
        this.soReviewer = soReviewer == null ? null : soReviewer.trim();
    }

    public String getSoSubordinate() {
        return soSubordinate;
    }

    public void setSoSubordinate(String soSubordinate) {
        this.soSubordinate = soSubordinate == null ? null : soSubordinate.trim();
    }

    public String getSoWatchword() {
        return soWatchword;
    }

    public void setSoWatchword(String soWatchword) {
        this.soWatchword = soWatchword == null ? null : soWatchword.trim();
    }

    public String getSoTailclause() {
        return soTailclause;
    }

    public void setSoTailclause(String soTailclause) {
        this.soTailclause = soTailclause == null ? null : soTailclause.trim();
    }

    public String getSoRemark() {
        return soRemark;
    }

    public void setSoRemark(String soRemark) {
        this.soRemark = soRemark == null ? null : soRemark.trim();
    }

    public String getSoAccountOwnership() {
        return soAccountOwnership;
    }

    public void setSoAccountOwnership(String soAccountOwnership) {
        this.soAccountOwnership = soAccountOwnership == null ? null : soAccountOwnership.trim();
    }

    public String getSoCollectionTime() {
        return soCollectionTime;
    }

    public void setSoCollectionTime(String soCollectionTime) {
        this.soCollectionTime = soCollectionTime == null ? null : soCollectionTime.trim();
    }

    public String getSoCollectionMonth() {
        return soCollectionMonth;
    }

    public void setSoCollectionMonth(String soCollectionMonth) {
        this.soCollectionMonth = soCollectionMonth == null ? null : soCollectionMonth.trim();
    }

    public String getSoCollectionTerms() {
        return soCollectionTerms;
    }

    public void setSoCollectionTerms(String soCollectionTerms) {
        this.soCollectionTerms = soCollectionTerms == null ? null : soCollectionTerms.trim();
    }

    public String getSoCollectionTermsDay() {
        return soCollectionTermsDay;
    }

    public void setSoCollectionTermsDay(String soCollectionTermsDay) {
        this.soCollectionTermsDay = soCollectionTermsDay == null ? null : soCollectionTermsDay.trim();
    }

    public String getSoAuditing() {
        return soAuditing;
    }

    public void setSoAuditing(String soAuditing) {
        this.soAuditing = soAuditing == null ? null : soAuditing.trim();
    }

    public String getSoYn() {
        return soYn;
    }

    public void setSoYn(String soYn) {
        this.soYn = soYn == null ? null : soYn.trim();
    }

    public String getSoCustom1() {
        return soCustom1;
    }

    public void setSoCustom1(String soCustom1) {
        this.soCustom1 = soCustom1 == null ? null : soCustom1.trim();
    }

    public String getSoCustom2() {
        return soCustom2;
    }

    public void setSoCustom2(String soCustom2) {
        this.soCustom2 = soCustom2 == null ? null : soCustom2.trim();
    }

    public String getSoCustom3() {
        return soCustom3;
    }

    public void setSoCustom3(String soCustom3) {
        this.soCustom3 = soCustom3 == null ? null : soCustom3.trim();
    }

    public String getSoCustom4() {
        return soCustom4;
    }

    public void setSoCustom4(String soCustom4) {
        this.soCustom4 = soCustom4 == null ? null : soCustom4.trim();
    }

    public String getSoCustom5() {
        return soCustom5;
    }

    public void setSoCustom5(String soCustom5) {
        this.soCustom5 = soCustom5 == null ? null : soCustom5.trim();
    }

    public String getSoCustom6() {
        return soCustom6;
    }

    public void setSoCustom6(String soCustom6) {
        this.soCustom6 = soCustom6 == null ? null : soCustom6.trim();
    }
}