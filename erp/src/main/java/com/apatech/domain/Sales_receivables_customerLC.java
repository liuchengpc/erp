package com.apatech.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 应收款客户表
 * @author 刘成
 *
 */
public class Sales_receivables_customerLC {
	 private Integer srId;//预收账款明细表id，主键
	    private String srType;//单别
	    private String srNumber;//原单单号
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    @DateTimeFormat(pattern ="yyyy-MM-dd")
	    private Date srDate;//原单日期
	    private String srPcId;//交易对象客户表id,外键
	    private String srPcName;//交易对象名称
	    private String srTeamId;//部门表id，外键
	    private String srTeamName;//部门名称
	    private String srBuyer;//业务人员
	    private String srProjectName;//项目名称
	    private String srCurrency;//币别表id,外键
	    private Float srExchangeRate;//币别表汇率（买进）
	    private Double srPayablesmainPrice;//原单金额
	    private Float srCurrentbalance;//现行余额
	    private Float srDiscountamount;//折让金额
	    private Float srAmountcharged;//冲款金额
	    private Float srOffsetamount;//冲抵金额
	    private String srAuditing;//是否审核
	    private String srYn;//是否删除 0是 1否 默认0
	    private String srCustom1;//自定义栏一
	    private String srCustom2;//自定义栏二
	    private String srCustom3;//自定义栏三
	    private String srCustom4;//自定义栏四
	    private String srCustom5;//自定义栏五
	    private String srCustom6;//自定义栏六
	    private String srCustom7;//表状态（0 商品记录表，1 应收账款明细表）
	    private String srCustom8;//币别名
	    private String srCustom9;//自定义栏九
	    private String srCustom10;//主表id
	
	
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
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCufirstsaleout;//最初销售出库日
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCufirstsalereturn;//最初销售退货日
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCurecentsaleout;//最近销售出库日
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCurecentsalereturn;//最近销售退货日
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCurecentvisit;//最近拜访日
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerCuordervisit;//预约拜访日
    private Float customerDiscountpoint;//折数
    private String customerSalelv;//售价等级
    private Integer customerCuiftax;//是否含税（0，1）
    private String customerLatentcusno;//潜在客户编号
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date customerTanddate;//客户建立日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date endbusinessday;//终止交易日
    private Float customerCreditmoney;//账款额度
    private Float customerResiduemonet;//剩余额度
    @JsonFormat(pattern = "yyyy-MM-dd")
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
    
    
    private List<Sales_receivables_customerLC> list;//自定栏6
    
    
   
    
    

    public Sales_receivables_customerLC() {
		super();
	}

    
    


	





	@Override
	public String toString() {
		return "Sales_receivables_customerLC [srId=" + srId + ", srType=" + srType + ", srNumber=" + srNumber
				+ ", srDate=" + srDate + ", srPcId=" + srPcId + ", srPcName=" + srPcName + ", srTeamId=" + srTeamId
				+ ", srTeamName=" + srTeamName + ", srBuyer=" + srBuyer + ", srProjectName=" + srProjectName
				+ ", srCurrency=" + srCurrency + ", srExchangeRate=" + srExchangeRate + ", srPayablesmainPrice="
				+ srPayablesmainPrice + ", srCurrentbalance=" + srCurrentbalance + ", srDiscountamount="
				+ srDiscountamount + ", srAmountcharged=" + srAmountcharged + ", srOffsetamount=" + srOffsetamount
				+ ", srAuditing=" + srAuditing + ", srYn=" + srYn + ", srCustom1=" + srCustom1 + ", srCustom2="
				+ srCustom2 + ", srCustom3=" + srCustom3 + ", srCustom4=" + srCustom4 + ", srCustom5=" + srCustom5
				+ ", srCustom6=" + srCustom6 + ", srCustom7=" + srCustom7 + ", srCustom8=" + srCustom8 + ", srCustom9="
				+ srCustom9 + ", srCustom10=" + srCustom10 + ", customerId=" + customerId + ", customerName="
				+ customerName + ", customerEasyname=" + customerEasyname + ", customerEnglishName="
				+ customerEnglishName + ", customerChargePerson=" + customerChargePerson + ", customerAccountOwnership="
				+ customerAccountOwnership + ", customerType=" + customerType + ", currencyId=" + currencyId
				+ ", customerPrincipalman=" + customerPrincipalman + ", customerLinkman=" + customerLinkman
				+ ", customerLinktela=" + customerLinktela + ", customerLinktelb=" + customerLinktelb
				+ ", customerLinktelc=" + customerLinktelc + ", customerMobilephone=" + customerMobilephone + ", adaId="
				+ adaId + ", customerTaxcheckno=" + customerTaxcheckno + ", customerCapitalmoney="
				+ customerCapitalmoney + ", customerJob=" + customerJob + ", customerEmail=" + customerEmail
				+ ", customerWebadd=" + customerWebadd + ", customerFaxno=" + customerFaxno
				+ ", customerCufirstsaleout=" + customerCufirstsaleout + ", customerCufirstsalereturn="
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
				+ ", customerCustom6=" + customerCustom6 + ", list=" + list + "]";
	}











