package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 潜在客户表
 * @author 刘成
 *
 */
public class Potential_customer {
    private String pcId;//客户id（主键 唯一）
    private String pcName;//客户全称
    private String pcEasyname;//客户简称
    private String pcEnglishName;//英文全称
    private String pcChargePerson;//英文简称
    private String pcType;//类别
    private String pcArea;//地区
    private String currencyId;//币别id
    private String cgId;//客户等级id
    private String nsId;//洽谈阶段id
    private Float pcProbabilitySuccess;//成功几率（%）
    private String pcDecisionMaker;//决策者
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date pcNegotiationDate;//洽谈日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date pcAppointmentVisitDate;//预约拜访日
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date pcRecentVisitDate;//最近拜访日
    private Float pcEstimatedTurnover;//预估成交额
    private String pcCustomerProfile;//客户简介
    private String pcPrincipalman;//负责人
    private String pcLinkman;//联系人    
    private String pcLinktela;//联系电话一
    private String pcLinktelb;//联系电话二
    private String pcLinktelc;//联系电话三
    private String pcMobilephone;//移动电话
    private String adaId;//银行账号
    private String bankId;//开户银行id
    private String pcServicer;//业务人员（外键）
    private String pcTaxcheckno;//税务登记号
    private Float pcCapitalmoney;//资本额
    private String pcJob;//行业别
    private String pcEmail;//电子邮件
    private String pcWebadd;//网址
    private String pcFaxno;//传真号码
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date pcExpiryDate;//失效日期
    private String pcSalelv;//售价等级
    private String receivableId;////应收账款科目(关联会计科目表account_id)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date pcCuendorderday;//每月结账日
    private String itAccountsEceivableSubject;//应收账款科目(关联会计科目表account_id)
    private Float pcDiscountpoint;//折数
    private String pcHonestlv;//信用等级
    private Integer pcCuiftax;//是否含税（0，1）
    private String itDepositReceivedSubject;//预收账款科目id(关联会计科目表account_id)
    private String pcRemark;//备注
    private String pcAuditing;//是否审核
    private String pcYn;//是否删除（0 否 1 是 ，默认0）
    private String pcCustom1;//自定义1
    private String pcCustom2;//自定义2
    private String pcCustom3;//自定义3
    private String pcCustom4;//自定义4
    private String pcCustom5;//自定义5
    private String pcCustom6;//自定义6

    
    
    
    
    public Potential_customer() {
		super();
	}

	@Override
	public String toString() {
		return "Potential_customer [pcId=" + pcId + ", pcName=" + pcName + ", pcEasyname=" + pcEasyname
				+ ", pcEnglishName=" + pcEnglishName + ", pcChargePerson=" + pcChargePerson + ", pcType=" + pcType
				+ ", pcArea=" + pcArea + ", currencyId=" + currencyId + ", cgId=" + cgId + ", nsId=" + nsId
				+ ", pcProbabilitySuccess=" + pcProbabilitySuccess + ", pcDecisionMaker=" + pcDecisionMaker
				+ ", pcNegotiationDate=" + pcNegotiationDate + ", pcAppointmentVisitDate=" + pcAppointmentVisitDate
				+ ", pcRecentVisitDate=" + pcRecentVisitDate + ", pcEstimatedTurnover=" + pcEstimatedTurnover
				+ ", pcCustomerProfile=" + pcCustomerProfile + ", pcPrincipalman=" + pcPrincipalman + ", pcLinkman="
				+ pcLinkman + ", pcLinktela=" + pcLinktela + ", pcLinktelb=" + pcLinktelb + ", pcLinktelc=" + pcLinktelc
				+ ", pcMobilephone=" + pcMobilephone + ", adaId=" + adaId + ", bankId=" + bankId + ", pcServicer="
				+ pcServicer + ", pcTaxcheckno=" + pcTaxcheckno + ", pcCapitalmoney=" + pcCapitalmoney + ", pcJob="
				+ pcJob + ", pcEmail=" + pcEmail + ", pcWebadd=" + pcWebadd + ", pcFaxno=" + pcFaxno + ", pcExpiryDate="
				+ pcExpiryDate + ", pcSalelv=" + pcSalelv + ", receivableId=" + receivableId + ", pcCuendorderday="
				+ pcCuendorderday + ", itAccountsEceivableSubject=" + itAccountsEceivableSubject + ", pcDiscountpoint="
				+ pcDiscountpoint + ", pcHonestlv=" + pcHonestlv + ", pcCuiftax=" + pcCuiftax
				+ ", itDepositReceivedSubject=" + itDepositReceivedSubject + ", pcRemark=" + pcRemark + ", pcAuditing="
				+ pcAuditing + ", pcYn=" + pcYn + ", pcCustom1=" + pcCustom1 + ", pcCustom2=" + pcCustom2
				+ ", pcCustom3=" + pcCustom3 + ", pcCustom4=" + pcCustom4 + ", pcCustom5=" + pcCustom5 + ", pcCustom6="
				+ pcCustom6 + "]";
	}

