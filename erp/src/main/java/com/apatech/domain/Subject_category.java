package com.apatech.domain;

/**
 * 科目类别表
 * @author 刘成
 *
 */
public class Subject_category {
    private String scId;//id（主键 唯一）
    private String scName;//类别名称
    private String scEngname;//英文名称
    private String scRemark;//备注
    private String scAuditing;//是否审核
    private String scYn;//是否删除（0 否 1 是 ，默认0）
    private String scCustom1;//自定义1
    private String scCustom2;//自定义2
    private String scCustom3;//自定义3
    private String scCustom4;//自定义4
    private String scCustom5;//自定义5
    private String scCustom6;//自定义6
    
    

    public Subject_category() {
		super();
	}

	@Override
	public String toString() {
		return "Subject_category [scId=" + scId + ", scName=" + scName + ", scEngname=" + scEngname + ", scRemark="
				+ scRemark + ", scAuditing=" + scAuditing + ", scYn=" + scYn + ", scCustom1=" + scCustom1
				+ ", scCustom2=" + scCustom2 + ", scCustom3=" + scCustom3 + ", scCustom4=" + scCustom4 + ", scCustom5="
				+ scCustom5 + ", scCustom6=" + scCustom6 + "]";
	}

	public String getScId() {
        return scId;
    }

    public void setScId(String scId) {
        this.scId = scId == null ? null : scId.trim();
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    public String getScEngname() {
        return scEngname;
    }

    public void setScEngname(String scEngname) {
        this.scEngname = scEngname == null ? null : scEngname.trim();
    }

    public String getScRemark() {
        return scRemark;
    }

    public void setScRemark(String scRemark) {
        this.scRemark = scRemark == null ? null : scRemark.trim();
    }

    public String getScAuditing() {
        return scAuditing;
    }

    public void setScAuditing(String scAuditing) {
        this.scAuditing = scAuditing == null ? null : scAuditing.trim();
    }

    public String getScYn() {
        return scYn;
    }

    public void setScYn(String scYn) {
        this.scYn = scYn == null ? null : scYn.trim();
    }

    public String getScCustom1() {
        return scCustom1;
    }

    public void setScCustom1(String scCustom1) {
        this.scCustom1 = scCustom1 == null ? null : scCustom1.trim();
    }

    public String getScCustom2() {
        return scCustom2;
    }

    public void setScCustom2(String scCustom2) {
        this.scCustom2 = scCustom2 == null ? null : scCustom2.trim();
    }

    public String getScCustom3() {
        return scCustom3;
    }

    public void setScCustom3(String scCustom3) {
        this.scCustom3 = scCustom3 == null ? null : scCustom3.trim();
    }

    public String getScCustom4() {
        return scCustom4;
    }

    public void setScCustom4(String scCustom4) {
        this.scCustom4 = scCustom4 == null ? null : scCustom4.trim();
    }

    public String getScCustom5() {
        return scCustom5;
    }

    public void setScCustom5(String scCustom5) {
        this.scCustom5 = scCustom5 == null ? null : scCustom5.trim();
    }

    public String getScCustom6() {
        return scCustom6;
    }

    public void setScCustom6(String scCustom6) {
        this.scCustom6 = scCustom6 == null ? null : scCustom6.trim();
    }
}