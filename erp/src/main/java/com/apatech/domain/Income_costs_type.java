package com.apatech.domain;

/**
 * 收入费用类别表
 * @author 刘成
 *
 */
public class Income_costs_type {
    private String ictId;//编号（主键 唯一）
    private String ictName;//名称
    private String ictEnglishName;//英文名称
    private String ictSubject;//科目
    private String ictRemark;//备注
    private String ictAuditing;//是否审核
    private String ictYn;//是否删除（0 否 1 是 ，默认0）
    private String ictCustom1;//自定栏1
    private String ictCustom2;//自定栏2
    private String ictCustom3;//自定栏3
    private String ictCustom4;//自定栏4
    private String ictCustom5;//自定栏5
    private String ictCustom6;//自定栏6
    
    

    public Income_costs_type() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Income_costs_type [ictId=" + ictId + ", ictName=" + ictName + ", ictEnglishName=" + ictEnglishName
				+ ", ictSubject=" + ictSubject + ", ictRemark=" + ictRemark + ", ictAuditing=" + ictAuditing
				+ ", ictYn=" + ictYn + ", ictCustom1=" + ictCustom1 + ", ictCustom2=" + ictCustom2 + ", ictCustom3="
				+ ictCustom3 + ", ictCustom4=" + ictCustom4 + ", ictCustom5=" + ictCustom5 + ", ictCustom6="
				+ ictCustom6 + "]";
	}



	public String getIctId() {
        return ictId;
    }

    public void setIctId(String ictId) {
        this.ictId = ictId == null ? null : ictId.trim();
    }

    public String getIctName() {
        return ictName;
    }

    public void setIctName(String ictName) {
        this.ictName = ictName == null ? null : ictName.trim();
    }

    public String getIctEnglishName() {
        return ictEnglishName;
    }

    public void setIctEnglishName(String ictEnglishName) {
        this.ictEnglishName = ictEnglishName == null ? null : ictEnglishName.trim();
    }

    public String getIctSubject() {
        return ictSubject;
    }

    public void setIctSubject(String ictSubject) {
        this.ictSubject = ictSubject == null ? null : ictSubject.trim();
    }

    public String getIctRemark() {
        return ictRemark;
    }

    public void setIctRemark(String ictRemark) {
        this.ictRemark = ictRemark == null ? null : ictRemark.trim();
    }

    public String getIctAuditing() {
        return ictAuditing;
    }

    public void setIctAuditing(String ictAuditing) {
        this.ictAuditing = ictAuditing == null ? null : ictAuditing.trim();
    }

    public String getIctYn() {
        return ictYn;
    }

    public void setIctYn(String ictYn) {
        this.ictYn = ictYn == null ? null : ictYn.trim();
    }

    public String getIctCustom1() {
        return ictCustom1;
    }

    public void setIctCustom1(String ictCustom1) {
        this.ictCustom1 = ictCustom1 == null ? null : ictCustom1.trim();
    }

    public String getIctCustom2() {
        return ictCustom2;
    }

    public void setIctCustom2(String ictCustom2) {
        this.ictCustom2 = ictCustom2 == null ? null : ictCustom2.trim();
    }

    public String getIctCustom3() {
        return ictCustom3;
    }

    public void setIctCustom3(String ictCustom3) {
        this.ictCustom3 = ictCustom3 == null ? null : ictCustom3.trim();
    }

    public String getIctCustom4() {
        return ictCustom4;
    }

    public void setIctCustom4(String ictCustom4) {
        this.ictCustom4 = ictCustom4 == null ? null : ictCustom4.trim();
    }

    public String getIctCustom5() {
        return ictCustom5;
    }

    public void setIctCustom5(String ictCustom5) {
        this.ictCustom5 = ictCustom5 == null ? null : ictCustom5.trim();
    }

    public String getIctCustom6() {
        return ictCustom6;
    }

    public void setIctCustom6(String ictCustom6) {
        this.ictCustom6 = ictCustom6 == null ? null : ictCustom6.trim();
    }
}