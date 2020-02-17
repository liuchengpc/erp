package com.apatech.domain;

import java.util.Date;

public class Purchasing_order {
    private String poId;

    private String supplierId;

    private String poEngname;

    private String potId;

    private String poPriceIncludeTax;

    private String poSingleStatus;

    private Date poDocumentDate;

    private String poDocumentNumber;

    private String currencyId;

    private Float poExchangeRate;

    private String poDeliveryAddress;

    private String poBuyer;

    private String poBelongsSection;

    private String poBelongsProject;

    private String poHeaderProvision;

    private String poEndClause;

    private String poRemark;

    private String poAudition;

    private String poYn;

    private String poCustom1;

    private String poCustom2;

    private String poCustom3;

    private String poCustom4;

    private String poCustom5;

    private String poCustom6;

    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId == null ? null : poId.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getPoEngname() {
        return poEngname;
    }

    public void setPoEngname(String poEngname) {
        this.poEngname = poEngname == null ? null : poEngname.trim();
    }

    public String getPotId() {
        return potId;
    }

    public void setPotId(String potId) {
        this.potId = potId == null ? null : potId.trim();
    }

    public String getPoPriceIncludeTax() {
        return poPriceIncludeTax;
    }

    public void setPoPriceIncludeTax(String poPriceIncludeTax) {
        this.poPriceIncludeTax = poPriceIncludeTax == null ? null : poPriceIncludeTax.trim();
    }

    public String getPoSingleStatus() {
        return poSingleStatus;
    }

    public void setPoSingleStatus(String poSingleStatus) {
        this.poSingleStatus = poSingleStatus == null ? null : poSingleStatus.trim();
    }

    public Date getPoDocumentDate() {
        return poDocumentDate;
    }

    public void setPoDocumentDate(Date poDocumentDate) {
        this.poDocumentDate = poDocumentDate;
    }

    public String getPoDocumentNumber() {
        return poDocumentNumber;
    }

    public void setPoDocumentNumber(String poDocumentNumber) {
        this.poDocumentNumber = poDocumentNumber == null ? null : poDocumentNumber.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public Float getPoExchangeRate() {
        return poExchangeRate;
    }

    public void setPoExchangeRate(Float poExchangeRate) {
        this.poExchangeRate = poExchangeRate;
    }

    public String getPoDeliveryAddress() {
        return poDeliveryAddress;
    }

    public void setPoDeliveryAddress(String poDeliveryAddress) {
        this.poDeliveryAddress = poDeliveryAddress == null ? null : poDeliveryAddress.trim();
    }

    public String getPoBuyer() {
        return poBuyer;
    }

    public void setPoBuyer(String poBuyer) {
        this.poBuyer = poBuyer == null ? null : poBuyer.trim();
    }

    public String getPoBelongsSection() {
        return poBelongsSection;
    }

    public void setPoBelongsSection(String poBelongsSection) {
        this.poBelongsSection = poBelongsSection == null ? null : poBelongsSection.trim();
    }

    public String getPoBelongsProject() {
        return poBelongsProject;
    }

    public void setPoBelongsProject(String poBelongsProject) {
        this.poBelongsProject = poBelongsProject == null ? null : poBelongsProject.trim();
    }

    public String getPoHeaderProvision() {
        return poHeaderProvision;
    }

    public void setPoHeaderProvision(String poHeaderProvision) {
        this.poHeaderProvision = poHeaderProvision == null ? null : poHeaderProvision.trim();
    }

    public String getPoEndClause() {
        return poEndClause;
    }

    public void setPoEndClause(String poEndClause) {
        this.poEndClause = poEndClause == null ? null : poEndClause.trim();
    }

    public String getPoRemark() {
        return poRemark;
    }

    public void setPoRemark(String poRemark) {
        this.poRemark = poRemark == null ? null : poRemark.trim();
    }

    public String getPoAudition() {
        return poAudition;
    }

    public void setPoAudition(String poAudition) {
        this.poAudition = poAudition == null ? null : poAudition.trim();
    }

    public String getPoYn() {
        return poYn;
    }

    public void setPoYn(String poYn) {
        this.poYn = poYn == null ? null : poYn.trim();
    }

    public String getPoCustom1() {
        return poCustom1;
    }

    public void setPoCustom1(String poCustom1) {
        this.poCustom1 = poCustom1 == null ? null : poCustom1.trim();
    }

    public String getPoCustom2() {
        return poCustom2;
    }

    public void setPoCustom2(String poCustom2) {
        this.poCustom2 = poCustom2 == null ? null : poCustom2.trim();
    }

    public String getPoCustom3() {
        return poCustom3;
    }

    public void setPoCustom3(String poCustom3) {
        this.poCustom3 = poCustom3 == null ? null : poCustom3.trim();
    }

    public String getPoCustom4() {
        return poCustom4;
    }

    public void setPoCustom4(String poCustom4) {
        this.poCustom4 = poCustom4 == null ? null : poCustom4.trim();
    }

    public String getPoCustom5() {
        return poCustom5;
    }

    public void setPoCustom5(String poCustom5) {
        this.poCustom5 = poCustom5 == null ? null : poCustom5.trim();
    }

    public String getPoCustom6() {
        return poCustom6;
    }

    public void setPoCustom6(String poCustom6) {
        this.poCustom6 = poCustom6 == null ? null : poCustom6.trim();
    }
}