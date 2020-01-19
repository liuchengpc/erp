package com.apatech.domain;

/**
 * （客户）地址表
 * @author 刘成
 *
 */
public class Customer_address {
    private String caAddressid;//地址id（主键 唯一）
    private String caAddress;//地址
    private String caPostcode;//邮编
    private String caAlinkman;//联系人
    private String caLinkmaneasyname;//联系人职称
    private String caAfaxno;//传真号码
    private String caWay;//行走路线
    private String caAdecoration;//备注
    private String customerId;//客户id|潜在客户id
    private String caAuditing;//是否审核
    private String caYn;//否删除（0 否 1 是 ，默认0）
    private String caCustom1;//自定栏1
    private String caCustom2;//自定栏2
    private String caCustom3;//自定栏3
    private String caCustom4;//自定栏4
    private String caCustom5;//自定栏5
    private String caCustom6;//自定栏6
    
    

    public Customer_address() {
		super();
	}

    
    
	@Override
	public String toString() {
		return "Customer_address [caAddressid=" + caAddressid + ", caAddress=" + caAddress + ", caPostcode="
				+ caPostcode + ", caAlinkman=" + caAlinkman + ", caLinkmaneasyname=" + caLinkmaneasyname + ", caAfaxno="
				+ caAfaxno + ", caWay=" + caWay + ", caAdecoration=" + caAdecoration + ", customerId=" + customerId
				+ ", caAuditing=" + caAuditing + ", caYn=" + caYn + ", caCustom1=" + caCustom1 + ", caCustom2="
				+ caCustom2 + ", caCustom3=" + caCustom3 + ", caCustom4=" + caCustom4 + ", caCustom5=" + caCustom5
				+ ", caCustom6=" + caCustom6 + "]";
	}



	public String getCaAddressid() {
        return caAddressid;
    }

    public void setCaAddressid(String caAddressid) {
        this.caAddressid = caAddressid == null ? null : caAddressid.trim();
    }

    public String getCaAddress() {
        return caAddress;
    }

    public void setCaAddress(String caAddress) {
        this.caAddress = caAddress == null ? null : caAddress.trim();
    }

    public String getCaPostcode() {
        return caPostcode;
    }

    public void setCaPostcode(String caPostcode) {
        this.caPostcode = caPostcode == null ? null : caPostcode.trim();
    }

    public String getCaAlinkman() {
        return caAlinkman;
    }

    public void setCaAlinkman(String caAlinkman) {
        this.caAlinkman = caAlinkman == null ? null : caAlinkman.trim();
    }

    public String getCaLinkmaneasyname() {
        return caLinkmaneasyname;
    }

    public void setCaLinkmaneasyname(String caLinkmaneasyname) {
        this.caLinkmaneasyname = caLinkmaneasyname == null ? null : caLinkmaneasyname.trim();
    }

    public String getCaAfaxno() {
        return caAfaxno;
    }

    public void setCaAfaxno(String caAfaxno) {
        this.caAfaxno = caAfaxno == null ? null : caAfaxno.trim();
    }

    public String getCaWay() {
        return caWay;
    }

    public void setCaWay(String caWay) {
        this.caWay = caWay == null ? null : caWay.trim();
    }

    public String getCaAdecoration() {
        return caAdecoration;
    }

    public void setCaAdecoration(String caAdecoration) {
        this.caAdecoration = caAdecoration == null ? null : caAdecoration.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCaAuditing() {
        return caAuditing;
    }

    public void setCaAuditing(String caAuditing) {
        this.caAuditing = caAuditing == null ? null : caAuditing.trim();
    }

    public String getCaYn() {
        return caYn;
    }

    public void setCaYn(String caYn) {
        this.caYn = caYn == null ? null : caYn.trim();
    }

    public String getCaCustom1() {
        return caCustom1;
    }

    public void setCaCustom1(String caCustom1) {
        this.caCustom1 = caCustom1 == null ? null : caCustom1.trim();
    }

    public String getCaCustom2() {
        return caCustom2;
    }

    public void setCaCustom2(String caCustom2) {
        this.caCustom2 = caCustom2 == null ? null : caCustom2.trim();
    }

    public String getCaCustom3() {
        return caCustom3;
    }

    public void setCaCustom3(String caCustom3) {
        this.caCustom3 = caCustom3 == null ? null : caCustom3.trim();
    }

    public String getCaCustom4() {
        return caCustom4;
    }

    public void setCaCustom4(String caCustom4) {
        this.caCustom4 = caCustom4 == null ? null : caCustom4.trim();
    }

    public String getCaCustom5() {
        return caCustom5;
    }

    public void setCaCustom5(String caCustom5) {
        this.caCustom5 = caCustom5 == null ? null : caCustom5.trim();
    }

    public String getCaCustom6() {
        return caCustom6;
    }

    public void setCaCustom6(String caCustom6) {
        this.caCustom6 = caCustom6 == null ? null : caCustom6.trim();
    }
}