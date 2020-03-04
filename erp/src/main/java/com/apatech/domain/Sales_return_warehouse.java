package com.apatech.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 销售退货主表
 * @author 刘成
 *
 */
public class Sales_return_warehouse {
    private String srwId;//id
    private String customerId;//客户id
    private String srwAddress;//送货地址
    private String srwtId;//销售出库类型id
    private String srwPriceIncludeTax;//单价是否含税
    private Integer salescxrk;//是否重新入库(0否1是)
    private String warehouseId;//仓库id
    private String srwCertificateNumber;//凭证编号
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date srwDocumentDate;//单据日期
    private String srwDocumentNumber;//单据号码
    private String currencyId;//币别id
    private Float srwExchangeRate;//汇率
    private String srwForeignTrade;//国外贸易（默认否）
    private Integer srwSunnum;//总数量
    private Float srwSunmoney;//总金额
    private Float srwTax;//总税额
    private Float srwIncludingTaxAmount;//总含税金额
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private String srwSaleszkgs;//账款归属
    private String srwSalesdate;//收款日期
    private String srwSalessktj;//收款条件
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Integer srwSalesday;//收款天数
    private String srwSalesyue;//账款月份
    private String srwBuyer;//业务人员
    private String srwBelongsSection;//所属部门
    private String srwBelongsProject;//所属项目
    private String srwForm;//制单人员
    private String srwCheckagainStaff;//复核人员
    private String srwHeaderProvision;//表头条文
    private String srwEndClause;//表尾条文
    private String srwRemark;//备注
    private String srwAuditing;//是否审核
    private String srwYn;//是否删除（0 否 1 是 ，默认0）
    private String srwCustom1;//自定义
    private String srwCustom2;//自定义
    private String srwCustom3;//自定义
    private String srwCustom4;//自定义
    private String srwCustom5;//自定义
    private String srwCustom6;//自定义
    private List<Sales_return_warehouse_detailed> list;
    
   

	public Sales_return_warehouse() {
		super();
	}

	
	


	@Override
	public String toString() {
		return "Sales_return_warehouse [srwId=" + srwId + ", customerId=" + customerId + ", srwAddress=" + srwAddress
				+ ", srwtId=" + srwtId + ", srwPriceIncludeTax=" + srwPriceIncludeTax + ", salescxrk=" + salescxrk
				+ ", warehouseId=" + warehouseId + ", srwCertificateNumber=" + srwCertificateNumber
				+ ", srwDocumentDate=" + srwDocumentDate + ", srwDocumentNumber=" + srwDocumentNumber + ", currencyId="
				+ currencyId + ", srwExchangeRate=" + srwExchangeRate + ", srwForeignTrade=" + srwForeignTrade
				+ ", srwSunnum=" + srwSunnum + ", srwSunmoney=" + srwSunmoney + ", srwTax=" + srwTax
				+ ", srwIncludingTaxAmount=" + srwIncludingTaxAmount + ", srwSaleszkgs=" + srwSaleszkgs
				+ ", srwSalesdate=" + srwSalesdate + ", srwSalessktj=" + srwSalessktj + ", srwSalesday=" + srwSalesday
				+ ", srwSalesyue=" + srwSalesyue + ", srwBuyer=" + srwBuyer + ", srwBelongsSection=" + srwBelongsSection
				+ ", srwBelongsProject=" + srwBelongsProject + ", srwForm=" + srwForm + ", srwCheckagainStaff="
				+ srwCheckagainStaff + ", srwHeaderProvision=" + srwHeaderProvision + ", srwEndClause=" + srwEndClause
				+ ", srwRemark=" + srwRemark + ", srwAuditing=" + srwAuditing + ", srwYn=" + srwYn + ", srwCustom1="
				+ srwCustom1 + ", srwCustom2=" + srwCustom2 + ", srwCustom3=" + srwCustom3 + ", srwCustom4="
				+ srwCustom4 + ", srwCustom5=" + srwCustom5 + ", srwCustom6=" + srwCustom6 + ", list=" + list + "]";
	}





	public String getSrwId() {
		return srwId;
	}



	public void setSrwId(String srwId) {
		this.srwId = srwId;
	}



