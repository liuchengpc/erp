package com.apatech.domain;

/**
 * 采购折让费用明细表
 * @author 刘成
 *
 */
public class Assessment_procurement_detailed {
    private String apdId;//id（主键 唯一）
    private String apId;//采购分摊单号(采购分摊作业表id 外键)
    private String apdIctId;//费用编号（收入费用类别 外键）
    private String apdIctName;//费用名称
    private String apdCurrencyId;//币别（currency外键）
    private Float apdExchangeRate;//汇率
    private Integer apdMoney;//金额
    private Float apdAmountStandardCurrency;//金额本位币
    private String apdAudition;//是否审核
    private String apdYn;//是否删除（0 否 1 是 ，默认0）
    private String apdCustom1;//自定栏1
    private String apdCustom2;//自定栏2
    private String apdCustom3;//自定栏3
    private String apdCustom4;//自定栏4
    private String apdCustom5;//自定栏5
    private String apdCustom6;//自定栏6
    
    

    public Assessment_procurement_detailed() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Assessment_procurement_detailed [apdId=" + apdId + ", apId=" + apId + ", apdIctId=" + apdIctId
				+ ", apdIctName=" + apdIctName + ", apdCurrencyId=" + apdCurrencyId + ", apdExchangeRate="
				+ apdExchangeRate + ", apdMoney=" + apdMoney + ", apdAmountStandardCurrency="
				+ apdAmountStandardCurrency + ", apdAudition=" + apdAudition + ", apdYn=" + apdYn + ", apdCustom1="
				+ apdCustom1 + ", apdCustom2=" + apdCustom2 + ", apdCustom3=" + apdCustom3 + ", apdCustom4="
				+ apdCustom4 + ", apdCustom5=" + apdCustom5 + ", apdCustom6=" + apdCustom6 + "]";
	}



	public String getApdId() {
        return apdId;
    }

    public void setApdId(String apdId) {
        this.apdId = apdId == null ? null : apdId.trim();
    }

    public String getApId() {
        return apId;
    }

    public void setApId(String apId) {
        this.apId = apId == null ? null : apId.trim();
    }

    public String getApdIctId() {
        return apdIctId;
    }

    public void setApdIctId(String apdIctId) {
        this.apdIctId = apdIctId == null ? null : apdIctId.trim();
    }

    public String getApdIctName() {
        return apdIctName;
    }

    public void setApdIctName(String apdIctName) {
        this.apdIctName = apdIctName == null ? null : apdIctName.trim();
    }

    public String getApdCurrencyId() {
        return apdCurrencyId;
    }

    public void setApdCurrencyId(String apdCurrencyId) {
        this.apdCurrencyId = apdCurrencyId == null ? null : apdCurrencyId.trim();
    }

    public Float getApdExchangeRate() {
        return apdExchangeRate;
    }

    public void setApdExchangeRate(Float apdExchangeRate) {
        this.apdExchangeRate = apdExchangeRate;
    }

    public Integer getApdMoney() {
        return apdMoney;
    }

    public void setApdMoney(Integer apdMoney) {
        this.apdMoney = apdMoney;
    }

    public Float getApdAmountStandardCurrency() {
        return apdAmountStandardCurrency;
    }

    public void setApdAmountStandardCurrency(Float apdAmountStandardCurrency) {
        this.apdAmountStandardCurrency = apdAmountStandardCurrency;
    }

    public String getApdAudition() {
        return apdAudition;
    }

    public void setApdAudition(String apdAudition) {
        this.apdAudition = apdAudition == null ? null : apdAudition.trim();
    }

    public String getApdYn() {
        return apdYn;
    }

    public void setApdYn(String apdYn) {
        this.apdYn = apdYn == null ? null : apdYn.trim();
    }

    public String getApdCustom1() {
        return apdCustom1;
    }

    public void setApdCustom1(String apdCustom1) {
        this.apdCustom1 = apdCustom1 == null ? null : apdCustom1.trim();
    }

    public String getApdCustom2() {
        return apdCustom2;
    }

    public void setApdCustom2(String apdCustom2) {
        this.apdCustom2 = apdCustom2 == null ? null : apdCustom2.trim();
    }

    public String getApdCustom3() {
        return apdCustom3;
    }

    public void setApdCustom3(String apdCustom3) {
        this.apdCustom3 = apdCustom3 == null ? null : apdCustom3.trim();
    }

    public String getApdCustom4() {
        return apdCustom4;
    }

    public void setApdCustom4(String apdCustom4) {
        this.apdCustom4 = apdCustom4 == null ? null : apdCustom4.trim();
    }

    public String getApdCustom5() {
        return apdCustom5;
    }

    public void setApdCustom5(String apdCustom5) {
        this.apdCustom5 = apdCustom5 == null ? null : apdCustom5.trim();
    }

    public String getApdCustom6() {
        return apdCustom6;
    }

    public void setApdCustom6(String apdCustom6) {
        this.apdCustom6 = apdCustom6 == null ? null : apdCustom6.trim();
    }
}