package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 采购退货主表
 * @author 刘成
 *
 */
public class Purchase_returns {
    private String pureId;//id（主键 唯一）
    private String supplierId;//供应商id
    private String pureEngname;//供应商地址
    private String puretId;//采购入库类型id
    private String purePriceIncludeTax;//单价是否含税
    private Integer warehouseId;//仓库id
    private String pureSingleStatus;//凭证编号
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date pureDocumentDate;//单据日期
    private String pureDocumentNumber;//单据号码
    private String currencyId;//币别id
    private Float pureExchangeRate;//汇率
    private Integer pureForeignTrade;//国外贸易（默认否）
    private Integer pureSunnum;//总数量
    private Float pureSunmoney;//总金额
    private Float pureTax;//总税额
    private Float pureIncludeTaxAmount;//总含税金额
    private String pureDeliveryAddress;//送货地址
    private String pureBuyer;//采购人员
    private String pureBelongsSection;//所属部门
    private String pureBelongsProject;//所属项目
    private String pureExecutor;//制单人员
    private String pureCheckagainStaff;//复核人员
    private String pureHeaderProvision;//表头条文
    private String pureEndClause;//表尾条文
    private String pureRemark;//备注
    private String pureAudition;//是否审核
    private String pureYn;//是否删除（0 否 1 是 ，默认0）
    private String pureCustom1;//自定义1
    private String pureCustom2;//自定义2
    private String pureCustom3;//自定义3
    private String pureCustom4;//自定义4
    private String pureCustom5;//自定义5
    private String pureCustom6;//自定义6
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date createDate;//修改时间
    private int lineId;//行编号
    
    

    public Purchase_returns() {
		super();
	}

	




	@Override
	public String toString() {
		return "Purchase_returns [pureId=" + pureId + ", supplierId=" + supplierId + ", pureEngname=" + pureEngname
				+ ", puretId=" + puretId + ", purePriceIncludeTax=" + purePriceIncludeTax + ", warehouseId="
				+ warehouseId + ", pureSingleStatus=" + pureSingleStatus + ", pureDocumentDate=" + pureDocumentDate
				+ ", pureDocumentNumber=" + pureDocumentNumber + ", currencyId=" + currencyId + ", pureExchangeRate="
				+ pureExchangeRate + ", pureForeignTrade=" + pureForeignTrade + ", pureSunnum=" + pureSunnum
				+ ", pureSunmoney=" + pureSunmoney + ", pureTax=" + pureTax + ", pureIncludeTaxAmount="
				+ pureIncludeTaxAmount + ", pureDeliveryAddress=" + pureDeliveryAddress + ", pureBuyer=" + pureBuyer
				+ ", pureBelongsSection=" + pureBelongsSection + ", pureBelongsProject=" + pureBelongsProject
				+ ", pureExecutor=" + pureExecutor + ", pureCheckagainStaff=" + pureCheckagainStaff
				+ ", pureHeaderProvision=" + pureHeaderProvision + ", pureEndClause=" + pureEndClause + ", pureRemark="
				+ pureRemark + ", pureAudition=" + pureAudition + ", pureYn=" + pureYn + ", pureCustom1=" + pureCustom1
				+ ", pureCustom2=" + pureCustom2 + ", pureCustom3=" + pureCustom3 + ", pureCustom4=" + pureCustom4
				+ ", pureCustom5=" + pureCustom5 + ", pureCustom6=" + pureCustom6 + ", createDate=" + createDate
				+ ", lineId=" + lineId + "]";
	}






	public String getPureId() {
        return pureId;
    }

