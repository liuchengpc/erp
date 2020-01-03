package com.apatech.domain;
/**
 * 供应商表
 * @author 刘成
 *
 */
public class Supplier {
    private Integer supplierid;//编号，主键
    private String companyname;//公司名称
    private String companyabbreviation;//公司简称
    private String contacts;//联系人
    private String phone;//手机号
    private String email;//邮箱
    private String telephone;//电话
    private String province;//省（地址）
    private String city;//市（地址）
    private String region;//地区（地址）
    private String street;//街道
    
    

    @Override
	public String toString() {
		return "Supplier [supplierid=" + supplierid + ", companyname=" + companyname + ", companyabbreviation="
				+ companyabbreviation + ", contacts=" + contacts + ", phone=" + phone + ", email=" + email
				+ ", telephone=" + telephone + ", province=" + province + ", city=" + city + ", region=" + region
				+ ", street=" + street + "]";
	}

	public Supplier() {
		super();
	}

	public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyabbreviation() {
        return companyabbreviation;
    }

    public void setCompanyabbreviation(String companyabbreviation) {
        this.companyabbreviation = companyabbreviation == null ? null : companyabbreviation.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }
}