package com.apatech.domain;

/**
 * 客户等级表
 * @author 刘成
 *
 */
public class Customer_grade { 
    private String cgId;//id（主键 唯一）
    private String cgName;//等级名称
    private String cgRemark;//备注
    private String cgAuditing;//是否审核
    private String cgYn;//是否删除（0 否 1 是 ，默认0）
    private String cgCustom1;//自定栏1
    private String cgCustom2;//自定栏2
    private String cgCustom3;//自定栏3
    private String cgCustom4;//自定栏4
    private String cgCustom5;//自定栏5
    private String cgCustom6;//自定栏6
    
    

    public Customer_grade() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Customer_grade [cgId=" + cgId + ", cgName=" + cgName + ", cgRemark=" + cgRemark + ", cgAuditing="
				+ cgAuditing + ", cgYn=" + cgYn + ", cgCustom1=" + cgCustom1 + ", cgCustom2=" + cgCustom2
				+ ", cgCustom3=" + cgCustom3 + ", cgCustom4=" + cgCustom4 + ", cgCustom5=" + cgCustom5 + ", cgCustom6="
				+ cgCustom6 + "]";
	}



	public String getCgId() {
        return cgId;
    }

    public void setCgId(String cgId) {
        this.cgId = cgId == null ? null : cgId.trim();
    }

    public String getCgName() {
        return cgName;
    }

    public void setCgName(String cgName) {
        this.cgName = cgName == null ? null : cgName.trim();
    }

    public String getCgRemark() {
        return cgRemark;
    }

    public void setCgRemark(String cgRemark) {
        this.cgRemark = cgRemark == null ? null : cgRemark.trim();
    }

    public String getCgAuditing() {
        return cgAuditing;
    }

    public void setCgAuditing(String cgAuditing) {
        this.cgAuditing = cgAuditing == null ? null : cgAuditing.trim();
    }

    public String getCgYn() {
        return cgYn;
    }

    public void setCgYn(String cgYn) {
        this.cgYn = cgYn == null ? null : cgYn.trim();
    }

    public String getCgCustom1() {
        return cgCustom1;
    }

    public void setCgCustom1(String cgCustom1) {
        this.cgCustom1 = cgCustom1 == null ? null : cgCustom1.trim();
    }

    public String getCgCustom2() {
        return cgCustom2;
    }

    public void setCgCustom2(String cgCustom2) {
        this.cgCustom2 = cgCustom2 == null ? null : cgCustom2.trim();
    }

    public String getCgCustom3() {
        return cgCustom3;
    }

    public void setCgCustom3(String cgCustom3) {
        this.cgCustom3 = cgCustom3 == null ? null : cgCustom3.trim();
    }

    public String getCgCustom4() {
        return cgCustom4;
    }

    public void setCgCustom4(String cgCustom4) {
        this.cgCustom4 = cgCustom4 == null ? null : cgCustom4.trim();
    }

    public String getCgCustom5() {
        return cgCustom5;
    }

    public void setCgCustom5(String cgCustom5) {
        this.cgCustom5 = cgCustom5 == null ? null : cgCustom5.trim();
    }

    public String getCgCustom6() {
        return cgCustom6;
    }

    public void setCgCustom6(String cgCustom6) {
        this.cgCustom6 = cgCustom6 == null ? null : cgCustom6.trim();
    }
}