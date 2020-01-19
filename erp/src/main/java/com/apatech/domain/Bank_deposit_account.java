package com.apatech.domain;

/**
 * 银行存款账户表
 * @author 刘成
 *
 */
public class Bank_deposit_account {
    private String adaId;//编号（主键 唯一）
    private String currencyId;//币别id
    private String bankId;//开户银行id
    private String adaBankaddress;//银行地址
    private String adaPhone;//联系电话
    private Float adaInitialbalance;//初始余额
    private String adaName;//账户名称
    private String adaSubject;//银行存款科目
    private String adaCyberBankaddress;//网银地址
    private String adaLinkman;//联系人
    private Float adaCurrentbalance;//当前余额
    private String adaRemark;//备注
    private String adaAuditing;//是否审核
    private String adaYn;//是否删除（0 否 1 是 ，默认0）
    private String adaCustom1;//自定栏1
    private String adaCustom2;//自定栏2
    private String adaCustom3;//自定栏3
    private String adaCustom4;//自定栏4
    private String adaCustom5;//自定栏5
    private String adaCustom6;//自定栏6
    
    

    public Bank_deposit_account() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Bank_deposit_account [adaId=" + adaId + ", currencyId=" + currencyId + ", bankId=" + bankId
				+ ", adaBankaddress=" + adaBankaddress + ", adaPhone=" + adaPhone + ", adaInitialbalance="
				+ adaInitialbalance + ", adaName=" + adaName + ", adaSubject=" + adaSubject + ", adaCyberBankaddress="
				+ adaCyberBankaddress + ", adaLinkman=" + adaLinkman + ", adaCurrentbalance=" + adaCurrentbalance
				+ ", adaRemark=" + adaRemark + ", adaAuditing=" + adaAuditing + ", adaYn=" + adaYn + ", adaCustom1="
				+ adaCustom1 + ", adaCustom2=" + adaCustom2 + ", adaCustom3=" + adaCustom3 + ", adaCustom4="
				+ adaCustom4 + ", adaCustom5=" + adaCustom5 + ", adaCustom6=" + adaCustom6 + "]";
	}



	public String getAdaId() {
        return adaId;
    }

    public void setAdaId(String adaId) {
        this.adaId = adaId == null ? null : adaId.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getAdaBankaddress() {
        return adaBankaddress;
    }

    public void setAdaBankaddress(String adaBankaddress) {
        this.adaBankaddress = adaBankaddress == null ? null : adaBankaddress.trim();
    }

    public String getAdaPhone() {
        return adaPhone;
    }

    public void setAdaPhone(String adaPhone) {
        this.adaPhone = adaPhone == null ? null : adaPhone.trim();
    }

    public Float getAdaInitialbalance() {
        return adaInitialbalance;
    }

    public void setAdaInitialbalance(Float adaInitialbalance) {
        this.adaInitialbalance = adaInitialbalance;
    }

    public String getAdaName() {
        return adaName;
    }

    public void setAdaName(String adaName) {
        this.adaName = adaName == null ? null : adaName.trim();
    }

    public String getAdaSubject() {
        return adaSubject;
    }

    public void setAdaSubject(String adaSubject) {
        this.adaSubject = adaSubject == null ? null : adaSubject.trim();
    }

    public String getAdaCyberBankaddress() {
        return adaCyberBankaddress;
    }

    public void setAdaCyberBankaddress(String adaCyberBankaddress) {
        this.adaCyberBankaddress = adaCyberBankaddress == null ? null : adaCyberBankaddress.trim();
    }

    public String getAdaLinkman() {
        return adaLinkman;
    }

    public void setAdaLinkman(String adaLinkman) {
        this.adaLinkman = adaLinkman == null ? null : adaLinkman.trim();
    }

    public Float getAdaCurrentbalance() {
        return adaCurrentbalance;
    }

    public void setAdaCurrentbalance(Float adaCurrentbalance) {
        this.adaCurrentbalance = adaCurrentbalance;
    }

    public String getAdaRemark() {
        return adaRemark;
    }

    public void setAdaRemark(String adaRemark) {
        this.adaRemark = adaRemark == null ? null : adaRemark.trim();
    }

    public String getAdaAuditing() {
        return adaAuditing;
    }

    public void setAdaAuditing(String adaAuditing) {
        this.adaAuditing = adaAuditing == null ? null : adaAuditing.trim();
    }

    public String getAdaYn() {
        return adaYn;
    }

    public void setAdaYn(String adaYn) {
        this.adaYn = adaYn == null ? null : adaYn.trim();
    }

    public String getAdaCustom1() {
        return adaCustom1;
    }

    public void setAdaCustom1(String adaCustom1) {
        this.adaCustom1 = adaCustom1 == null ? null : adaCustom1.trim();
    }

    public String getAdaCustom2() {
        return adaCustom2;
    }

    public void setAdaCustom2(String adaCustom2) {
        this.adaCustom2 = adaCustom2 == null ? null : adaCustom2.trim();
    }

    public String getAdaCustom3() {
        return adaCustom3;
    }

    public void setAdaCustom3(String adaCustom3) {
        this.adaCustom3 = adaCustom3 == null ? null : adaCustom3.trim();
    }

    public String getAdaCustom4() {
        return adaCustom4;
    }

    public void setAdaCustom4(String adaCustom4) {
        this.adaCustom4 = adaCustom4 == null ? null : adaCustom4.trim();
    }

    public String getAdaCustom5() {
        return adaCustom5;
    }

    public void setAdaCustom5(String adaCustom5) {
        this.adaCustom5 = adaCustom5 == null ? null : adaCustom5.trim();
    }

    public String getAdaCustom6() {
        return adaCustom6;
    }

    public void setAdaCustom6(String adaCustom6) {
        this.adaCustom6 = adaCustom6 == null ? null : adaCustom6.trim();
    }
}