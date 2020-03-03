package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 供应商表
 * @author 刘成
 *
 */
public class Supplier {
    private String supplierId;//供应商编号（主键 唯一）
    private String supplierName;//供应商全称
    private String supplierEasyname;//供应商简称
    private String supplierEngname;//英文名称
    private String supplierEasyengname;//英文简称
    private String supplierAccountAttribution;//账款归属
    private String supplierType;//类别
    private String supplierZone;//地区
    private String currencyId;//币别id
    private String supplierPrincipalman;//负责人
    private String supplierLinkman;//联系人
    private String supplierLinktela;//联系电话一
    private String supplierLinktelb;//联系电话二
    private String supplierLinktelc;//联系电话三
    private String supplierMobilephone;//移动电话
    private String adaId;//银行账号
    private String bankId;//开户银行id
    private String supplierProcurementStaff;//采购人员
    private String supplierTaxcheckno;//税务登记号
    private Float supplierCapitalmoney;//资本额
    private String supplierJob;//行业别
    private String supplierEmail;//电子邮件
    private String supplierWebadd;//网址
    private String supplierFaxno;//传真号码
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date supplierCufirstsaleinput;//最初销售入库日
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date supplierCufirstsalereturn;//最初销售退货日
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date supplierCurecentsaleinput;//最近销售入库日
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date supplierCurecentsalereturn;//最近销售退货日
    private String supplierTaxIncluded;//单价是否含税
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date supplierTerminationdate;//终止交易日    
    private Float supplierCreditmoney;//账款额度
    private Float supplierResiduemonet;//剩余额度
    private String supplierCondition;//付款条件
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date supplierCuendorderday;//每月结账日
    private String supplierHonestlv;//信用等级
    private String supplierInvoiceType;//发票类型
    private Float supplierCufirstcollect;//期初预收款
    private Float supplierHouldcollect;//期初应收款
    private Float supplierCuendcollect;//期末预收款
    private Float supplierCuendshouldcollect;//期 末应收款
    private String supplierCudecoration;//未开票金额
    private Integer supplierCollectiontermid;//预付账款科目
    private Integer supplierInvoicetypeid;//应付账款科目
    private Integer supplierHouldcollectmoney;//应付账款科目
    private Integer supplierCurecollectmoney;//应付暂估科目    
    private String supplierAddressNo;//地址编号
    private String supplierRemark;//备注
    private String supplierAuditing;//是否审核
    private String supplierYn;//是否删除（0 否 1 是 ，默认0）
    private String supplierCustom1;//自定义1
    private String supplierCustom2;//自定义2
    private String supplierCustom3;//自定义3
    private String supplierCustom4;//自定义4
    private String supplierCustom5;//自定义5
    private String supplierCustom6;//自定义6
    
    

    public Supplier() {
		super();
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierEasyname="
				+ supplierEasyname + ", supplierEngname=" + supplierEngname + ", supplierEasyengname="
				+ supplierEasyengname + ", supplierAccountAttribution=" + supplierAccountAttribution + ", supplierType="
				+ supplierType + ", supplierZone=" + supplierZone + ", currencyId=" + currencyId
				+ ", supplierPrincipalman=" + supplierPrincipalman + ", supplierLinkman=" + supplierLinkman
				+ ", supplierLinktela=" + supplierLinktela + ", supplierLinktelb=" + supplierLinktelb
				+ ", supplierLinktelc=" + supplierLinktelc + ", supplierMobilephone=" + supplierMobilephone + ", adaId="
				+ adaId + ", bankId=" + bankId + ", supplierProcurementStaff=" + supplierProcurementStaff
				+ ", supplierTaxcheckno=" + supplierTaxcheckno + ", supplierCapitalmoney=" + supplierCapitalmoney
				+ ", supplierJob=" + supplierJob + ", supplierEmail=" + supplierEmail + ", supplierWebadd="
				+ supplierWebadd + ", supplierFaxno=" + supplierFaxno + ", supplierCufirstsaleinput="
				+ supplierCufirstsaleinput + ", supplierCufirstsalereturn=" + supplierCufirstsalereturn
				+ ", supplierCurecentsaleinput=" + supplierCurecentsaleinput + ", supplierCurecentsalereturn="
				+ supplierCurecentsalereturn + ", supplierTaxIncluded=" + supplierTaxIncluded
				+ ", supplierTerminationdate=" + supplierTerminationdate + ", supplierResiduemonet="
				+ supplierResiduemonet + ", supplierCondition=" + supplierCondition + ", supplierCuendorderday="
				+ supplierCuendorderday + ", supplierHonestlv=" + supplierHonestlv + ", supplierInvoiceType="
				+ supplierInvoiceType + ", supplierCufirstcollect=" + supplierCufirstcollect + ", supplierHouldcollect="
				+ supplierHouldcollect + ", supplierCuendcollect=" + supplierCuendcollect
				+ ", supplierCuendshouldcollect=" + supplierCuendshouldcollect + ", supplierCudecoration="
				+ supplierCudecoration + ", supplierCollectiontermid=" + supplierCollectiontermid
				+ ", supplierInvoicetypeid=" + supplierInvoicetypeid + ", supplierHouldcollectmoney="
				+ supplierHouldcollectmoney + ", supplierCurecollectmoney=" + supplierCurecollectmoney
				+ ", supplierAddressNo=" + supplierAddressNo + ", supplierRemark=" + supplierRemark
				+ ", supplierAuditing=" + supplierAuditing + ", supplierYn=" + supplierYn + ", supplierCustom1="
				+ supplierCustom1 + ", supplierCustom2=" + supplierCustom2 + ", supplierCustom3=" + supplierCustom3
				+ ", supplierCustom4=" + supplierCustom4 + ", supplierCustom5=" + supplierCustom5 + ", supplierCustom6="
				+ supplierCustom6 + "]";
	}

