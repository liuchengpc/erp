package com.apatech.pojo;

import com.apatech.domain.Currency;
import com.apatech.domain.Purchase_storage_detailed;
import com.apatech.domain.Supplier;
import com.apatech.domain.Warehouse;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseStoragePojo {
    private String psId;//id（主键 唯一）
    private String supplierId;//供应商id
    private String psEngname;//供应商地址
    private String pstId;//采购入库类型id
    private String psPriceIncludeTax;//单价是否含税
    private Integer warehouseId;//仓库id
    private String psSingleStatus;//凭证编号
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date psDocumentDate;//单据日期
    private String psDocumentNumber;//单据号码
    private String currencyId;//币别id
    private Float psExchangeRate;//汇率
    private Integer psForeignTrade;//国外贸易（默认否）
    private Integer psSunnum;//总数量
    private Float psSunmoney;//总金额
    private Float psTax;//总税额
    private Float psIncludeTaxAmount;//总含税金额
    private String psDeliveryAddress;//送货地址
    private String psBuyer;//采购人员
    private String psBelongsSection;//所属部门
    private String psBelongsProject;//所属项目
    private String psExecutor;//制单人员
    private String psCheckagainStaff;//复核人员
    private String psHeaderProvision;//表头条文
    private String psEndClause;//表尾条文
    private String psRemark;//备注
    private String psAudition;//是否审核
    private String psYn;//是否删除（0 否 1 是 ，默认0）
    private String psCustom1;//自定义1
    private String psCustom2;//自定义2
    private String psCustom3;//自定义3
    private String psCustom4;//自定义4
    private String psCustom5;//自定义5
    private String psCustom6;//自定义6

    private List<Purchase_storage_detailed> details = new ArrayList<>(); // 详表信息
    private Supplier supplier; // 供应商信息
    private Warehouse warehouse; // 仓库信息
    private Currency currency; // 货币信息

    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getPsEngname() {
        return psEngname;
    }

    public void setPsEngname(String psEngname) {
        this.psEngname = psEngname;
    }

    public String getPstId() {
        return pstId;
    }

    public void setPstId(String pstId) {
        this.pstId = pstId;
    }

    public String getPsPriceIncludeTax() {
        return psPriceIncludeTax;
    }

    public void setPsPriceIncludeTax(String psPriceIncludeTax) {
        this.psPriceIncludeTax = psPriceIncludeTax;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getPsSingleStatus() {
        return psSingleStatus;
    }

    public void setPsSingleStatus(String psSingleStatus) {
        this.psSingleStatus = psSingleStatus;
    }

    public Date getPsDocumentDate() {
        return psDocumentDate;
    }

    public void setPsDocumentDate(Date psDocumentDate) {
        this.psDocumentDate = psDocumentDate;
    }

    public String getPsDocumentNumber() {
        return psDocumentNumber;
    }

    public void setPsDocumentNumber(String psDocumentNumber) {
        this.psDocumentNumber = psDocumentNumber;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Float getPsExchangeRate() {
        return psExchangeRate;
    }

    public void setPsExchangeRate(Float psExchangeRate) {
        this.psExchangeRate = psExchangeRate;
    }

    public Integer getPsForeignTrade() {
        return psForeignTrade;
    }

    public void setPsForeignTrade(Integer psForeignTrade) {
        this.psForeignTrade = psForeignTrade;
    }

    public Integer getPsSunnum() {
        return psSunnum;
    }

    public void setPsSunnum(Integer psSunnum) {
        this.psSunnum = psSunnum;
    }

    public Float getPsSunmoney() {
        return psSunmoney;
    }

    public void setPsSunmoney(Float psSunmoney) {
        this.psSunmoney = psSunmoney;
    }

    public Float getPsTax() {
        return psTax;
    }

    public void setPsTax(Float psTax) {
        this.psTax = psTax;
    }

    public Float getPsIncludeTaxAmount() {
        return psIncludeTaxAmount;
    }

    public void setPsIncludeTaxAmount(Float psIncludeTaxAmount) {
        this.psIncludeTaxAmount = psIncludeTaxAmount;
    }

    public String getPsDeliveryAddress() {
        return psDeliveryAddress;
    }

    public void setPsDeliveryAddress(String psDeliveryAddress) {
        this.psDeliveryAddress = psDeliveryAddress;
    }

    public String getPsBuyer() {
        return psBuyer;
    }

    public void setPsBuyer(String psBuyer) {
        this.psBuyer = psBuyer;
    }

    public String getPsBelongsSection() {
        return psBelongsSection;
    }

    public void setPsBelongsSection(String psBelongsSection) {
        this.psBelongsSection = psBelongsSection;
    }

    public String getPsBelongsProject() {
        return psBelongsProject;
    }

    public void setPsBelongsProject(String psBelongsProject) {
        this.psBelongsProject = psBelongsProject;
    }

    public String getPsExecutor() {
        return psExecutor;
    }

    public void setPsExecutor(String psExecutor) {
        this.psExecutor = psExecutor;
    }

    public String getPsCheckagainStaff() {
        return psCheckagainStaff;
    }

    public void setPsCheckagainStaff(String psCheckagainStaff) {
        this.psCheckagainStaff = psCheckagainStaff;
    }

    public String getPsHeaderProvision() {
        return psHeaderProvision;
    }

    public void setPsHeaderProvision(String psHeaderProvision) {
        this.psHeaderProvision = psHeaderProvision;
    }

    public String getPsEndClause() {
        return psEndClause;
    }

    public void setPsEndClause(String psEndClause) {
        this.psEndClause = psEndClause;
    }

    public String getPsRemark() {
        return psRemark;
    }

    public void setPsRemark(String psRemark) {
        this.psRemark = psRemark;
    }

    public String getPsAudition() {
        return psAudition;
    }

    public void setPsAudition(String psAudition) {
        this.psAudition = psAudition;
    }

    public String getPsYn() {
        return psYn;
    }

    public void setPsYn(String psYn) {
        this.psYn = psYn;
    }

    public String getPsCustom1() {
        return psCustom1;
    }

    public void setPsCustom1(String psCustom1) {
        this.psCustom1 = psCustom1;
    }

    public String getPsCustom2() {
        return psCustom2;
    }

    public void setPsCustom2(String psCustom2) {
        this.psCustom2 = psCustom2;
    }

    public String getPsCustom3() {
        return psCustom3;
    }

    public void setPsCustom3(String psCustom3) {
        this.psCustom3 = psCustom3;
    }

    public String getPsCustom4() {
        return psCustom4;
    }

    public void setPsCustom4(String psCustom4) {
        this.psCustom4 = psCustom4;
    }

    public String getPsCustom5() {
        return psCustom5;
    }

    public void setPsCustom5(String psCustom5) {
        this.psCustom5 = psCustom5;
    }

    public String getPsCustom6() {
        return psCustom6;
    }

    public void setPsCustom6(String psCustom6) {
        this.psCustom6 = psCustom6;
    }

    public List<Purchase_storage_detailed> getDetails() {
        return details;
    }

    public void setDetails(List<Purchase_storage_detailed> details) {
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

    public PurchaseStoragePojo(){}

    public PurchaseStoragePojo(String psId, String supplierId, String psEngname, String pstId, String psPriceIncludeTax, Integer warehouseId, String psSingleStatus, Date psDocumentDate, String psDocumentNumber, String currencyId, Float psExchangeRate, Integer psForeignTrade, Integer psSunnum, Float psSunmoney, Float psTax, Float psIncludeTaxAmount, String psDeliveryAddress, String psBuyer, String psBelongsSection, String psBelongsProject, String psExecutor, String psCheckagainStaff, String psHeaderProvision, String psEndClause, String psRemark, String psAudition, String psYn, String psCustom1, String psCustom2, String psCustom3, String psCustom4, String psCustom5, String psCustom6, List<Purchase_storage_detailed> details, Supplier supplier, Warehouse warehouse, Currency currency) {
        this.psId = psId;
        this.supplierId = supplierId;
        this.psEngname = psEngname;
        this.pstId = pstId;
        this.psPriceIncludeTax = psPriceIncludeTax;
        this.warehouseId = warehouseId;
        this.psSingleStatus = psSingleStatus;
        this.psDocumentDate = psDocumentDate;
        this.psDocumentNumber = psDocumentNumber;
        this.currencyId = currencyId;
        this.psExchangeRate = psExchangeRate;
        this.psForeignTrade = psForeignTrade;
        this.psSunnum = psSunnum;
        this.psSunmoney = psSunmoney;
        this.psTax = psTax;
        this.psIncludeTaxAmount = psIncludeTaxAmount;
        this.psDeliveryAddress = psDeliveryAddress;
        this.psBuyer = psBuyer;
        this.psBelongsSection = psBelongsSection;
        this.psBelongsProject = psBelongsProject;
        this.psExecutor = psExecutor;
        this.psCheckagainStaff = psCheckagainStaff;
        this.psHeaderProvision = psHeaderProvision;
        this.psEndClause = psEndClause;
        this.psRemark = psRemark;
        this.psAudition = psAudition;
        this.psYn = psYn;
        this.psCustom1 = psCustom1;
        this.psCustom2 = psCustom2;
        this.psCustom3 = psCustom3;
        this.psCustom4 = psCustom4;
        this.psCustom5 = psCustom5;
        this.psCustom6 = psCustom6;
        this.details = details;
        this.supplier = supplier;
        this.warehouse = warehouse;
        this.currency = currency;
    }
}
