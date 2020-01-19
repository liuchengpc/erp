package com.apatech.domain;

/**
 * 学历表
 * @author 刘成
 *
 */
public class Educational_background {
    private String ebId;//学历编号（主键 唯一）
    private String ebName;//学历名称
    private String ebEnglishName;//英文名称
    private String ebRemark;//备注
    private String ebAuditing;//是否审核
    private String ebYn;//是否删除（0 否 1 是 ，默认0）
    private String ebCustom1;//自定栏1
    private String ebCustom2;//自定栏2
    private String ebCustom3;//自定栏3
    private String ebCustom4;//自定栏4
    private String ebCustom5;//自定栏5
    private String ebCustom6;//自定栏6
    
    

    public Educational_background() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Educational_background [ebId=" + ebId + ", ebName=" + ebName + ", ebEnglishName=" + ebEnglishName
				+ ", ebRemark=" + ebRemark + ", ebAuditing=" + ebAuditing + ", ebYn=" + ebYn + ", ebCustom1="
				+ ebCustom1 + ", ebCustom2=" + ebCustom2 + ", ebCustom3=" + ebCustom3 + ", ebCustom4=" + ebCustom4
				+ ", ebCustom5=" + ebCustom5 + ", ebCustom6=" + ebCustom6 + "]";
	}



	public String getEbId() {
        return ebId;
    }

    public void setEbId(String ebId) {
        this.ebId = ebId == null ? null : ebId.trim();
    }

    public String getEbName() {
        return ebName;
    }

    public void setEbName(String ebName) {
        this.ebName = ebName == null ? null : ebName.trim();
    }

    public String getEbEnglishName() {
        return ebEnglishName;
    }

    public void setEbEnglishName(String ebEnglishName) {
        this.ebEnglishName = ebEnglishName == null ? null : ebEnglishName.trim();
    }

    public String getEbRemark() {
        return ebRemark;
    }

    public void setEbRemark(String ebRemark) {
        this.ebRemark = ebRemark == null ? null : ebRemark.trim();
    }

    public String getEbAuditing() {
        return ebAuditing;
    }

    public void setEbAuditing(String ebAuditing) {
        this.ebAuditing = ebAuditing == null ? null : ebAuditing.trim();
    }

    public String getEbYn() {
        return ebYn;
    }

    public void setEbYn(String ebYn) {
        this.ebYn = ebYn == null ? null : ebYn.trim();
    }

    public String getEbCustom1() {
        return ebCustom1;
    }

    public void setEbCustom1(String ebCustom1) {
        this.ebCustom1 = ebCustom1 == null ? null : ebCustom1.trim();
    }

    public String getEbCustom2() {
        return ebCustom2;
    }

    public void setEbCustom2(String ebCustom2) {
        this.ebCustom2 = ebCustom2 == null ? null : ebCustom2.trim();
    }

    public String getEbCustom3() {
        return ebCustom3;
    }

    public void setEbCustom3(String ebCustom3) {
        this.ebCustom3 = ebCustom3 == null ? null : ebCustom3.trim();
    }

    public String getEbCustom4() {
        return ebCustom4;
    }

    public void setEbCustom4(String ebCustom4) {
        this.ebCustom4 = ebCustom4 == null ? null : ebCustom4.trim();
    }

    public String getEbCustom5() {
        return ebCustom5;
    }

    public void setEbCustom5(String ebCustom5) {
        this.ebCustom5 = ebCustom5 == null ? null : ebCustom5.trim();
    }

    public String getEbCustom6() {
        return ebCustom6;
    }

    public void setEbCustom6(String ebCustom6) {
        this.ebCustom6 = ebCustom6 == null ? null : ebCustom6.trim();
    }
}