package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 客户表
 * @author 刘成
 *
 */
public class Customer {
    private String customerId;//客户id（主键 唯一）
    private String customerName;//客户全称
    private String customerEasyname;//客户简称
    private String customerEnglishName;//英文全称
    private String customerChargePerson;//英文简称
    private String customerAccountOwnership;//账款归属
    private String customerType;//类别
    private String currencyId;//币别id
    private String customerPrincipalman;//负责人
    private String customerLinkman;//联系人
    private String customerLinktela;//联系电话一
    private String customerLinktelb;//联系电话二
    private String customerLinktelc;//联系电话三
    private String customerMobilephone;//移动电话
    private String adaId;//银行账号
    private String customerTaxcheckno;//税务登记号
    private Float customerCapitalmoney;//资本额
    private String customerJob;//行业别
    private String customerEmail;//电子邮件
    private String customerWebadd;//网址
    private String customerFaxno;//传真号码
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCufirstsaleout;//最初销售出库日
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCufirstsalereturn;//最初销售退货日
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCurecentsaleout;//最近销售出库日
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCurecentsalereturn;//最近销售退货日
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCurecentvisit;//最近拜访日
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCuordervisit;//预约拜访日
    private Float customerDiscountpoint;//折数
    private String customerSalelv;//售价等级
    private Integer customerCuiftax;//是否含税（0，1）
    private String customerLatentcusno;//潜在客户编号
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerTanddate;//客户建立日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date endbusinessday;//终止交易日
    private Float customerCreditmoney;//账款额度
    private Float customerResiduemonet;//剩余额度
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCuendorderday;//每月结账日
    private String customerHonestlv;//信用等级
    private Float customerCufirstcollect;//期初预收款
    private Float customerHouldcollect;//期初应收款
    private Float customerCuendcollect;//期末预收款
    private Float cuendshouldcollect;//期末应收款
    private String customerCudecoration;//其他备注
    private String receivableId;//收款条件id(关联应收冲款单表)
    private String itId;//发票类型id(关联发票类型表)
    private String itAccountsEceivableSubject;//应收账款科目(关联会计科目表account_id)
    private String itDepositReceivedSubject;//预收账款科目id(关联会计科目表account_id)
    private String bankId;//开户银行id(关联cus_bank开户银行表)
    private String customerAuditing;//是否审核
    private String customerYn;//是否删除（0 否 1 是 ，默认0）
    private String customerCustom1;//自定栏1
    private String customerCustom2;//自定栏2
    private String customerCustom3;//自定栏3
    private String customerCustom4;//自定栏4
    private String customerCustom5;//自定栏5
    private String customerCustom6;//自定栏6
    
    