    public void setPureId(String pureId) {
        this.pureId = pureId == null ? null : pureId.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getPureEngname() {
        return pureEngname;
    }

    public void setPureEngname(String pureEngname) {
        this.pureEngname = pureEngname == null ? null : pureEngname.trim();
    }

    public String getPuretId() {
        return puretId;
    }

    public void setPuretId(String puretId) {
        this.puretId = puretId == null ? null : puretId.trim();
    }

    public String getPurePriceIncludeTax() {
        return purePriceIncludeTax;
    }

    public void setPurePriceIncludeTax(String purePriceIncludeTax) {
        this.purePriceIncludeTax = purePriceIncludeTax == null ? null : purePriceIncludeTax.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getPureSingleStatus() {
        return pureSingleStatus;
    }

    public void setPureSingleStatus(String pureSingleStatus) {
        this.pureSingleStatus = pureSingleStatus == null ? null : pureSingleStatus.trim();
    }

    public Date getPureDocumentDate() {
        return pureDocumentDate;
    }

    public void setPureDocumentDate(Date pureDocumentDate) {
        this.pureDocumentDate = pureDocumentDate;
    }

    public String getPureDocumentNumber() {
        return pureDocumentNumber;
    }

    public void setPureDocumentNumber(String pureDocumentNumber) {
        this.pureDocumentNumber = pureDocumentNumber == null ? null : pureDocumentNumber.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public Float getPureExchangeRate() {
        return pureExchangeRate;
    }

    public void setPureExchangeRate(Float pureExchangeRate) {
        this.pureExchangeRate = pureExchangeRate;
    }

    public Integer getPureForeignTrade() {
        return pureForeignTrade;
    }

    public void setPureForeignTrade(Integer pureForeignTrade) {
        this.pureForeignTrade = pureForeignTrade;
    }

    public Integer getPureSunnum() {
        return pureSunnum;
    }

    public void setPureSunnum(Integer pureSunnum) {
        this.pureSunnum = pureSunnum;
    }

    public Float getPureSunmoney() {
        return pureSunmoney;
    }

    public void setPureSunmoney(Float pureSunmoney) {
        this.pureSunmoney = pureSunmoney;
    }

    public Float getPureTax() {
        return pureTax;
    }

    public void setPureTax(Float pureTax) {
        this.pureTax = pureTax;
    }

    public Float getPureIncludeTaxAmount() {
        return pureIncludeTaxAmount;
    }

    public void setPureIncludeTaxAmount(Float pureIncludeTaxAmount) {
        this.pureIncludeTaxAmount = pureIncludeTaxAmount;
    }

    public String getPureDeliveryAddress() {
        return pureDeliveryAddress;
    }

    public void setPureDeliveryAddress(String pureDeliveryAddress) {
        this.pureDeliveryAddress = pureDeliveryAddress == null ? null : pureDeliveryAddress.trim();
    }

    public String getPureBuyer() {
        return pureBuyer;
    }

    public void setPureBuyer(String pureBuyer) {
        this.pureBuyer = pureBuyer == null ? null : pureBuyer.trim();
    }

    public String getPureBelongsSection() {
        return pureBelongsSection;
    }

    public void setPureBelongsSection(String pureBelongsSection) {
        this.pureBelongsSection = pureBelongsSection == null ? null : pureBelongsSection.trim();
    }

    public String getPureBelongsProject() {
        return pureBelongsProject;
    }

    public void setPureBelongsProject(String pureBelongsProject) {
        this.pureBelongsProject = pureBelongsProject == null ? null : pureBelongsProject.trim();
    }

    public String getPureExecutor() {
        return pureExecutor;
    }

    public void setPureExecutor(String pureExecutor) {
        this.pureExecutor = pureExecutor == null ? null : pureExecutor.trim();
    }

    public String getPureCheckagainStaff() {
        return pureCheckagainStaff;
    }

    public void setPureCheckagainStaff(String pureCheckagainStaff) {
        this.pureCheckagainStaff = pureCheckagainStaff == null ? null : pureCheckagainStaff.trim();
    }

    public String getPureHeaderProvision() {
        return pureHeaderProvision;
    }

    public void setPureHeaderProvision(String pureHeaderProvision) {
        this.pureHeaderProvision = pureHeaderProvision == null ? null : pureHeaderProvision.trim();
    }

    public String getPureEndClause() {
        return pureEndClause;
    }

    public void setPureEndClause(String pureEndClause) {
        this.pureEndClause = pureEndClause == null ? null : pureEndClause.trim();
    }

    public String getPureRemark() {
        return pureRemark;
    }

    public void setPureRemark(String pureRemark) {
        this.pureRemark = pureRemark == null ? null : pureRemark.trim();
    }

    public String getPureAudition() {
        return pureAudition;
    }

    public void setPureAudition(String pureAudition) {
        this.pureAudition = pureAudition == null ? null : pureAudition.trim();
    }

    public String getPureYn() {
        return pureYn;
    }

    public void setPureYn(String pureYn) {
        this.pureYn = pureYn == null ? null : pureYn.trim();
    }

    public String getPureCustom1() {
        return pureCustom1;
    }

    public void setPureCustom1(String pureCustom1) {
        this.pureCustom1 = pureCustom1 == null ? null : pureCustom1.trim();
    }

    public String getPureCustom2() {
        return pureCustom2;
    }

    public void setPureCustom2(String pureCustom2) {
        this.pureCustom2 = pureCustom2 == null ? null : pureCustom2.trim();
    }

    public String getPureCustom3() {
        return pureCustom3;
    }

    public void setPureCustom3(String pureCustom3) {
        this.pureCustom3 = pureCustom3 == null ? null : pureCustom3.trim();
    }

    public String getPureCustom4() {
        return pureCustom4;
    }

    public void setPureCustom4(String pureCustom4) {
        this.pureCustom4 = pureCustom4 == null ? null : pureCustom4.trim();
    }

    public String getPureCustom5() {
        return pureCustom5;
    }

    public void setPureCustom5(String pureCustom5) {
        this.pureCustom5 = pureCustom5 == null ? null : pureCustom5.trim();
    }

    public String getPureCustom6() {
        return pureCustom6;
    }

    public void setPureCustom6(String pureCustom6) {
        this.pureCustom6 = pureCustom6 == null ? null : pureCustom6.trim();
    }
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getLineId() {
		return lineId;
	}
	public void setLineId(int lineId) {
		this.lineId = lineId;
	}
    
	
	
    
}