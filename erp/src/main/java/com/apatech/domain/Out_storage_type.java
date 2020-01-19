package com.apatech.domain;

/**
 * 出库类型表
 * @author 刘成
 *
 */
public class Out_storage_type {
    private String ostId;//id（主键 唯一）
    private String ostName;//类别名称
    private String ostEngname;//英文名称
    private String ostRemark;//备注
    private String ostAuditing;//是否审核
    private String ostYn;//是否删除（0 否 1 是 ，默认0）
    private String ostCustom1;//自定栏1
    private String ostCustom2;//自定栏2
    private String ostCustom3;//自定栏3
    private String ostCustom4;//自定栏4
    private String ostCustom5;//自定栏5
    private String ostCustom6;//自定栏6
    
    

    public Out_storage_type() {
		super();
	}

	@Override
	public String toString() {
		return "Out_storage_type [ostId=" + ostId + ", ostName=" + ostName + ", ostEngname=" + ostEngname
				+ ", ostRemark=" + ostRemark + ", ostAuditing=" + ostAuditing + ", ostYn=" + ostYn + ", ostCustom1="
				+ ostCustom1 + ", ostCustom2=" + ostCustom2 + ", ostCustom3=" + ostCustom3 + ", ostCustom4="
				+ ostCustom4 + ", ostCustom5=" + ostCustom5 + ", ostCustom6=" + ostCustom6 + "]";
	}

	public String getOstId() {
        return ostId;
    }

    public void setOstId(String ostId) {
        this.ostId = ostId == null ? null : ostId.trim();
    }

    public String getOstName() {
        return ostName;
    }

    public void setOstName(String ostName) {
        this.ostName = ostName == null ? null : ostName.trim();
    }

    public String getOstEngname() {
        return ostEngname;
    }

    public void setOstEngname(String ostEngname) {
        this.ostEngname = ostEngname == null ? null : ostEngname.trim();
    }

    public String getOstRemark() {
        return ostRemark;
    }

    public void setOstRemark(String ostRemark) {
        this.ostRemark = ostRemark == null ? null : ostRemark.trim();
    }

    public String getOstAuditing() {
        return ostAuditing;
    }

    public void setOstAuditing(String ostAuditing) {
        this.ostAuditing = ostAuditing == null ? null : ostAuditing.trim();
    }

    public String getOstYn() {
        return ostYn;
    }

    public void setOstYn(String ostYn) {
        this.ostYn = ostYn == null ? null : ostYn.trim();
    }

    public String getOstCustom1() {
        return ostCustom1;
    }

    public void setOstCustom1(String ostCustom1) {
        this.ostCustom1 = ostCustom1 == null ? null : ostCustom1.trim();
    }

    public String getOstCustom2() {
        return ostCustom2;
    }

    public void setOstCustom2(String ostCustom2) {
        this.ostCustom2 = ostCustom2 == null ? null : ostCustom2.trim();
    }

    public String getOstCustom3() {
        return ostCustom3;
    }

    public void setOstCustom3(String ostCustom3) {
        this.ostCustom3 = ostCustom3 == null ? null : ostCustom3.trim();
    }

    public String getOstCustom4() {
        return ostCustom4;
    }

    public void setOstCustom4(String ostCustom4) {
        this.ostCustom4 = ostCustom4 == null ? null : ostCustom4.trim();
    }

    public String getOstCustom5() {
        return ostCustom5;
    }

    public void setOstCustom5(String ostCustom5) {
        this.ostCustom5 = ostCustom5 == null ? null : ostCustom5.trim();
    }

    public String getOstCustom6() {
        return ostCustom6;
    }

    public void setOstCustom6(String ostCustom6) {
        this.ostCustom6 = ostCustom6 == null ? null : ostCustom6.trim();
    }
}