	public String getCustomerId() {
		return customerId;
	}



	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}



	public String getSrwAddress() {
		return srwAddress;
	}



	public void setSrwAddress(String srwAddress) {
		this.srwAddress = srwAddress;
	}



	public String getSrwtId() {
		return srwtId;
	}



	public void setSrwtId(String srwtId) {
		this.srwtId = srwtId;
	}



	public String getSrwPriceIncludeTax() {
		return srwPriceIncludeTax;
	}



	public void setSrwPriceIncludeTax(String srwPriceIncludeTax) {
		this.srwPriceIncludeTax = srwPriceIncludeTax;
	}



	public Integer getSalescxrk() {
		return salescxrk;
	}



	public void setSalescxrk(Integer salescxrk) {
		this.salescxrk = salescxrk;
	}



	public String getWarehouseId() {
		return warehouseId;
	}



	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}



	public String getSrwCertificateNumber() {
		return srwCertificateNumber;
	}



	public void setSrwCertificateNumber(String srwCertificateNumber) {
		this.srwCertificateNumber = srwCertificateNumber;
	}



	public Date getSrwDocumentDate() {
		return srwDocumentDate;
	}



	public void setSrwDocumentDate(Date srwDocumentDate) {
		this.srwDocumentDate = srwDocumentDate;
	}



	public String getSrwDocumentNumber() {
		return srwDocumentNumber;
	}



	public void setSrwDocumentNumber(String srwDocumentNumber) {
		this.srwDocumentNumber = srwDocumentNumber;
	}



	public String getCurrencyId() {
		return currencyId;
	}



	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}



	public Float getSrwExchangeRate() {
		return srwExchangeRate;
	}



	public void setSrwExchangeRate(Float srwExchangeRate) {
		this.srwExchangeRate = srwExchangeRate;
	}



	public String getSrwForeignTrade() {
		return srwForeignTrade;
	}



	public void setSrwForeignTrade(String srwForeignTrade) {
		this.srwForeignTrade = srwForeignTrade;
	}



	public Integer getSrwSunnum() {
		return srwSunnum;
	}



	public void setSrwSunnum(Integer srwSunnum) {
		this.srwSunnum = srwSunnum;
	}



	public Float getSrwSunmoney() {
		return srwSunmoney;
	}



	public void setSrwSunmoney(Float srwSunmoney) {
		this.srwSunmoney = srwSunmoney;
	}



	public Float getSrwTax() {
		return srwTax;
	}



	public void setSrwTax(Float srwTax) {
		this.srwTax = srwTax;
	}



	public Float getSrwIncludingTaxAmount() {
		return srwIncludingTaxAmount;
	}



	public void setSrwIncludingTaxAmount(Float srwIncludingTaxAmount) {
		this.srwIncludingTaxAmount = srwIncludingTaxAmount;
	}



	public String getSrwSaleszkgs() {
		return srwSaleszkgs;
	}



	public void setSrwSaleszkgs(String srwSaleszkgs) {
		this.srwSaleszkgs = srwSaleszkgs;
	}



	public String getSrwSalesdate() {
		return srwSalesdate;
	}



	public void setSrwSalesdate(String srwSalesdate) {
		this.srwSalesdate = srwSalesdate;
	}



	public String getSrwSalessktj() {
		return srwSalessktj;
	}



	public void setSrwSalessktj(String srwSalessktj) {
		this.srwSalessktj = srwSalessktj;
	}



	public Integer getSrwSalesday() {
		return srwSalesday;
	}



	public void setSrwSalesday(Integer srwSalesday) {
		this.srwSalesday = srwSalesday;
	}



	public String getSrwSalesyue() {
		return srwSalesyue;
	}



	public void setSrwSalesyue(String srwSalesyue) {
		this.srwSalesyue = srwSalesyue;
	}



	public String getSrwBuyer() {
		return srwBuyer;
	}



	public void setSrwBuyer(String srwBuyer) {
		this.srwBuyer = srwBuyer;
	}



	public String getSrwBelongsSection() {
		return srwBelongsSection;
	}



	public void setSrwBelongsSection(String srwBelongsSection) {
		this.srwBelongsSection = srwBelongsSection;
	}



	public String getSrwBelongsProject() {
		return srwBelongsProject;
	}



	public void setSrwBelongsProject(String srwBelongsProject) {
		this.srwBelongsProject = srwBelongsProject;
	}



	public String getSrwForm() {
		return srwForm;
	}



	public void setSrwForm(String srwForm) {
		this.srwForm = srwForm;
	}



	public String getSrwCheckagainStaff() {
		return srwCheckagainStaff;
	}



	public void setSrwCheckagainStaff(String srwCheckagainStaff) {
		this.srwCheckagainStaff = srwCheckagainStaff;
	}



	public String getSrwHeaderProvision() {
		return srwHeaderProvision;
	}



	public void setSrwHeaderProvision(String srwHeaderProvision) {
		this.srwHeaderProvision = srwHeaderProvision;
	}



	public String getSrwEndClause() {
		return srwEndClause;
	}



	public void setSrwEndClause(String srwEndClause) {
		this.srwEndClause = srwEndClause;
	}



	public String getSrwRemark() {
		return srwRemark;
	}



	public void setSrwRemark(String srwRemark) {
		this.srwRemark = srwRemark;
	}



	public String getSrwAuditing() {
		return srwAuditing;
	}



	public void setSrwAuditing(String srwAuditing) {
		this.srwAuditing = srwAuditing;
	}



	public String getSrwYn() {
		return srwYn;
	}



	public void setSrwYn(String srwYn) {
		this.srwYn = srwYn;
	}



	public String getSrwCustom1() {
		return srwCustom1;
	}



	public void setSrwCustom1(String srwCustom1) {
		this.srwCustom1 = srwCustom1;
	}



	public String getSrwCustom2() {
		return srwCustom2;
	}



	public void setSrwCustom2(String srwCustom2) {
		this.srwCustom2 = srwCustom2;
	}



	public String getSrwCustom3() {
		return srwCustom3;
	}



	public void setSrwCustom3(String srwCustom3) {
		this.srwCustom3 = srwCustom3;
	}



	public String getSrwCustom4() {
		return srwCustom4;
	}



	public void setSrwCustom4(String srwCustom4) {
		this.srwCustom4 = srwCustom4;
	}



	public String getSrwCustom5() {
		return srwCustom5;
	}



	public void setSrwCustom5(String srwCustom5) {
		this.srwCustom5 = srwCustom5;
	}



	public String getSrwCustom6() {
		return srwCustom6;
	}



	public void setSrwCustom6(String srwCustom6) {
		this.srwCustom6 = srwCustom6;
	}



	public List<Sales_return_warehouse_detailed> getList() {
		return list;
	}



	public void setList(List<Sales_return_warehouse_detailed> list) {
		this.list = list;
	}
	
	


}