	public Integer getSrId() {
		return srId;
	}



	public void setSrId(Integer srId) {
		this.srId = srId;
	}



	public String getSrType() {
		return srType;
	}



	public void setSrType(String srType) {
		this.srType = srType;
	}



	public String getSrNumber() {
		return srNumber;
	}



	public void setSrNumber(String srNumber) {
		this.srNumber = srNumber;
	}



	public Date getSrDate() {
		return srDate;
	}



	public void setSrDate(Date srDate) {
		this.srDate = srDate;
	}



	public String getSrPcId() {
		return srPcId;
	}



	public void setSrPcId(String srPcId) {
		this.srPcId = srPcId;
	}



	public String getSrPcName() {
		return srPcName;
	}



	public void setSrPcName(String srPcName) {
		this.srPcName = srPcName;
	}



	public String getSrTeamId() {
		return srTeamId;
	}



	public void setSrTeamId(String srTeamId) {
		this.srTeamId = srTeamId;
	}



	public String getSrTeamName() {
		return srTeamName;
	}



	public void setSrTeamName(String srTeamName) {
		this.srTeamName = srTeamName;
	}



	public String getSrBuyer() {
		return srBuyer;
	}



	public void setSrBuyer(String srBuyer) {
		this.srBuyer = srBuyer;
	}



	public String getSrProjectName() {
		return srProjectName;
	}



	public void setSrProjectName(String srProjectName) {
		this.srProjectName = srProjectName;
	}



	public String getSrCurrency() {
		return srCurrency;
	}



	public void setSrCurrency(String srCurrency) {
		this.srCurrency = srCurrency;
	}



	public Float getSrExchangeRate() {
		return srExchangeRate;
	}



	public void setSrExchangeRate(Float srExchangeRate) {
		this.srExchangeRate = srExchangeRate;
	}



	public Double getSrPayablesmainPrice() {
		return srPayablesmainPrice;
	}



	public void setSrPayablesmainPrice(Double srPayablesmainPrice) {
		this.srPayablesmainPrice = srPayablesmainPrice;
	}



	public Float getSrCurrentbalance() {
		return srCurrentbalance;
	}



	public void setSrCurrentbalance(Float srCurrentbalance) {
		this.srCurrentbalance = srCurrentbalance;
	}



	public Float getSrDiscountamount() {
		return srDiscountamount;
	}



	public void setSrDiscountamount(Float srDiscountamount) {
		this.srDiscountamount = srDiscountamount;
	}



	public Float getSrAmountcharged() {
		return srAmountcharged;
	}



	public void setSrAmountcharged(Float srAmountcharged) {
		this.srAmountcharged = srAmountcharged;
	}



