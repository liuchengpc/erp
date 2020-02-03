package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author 刘成
 *
 */
public class Sales_out_warehouse {
    private String sowId;//id（主键 唯一）
    private String customerId;//客户id
    private String sowAddress;//送货地址
    private String sowtId;//销售出库类型id
    private String sowPriceIncludeTax;//单价是否含税
    private String warehouseId;//仓库id
    private String sowCertificateNumber;//凭证编号
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date sowDocumentDate;//单据日期
    private String sowDocumentNumber;//单据号码
    private String currencyId;//币别id
    private Float sowExchangeRate;//汇率
    private String sowForeignTrade;//国外贸易（默认否）
    private Integer sowSunnum;//总数量
    private Float sowSunmoney;//总金额
    private Float sowTax;//总税额
    private Float sowIncludingTaxAmount;//总含税金额
    private String sowSaleszkgs;//账款归属
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date sowSalesdate;//收款日期
    private String sowSalessktj;//收款条件
    private Integer sowSalesday;//收款天数
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date sowSalesyue;//账款月份
    private String sowBuyer;//采购人员
    private String sowBelongsSection;//所属部门
    private String sowBelongsProject;//所属项目
    private String sowForm;//制单人员
    private String sowCheckagainStaff;//复核人员
    private String sowProject;//所属项目
    private String sowHeaderProvision;//表头条文
    private String sowEndClause;//表尾条文
    private String sowRemark;//备注
    private String sowAuditing;//是否审核
    private String sowYn;//是否删除（0 否 1 是 ，默认0）
    private String sowCustom1;//自定义1
    private String sowCustom2;//自定义2
    private String sowCustom3;//自定义3
    private String sowCustom4;//自定义4
    private String sowCustom5;//自定义5
    private String sowCustom6;//自定义6
    
    

    public Sales_out_warehouse() {
		super();
	}

	@Override
	public String toString() {
		return "Sales_out_warehouse [sowId=" + sowId + ", customerId=" + customerId + ", sowAddress=" + sowAddress
				+ ", sowtId=" + sowtId + ", sowPriceIncludeTax=" + sowPriceIncludeTax + ", warehouseId=" + warehouseId
				+ ", sowCertificateNumber=" + sowCertificateNumber + ", sowDocumentDate=" + sowDocumentDate
				+ ", sowDocumentNumber=" + sowDocumentNumber + ", currencyId=" + currencyId + ", sowExchangeRate="
				+ sowExchangeRate + ", sowForeignTrade=" + sowForeignTrade + ", sowSunnum=" + sowSunnum
				+ ", sowSunmoney=" + sowSunmoney + ", sowTax=" + sowTax + ", sowIncludingTaxAmount="
				+ sowIncludingTaxAmount + ", sowSaleszkgs=" + sowSaleszkgs + ", sowSalesdate=" + sowSalesdate
				+ ", sowSalessktj=" + sowSalessktj + ", sowSalesday=" + sowSalesday + ", sowSalesyue=" + sowSalesyue
				+ ", sowBuyer=" + sowBuyer + ", sowBelongsSection=" + sowBelongsSection + ", sowBelongsProject="
				+ sowBelongsProject + ", sowForm=" + sowForm + ", sowCheckagainStaff=" + sowCheckagainStaff
				+ ", sowProject=" + sowProject + ", sowHeaderProvision=" + sowHeaderProvision + ", sowEndClause="
				+ sowEndClause + ", sowRemark=" + sowRemark + ", sowAuditing=" + sowAuditing + ", sowYn=" + sowYn
				+ ", sowCustom1=" + sowCustom1 + ", sowCustom2=" + sowCustom2 + ", sowCustom3=" + sowCustom3
				+ ", sowCustom4=" + sowCustom4 + ", sowCustom5=" + sowCustom5 + ", sowCustom6=" + sowCustom6 + "]";
	}

	public String getSowId() {
        return sowId;
    }

