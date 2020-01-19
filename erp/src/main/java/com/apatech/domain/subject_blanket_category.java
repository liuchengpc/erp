package com.apatech.domain;

/**
 * 科目总类表
 * @author 刘成
 *
 */
public class subject_blanket_category {
    private String sbcId;//id（主键 唯一）
    private String sbcName;//类别名称
    private String sbcEngname;//英文名称
    private String sbcRemark;//备注
    private String sbcAuditing;//是否审核
    private String sbcYn;//是否删除（0 否 1 是 ，默认0）
    private String sbcCustom1;//自定义1
    private String sbcCustom2;//自定义2
    private String sbcCustom3;//自定义3
    private String sbcCustom4;//自定义4
    private String sbcCustom5;//自定义5
    private String sbcCustom6;//自定义6
    
    

    public subject_blanket_category() {
		super();
	}

	@Override
	public String toString() {
		return "subject_blanket_category [sbcId=" + sbcId + ", sbcName=" + sbcName + ", sbcEngname=" + sbcEngname
				+ ", sbcRemark=" + sbcRemark + ", sbcAuditing=" + sbcAuditing + ", sbcYn=" + sbcYn + ", sbcCustom1="
				+ sbcCustom1 + ", sbcCustom2=" + sbcCustom2 + ", sbcCustom3=" + sbcCustom3 + ", sbcCustom4="
				+ sbcCustom4 + ", sbcCustom5=" + sbcCustom5 + ", sbcCustom6=" + sbcCustom6 + "]";
	}

	public String getSbcId() {
        return sbcId;
    }

    public void setSbcId(String sbcId) {
        this.sbcId = sbcId == null ? null : sbcId.trim();
    }

    public String getSbcName() {
        return sbcName;
    }

    public void setSbcName(String sbcName) {
        this.sbcName = sbcName == null ? null : sbcName.trim();
    }

    public String getSbcEngname() {
        return sbcEngname;
    }

    public void setSbcEngname(String sbcEngname) {
        this.sbcEngname = sbcEngname == null ? null : sbcEngname.trim();
    }

    public String getSbcRemark() {
        return sbcRemark;
    }

    public void setSbcRemark(String sbcRemark) {
        this.sbcRemark = sbcRemark == null ? null : sbcRemark.trim();
    }

    public String getSbcAuditing() {
        return sbcAuditing;
    }

    public void setSbcAuditing(String sbcAuditing) {
        this.sbcAuditing = sbcAuditing == null ? null : sbcAuditing.trim();
    }

    public String getSbcYn() {
        return sbcYn;
    }

    public void setSbcYn(String sbcYn) {
        this.sbcYn = sbcYn == null ? null : sbcYn.trim();
    }

    public String getSbcCustom1() {
        return sbcCustom1;
    }

    public void setSbcCustom1(String sbcCustom1) {
        this.sbcCustom1 = sbcCustom1 == null ? null : sbcCustom1.trim();
    }

    public String getSbcCustom2() {
        return sbcCustom2;
    }

    public void setSbcCustom2(String sbcCustom2) {
        this.sbcCustom2 = sbcCustom2 == null ? null : sbcCustom2.trim();
    }

    public String getSbcCustom3() {
        return sbcCustom3;
    }

    public void setSbcCustom3(String sbcCustom3) {
        this.sbcCustom3 = sbcCustom3 == null ? null : sbcCustom3.trim();
    }

    public String getSbcCustom4() {
        return sbcCustom4;
    }

    public void setSbcCustom4(String sbcCustom4) {
        this.sbcCustom4 = sbcCustom4 == null ? null : sbcCustom4.trim();
    }

    public String getSbcCustom5() {
        return sbcCustom5;
    }

    public void setSbcCustom5(String sbcCustom5) {
        this.sbcCustom5 = sbcCustom5 == null ? null : sbcCustom5.trim();
    }

    public String getSbcCustom6() {
        return sbcCustom6;
    }

    public void setSbcCustom6(String sbcCustom6) {
        this.sbcCustom6 = sbcCustom6 == null ? null : sbcCustom6.trim();
    }
}