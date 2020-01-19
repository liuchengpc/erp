package com.apatech.domain;

/**
 * 银行表
 * @author 刘成
 *
 */
public class Bank {
    private String bankId;//银行编号（主键 唯一）
    private String bankName;//银行名称
    private String bankEnglishName;//英文名称
    private String bankTelephone;//电话
    private String bankZipcode;//邮编
    private String bankAddress;//地址
    private String bankRemark;//备注
    private String bankYn;//是否删除（0 否 1 是 ，默认0）
    private String bankCustom1;//自定栏1
    private String bankCustom2;//自定栏2
    private String bankCustom3;//自定栏3
    private String bankCustom4;//自定栏4
    private String bankCustom5;//自定栏5
    private String bankCustom6;//自定栏6
    
    

    public Bank() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", bankEnglishName=" + bankEnglishName
				+ ", bankTelephone=" + bankTelephone + ", bankZipcode=" + bankZipcode + ", bankAddress=" + bankAddress
				+ ", bankRemark=" + bankRemark + ", bankYn=" + bankYn + ", bankCustom1=" + bankCustom1
				+ ", bankCustom2=" + bankCustom2 + ", bankCustom3=" + bankCustom3 + ", bankCustom4=" + bankCustom4
				+ ", bankCustom5=" + bankCustom5 + ", bankCustom6=" + bankCustom6 + "]";
	}



	public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankEnglishName() {
        return bankEnglishName;
    }

    public void setBankEnglishName(String bankEnglishName) {
        this.bankEnglishName = bankEnglishName == null ? null : bankEnglishName.trim();
    }

    public String getBankTelephone() {
        return bankTelephone;
    }

    public void setBankTelephone(String bankTelephone) {
        this.bankTelephone = bankTelephone == null ? null : bankTelephone.trim();
    }

    public String getBankZipcode() {
        return bankZipcode;
    }

    public void setBankZipcode(String bankZipcode) {
        this.bankZipcode = bankZipcode == null ? null : bankZipcode.trim();
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    public String getBankRemark() {
        return bankRemark;
    }

    public void setBankRemark(String bankRemark) {
        this.bankRemark = bankRemark == null ? null : bankRemark.trim();
    }

    public String getBankYn() {
        return bankYn;
    }

    public void setBankYn(String bankYn) {
        this.bankYn = bankYn == null ? null : bankYn.trim();
    }

    public String getBankCustom1() {
        return bankCustom1;
    }

    public void setBankCustom1(String bankCustom1) {
        this.bankCustom1 = bankCustom1 == null ? null : bankCustom1.trim();
    }

    public String getBankCustom2() {
        return bankCustom2;
    }

    public void setBankCustom2(String bankCustom2) {
        this.bankCustom2 = bankCustom2 == null ? null : bankCustom2.trim();
    }

    public String getBankCustom3() {
        return bankCustom3;
    }

    public void setBankCustom3(String bankCustom3) {
        this.bankCustom3 = bankCustom3 == null ? null : bankCustom3.trim();
    }

    public String getBankCustom4() {
        return bankCustom4;
    }

    public void setBankCustom4(String bankCustom4) {
        this.bankCustom4 = bankCustom4 == null ? null : bankCustom4.trim();
    }

    public String getBankCustom5() {
        return bankCustom5;
    }

    public void setBankCustom5(String bankCustom5) {
        this.bankCustom5 = bankCustom5 == null ? null : bankCustom5.trim();
    }

    public String getBankCustom6() {
        return bankCustom6;
    }

    public void setBankCustom6(String bankCustom6) {
        this.bankCustom6 = bankCustom6 == null ? null : bankCustom6.trim();
    }
}