package com.apatech.domain;

/**
 * 客户类别表
 * @author 刘成
 *
 */
public class Customer_type {
    private String cutyId;//id（主键 唯一）
    private String cutyName;//类别名称
    private String cutyEngname;//英文名称
    private String cutyRemark;//备注
    private String cutyAuditing;//是否审核
    private String cutyYn;//是否删除（0 否 1 是 ，默认0）
    private String cutyCustom1;//自定栏1
    private String cutyCustom2;//自定栏2
    private String cutyCustom3;//自定栏3
    private String cutyCustom4;//自定栏4
    private String cutyCustom5;//自定栏5
    private String cutyCustom6;//自定栏6
    
    

    public Customer_type() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Customer_type [cutyId=" + cutyId + ", cutyName=" + cutyName + ", cutyEngname=" + cutyEngname
				+ ", cutyRemark=" + cutyRemark + ", cutyAuditing=" + cutyAuditing + ", cutyYn=" + cutyYn
				+ ", cutyCustom1=" + cutyCustom1 + ", cutyCustom2=" + cutyCustom2 + ", cutyCustom3=" + cutyCustom3
				+ ", cutyCustom4=" + cutyCustom4 + ", cutyCustom5=" + cutyCustom5 + ", cutyCustom6=" + cutyCustom6
				+ "]";
	}



	public String getCutyId() {
        return cutyId;
    }

    public void setCutyId(String cutyId) {
        this.cutyId = cutyId == null ? null : cutyId.trim();
    }

    public String getCutyName() {
        return cutyName;
    }

    public void setCutyName(String cutyName) {
        this.cutyName = cutyName == null ? null : cutyName.trim();
    }

    public String getCutyEngname() {
        return cutyEngname;
    }

    public void setCutyEngname(String cutyEngname) {
        this.cutyEngname = cutyEngname == null ? null : cutyEngname.trim();
    }

    public String getCutyRemark() {
        return cutyRemark;
    }

    public void setCutyRemark(String cutyRemark) {
        this.cutyRemark = cutyRemark == null ? null : cutyRemark.trim();
    }

    public String getCutyAuditing() {
        return cutyAuditing;
    }

    public void setCutyAuditing(String cutyAuditing) {
        this.cutyAuditing = cutyAuditing == null ? null : cutyAuditing.trim();
    }

    public String getCutyYn() {
        return cutyYn;
    }

    public void setCutyYn(String cutyYn) {
        this.cutyYn = cutyYn == null ? null : cutyYn.trim();
    }

    public String getCutyCustom1() {
        return cutyCustom1;
    }

    public void setCutyCustom1(String cutyCustom1) {
        this.cutyCustom1 = cutyCustom1 == null ? null : cutyCustom1.trim();
    }

    public String getCutyCustom2() {
        return cutyCustom2;
    }

    public void setCutyCustom2(String cutyCustom2) {
        this.cutyCustom2 = cutyCustom2 == null ? null : cutyCustom2.trim();
    }

    public String getCutyCustom3() {
        return cutyCustom3;
    }

    public void setCutyCustom3(String cutyCustom3) {
        this.cutyCustom3 = cutyCustom3 == null ? null : cutyCustom3.trim();
    }

    public String getCutyCustom4() {
        return cutyCustom4;
    }

    public void setCutyCustom4(String cutyCustom4) {
        this.cutyCustom4 = cutyCustom4 == null ? null : cutyCustom4.trim();
    }

    public String getCutyCustom5() {
        return cutyCustom5;
    }

    public void setCutyCustom5(String cutyCustom5) {
        this.cutyCustom5 = cutyCustom5 == null ? null : cutyCustom5.trim();
    }

    public String getCutyCustom6() {
        return cutyCustom6;
    }

    public void setCutyCustom6(String cutyCustom6) {
        this.cutyCustom6 = cutyCustom6 == null ? null : cutyCustom6.trim();
    }
}