    public Customer() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEasyname="
				+ customerEasyname + ", customerEnglishName=" + customerEnglishName + ", customerChargePerson="
				+ customerChargePerson + ", customerAccountOwnership=" + customerAccountOwnership + ", customerType="
				+ customerType + ", currencyId=" + currencyId + ", customerPrincipalman=" + customerPrincipalman
				+ ", customerLinkman=" + customerLinkman + ", customerLinktela=" + customerLinktela
				+ ", customerLinktelb=" + customerLinktelb + ", customerLinktelc=" + customerLinktelc
				+ ", customerMobilephone=" + customerMobilephone + ", adaId=" + adaId + ", customerTaxcheckno="
				+ customerTaxcheckno + ", customerCapitalmoney=" + customerCapitalmoney + ", customerJob=" + customerJob
				+ ", customerEmail=" + customerEmail + ", customerWebadd=" + customerWebadd + ", customerFaxno="
				+ customerFaxno + ", customerCufirstsaleout=" + customerCufirstsaleout + ", customerCufirstsalereturn="
				+ customerCufirstsalereturn + ", customerCurecentsaleout=" + customerCurecentsaleout
				+ ", customerCurecentsalereturn=" + customerCurecentsalereturn + ", customerCurecentvisit="
				+ customerCurecentvisit + ", customerCuordervisit=" + customerCuordervisit + ", customerDiscountpoint="
				+ customerDiscountpoint + ", customerSalelv=" + customerSalelv + ", customerCuiftax=" + customerCuiftax
				+ ", customerLatentcusno=" + customerLatentcusno + ", customerTanddate=" + customerTanddate
				+ ", endbusinessday=" + endbusinessday + ", customerCreditmoney=" + customerCreditmoney
				+ ", customerResiduemonet=" + customerResiduemonet + ", customerCuendorderday=" + customerCuendorderday
				+ ", customerHonestlv=" + customerHonestlv + ", customerCufirstcollect=" + customerCufirstcollect
				+ ", customerHouldcollect=" + customerHouldcollect + ", customerCuendcollect=" + customerCuendcollect
				+ ", cuendshouldcollect=" + cuendshouldcollect + ", customerCudecoration=" + customerCudecoration
				+ ", receivableId=" + receivableId + ", itId=" + itId + ", itAccountsEceivableSubject="
				+ itAccountsEceivableSubject + ", itDepositReceivedSubject=" + itDepositReceivedSubject + ", bankId="
				+ bankId + ", customerAuditing=" + customerAuditing + ", customerYn=" + customerYn
				+ ", customerCustom1=" + customerCustom1 + ", customerCustom2=" + customerCustom2 + ", customerCustom3="
				+ customerCustom3 + ", customerCustom4=" + customerCustom4 + ", customerCustom5=" + customerCustom5
				+ ", customerCustom6=" + customerCustom6 + "]";
	}



	public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerEasyname() {
        return customerEasyname;
    }

    public void setCustomerEasyname(String customerEasyname) {
        this.customerEasyname = customerEasyname == null ? null : customerEasyname.trim();
    }

    public String getCustomerEnglishName() {
        return customerEnglishName;
    }

    public void setCustomerEnglishName(String customerEnglishName) {
        this.customerEnglishName = customerEnglishName == null ? null : customerEnglishName.trim();
    }

    public String getCustomerChargePerson() {
        return customerChargePerson;
    }

    public void setCustomerChargePerson(String customerChargePerson) {
        this.customerChargePerson = customerChargePerson == null ? null : customerChargePerson.trim();
    }

    public String getCustomerAccountOwnership() {
        return customerAccountOwnership;
    }

    public void setCustomerAccountOwnership(String customerAccountOwnership) {
        this.customerAccountOwnership = customerAccountOwnership == null ? null : customerAccountOwnership.trim();
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public String getCustomerPrincipalman() {
        return customerPrincipalman;
    }

    public void setCustomerPrincipalman(String customerPrincipalman) {
        this.customerPrincipalman = customerPrincipalman == null ? null : customerPrincipalman.trim();
    }

    public String getCustomerLinkman() {
        return customerLinkman;
    }

    public void setCustomerLinkman(String customerLinkman) {
        this.customerLinkman = customerLinkman == null ? null : customerLinkman.trim();
    }

    public String getCustomerLinktela() {
        return customerLinktela;
    }

    public void setCustomerLinktela(String customerLinktela) {
        this.customerLinktela = customerLinktela == null ? null : customerLinktela.trim();
    }

    public String getCustomerLinktelb() {
        return customerLinktelb;
    }

    public void setCustomerLinktelb(String customerLinktelb) {
        this.customerLinktelb = customerLinktelb == null ? null : customerLinktelb.trim();
    }

    public String getCustomerLinktelc() {
        return customerLinktelc;
    }

    public void setCustomerLinktelc(String customerLinktelc) {
        this.customerLinktelc = customerLinktelc == null ? null : customerLinktelc.trim();
    }

    public String getCustomerMobilephone() {
        return customerMobilephone;
    }

    public void setCustomerMobilephone(String customerMobilephone) {
        this.customerMobilephone = customerMobilephone == null ? null : customerMobilephone.trim();
    }

    public String getAdaId() {
        return adaId;
    }

    public void setAdaId(String adaId) {
        this.adaId = adaId == null ? null : adaId.trim();
    }

    public String getCustomerTaxcheckno() {
        return customerTaxcheckno;
    }

    public void setCustomerTaxcheckno(String customerTaxcheckno) {
        this.customerTaxcheckno = customerTaxcheckno == null ? null : customerTaxcheckno.trim();
    }

    public Float getCustomerCapitalmoney() {
        return customerCapitalmoney;
    }

    public void setCustomerCapitalmoney(Float customerCapitalmoney) {
        this.customerCapitalmoney = customerCapitalmoney;
    }

    public String getCustomerJob() {
        return customerJob;
    }

    public void setCustomerJob(String customerJob) {
        this.customerJob = customerJob == null ? null : customerJob.trim();
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail == null ? null : customerEmail.trim();
    }

    public String getCustomerWebadd() {
        return customerWebadd;
    }

    public void setCustomerWebadd(String customerWebadd) {
        this.customerWebadd = customerWebadd == null ? null : customerWebadd.trim();
    }

    public String getCustomerFaxno() {
        return customerFaxno;
    }

    public void setCustomerFaxno(String customerFaxno) {
        this.customerFaxno = customerFaxno == null ? null : customerFaxno.trim();
    }

    public Date getCustomerCufirstsaleout() {
        return customerCufirstsaleout;
    }

    public void setCustomerCufirstsaleout(Date customerCufirstsaleout) {
        this.customerCufirstsaleout = customerCufirstsaleout;
    }

    public Date getCustomerCufirstsalereturn() {
        return customerCufirstsalereturn;
    }

    public void setCustomerCufirstsalereturn(Date customerCufirstsalereturn) {
        this.customerCufirstsalereturn = customerCufirstsalereturn;
    }

    public Date getCustomerCurecentsaleout() {
        return customerCurecentsaleout;
    }

    public void setCustomerCurecentsaleout(Date customerCurecentsaleout) {
        this.customerCurecentsaleout = customerCurecentsaleout;
    }

    public Date getCustomerCurecentsalereturn() {
        return customerCurecentsalereturn;
    }

    public void setCustomerCurecentsalereturn(Date customerCurecentsalereturn) {
        this.customerCurecentsalereturn = customerCurecentsalereturn;
    }

    public Date getCustomerCurecentvisit() {
        return customerCurecentvisit;
    }

    public void setCustomerCurecentvisit(Date customerCurecentvisit) {
        this.customerCurecentvisit = customerCurecentvisit;
    }

    public Date getCustomerCuordervisit() {
        return customerCuordervisit;
    }

    public void setCustomerCuordervisit(Date customerCuordervisit) {
        this.customerCuordervisit = customerCuordervisit;
    }

    public Float getCustomerDiscountpoint() {
        return customerDiscountpoint;
    }

    public void setCustomerDiscountpoint(Float customerDiscountpoint) {
        this.customerDiscountpoint = customerDiscountpoint;
    }

    public String getCustomerSalelv() {
        return customerSalelv;
    }

    public void setCustomerSalelv(String customerSalelv) {
        this.customerSalelv = customerSalelv == null ? null : customerSalelv.trim();
    }

    public Integer getCustomerCuiftax() {
        return customerCuiftax;
    }

    public void setCustomerCuiftax(Integer customerCuiftax) {
        this.customerCuiftax = customerCuiftax;
    }

    public String getCustomerLatentcusno() {
        return customerLatentcusno;
    }

    public void setCustomerLatentcusno(String customerLatentcusno) {
        this.customerLatentcusno = customerLatentcusno == null ? null : customerLatentcusno.trim();
    }

    public Date getCustomerTanddate() {
        return customerTanddate;
    }

    public void setCustomerTanddate(Date customerTanddate) {
        this.customerTanddate = customerTanddate;
    }

    public Date getEndbusinessday() {
        return endbusinessday;
    }

    public void setEndbusinessday(Date endbusinessday) {
        this.endbusinessday = endbusinessday;
    }

    public Float getCustomerCreditmoney() {
        return customerCreditmoney;
    }

    public void setCustomerCreditmoney(Float customerCreditmoney) {
        this.customerCreditmoney = customerCreditmoney;
    }

    public Float getCustomerResiduemonet() {
        return customerResiduemonet;
    }

    public void setCustomerResiduemonet(Float customerResiduemonet) {
        this.customerResiduemonet = customerResiduemonet;
    }

    public Date getCustomerCuendorderday() {
        return customerCuendorderday;
    }

    public void setCustomerCuendorderday(Date customerCuendorderday) {
        this.customerCuendorderday = customerCuendorderday;
    }

    public String getCustomerHonestlv() {
        return customerHonestlv;
    }

    public void setCustomerHonestlv(String customerHonestlv) {
        this.customerHonestlv = customerHonestlv == null ? null : customerHonestlv.trim();
    }

    public Float getCustomerCufirstcollect() {
        return customerCufirstcollect;
    }

    public void setCustomerCufirstcollect(Float customerCufirstcollect) {
        this.customerCufirstcollect = customerCufirstcollect;
    }

    public Float getCustomerHouldcollect() {
        return customerHouldcollect;
    }

    public void setCustomerHouldcollect(Float customerHouldcollect) {
        this.customerHouldcollect = customerHouldcollect;
    }

    public Float getCustomerCuendcollect() {
        return customerCuendcollect;
    }

    public void setCustomerCuendcollect(Float customerCuendcollect) {
        this.customerCuendcollect = customerCuendcollect;
    }

    public Float getCuendshouldcollect() {
        return cuendshouldcollect;
    }

    public void setCuendshouldcollect(Float cuendshouldcollect) {
        this.cuendshouldcollect = cuendshouldcollect;
    }

    public String getCustomerCudecoration() {
        return customerCudecoration;
    }

    public void setCustomerCudecoration(String customerCudecoration) {
        this.customerCudecoration = customerCudecoration == null ? null : customerCudecoration.trim();
    }

    public String getReceivableId() {
        return receivableId;
    }

    public void setReceivableId(String receivableId) {
        this.receivableId = receivableId == null ? null : receivableId.trim();
    }

    public String getItId() {
        return itId;
    }

    public void setItId(String itId) {
        this.itId = itId == null ? null : itId.trim();
    }

    public String getItAccountsEceivableSubject() {
        return itAccountsEceivableSubject;
    }

    public void setItAccountsEceivableSubject(String itAccountsEceivableSubject) {
        this.itAccountsEceivableSubject = itAccountsEceivableSubject == null ? null : itAccountsEceivableSubject.trim();
    }

    public String getItDepositReceivedSubject() {
        return itDepositReceivedSubject;
    }

    public void setItDepositReceivedSubject(String itDepositReceivedSubject) {
        this.itDepositReceivedSubject = itDepositReceivedSubject == null ? null : itDepositReceivedSubject.trim();
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getCustomerAuditing() {
        return customerAuditing;
    }

    public void setCustomerAuditing(String customerAuditing) {
        this.customerAuditing = customerAuditing == null ? null : customerAuditing.trim();
    }

    public String getCustomerYn() {
        return customerYn;
    }

    public void setCustomerYn(String customerYn) {
        this.customerYn = customerYn == null ? null : customerYn.trim();
    }

    public String getCustomerCustom1() {
        return customerCustom1;
    }

    public void setCustomerCustom1(String customerCustom1) {
        this.customerCustom1 = customerCustom1 == null ? null : customerCustom1.trim();
    }

    public String getCustomerCustom2() {
        return customerCustom2;
    }

    public void setCustomerCustom2(String customerCustom2) {
        this.customerCustom2 = customerCustom2 == null ? null : customerCustom2.trim();
    }

    public String getCustomerCustom3() {
        return customerCustom3;
    }

    public void setCustomerCustom3(String customerCustom3) {
        this.customerCustom3 = customerCustom3 == null ? null : customerCustom3.trim();
    }

    public String getCustomerCustom4() {
        return customerCustom4;
    }

    public void setCustomerCustom4(String customerCustom4) {
        this.customerCustom4 = customerCustom4 == null ? null : customerCustom4.trim();
    }

    public String getCustomerCustom5() {
        return customerCustom5;
    }

    public void setCustomerCustom5(String customerCustom5) {
        this.customerCustom5 = customerCustom5 == null ? null : customerCustom5.trim();
    }

    public String getCustomerCustom6() {
        return customerCustom6;
    }

    public void setCustomerCustom6(String customerCustom6) {
        this.customerCustom6 = customerCustom6 == null ? null : customerCustom6.trim();
    }
}