	public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierEasyname() {
        return supplierEasyname;
    }

    public void setSupplierEasyname(String supplierEasyname) {
        this.supplierEasyname = supplierEasyname == null ? null : supplierEasyname.trim();
    }

    public String getSupplierEngname() {
        return supplierEngname;
    }

    public void setSupplierEngname(String supplierEngname) {
        this.supplierEngname = supplierEngname == null ? null : supplierEngname.trim();
    }

    public String getSupplierEasyengname() {
        return supplierEasyengname;
    }

    public void setSupplierEasyengname(String supplierEasyengname) {
        this.supplierEasyengname = supplierEasyengname == null ? null : supplierEasyengname.trim();
    }

    public String getSupplierAccountAttribution() {
        return supplierAccountAttribution;
    }

    public void setSupplierAccountAttribution(String supplierAccountAttribution) {
        this.supplierAccountAttribution = supplierAccountAttribution == null ? null : supplierAccountAttribution.trim();
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType == null ? null : supplierType.trim();
    }

    public String getSupplierZone() {
        return supplierZone;
    }

    public void setSupplierZone(String supplierZone) {
        this.supplierZone = supplierZone == null ? null : supplierZone.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public String getSupplierPrincipalman() {
        return supplierPrincipalman;
    }

    public void setSupplierPrincipalman(String supplierPrincipalman) {
        this.supplierPrincipalman = supplierPrincipalman == null ? null : supplierPrincipalman.trim();
    }

    public String getSupplierLinkman() {
        return supplierLinkman;
    }

    public void setSupplierLinkman(String supplierLinkman) {
        this.supplierLinkman = supplierLinkman == null ? null : supplierLinkman.trim();
    }

    public String getSupplierLinktela() {
        return supplierLinktela;
    }

    public void setSupplierLinktela(String supplierLinktela) {
        this.supplierLinktela = supplierLinktela == null ? null : supplierLinktela.trim();
    }

    public String getSupplierLinktelb() {
        return supplierLinktelb;
    }

    public void setSupplierLinktelb(String supplierLinktelb) {
        this.supplierLinktelb = supplierLinktelb == null ? null : supplierLinktelb.trim();
    }

    public String getSupplierLinktelc() {
        return supplierLinktelc;
    }

    public void setSupplierLinktelc(String supplierLinktelc) {
        this.supplierLinktelc = supplierLinktelc == null ? null : supplierLinktelc.trim();
    }

    public String getSupplierMobilephone() {
        return supplierMobilephone;
    }

    public void setSupplierMobilephone(String supplierMobilephone) {
        this.supplierMobilephone = supplierMobilephone == null ? null : supplierMobilephone.trim();
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

    public String getSupplierProcurementStaff() {
        return supplierProcurementStaff;
    }

    public void setSupplierProcurementStaff(String supplierProcurementStaff) {
        this.supplierProcurementStaff = supplierProcurementStaff == null ? null : supplierProcurementStaff.trim();
    }

    public String getSupplierTaxcheckno() {
        return supplierTaxcheckno;
    }

    public void setSupplierTaxcheckno(String supplierTaxcheckno) {
        this.supplierTaxcheckno = supplierTaxcheckno == null ? null : supplierTaxcheckno.trim();
    }

    public Float getSupplierCapitalmoney() {
        return supplierCapitalmoney;
    }

    public void setSupplierCapitalmoney(Float supplierCapitalmoney) {
        this.supplierCapitalmoney = supplierCapitalmoney;
    }

    public String getSupplierJob() {
        return supplierJob;
    }

    public void setSupplierJob(String supplierJob) {
        this.supplierJob = supplierJob == null ? null : supplierJob.trim();
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail == null ? null : supplierEmail.trim();
    }

    public String getSupplierWebadd() {
        return supplierWebadd;
    }

    public void setSupplierWebadd(String supplierWebadd) {
        this.supplierWebadd = supplierWebadd == null ? null : supplierWebadd.trim();
    }

    public String getSupplierFaxno() {
        return supplierFaxno;
    }

    public void setSupplierFaxno(String supplierFaxno) {
        this.supplierFaxno = supplierFaxno == null ? null : supplierFaxno.trim();
    }

    public Date getSupplierCufirstsaleinput() {
        return supplierCufirstsaleinput;
    }

    public void setSupplierCufirstsaleinput(Date supplierCufirstsaleinput) {
        this.supplierCufirstsaleinput = supplierCufirstsaleinput;
    }

    public Date getSupplierCufirstsalereturn() {
        return supplierCufirstsalereturn;
    }

    public void setSupplierCufirstsalereturn(Date supplierCufirstsalereturn) {
        this.supplierCufirstsalereturn = supplierCufirstsalereturn;
    }

    public Date getSupplierCurecentsaleinput() {
        return supplierCurecentsaleinput;
    }

    public void setSupplierCurecentsaleinput(Date supplierCurecentsaleinput) {
        this.supplierCurecentsaleinput = supplierCurecentsaleinput;
    }

    public Date getSupplierCurecentsalereturn() {
        return supplierCurecentsalereturn;
    }

    public void setSupplierCurecentsalereturn(Date supplierCurecentsalereturn) {
        this.supplierCurecentsalereturn = supplierCurecentsalereturn;
    }

    public String getSupplierTaxIncluded() {
        return supplierTaxIncluded;
    }

    public void setSupplierTaxIncluded(String supplierTaxIncluded) {
        this.supplierTaxIncluded = supplierTaxIncluded == null ? null : supplierTaxIncluded.trim();
    }

    public Date getSupplierTerminationdate() {
        return supplierTerminationdate;
    }

    public void setSupplierTerminationdate(Date supplierTerminationdate) {
        this.supplierTerminationdate = supplierTerminationdate;
    }

    public Float getSupplierCreditmoney() {
        return supplierCreditmoney;
    }

    public void setSupplierCreditmoney(Float supplierCreditmoney) {
        this.supplierCreditmoney = supplierCreditmoney;
    }

    public Float getSupplierResiduemonet() {
        return supplierResiduemonet;
    }

    public void setSupplierResiduemonet(Float supplierResiduemonet) {
        this.supplierResiduemonet = supplierResiduemonet;
    }

    public String getSupplierCondition() {
        return supplierCondition;
    }

    public void setSupplierCondition(String supplierCondition) {
        this.supplierCondition = supplierCondition == null ? null : supplierCondition.trim();
    }

    public Date getSupplierCuendorderday() {
        return supplierCuendorderday;
    }

    public void setSupplierCuendorderday(Date supplierCuendorderday) {
        this.supplierCuendorderday = supplierCuendorderday;
    }

    public String getSupplierHonestlv() {
        return supplierHonestlv;
    }

    public void setSupplierHonestlv(String supplierHonestlv) {
        this.supplierHonestlv = supplierHonestlv == null ? null : supplierHonestlv.trim();
    }

    public String getSupplierInvoiceType() {
        return supplierInvoiceType;
    }

    public void setSupplierInvoiceType(String supplierInvoiceType) {
        this.supplierInvoiceType = supplierInvoiceType == null ? null : supplierInvoiceType.trim();
    }

    public Float getSupplierCufirstcollect() {
        return supplierCufirstcollect;
    }

    public void setSupplierCufirstcollect(Float supplierCufirstcollect) {
        this.supplierCufirstcollect = supplierCufirstcollect;
    }

    public Float getSupplierHouldcollect() {
        return supplierHouldcollect;
    }

    public void setSupplierHouldcollect(Float supplierHouldcollect) {
        this.supplierHouldcollect = supplierHouldcollect;
    }

    public Float getSupplierCuendcollect() {
        return supplierCuendcollect;
    }

    public void setSupplierCuendcollect(Float supplierCuendcollect) {
        this.supplierCuendcollect = supplierCuendcollect;
    }

    public Float getSupplierCuendshouldcollect() {
        return supplierCuendshouldcollect;
    }

    public void setSupplierCuendshouldcollect(Float supplierCuendshouldcollect) {
        this.supplierCuendshouldcollect = supplierCuendshouldcollect;
    }

    public String getSupplierCudecoration() {
        return supplierCudecoration;
    }

    public void setSupplierCudecoration(String supplierCudecoration) {
        this.supplierCudecoration = supplierCudecoration == null ? null : supplierCudecoration.trim();
    }

    public Integer getSupplierCollectiontermid() {
        return supplierCollectiontermid;
    }

    public void setSupplierCollectiontermid(Integer supplierCollectiontermid) {
        this.supplierCollectiontermid = supplierCollectiontermid;
    }

    public Integer getSupplierInvoicetypeid() {
        return supplierInvoicetypeid;
    }

    public void setSupplierInvoicetypeid(Integer supplierInvoicetypeid) {
        this.supplierInvoicetypeid = supplierInvoicetypeid;
    }

    public Integer getSupplierHouldcollectmoney() {
        return supplierHouldcollectmoney;
    }

    public void setSupplierHouldcollectmoney(Integer supplierHouldcollectmoney) {
        this.supplierHouldcollectmoney = supplierHouldcollectmoney;
    }

    public Integer getSupplierCurecollectmoney() {
        return supplierCurecollectmoney;
    }

    public void setSupplierCurecollectmoney(Integer supplierCurecollectmoney) {
        this.supplierCurecollectmoney = supplierCurecollectmoney;
    }

    public String getSupplierAddressNo() {
        return supplierAddressNo;
    }

    public void setSupplierAddressNo(String supplierAddressNo) {
        this.supplierAddressNo = supplierAddressNo == null ? null : supplierAddressNo.trim();
    }

    public String getSupplierRemark() {
        return supplierRemark;
    }

    public void setSupplierRemark(String supplierRemark) {
        this.supplierRemark = supplierRemark == null ? null : supplierRemark.trim();
    }

    public String getSupplierAuditing() {
        return supplierAuditing;
    }

    public void setSupplierAuditing(String supplierAuditing) {
        this.supplierAuditing = supplierAuditing == null ? null : supplierAuditing.trim();
    }

    public String getSupplierYn() {
        return supplierYn;
    }

    public void setSupplierYn(String supplierYn) {
        this.supplierYn = supplierYn == null ? null : supplierYn.trim();
    }

    public String getSupplierCustom1() {
        return supplierCustom1;
    }

    public void setSupplierCustom1(String supplierCustom1) {
        this.supplierCustom1 = supplierCustom1 == null ? null : supplierCustom1.trim();
    }

    public String getSupplierCustom2() {
        return supplierCustom2;
    }

    public void setSupplierCustom2(String supplierCustom2) {
        this.supplierCustom2 = supplierCustom2 == null ? null : supplierCustom2.trim();
    }

    public String getSupplierCustom3() {
        return supplierCustom3;
    }

    public void setSupplierCustom3(String supplierCustom3) {
        this.supplierCustom3 = supplierCustom3 == null ? null : supplierCustom3.trim();
    }

    public String getSupplierCustom4() {
        return supplierCustom4;
    }

    public void setSupplierCustom4(String supplierCustom4) {
        this.supplierCustom4 = supplierCustom4 == null ? null : supplierCustom4.trim();
    }

    public String getSupplierCustom5() {
        return supplierCustom5;
    }

    public void setSupplierCustom5(String supplierCustom5) {
        this.supplierCustom5 = supplierCustom5 == null ? null : supplierCustom5.trim();
    }

    public String getSupplierCustom6() {
        return supplierCustom6;
    }

    public void setSupplierCustom6(String supplierCustom6) {
        this.supplierCustom6 = supplierCustom6 == null ? null : supplierCustom6.trim();
    }
}