package com.apatech.domain;

/**
 * 采购订单类型表
 * @author 刘成
 *
 */
public class Purchasing_order_type {
    private String potId;//id（主键 唯一）
    private String potName;//类别名称
    private String potEngname;//英文名称
    private String potRemark;//备注
    private String potAudition;//是否审核
    private String potYn;//是否删除（0 否 1 是 ，默认0）
    private String potCustom1;//自定义1
    private String potCustom2;//自定义2
    private String potCustom3;//自定义3
    private String potCustom4;//自定义4
    private String potCustom5;//自定义5
    private String potCustom6;//自定义6
    
    
    

    public Purchasing_order_type() {
		super();
	}

	@Override
	public String toString() {
		return "Purchasing_order_type [potId=" + potId + ", potName=" + potName + ", potEngname=" + potEngname
				+ ", potRemark=" + potRemark + ", potAudition=" + potAudition + ", potYn=" + potYn + ", potCustom1="
				+ potCustom1 + ", potCustom2=" + potCustom2 + ", potCustom3=" + potCustom3 + ", potCustom4="
				+ potCustom4 + ", potCustom5=" + potCustom5 + ", potCustom6=" + potCustom6 + "]";
	}

	public String getPotId() {
        return potId;
    }

    public void setPotId(String potId) {
        this.potId = potId == null ? null : potId.trim();
    }

    public String getPotName() {
        return potName;
    }

    public void setPotName(String potName) {
        this.potName = potName == null ? null : potName.trim();
    }

    public String getPotEngname() {
        return potEngname;
    }

    public void setPotEngname(String potEngname) {
        this.potEngname = potEngname == null ? null : potEngname.trim();
    }

    public String getPotRemark() {
        return potRemark;
    }

    public void setPotRemark(String potRemark) {
        this.potRemark = potRemark == null ? null : potRemark.trim();
    }

    public String getPotAudition() {
        return potAudition;
    }

    public void setPotAudition(String potAudition) {
        this.potAudition = potAudition == null ? null : potAudition.trim();
    }

    public String getPotYn() {
        return potYn;
    }

    public void setPotYn(String potYn) {
        this.potYn = potYn == null ? null : potYn.trim();
    }

    public String getPotCustom1() {
        return potCustom1;
    }

    public void setPotCustom1(String potCustom1) {
        this.potCustom1 = potCustom1 == null ? null : potCustom1.trim();
    }

    public String getPotCustom2() {
        return potCustom2;
    }

    public void setPotCustom2(String potCustom2) {
        this.potCustom2 = potCustom2 == null ? null : potCustom2.trim();
    }

    public String getPotCustom3() {
        return potCustom3;
    }

    public void setPotCustom3(String potCustom3) {
        this.potCustom3 = potCustom3 == null ? null : potCustom3.trim();
    }

    public String getPotCustom4() {
        return potCustom4;
    }

    public void setPotCustom4(String potCustom4) {
        this.potCustom4 = potCustom4 == null ? null : potCustom4.trim();
    }

    public String getPotCustom5() {
        return potCustom5;
    }

    public void setPotCustom5(String potCustom5) {
        this.potCustom5 = potCustom5 == null ? null : potCustom5.trim();
    }

    public String getPotCustom6() {
        return potCustom6;
    }

    public void setPotCustom6(String potCustom6) {
        this.potCustom6 = potCustom6 == null ? null : potCustom6.trim();
    }
}