	public Float getSrOffsetamount() {
		return srOffsetamount;
	}



	public void setSrOffsetamount(Float srOffsetamount) {
		this.srOffsetamount = srOffsetamount;
	}



	public String getSrAuditing() {
		return srAuditing;
	}



	public void setSrAuditing(String srAuditing) {
		this.srAuditing = srAuditing;
	}



	public String getSrYn() {
		return srYn;
	}



	public void setSrYn(String srYn) {
		this.srYn = srYn;
	}



	public String getSrCustom1() {
		return srCustom1;
	}



	public void setSrCustom1(String srCustom1) {
		this.srCustom1 = srCustom1;
	}



	public String getSrCustom2() {
		return srCustom2;
	}



	public void setSrCustom2(String srCustom2) {
		this.srCustom2 = srCustom2;
	}



	public String getSrCustom3() {
		return srCustom3;
	}



	public void setSrCustom3(String srCustom3) {
		this.srCustom3 = srCustom3;
	}



	public String getSrCustom4() {
		return srCustom4;
	}



	public void setSrCustom4(String srCustom4) {
		this.srCustom4 = srCustom4;
	}



	public String getSrCustom5() {
		return srCustom5;
	}



	public void setSrCustom5(String srCustom5) {
		this.srCustom5 = srCustom5;
	}



	public String getSrCustom6() {
		return srCustom6;
	}



	public void setSrCustom6(String srCustom6) {
		this.srCustom6 = srCustom6;
	}



	public String getSrCustom7() {
		return srCustom7;
	}



	public void setSrCustom7(String srCustom7) {
		this.srCustom7 = srCustom7;
	}



	public String getSrCustom8() {
		return srCustom8;
	}



	public void setSrCustom8(String srCustom8) {
		this.srCustom8 = srCustom8;
	}



	public String getSrCustom9() {
		return srCustom9;
	}



	public void setSrCustom9(String srCustom9) {
		this.srCustom9 = srCustom9;
	}



	public String getSrCustom10() {
		return srCustom10;
	}



	public void setSrCustom10(String srCustom10) {
		this.srCustom10 = srCustom10;
	}



	public String getCustomerId() {
		return customerId;
	}



	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerEasyname() {
		return customerEasyname;
	}



	public void setCustomerEasyname(String customerEasyname) {
		this.customerEasyname = customerEasyname;
	}



	public String getCustomerEnglishName() {
		return customerEnglishName;
	}



	public void setCustomerEnglishName(String customerEnglishName) {
		this.customerEnglishName = customerEnglishName;
	}



	public String getCustomerChargePerson() {
		return customerChargePerson;
	}



	public void setCustomerChargePerson(String customerChargePerson) {
		this.customerChargePerson = customerChargePerson;
	}



	public String getCustomerAccountOwnership() {
		return customerAccountOwnership;
	}



	public void setCustomerAccountOwnership(String customerAccountOwnership) {
		this.customerAccountOwnership = customerAccountOwnership;
	}



