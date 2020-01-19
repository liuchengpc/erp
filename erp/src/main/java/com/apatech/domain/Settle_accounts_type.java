package com.apatech.domain;
/**
 * 结算方式表
 * @author 刘成
 *
 */
public class Settle_accounts_type {
    private String satId;//编号（主键 唯一）
    private String satName;//名称
    private String satEnglishName;//英文名称
    private String satSubject;//科目
    private String satRemark;//备注
    private String satAuditing;//是否审核
    private String satYn;//是否删除（0 否 1 是 ，默认0）
    private String satCustom1;//自定义1
    private String satCustom2;//自定义2
    private String satCustom3;//自定义3
    private String satCustom4;//自定义4
    private String satCustom5;//自定义5
    private String satCustom6;//自定义6
    
    

    public Settle_accounts_type() {
		super();
	}

	@Override
	public String toString() {
		return "Settle_accounts_type [satId=" + satId + ", satName=" + satName + ", satEnglishName=" + satEnglishName
				+ ", satSubject=" + satSubject + ", satRemark=" + satRemark + ", satAuditing=" + satAuditing
				+ ", satYn=" + satYn + ", satCustom1=" + satCustom1 + ", satCustom2=" + satCustom2 + ", satCustom3="
				+ satCustom3 + ", satCustom4=" + satCustom4 + ", satCustom5=" + satCustom5 + ", satCustom6="
				+ satCustom6 + "]";
	}

	public String getSatId() {
        return satId;
    }

    public void setSatId(String satId) {
        this.satId = satId == null ? null : satId.trim();
    }

    public String getSatName() {
        return satName;
    }

    public void setSatName(String satName) {
        this.satName = satName == null ? null : satName.trim();
    }

    public String getSatEnglishName() {
        return satEnglishName;
    }

    public void setSatEnglishName(String satEnglishName) {
        this.satEnglishName = satEnglishName == null ? null : satEnglishName.trim();
    }

    public String getSatSubject() {
        return satSubject;
    }

    public void setSatSubject(String satSubject) {
        this.satSubject = satSubject == null ? null : satSubject.trim();
    }

    public String getSatRemark() {
        return satRemark;
    }

    public void setSatRemark(String satRemark) {
        this.satRemark = satRemark == null ? null : satRemark.trim();
    }

    public String getSatAuditing() {
        return satAuditing;
    }

    public void setSatAuditing(String satAuditing) {
        this.satAuditing = satAuditing == null ? null : satAuditing.trim();
    }

    public String getSatYn() {
        return satYn;
    }

    public void setSatYn(String satYn) {
        this.satYn = satYn == null ? null : satYn.trim();
    }

    public String getSatCustom1() {
        return satCustom1;
    }

    public void setSatCustom1(String satCustom1) {
        this.satCustom1 = satCustom1 == null ? null : satCustom1.trim();
    }

    public String getSatCustom2() {
        return satCustom2;
    }

    public void setSatCustom2(String satCustom2) {
        this.satCustom2 = satCustom2 == null ? null : satCustom2.trim();
    }

    public String getSatCustom3() {
        return satCustom3;
    }

    public void setSatCustom3(String satCustom3) {
        this.satCustom3 = satCustom3 == null ? null : satCustom3.trim();
    }

    public String getSatCustom4() {
        return satCustom4;
    }

    public void setSatCustom4(String satCustom4) {
        this.satCustom4 = satCustom4 == null ? null : satCustom4.trim();
    }

    public String getSatCustom5() {
        return satCustom5;
    }

    public void setSatCustom5(String satCustom5) {
        this.satCustom5 = satCustom5 == null ? null : satCustom5.trim();
    }

    public String getSatCustom6() {
        return satCustom6;
    }

    public void setSatCustom6(String satCustom6) {
        this.satCustom6 = satCustom6 == null ? null : satCustom6.trim();
    }
}