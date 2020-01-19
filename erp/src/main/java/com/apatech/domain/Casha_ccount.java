package com.apatech.domain;

/**
 * 现金账户设定表
 * @author 刘成
 *
 */
public class Casha_ccount {
    private String ccId;//编号（主键 唯一）
    private String ccName;//名称
    private String currencyId;//币别id
    private String ccSubject;//现金科目
    private Float ccInitialbalance;//初始余额
    private Float ccCurrentbalance;//当前余额
    private String ccRemark;//备注
    private String ccAuditing;//是否审核
    private String ccYn;//是否删除（0 否 1 是 ，默认0）
    private String ccCustom1;//自定栏1
    private String ccCustom2;//自定栏2
    private String ccCustom3;//自定栏3
    private String ccCustom4;//自定栏4
    private String ccCustom5;//自定栏5
    private String ccCustom6;//自定栏6
    
    

    public Casha_ccount() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Casha_ccount [ccId=" + ccId + ", ccName=" + ccName + ", currencyId=" + currencyId + ", ccSubject="
				+ ccSubject + ", ccInitialbalance=" + ccInitialbalance + ", ccCurrentbalance=" + ccCurrentbalance
				+ ", ccRemark=" + ccRemark + ", ccAuditing=" + ccAuditing + ", ccYn=" + ccYn + ", ccCustom1="
				+ ccCustom1 + ", ccCustom2=" + ccCustom2 + ", ccCustom3=" + ccCustom3 + ", ccCustom4=" + ccCustom4
				+ ", ccCustom5=" + ccCustom5 + ", ccCustom6=" + ccCustom6 + "]";
	}



	public String getCcId() {
        return ccId;
    }

    public void setCcId(String ccId) {
        this.ccId = ccId == null ? null : ccId.trim();
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName == null ? null : ccName.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public String getCcSubject() {
        return ccSubject;
    }

    public void setCcSubject(String ccSubject) {
        this.ccSubject = ccSubject == null ? null : ccSubject.trim();
    }

    public Float getCcInitialbalance() {
        return ccInitialbalance;
    }

    public void setCcInitialbalance(Float ccInitialbalance) {
        this.ccInitialbalance = ccInitialbalance;
    }

    public Float getCcCurrentbalance() {
        return ccCurrentbalance;
    }

    public void setCcCurrentbalance(Float ccCurrentbalance) {
        this.ccCurrentbalance = ccCurrentbalance;
    }

    public String getCcRemark() {
        return ccRemark;
    }

    public void setCcRemark(String ccRemark) {
        this.ccRemark = ccRemark == null ? null : ccRemark.trim();
    }

    public String getCcAuditing() {
        return ccAuditing;
    }

    public void setCcAuditing(String ccAuditing) {
        this.ccAuditing = ccAuditing == null ? null : ccAuditing.trim();
    }

    public String getCcYn() {
        return ccYn;
    }

    public void setCcYn(String ccYn) {
        this.ccYn = ccYn == null ? null : ccYn.trim();
    }

    public String getCcCustom1() {
        return ccCustom1;
    }

    public void setCcCustom1(String ccCustom1) {
        this.ccCustom1 = ccCustom1 == null ? null : ccCustom1.trim();
    }

    public String getCcCustom2() {
        return ccCustom2;
    }

    public void setCcCustom2(String ccCustom2) {
        this.ccCustom2 = ccCustom2 == null ? null : ccCustom2.trim();
    }

    public String getCcCustom3() {
        return ccCustom3;
    }

    public void setCcCustom3(String ccCustom3) {
        this.ccCustom3 = ccCustom3 == null ? null : ccCustom3.trim();
    }

    public String getCcCustom4() {
        return ccCustom4;
    }

    public void setCcCustom4(String ccCustom4) {
        this.ccCustom4 = ccCustom4 == null ? null : ccCustom4.trim();
    }

    public String getCcCustom5() {
        return ccCustom5;
    }

    public void setCcCustom5(String ccCustom5) {
        this.ccCustom5 = ccCustom5 == null ? null : ccCustom5.trim();
    }

    public String getCcCustom6() {
        return ccCustom6;
    }

    public void setCcCustom6(String ccCustom6) {
        this.ccCustom6 = ccCustom6 == null ? null : ccCustom6.trim();
    }
}