	public String getCustomerType() {
		return customerType;
	}



	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}



	public String getCurrencyId() {
		return currencyId;
	}



	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}



	public String getCustomerPrincipalman() {
		return customerPrincipalman;
	}



	public void setCustomerPrincipalman(String customerPrincipalman) {
		this.customerPrincipalman = customerPrincipalman;
	}



	public String getCustomerLinkman() {
		return customerLinkman;
	}



	public void setCustomerLinkman(String customerLinkman) {
		this.customerLinkman = customerLinkman;
	}



	public String getCustomerLinktela() {
		return customerLinktela;
	}



	public void setCustomerLinktela(String customerLinktela) {
		this.customerLinktela = customerLinktela;
	}



	public String getCustomerLinktelb() {
		return customerLinktelb;
	}



	public void setCustomerLinktelb(String customerLinktelb) {
		this.customerLinktelb = customerLinktelb;
	}



	public String getCustomerLinktelc() {
		return customerLinktelc;
	}



	public void setCustomerLinktelc(String customerLinktelc) {
		this.customerLinktelc = customerLinktelc;
	}



	public String getCustomerMobilephone() {
		return customerMobilephone;
	}



	public void setCustomerMobilephone(String customerMobilephone) {
		this.customerMobilephone = customerMobilephone;
	}



	public String getAdaId() {
		return adaId;
	}



	public void setAdaId(String adaId) {
		this.adaId = adaId;
	}



	public String getCustomerTaxcheckno() {
		return customerTaxcheckno;
	}



	public void setCustomerTaxcheckno(String customerTaxcheckno) {
		this.customerTaxcheckno = customerTaxcheckno;
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
		this.customerJob = customerJob;
	}



	public String getCustomerEmail() {
		return customerEmail;
	}



	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}



	public String getCustomerWebadd() {
		return customerWebadd;
	}



	public void setCustomerWebadd(String customerWebadd) {
		this.customerWebadd = customerWebadd;
	}



	public String getCustomerFaxno() {
		return customerFaxno;
	}



	public void setCustomerFaxno(String customerFaxno) {
		this.customerFaxno = customerFaxno;
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
		this.customerSalelv = customerSalelv;
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
		this.customerLatentcusno = customerLatentcusno;
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
		this.customerHonestlv = customerHonestlv;
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
		this.customerCudecoration = customerCudecoration;
	}



	public String getReceivableId() {
		return receivableId;
	}



	public void setReceivableId(String receivableId) {
		this.receivableId = receivableId;
	}



	public String getItId() {
		return itId;
	}



	public void setItId(String itId) {
		this.itId = itId;
	}



	public String getItAccountsEceivableSubject() {
		return itAccountsEceivableSubject;
	}



	public void setItAccountsEceivableSubject(String itAccountsEceivableSubject) {
		this.itAccountsEceivableSubject = itAccountsEceivableSubject;
	}



	public String getItDepositReceivedSubject() {
		return itDepositReceivedSubject;
	}



	public void setItDepositReceivedSubject(String itDepositReceivedSubject) {
		this.itDepositReceivedSubject = itDepositReceivedSubject;
	}



	public String getBankId() {
		return bankId;
	}



	public void setBankId(String bankId) {
		this.bankId = bankId;
	}



	public String getCustomerAuditing() {
		return customerAuditing;
	}



	public void setCustomerAuditing(String customerAuditing) {
		this.customerAuditing = customerAuditing;
	}



	public String getCustomerYn() {
		return customerYn;
	}



	public void setCustomerYn(String customerYn) {
		this.customerYn = customerYn;
	}



	public String getCustomerCustom1() {
		return customerCustom1;
	}



	public void setCustomerCustom1(String customerCustom1) {
		this.customerCustom1 = customerCustom1;
	}



	public String getCustomerCustom2() {
		return customerCustom2;
	}



	public void setCustomerCustom2(String customerCustom2) {
		this.customerCustom2 = customerCustom2;
	}



	public String getCustomerCustom3() {
		return customerCustom3;
	}



	public void setCustomerCustom3(String customerCustom3) {
		this.customerCustom3 = customerCustom3;
	}



	public String getCustomerCustom4() {
		return customerCustom4;
	}



	public void setCustomerCustom4(String customerCustom4) {
		this.customerCustom4 = customerCustom4;
	}



	public String getCustomerCustom5() {
		return customerCustom5;
	}



	public void setCustomerCustom5(String customerCustom5) {
		this.customerCustom5 = customerCustom5;
	}



	public String getCustomerCustom6() {
		return customerCustom6;
	}



	public void setCustomerCustom6(String customerCustom6) {
		this.customerCustom6 = customerCustom6;
	}











	public List<Sales_receivables_customerLC> getList() {
		
		return list;
	}

	public void setList(List<Sales_receivables_customerLC> list) {
		this.list = list;
	}
    
    

	
}