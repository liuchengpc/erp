package com.apatech.domain;

/**
 * 税目表
 * @author 刘成
 *
 */
public class Tax_items {
    private String tiId;//编号（主键 唯一）
    private String tiName;//名称
    private String tiEnglishName;//英文名称
    private String tiRemark;//备注
    private String tiAuditing;//是否审核
    private String tiYn;//是否删除（0 否 1 是 ，默认0）
    private String tiCustom1;//自定义1
    private String tiCustom2;//自定义2
    private String tiCustom3;//自定义3
    private String tiCustom4;//自定义4
    private String tiCustom5;//自定义5
    private String tiCustom6;//自定义6
    
    

    public Tax_items() {
		super();
	}

	@Override
	public String toString() {
		return "Tax_items [tiId=" + tiId + ", tiName=" + tiName + ", tiEnglishName=" + tiEnglishName + ", tiRemark="
				+ tiRemark + ", tiAuditing=" + tiAuditing + ", tiYn=" + tiYn + ", tiCustom1=" + tiCustom1
				+ ", tiCustom2=" + tiCustom2 + ", tiCustom3=" + tiCustom3 + ", tiCustom4=" + tiCustom4 + ", tiCustom5="
				+ tiCustom5 + "]";
	}

	public String getTiId() {
        return tiId;
    }

    public void setTiId(String tiId) {
        this.tiId = tiId == null ? null : tiId.trim();
    }

    public String getTiName() {
        return tiName;
    }

    public void setTiName(String tiName) {
        this.tiName = tiName == null ? null : tiName.trim();
    }

    public String getTiEnglishName() {
        return tiEnglishName;
    }

    public void setTiEnglishName(String tiEnglishName) {
        this.tiEnglishName = tiEnglishName == null ? null : tiEnglishName.trim();
    }

    public String getTiRemark() {
        return tiRemark;
    }

    public void setTiRemark(String tiRemark) {
        this.tiRemark = tiRemark == null ? null : tiRemark.trim();
    }

    public String getTiAuditing() {
        return tiAuditing;
    }

    public void setTiAuditing(String tiAuditing) {
        this.tiAuditing = tiAuditing == null ? null : tiAuditing.trim();
    }

    public String getTiYn() {
        return tiYn;
    }

    public void setTiYn(String tiYn) {
        this.tiYn = tiYn == null ? null : tiYn.trim();
    }

    public String getTiCustom1() {
        return tiCustom1;
    }

    public void setTiCustom1(String tiCustom1) {
        this.tiCustom1 = tiCustom1 == null ? null : tiCustom1.trim();
    }

    public String getTiCustom2() {
        return tiCustom2;
    }

    public void setTiCustom2(String tiCustom2) {
        this.tiCustom2 = tiCustom2 == null ? null : tiCustom2.trim();
    }

    public String getTiCustom3() {
        return tiCustom3;
    }

    public void setTiCustom3(String tiCustom3) {
        this.tiCustom3 = tiCustom3 == null ? null : tiCustom3.trim();
    }

    public String getTiCustom4() {
        return tiCustom4;
    }

    public void setTiCustom4(String tiCustom4) {
        this.tiCustom4 = tiCustom4 == null ? null : tiCustom4.trim();
    }

    public String getTiCustom5() {
        return tiCustom5;
    }

    public void setTiCustom5(String tiCustom5) {
        this.tiCustom5 = tiCustom5 == null ? null : tiCustom5.trim();
    }

    public String getTiCustom6() {
        return tiCustom6;
    }

    public void setTiCustom6(String tiCustom6) {
        this.tiCustom6 = tiCustom6 == null ? null : tiCustom6.trim();
    }
}