    public void setSowId(String sowId) {
        this.sowId = sowId == null ? null : sowId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getSowAddress() {
        return sowAddress;
    }

    public void setSowAddress(String sowAddress) {
        this.sowAddress = sowAddress == null ? null : sowAddress.trim();
    }

    public String getSowtId() {
        return sowtId;
    }

    public void setSowtId(String sowtId) {
        this.sowtId = sowtId == null ? null : sowtId.trim();
    }

    public String getSowPriceIncludeTax() {
        return sowPriceIncludeTax;
    }

    public void setSowPriceIncludeTax(String sowPriceIncludeTax) {
        this.sowPriceIncludeTax = sowPriceIncludeTax == null ? null : sowPriceIncludeTax.trim();
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getSowCertificateNumber() {
        return sowCertificateNumber;
    }

    public void setSowCertificateNumber(String sowCertificateNumber) {
        this.sowCertificateNumber = sowCertificateNumber == null ? null : sowCertificateNumber.trim();
    }

    public Date getSowDocumentDate() {
        return sowDocumentDate;
    }

    public void setSowDocumentDate(Date sowDocumentDate) {
        this.sowDocumentDate = sowDocumentDate;
    }

    public String getSowDocumentNumber() {
        return sowDocumentNumber;
    }

    public void setSowDocumentNumber(String sowDocumentNumber) {
        this.sowDocumentNumber = sowDocumentNumber == null ? null : sowDocumentNumber.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public Float getSowExchangeRate() {
        return sowExchangeRate;
    }

    public void setSowExchangeRate(Float sowExchangeRate) {
        this.sowExchangeRate = sowExchangeRate;
    }

    public String getSowForeignTrade() {
        return sowForeignTrade;
    }

    public void setSowForeignTrade(String sowForeignTrade) {
        this.sowForeignTrade = sowForeignTrade == null ? null : sowForeignTrade.trim();
    }

    public Integer getSowSunnum() {
        return sowSunnum;
    }

    public void setSowSunnum(Integer sowSunnum) {
        this.sowSunnum = sowSunnum;
    }

    public Float getSowSunmoney() {
        return sowSunmoney;
    }

    public void setSowSunmoney(Float sowSunmoney) {
        this.sowSunmoney = sowSunmoney;
    }

    public Float getSowTax() {
        return sowTax;
    }

    public void setSowTax(Float sowTax) {
        this.sowTax = sowTax;
    }

    public Float getSowIncludingTaxAmount() {
        return sowIncludingTaxAmount;
    }

    public void setSowIncludingTaxAmount(Float sowIncludingTaxAmount) {
        this.sowIncludingTaxAmount = sowIncludingTaxAmount;
    }

    public String getSowSaleszkgs() {
        return sowSaleszkgs;
    }

    public void setSowSaleszkgs(String sowSaleszkgs) {
        this.sowSaleszkgs = sowSaleszkgs == null ? null : sowSaleszkgs.trim();
    }

    public Date getSowSalesdate() {
        return sowSalesdate;
    }

    public void setSowSalesdate(Date sowSalesdate) {
        this.sowSalesdate = sowSalesdate;
    }

    public String getSowSalessktj() {
        return sowSalessktj;
    }

    public void setSowSalessktj(String sowSalessktj) {
        this.sowSalessktj = sowSalessktj == null ? null : sowSalessktj.trim();
    }

    public Integer getSowSalesday() {
        return sowSalesday;
    }

    public void setSowSalesday(Integer sowSalesday) {
        this.sowSalesday = sowSalesday;
    }

    public Date getSowSalesyue() {
        return sowSalesyue;
    }

    public void setSowSalesyue(Date sowSalesyue) {
        this.sowSalesyue = sowSalesyue;
    }

    public String getSowBuyer() {
        return sowBuyer;
    }

    public void setSowBuyer(String sowBuyer) {
        this.sowBuyer = sowBuyer == null ? null : sowBuyer.trim();
    }

    public String getSowBelongsSection() {
        return sowBelongsSection;
    }

    public void setSowBelongsSection(String sowBelongsSection) {
        this.sowBelongsSection = sowBelongsSection == null ? null : sowBelongsSection.trim();
    }

    public String getSowBelongsProject() {
        return sowBelongsProject;
    }

    public void setSowBelongsProject(String sowBelongsProject) {
        this.sowBelongsProject = sowBelongsProject == null ? null : sowBelongsProject.trim();
    }

    public String getSowForm() {
        return sowForm;
    }

    public void setSowForm(String sowForm) {
        this.sowForm = sowForm == null ? null : sowForm.trim();
    }

    public String getSowCheckagainStaff() {
        return sowCheckagainStaff;
    }

    public void setSowCheckagainStaff(String sowCheckagainStaff) {
        this.sowCheckagainStaff = sowCheckagainStaff == null ? null : sowCheckagainStaff.trim();
    }

    public String getSowProject() {
        return sowProject;
    }

    public void setSowProject(String sowProject) {
        this.sowProject = sowProject == null ? null : sowProject.trim();
    }

    public String getSowHeaderProvision() {
        return sowHeaderProvision;
    }

    public void setSowHeaderProvision(String sowHeaderProvision) {
        this.sowHeaderProvision = sowHeaderProvision == null ? null : sowHeaderProvision.trim();
    }

    public String getSowEndClause() {
        return sowEndClause;
    }

    public void setSowEndClause(String sowEndClause) {
        this.sowEndClause = sowEndClause == null ? null : sowEndClause.trim();
    }

    public String getSowRemark() {
        return sowRemark;
    }

    public void setSowRemark(String sowRemark) {
        this.sowRemark = sowRemark == null ? null : sowRemark.trim();
    }

    public String getSowAuditing() {
        return sowAuditing;
    }

    public void setSowAuditing(String sowAuditing) {
        this.sowAuditing = sowAuditing == null ? null : sowAuditing.trim();
    }

    public String getSowYn() {
        return sowYn;
    }

    public void setSowYn(String sowYn) {
        this.sowYn = sowYn == null ? null : sowYn.trim();
    }

    public String getSowCustom1() {
        return sowCustom1;
    }

    public void setSowCustom1(String sowCustom1) {
        this.sowCustom1 = sowCustom1 == null ? null : sowCustom1.trim();
    }

    public String getSowCustom2() {
        return sowCustom2;
    }

    public void setSowCustom2(String sowCustom2) {
        this.sowCustom2 = sowCustom2 == null ? null : sowCustom2.trim();
    }

    public String getSowCustom3() {
        return sowCustom3;
    }

    public void setSowCustom3(String sowCustom3) {
        this.sowCustom3 = sowCustom3 == null ? null : sowCustom3.trim();
    }

    public String getSowCustom4() {
        return sowCustom4;
    }

    public void setSowCustom4(String sowCustom4) {
        this.sowCustom4 = sowCustom4 == null ? null : sowCustom4.trim();
    }

    public String getSowCustom5() {
        return sowCustom5;
    }

    public void setSowCustom5(String sowCustom5) {
        this.sowCustom5 = sowCustom5 == null ? null : sowCustom5.trim();
    }

    public String getSowCustom6() {
        return sowCustom6;
    }

    public void setSowCustom6(String sowCustom6) {
        this.sowCustom6 = sowCustom6 == null ? null : sowCustom6.trim();
    }
}