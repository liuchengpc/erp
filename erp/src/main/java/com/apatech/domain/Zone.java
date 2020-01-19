package com.apatech.domain;

/**
 * 地区表
 * @author 刘成
 *
 */
public class Zone {
    private String zoneId;//地区id（主键 唯一）
    private String zoneName;//地区名称
    private String zoneEnglishName;//英文名称
    private String zoneRemark;//备注
    private String zoneAuditing;//是否审核
    private String zoneYn;//是否删除（0 否 1 是 ，默认0）
    private String zoneCustom1;//自定义1
    private String zoneCustom2;//自定义2
    private String zoneCustom3;//自定义3
    private String zoneCustom4;//自定义4
    private String zoneCustom5;//自定义5
    private String zoneCustom6;//自定义6
    
    

    public Zone() {
		super();
	}

	@Override
	public String toString() {
		return "Zone [zoneId=" + zoneId + ", zoneName=" + zoneName + ", zoneEnglishName=" + zoneEnglishName
				+ ", zoneRemark=" + zoneRemark + ", zoneAuditing=" + zoneAuditing + ", zoneYn=" + zoneYn
				+ ", zoneCustom1=" + zoneCustom1 + ", zoneCustom2=" + zoneCustom2 + ", zoneCustom3=" + zoneCustom3
				+ ", zoneCustom4=" + zoneCustom4 + ", zoneCustom5=" + zoneCustom5 + ", zoneCustom6=" + zoneCustom6
				+ "]";
	}

	public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId == null ? null : zoneId.trim();
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName == null ? null : zoneName.trim();
    }

    public String getZoneEnglishName() {
        return zoneEnglishName;
    }

    public void setZoneEnglishName(String zoneEnglishName) {
        this.zoneEnglishName = zoneEnglishName == null ? null : zoneEnglishName.trim();
    }

    public String getZoneRemark() {
        return zoneRemark;
    }

    public void setZoneRemark(String zoneRemark) {
        this.zoneRemark = zoneRemark == null ? null : zoneRemark.trim();
    }

    public String getZoneAuditing() {
        return zoneAuditing;
    }

    public void setZoneAuditing(String zoneAuditing) {
        this.zoneAuditing = zoneAuditing == null ? null : zoneAuditing.trim();
    }

    public String getZoneYn() {
        return zoneYn;
    }

    public void setZoneYn(String zoneYn) {
        this.zoneYn = zoneYn == null ? null : zoneYn.trim();
    }

    public String getZoneCustom1() {
        return zoneCustom1;
    }

    public void setZoneCustom1(String zoneCustom1) {
        this.zoneCustom1 = zoneCustom1 == null ? null : zoneCustom1.trim();
    }

    public String getZoneCustom2() {
        return zoneCustom2;
    }

    public void setZoneCustom2(String zoneCustom2) {
        this.zoneCustom2 = zoneCustom2 == null ? null : zoneCustom2.trim();
    }

    public String getZoneCustom3() {
        return zoneCustom3;
    }

    public void setZoneCustom3(String zoneCustom3) {
        this.zoneCustom3 = zoneCustom3 == null ? null : zoneCustom3.trim();
    }

    public String getZoneCustom4() {
        return zoneCustom4;
    }

    public void setZoneCustom4(String zoneCustom4) {
        this.zoneCustom4 = zoneCustom4 == null ? null : zoneCustom4.trim();
    }

    public String getZoneCustom5() {
        return zoneCustom5;
    }

    public void setZoneCustom5(String zoneCustom5) {
        this.zoneCustom5 = zoneCustom5 == null ? null : zoneCustom5.trim();
    }

    public String getZoneCustom6() {
        return zoneCustom6;
    }

    public void setZoneCustom6(String zoneCustom6) {
        this.zoneCustom6 = zoneCustom6 == null ? null : zoneCustom6.trim();
    }
}