package com.apatech.domain;

/**
 * 计量单位表
 * @author 刘成
 *
 */
public class Measurement_unit {
    private String muId;//计量单位id（主键 唯一）
    private String muName;//单位名称
    private String muEnglistName;//英文名称
    private String muRemark;//备注
    private String muAuditing;//是否审核
    private String muYn;//是否删除（0 否 1 是 ，默认0）
    private String muCustom1;//自定栏1
    private String muCustom2;//自定栏2
    private String muCustom3;//自定栏3
    private String muCustom4;//自定栏4
    private String muCustom5;//自定栏5
    private String muCustom6;//自定栏6
    
    
    
    public Measurement_unit() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Measurement_unit [muId=" + muId + ", muName=" + muName + ", muEnglistName=" + muEnglistName
				+ ", muRemark=" + muRemark + ", muAuditing=" + muAuditing + ", muYn=" + muYn + ", muCustom1="
				+ muCustom1 + ", muCustom2=" + muCustom2 + ", muCustom3=" + muCustom3 + ", muCustom4=" + muCustom4
				+ ", muCustom5=" + muCustom5 + ", muCustom6=" + muCustom6 + "]";
	}



	public String getMuId() {
        return muId;
    }

    public void setMuId(String muId) {
        this.muId = muId == null ? null : muId.trim();
    }

    public String getMuName() {
        return muName;
    }

    public void setMuName(String muName) {
        this.muName = muName == null ? null : muName.trim();
    }

    public String getMuEnglistName() {
        return muEnglistName;
    }

    public void setMuEnglistName(String muEnglistName) {
        this.muEnglistName = muEnglistName == null ? null : muEnglistName.trim();
    }

    public String getMuRemark() {
        return muRemark;
    }

    public void setMuRemark(String muRemark) {
        this.muRemark = muRemark == null ? null : muRemark.trim();
    }

    public String getMuAuditing() {
        return muAuditing;
    }

    public void setMuAuditing(String muAuditing) {
        this.muAuditing = muAuditing == null ? null : muAuditing.trim();
    }

    public String getMuYn() {
        return muYn;
    }

    public void setMuYn(String muYn) {
        this.muYn = muYn == null ? null : muYn.trim();
    }

    public String getMuCustom1() {
        return muCustom1;
    }

    public void setMuCustom1(String muCustom1) {
        this.muCustom1 = muCustom1 == null ? null : muCustom1.trim();
    }

    public String getMuCustom2() {
        return muCustom2;
    }

    public void setMuCustom2(String muCustom2) {
        this.muCustom2 = muCustom2 == null ? null : muCustom2.trim();
    }

    public String getMuCustom3() {
        return muCustom3;
    }

    public void setMuCustom3(String muCustom3) {
        this.muCustom3 = muCustom3 == null ? null : muCustom3.trim();
    }

    public String getMuCustom4() {
        return muCustom4;
    }

    public void setMuCustom4(String muCustom4) {
        this.muCustom4 = muCustom4 == null ? null : muCustom4.trim();
    }

    public String getMuCustom5() {
        return muCustom5;
    }

    public void setMuCustom5(String muCustom5) {
        this.muCustom5 = muCustom5 == null ? null : muCustom5.trim();
    }

    public String getMuCustom6() {
        return muCustom6;
    }

    public void setMuCustom6(String muCustom6) {
        this.muCustom6 = muCustom6 == null ? null : muCustom6.trim();
    }
}