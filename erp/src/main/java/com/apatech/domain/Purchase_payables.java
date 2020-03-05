package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Purchase_payables {
    private Integer ppId;

    private String ppType;

    private String ppNumber;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date ppDate;

    private String ppPcId;

    private String ppPcName;

    private String ppTeamId;

    private String ppTeamName; 

    private String ppBuyer;

    private String ppProjectName;

    private String ppCurrency;

    private Float ppExchangeRate;

    private Double ppPayablesmainPrice;

    private Float ppCurrentbalance;

    private Float ppDiscountamount;

    private Float ppAmountcharged;

    private Float ppOffsetamount;

    private String ppAuditing;

    private String ppYn;

    private String ppCustom1;

    private String ppCustom2;		//单据号码

    private String ppCustom3;

    private String ppCustom4;

    private String ppCustom5;

    private String ppCustom6;

    private String ppCustom7;		//审核明细账款

    private String ppCustom8;		//关联应付款主表ID

    private String ppCustom9;		//判断是否为空，默认空值

    private String ppCustom10;

    public Integer getPpId() {
        return ppId;
    }

    public void setPpId(Integer ppId) {
        this.ppId = ppId;
    }

    public String getPpType() {
        return ppType;
    }

    public void setPpType(String ppType) {
        this.ppType = ppType == null ? null : ppType.trim();
    }

    public String getPpNumber() {
        return ppNumber;
    }

    public void setPpNumber(String ppNumber) {
        this.ppNumber = ppNumber == null ? null : ppNumber.trim();
    }

    public Date getPpDate() {
        return ppDate;
    }

    public void setPpDate(Date ppDate) {
        this.ppDate = ppDate;
    }

    public String getPpPcId() {
        return ppPcId;
    }

    public void setPpPcId(String ppPcId) {
        this.ppPcId = ppPcId == null ? null : ppPcId.trim();
    }

    public String getPpPcName() {
        return ppPcName;
    }

    public void setPpPcName(String ppPcName) {
        this.ppPcName = ppPcName == null ? null : ppPcName.trim();
    }

    public String getPpTeamId() {
        return ppTeamId;
    }

    public void setPpTeamId(String ppTeamId) {
        this.ppTeamId = ppTeamId == null ? null : ppTeamId.trim();
    }

    public String getPpTeamName() {
        return ppTeamName;
    }

    public void setPpTeamName(String ppTeamName) {
        this.ppTeamName = ppTeamName == null ? null : ppTeamName.trim();
    }

    public String getPpBuyer() {
        return ppBuyer;
    }

    public void setPpBuyer(String ppBuyer) {
        this.ppBuyer = ppBuyer == null ? null : ppBuyer.trim();
    }

    public String getPpProjectName() {
        return ppProjectName;
    }

    public void setPpProjectName(String ppProjectName) {
        this.ppProjectName = ppProjectName == null ? null : ppProjectName.trim();
    }

    public String getPpCurrency() {
        return ppCurrency;
    }

    public void setPpCurrency(String ppCurrency) {
        this.ppCurrency = ppCurrency == null ? null : ppCurrency.trim();
    }

    public Float getPpExchangeRate() {
        return ppExchangeRate;
    }

    public void setPpExchangeRate(Float ppExchangeRate) {
        this.ppExchangeRate = ppExchangeRate;
    }

    public Double getPpPayablesmainPrice() {
        return ppPayablesmainPrice;
    }

    public void setPpPayablesmainPrice(Double ppPayablesmainPrice) {
        this.ppPayablesmainPrice = ppPayablesmainPrice;
    }

    public Float getPpCurrentbalance() {
        return ppCurrentbalance;
    }

    public void setPpCurrentbalance(Float ppCurrentbalance) {
        this.ppCurrentbalance = ppCurrentbalance;
    }

    public Float getPpDiscountamount() {
        return ppDiscountamount;
    }

    public void setPpDiscountamount(Float ppDiscountamount) {
        this.ppDiscountamount = ppDiscountamount;
    }

    public Float getPpAmountcharged() {
        return ppAmountcharged;
    }

    public void setPpAmountcharged(Float ppAmountcharged) {
        this.ppAmountcharged = ppAmountcharged;
    }

    public Float getPpOffsetamount() {
        return ppOffsetamount;
    }

    public void setPpOffsetamount(Float ppOffsetamount) {
        this.ppOffsetamount = ppOffsetamount;
    }

    public String getPpAuditing() {
        return ppAuditing;
    }

    public void setPpAuditing(String ppAuditing) {
        this.ppAuditing = ppAuditing == null ? null : ppAuditing.trim();
    }

    public String getPpYn() {
        return ppYn;
    }

    public void setPpYn(String ppYn) {
        this.ppYn = ppYn == null ? null : ppYn.trim();
    }

    public String getPpCustom1() {
        return ppCustom1;
    }

    public void setPpCustom1(String ppCustom1) {
        this.ppCustom1 = ppCustom1 == null ? null : ppCustom1.trim();
    }

    public String getPpCustom2() {
        return ppCustom2;
    }

    public void setPpCustom2(String ppCustom2) {
        this.ppCustom2 = ppCustom2 == null ? null : ppCustom2.trim();
    }

    public String getPpCustom3() {
        return ppCustom3;
    }

    public void setPpCustom3(String ppCustom3) {
        this.ppCustom3 = ppCustom3 == null ? null : ppCustom3.trim();
    }

    public String getPpCustom4() {
        return ppCustom4;
    }

    public void setPpCustom4(String ppCustom4) {
        this.ppCustom4 = ppCustom4 == null ? null : ppCustom4.trim();
    }

    public String getPpCustom5() {
        return ppCustom5;
    }

    public void setPpCustom5(String ppCustom5) {
        this.ppCustom5 = ppCustom5 == null ? null : ppCustom5.trim();
    }

    public String getPpCustom6() {
        return ppCustom6;
    }

    public void setPpCustom6(String ppCustom6) {
        this.ppCustom6 = ppCustom6 == null ? null : ppCustom6.trim();
    }

    public String getPpCustom7() {
        return ppCustom7;
    }

    public void setPpCustom7(String ppCustom7) {
        this.ppCustom7 = ppCustom7 == null ? null : ppCustom7.trim();
    }

    public String getPpCustom8() {
        return ppCustom8;
    }

    public void setPpCustom8(String ppCustom8) {
        this.ppCustom8 = ppCustom8 == null ? null : ppCustom8.trim();
    }

    public String getPpCustom9() {
        return ppCustom9;
    }

    public void setPpCustom9(String ppCustom9) {
        this.ppCustom9 = ppCustom9 == null ? null : ppCustom9.trim();
    }

    public String getPpCustom10() {
        return ppCustom10;
    }

    public void setPpCustom10(String ppCustom10) {
        this.ppCustom10 = ppCustom10 == null ? null : ppCustom10.trim();
    }
}