	public String getPcId() {
        return pcId;
    }

    public void setPcId(String pcId) {
        this.pcId = pcId == null ? null : pcId.trim();
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName == null ? null : pcName.trim();
    }

    public String getPcEasyname() {
        return pcEasyname;
    }

    public void setPcEasyname(String pcEasyname) {
        this.pcEasyname = pcEasyname == null ? null : pcEasyname.trim();
    }

    public String getPcEnglishName() {
        return pcEnglishName;
    }

    public void setPcEnglishName(String pcEnglishName) {
        this.pcEnglishName = pcEnglishName == null ? null : pcEnglishName.trim();
    }

    public String getPcChargePerson() {
        return pcChargePerson;
    }

    public void setPcChargePerson(String pcChargePerson) {
        this.pcChargePerson = pcChargePerson == null ? null : pcChargePerson.trim();
    }

    public String getPcType() {
        return pcType;
    }

    public void setPcType(String pcType) {
        this.pcType = pcType == null ? null : pcType.trim();
    }

    public String getPcArea() {
        return pcArea;
    }

    public void setPcArea(String pcArea) {
        this.pcArea = pcArea == null ? null : pcArea.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public String getCgId() {
        return cgId;
    }

    public void setCgId(String cgId) {
        this.cgId = cgId == null ? null : cgId.trim();
    }

    public String getNsId() {
        return nsId;
    }

    public void setNsId(String nsId) {
        this.nsId = nsId == null ? null : nsId.trim();
    }

    public Float getPcProbabilitySuccess() {
        return pcProbabilitySuccess;
    }

    public void setPcProbabilitySuccess(Float pcProbabilitySuccess) {
        this.pcProbabilitySuccess = pcProbabilitySuccess;
    }

    public String getPcDecisionMaker() {
        return pcDecisionMaker;
    }

    public void setPcDecisionMaker(String pcDecisionMaker) {
        this.pcDecisionMaker = pcDecisionMaker == null ? null : pcDecisionMaker.trim();
    }

    public Date getPcNegotiationDate() {
        return pcNegotiationDate;
    }

    public void setPcNegotiationDate(Date pcNegotiationDate) {
        this.pcNegotiationDate = pcNegotiationDate;
    }

    public Date getPcAppointmentVisitDate() {
        return pcAppointmentVisitDate;
    }

    public void setPcAppointmentVisitDate(Date pcAppointmentVisitDate) {
        this.pcAppointmentVisitDate = pcAppointmentVisitDate;
    }

    public Date getPcRecentVisitDate() {
        return pcRecentVisitDate;
    }

    public void setPcRecentVisitDate(Date pcRecentVisitDate) {
        this.pcRecentVisitDate = pcRecentVisitDate;
    }

    public Float getPcEstimatedTurnover() {
        return pcEstimatedTurnover;
    }

    public void setPcEstimatedTurnover(Float pcEstimatedTurnover) {
        this.pcEstimatedTurnover = pcEstimatedTurnover;
    }

    public String getPcCustomerProfile() {
        return pcCustomerProfile;
    }

    public void setPcCustomerProfile(String pcCustomerProfile) {
        this.pcCustomerProfile = pcCustomerProfile == null ? null : pcCustomerProfile.trim();
    }

    public String getPcPrincipalman() {
        return pcPrincipalman;
    }

    public void setPcPrincipalman(String pcPrincipalman) {
        this.pcPrincipalman = pcPrincipalman == null ? null : pcPrincipalman.trim();
    }

    public String getPcLinkman() {
        return pcLinkman;
    }

    public void setPcLinkman(String pcLinkman) {
        this.pcLinkman = pcLinkman == null ? null : pcLinkman.trim();
    }

    public String getPcLinktela() {
        return pcLinktela;
    }

    public void setPcLinktela(String pcLinktela) {
        this.pcLinktela = pcLinktela == null ? null : pcLinktela.trim();
    }

    public String getPcLinktelb() {
        return pcLinktelb;
    }

    public void setPcLinktelb(String pcLinktelb) {
        this.pcLinktelb = pcLinktelb == null ? null : pcLinktelb.trim();
    }

    public String getPcLinktelc() {
        return pcLinktelc;
    }

    public void setPcLinktelc(String pcLinktelc) {
        this.pcLinktelc = pcLinktelc == null ? null : pcLinktelc.trim();
    }

    public String getPcMobilephone() {
        return pcMobilephone;
    }

    public void setPcMobilephone(String pcMobilephone) {
        this.pcMobilephone = pcMobilephone == null ? null : pcMobilephone.trim();
    }

    public String getAdaId() {
        return adaId;
    }

    public void setAdaId(String adaId) {
        this.adaId = adaId == null ? null : adaId.trim();
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getPcServicer() {
        return pcServicer;
    }

    public void setPcServicer(String pcServicer) {
        this.pcServicer = pcServicer == null ? null : pcServicer.trim();
    }

    public String getPcTaxcheckno() {
        return pcTaxcheckno;
    }

    public void setPcTaxcheckno(String pcTaxcheckno) {
        this.pcTaxcheckno = pcTaxcheckno == null ? null : pcTaxcheckno.trim();
    }

    public Float getPcCapitalmoney() {
        return pcCapitalmoney;
    }

    public void setPcCapitalmoney(Float pcCapitalmoney) {
        this.pcCapitalmoney = pcCapitalmoney;
    }

    public String getPcJob() {
        return pcJob;
    }

    public void setPcJob(String pcJob) {
        this.pcJob = pcJob == null ? null : pcJob.trim();
    }

    public String getPcEmail() {
        return pcEmail;
    }

    public void setPcEmail(String pcEmail) {
        this.pcEmail = pcEmail == null ? null : pcEmail.trim();
    }

    public String getPcWebadd() {
        return pcWebadd;
    }

    public void setPcWebadd(String pcWebadd) {
        this.pcWebadd = pcWebadd == null ? null : pcWebadd.trim();
    }

    public String getPcFaxno() {
        return pcFaxno;
    }

    public void setPcFaxno(String pcFaxno) {
        this.pcFaxno = pcFaxno == null ? null : pcFaxno.trim();
    }

    public Date getPcExpiryDate() {
        return pcExpiryDate;
    }

    public void setPcExpiryDate(Date pcExpiryDate) {
        this.pcExpiryDate = pcExpiryDate;
    }

    public String getPcSalelv() {
        return pcSalelv;
    }

    public void setPcSalelv(String pcSalelv) {
        this.pcSalelv = pcSalelv == null ? null : pcSalelv.trim();
    }

    public String getReceivableId() {
        return receivableId;
    }

    public void setReceivableId(String receivableId) {
        this.receivableId = receivableId == null ? null : receivableId.trim();
    }

    public Date getPcCuendorderday() {
        return pcCuendorderday;
    }

    public void setPcCuendorderday(Date pcCuendorderday) {
        this.pcCuendorderday = pcCuendorderday;
    }

    public String getItAccountsEceivableSubject() {
        return itAccountsEceivableSubject;
    }

    public void setItAccountsEceivableSubject(String itAccountsEceivableSubject) {
        this.itAccountsEceivableSubject = itAccountsEceivableSubject == null ? null : itAccountsEceivableSubject.trim();
    }

    public Float getPcDiscountpoint() {
        return pcDiscountpoint;
    }

    public void setPcDiscountpoint(Float pcDiscountpoint) {
        this.pcDiscountpoint = pcDiscountpoint;
    }

    public String getPcHonestlv() {
        return pcHonestlv;
    }

    public void setPcHonestlv(String pcHonestlv) {
        this.pcHonestlv = pcHonestlv == null ? null : pcHonestlv.trim();
    }

    public Integer getPcCuiftax() {
        return pcCuiftax;
    }

    public void setPcCuiftax(Integer pcCuiftax) {
        this.pcCuiftax = pcCuiftax;
    }

    public String getItDepositReceivedSubject() {
        return itDepositReceivedSubject;
    }

    public void setItDepositReceivedSubject(String itDepositReceivedSubject) {
        this.itDepositReceivedSubject = itDepositReceivedSubject == null ? null : itDepositReceivedSubject.trim();
    }

    public String getPcRemark() {
        return pcRemark;
    }

    public void setPcRemark(String pcRemark) {
        this.pcRemark = pcRemark == null ? null : pcRemark.trim();
    }

    public String getPcAuditing() {
        return pcAuditing;
    }

    public void setPcAuditing(String pcAuditing) {
        this.pcAuditing = pcAuditing == null ? null : pcAuditing.trim();
    }

    public String getPcYn() {
        return pcYn;
    }

    public void setPcYn(String pcYn) {
        this.pcYn = pcYn == null ? null : pcYn.trim();
    }

    public String getPcCustom1() {
        return pcCustom1;
    }

    public void setPcCustom1(String pcCustom1) {
        this.pcCustom1 = pcCustom1 == null ? null : pcCustom1.trim();
    }

    public String getPcCustom2() {
        return pcCustom2;
    }

    public void setPcCustom2(String pcCustom2) {
        this.pcCustom2 = pcCustom2 == null ? null : pcCustom2.trim();
    }

    public String getPcCustom3() {
        return pcCustom3;
    }

    public void setPcCustom3(String pcCustom3) {
        this.pcCustom3 = pcCustom3 == null ? null : pcCustom3.trim();
    }

    public String getPcCustom4() {
        return pcCustom4;
    }

    public void setPcCustom4(String pcCustom4) {
        this.pcCustom4 = pcCustom4 == null ? null : pcCustom4.trim();
    }

    public String getPcCustom5() {
        return pcCustom5;
    }

    public void setPcCustom5(String pcCustom5) {
        this.pcCustom5 = pcCustom5 == null ? null : pcCustom5.trim();
    }

    public String getPcCustom6() {
        return pcCustom6;
    }

    public void setPcCustom6(String pcCustom6) {
        this.pcCustom6 = pcCustom6 == null ? null : pcCustom6.trim();
    }
}