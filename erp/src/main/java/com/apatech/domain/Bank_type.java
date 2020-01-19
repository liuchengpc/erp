package com.apatech.domain;

/**
 * 
 * @author 刘成
 *
 */
public class Bank_type {
    private String btId;//编号（主键 唯一）
    private String btName; //名称
    private String btEnglishName;//英文名称
    private String btRemark;//备注
    private String btAuditing;//是否审核
    private String btYn;//是否删除（0 否 1 是 ，默认0）
    private String btCustom1;//自定栏1
    private String btCustom2;//自定栏2
    private String btCustom3;//自定栏3
    private String btCustom4;//自定栏4
    private String btCustom5;//自定栏5
    private String btCustom6;//自定栏6
    
    

    public Bank_type() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Bank_type [btId=" + btId + ", btName=" + btName + ", btEnglishName=" + btEnglishName + ", btRemark="
				+ btRemark + ", btAuditing=" + btAuditing + ", btYn=" + btYn + ", btCustom1=" + btCustom1
				+ ", btCustom2=" + btCustom2 + ", btCustom3=" + btCustom3 + ", btCustom4=" + btCustom4 + ", btCustom5="
				+ btCustom5 + ", btCustom6=" + btCustom6 + "]";
	}



	public String getBtId() {
        return btId;
    }

    public void setBtId(String btId) {
        this.btId = btId == null ? null : btId.trim();
    }

    public String getBtName() {
        return btName;
    }

    public void setBtName(String btName) {
        this.btName = btName == null ? null : btName.trim();
    }

    public String getBtEnglishName() {
        return btEnglishName;
    }

    public void setBtEnglishName(String btEnglishName) {
        this.btEnglishName = btEnglishName == null ? null : btEnglishName.trim();
    }

    public String getBtRemark() {
        return btRemark;
    }

    public void setBtRemark(String btRemark) {
        this.btRemark = btRemark == null ? null : btRemark.trim();
    }

    public String getBtAuditing() {
        return btAuditing;
    }

    public void setBtAuditing(String btAuditing) {
        this.btAuditing = btAuditing == null ? null : btAuditing.trim();
    }

    public String getBtYn() {
        return btYn;
    }

    public void setBtYn(String btYn) {
        this.btYn = btYn == null ? null : btYn.trim();
    }

    public String getBtCustom1() {
        return btCustom1;
    }

    public void setBtCustom1(String btCustom1) {
        this.btCustom1 = btCustom1 == null ? null : btCustom1.trim();
    }

    public String getBtCustom2() {
        return btCustom2;
    }

    public void setBtCustom2(String btCustom2) {
        this.btCustom2 = btCustom2 == null ? null : btCustom2.trim();
    }

    public String getBtCustom3() {
        return btCustom3;
    }

    public void setBtCustom3(String btCustom3) {
        this.btCustom3 = btCustom3 == null ? null : btCustom3.trim();
    }

    public String getBtCustom4() {
        return btCustom4;
    }

    public void setBtCustom4(String btCustom4) {
        this.btCustom4 = btCustom4 == null ? null : btCustom4.trim();
    }

    public String getBtCustom5() {
        return btCustom5;
    }

    public void setBtCustom5(String btCustom5) {
        this.btCustom5 = btCustom5 == null ? null : btCustom5.trim();
    }

    public String getBtCustom6() {
        return btCustom6;
    }

    public void setBtCustom6(String btCustom6) {
        this.btCustom6 = btCustom6 == null ? null : btCustom6.trim();
    }
}