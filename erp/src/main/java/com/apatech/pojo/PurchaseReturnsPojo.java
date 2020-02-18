package com.apatech.pojo;

import com.apatech.domain.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 采购退货 pojo
 * author:dev-shaw
 * date:2020-2-16 22:25:10
 */
public class PurchaseReturnsPojo {
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
    private List<Purchase_returns_detailed> details = new ArrayList<>(); // 详表内容
    private Supplier supplier; // 供应商信息
    private Warehouse warehouse; // 仓库信息
    private Currency currency; // 货币信息
    private Purchase_storage purchaseStorage; // 采购入库类型信息

    public String getPureId() {
        return pureId;
    }

    public void setPureId(String pureId) {
        this.pureId = pureId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getPureEngname() {
        return pureEngname;
    }

    public void setPureEngname(String pureEngname) {
        this.pureEngname = pureEngname;
    }

    public String getPuretId() {
        return puretId;
    }

    public void setPuretId(String puretId) {
        this.puretId = puretId;
    }

    public String getPurePriceIncludeTax() {
        return purePriceIncludeTax;
    }

    public void setPurePriceIncludeTax(String purePriceIncludeTax) {
        this.purePriceIncludeTax = purePriceIncludeTax;
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
        this.pureSingleStatus = pureSingleStatus;
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
        this.pureDocumentNumber = pureDocumentNumber;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
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
        this.pureDeliveryAddress = pureDeliveryAddress;
    }

    public String getPureBuyer() {
        return pureBuyer;
    }

    public void setPureBuyer(String pureBuyer) {
        this.pureBuyer = pureBuyer;
    }

    public String getPureBelongsSection() {
        return pureBelongsSection;
    }

    public void setPureBelongsSection(String pureBelongsSection) {
        this.pureBelongsSection = pureBelongsSection;
    }

    public String getPureBelongsProject() {
        return pureBelongsProject;
    }

    public void setPureBelongsProject(String pureBelongsProject) {
        this.pureBelongsProject = pureBelongsProject;
    }

    public String getPureExecutor() {
        return pureExecutor;
    }

    public void setPureExecutor(String pureExecutor) {
        this.pureExecutor = pureExecutor;
    }

    public String getPureCheckagainStaff() {
        return pureCheckagainStaff;
    }

    public void setPureCheckagainStaff(String pureCheckagainStaff) {
        this.pureCheckagainStaff = pureCheckagainStaff;
    }

    public String getPureHeaderProvision() {
        return pureHeaderProvision;
    }

    public void setPureHeaderProvision(String pureHeaderProvision) {
        this.pureHeaderProvision = pureHeaderProvision;
    }

    public String getPureEndClause() {
        return pureEndClause;
    }

    public void setPureEndClause(String pureEndClause) {
        this.pureEndClause = pureEndClause;
    }

    public String getPureRemark() {
        return pureRemark;
    }

    public void setPureRemark(String pureRemark) {
        this.pureRemark = pureRemark;
    }

    public String getPureAudition() {
        return pureAudition;
    }

    public void setPureAudition(String pureAudition) {
        this.pureAudition = pureAudition;
    }

    public String getPureYn() {
        return pureYn;
    }

    public void setPureYn(String pureYn) {
        this.pureYn = pureYn;
    }

    public String getPureCustom1() {
        return pureCustom1;
    }

    public void setPureCustom1(String pureCustom1) {
        this.pureCustom1 = pureCustom1;
    }

    public String getPureCustom2() {
        return pureCustom2;
    }

    public void setPureCustom2(String pureCustom2) {
        this.pureCustom2 = pureCustom2;
    }

    public String getPureCustom3() {
        return pureCustom3;
    }

    public void setPureCustom3(String pureCustom3) {
        this.pureCustom3 = pureCustom3;
    }

    public String getPureCustom4() {
        return pureCustom4;
    }

    public void setPureCustom4(String pureCustom4) {
        this.pureCustom4 = pureCustom4;
    }

    public String getPureCustom5() {
        return pureCustom5;
    }

    public void setPureCustom5(String pureCustom5) {
        this.pureCustom5 = pureCustom5;
    }

    public String getPureCustom6() {
        return pureCustom6;
    }

    public void setPureCustom6(String pureCustom6) {
        this.pureCustom6 = pureCustom6;
    }

    public List<Purchase_returns_detailed> getDetails() {
        return details;
    }

    public void setDetails(List<Purchase_returns_detailed> details) {
        this.details = details;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Purchase_storage getPurchaseStorage() {
        return purchaseStorage;
    }

    public void setPurchaseStorage(Purchase_storage purchaseStorage) {
        this.purchaseStorage = purchaseStorage;
    }

    public PurchaseReturnsPojo(){}

    public PurchaseReturnsPojo(String pureId, String supplierId, String pureEngname, String puretId, String purePriceIncludeTax, Integer warehouseId, String pureSingleStatus, Date pureDocumentDate, String pureDocumentNumber, String currencyId, Float pureExchangeRate, Integer pureForeignTrade, Integer pureSunnum, Float pureSunmoney, Float pureTax, Float pureIncludeTaxAmount, String pureDeliveryAddress, String pureBuyer, String pureBelongsSection, String pureBelongsProject, String pureExecutor, String pureCheckagainStaff, String pureHeaderProvision, String pureEndClause, String pureRemark, String pureAudition, String pureYn, String pureCustom1, String pureCustom2, String pureCustom3, String pureCustom4, String pureCustom5, String pureCustom6, List<Purchase_returns_detailed> details, Supplier supplier, Warehouse warehouse, Currency currency, Purchase_storage purchaseStorage) {
        this.pureId = pureId;
        this.supplierId = supplierId;
        this.pureEngname = pureEngname;
        this.puretId = puretId;
        this.purePriceIncludeTax = purePriceIncludeTax;
        this.warehouseId = warehouseId;
        this.pureSingleStatus = pureSingleStatus;
        this.pureDocumentDate = pureDocumentDate;
        this.pureDocumentNumber = pureDocumentNumber;
        this.currencyId = currencyId;
        this.pureExchangeRate = pureExchangeRate;
        this.pureForeignTrade = pureForeignTrade;
        this.pureSunnum = pureSunnum;
        this.pureSunmoney = pureSunmoney;
        this.pureTax = pureTax;
        this.pureIncludeTaxAmount = pureIncludeTaxAmount;
        this.pureDeliveryAddress = pureDeliveryAddress;
        this.pureBuyer = pureBuyer;
        this.pureBelongsSection = pureBelongsSection;
        this.pureBelongsProject = pureBelongsProject;
        this.pureExecutor = pureExecutor;
        this.pureCheckagainStaff = pureCheckagainStaff;
        this.pureHeaderProvision = pureHeaderProvision;
        this.pureEndClause = pureEndClause;
        this.pureRemark = pureRemark;
        this.pureAudition = pureAudition;
        this.pureYn = pureYn;
        this.pureCustom1 = pureCustom1;
        this.pureCustom2 = pureCustom2;
        this.pureCustom3 = pureCustom3;
        this.pureCustom4 = pureCustom4;
        this.pureCustom5 = pureCustom5;
        this.pureCustom6 = pureCustom6;
        this.details = details;
        this.supplier = supplier;
        this.warehouse = warehouse;
        this.currency = currency;
        this.purchaseStorage = purchaseStorage;
    }
}
