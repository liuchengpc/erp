package com.apatech.domain;

/**
 * 账款归属表
 * @author 刘成
 *
 */
public class Moneybelong {
    private String moneybelongId;//账款归属id（主键 唯一）
    private String moneybelongName;//账款归属
    private String moneybelongType;//类别
    private String moneybelongRemarks;//备注
    private String moneybelongAuditing;//是否审核
    private String moneybelongYn;//是否删除（0 否 1 是 ，默认0）
    private String moneybelongCustom1;//自定栏1
    private String moneybelongCustom2;//自定栏2
    private String moneybelongCustom3;//自定栏3
    private String moneybelongCustom4;//自定栏4
    private String moneybelongCustom5;//自定栏5
    private String moneybelongCustom6;//自定栏6
    
    

    public Moneybelong() {
		super();
	}

	@Override
	public String toString() {
		return "Moneybelong [moneybelongId=" + moneybelongId + ", moneybelongName=" + moneybelongName
				+ ", moneybelongType=" + moneybelongType + ", moneybelongRemarks=" + moneybelongRemarks
				+ ", moneybelongAuditing=" + moneybelongAuditing + ", moneybelongYn=" + moneybelongYn
				+ ", moneybelongCustom1=" + moneybelongCustom1 + ", moneybelongCustom2=" + moneybelongCustom2
				+ ", moneybelongCustom3=" + moneybelongCustom3 + ", moneybelongCustom4=" + moneybelongCustom4
				+ ", moneybelongCustom5=" + moneybelongCustom5 + ", moneybelongCustom6=" + moneybelongCustom6 + "]";
	}

	public String getMoneybelongId() {
        return moneybelongId;
    }

    public void setMoneybelongId(String moneybelongId) {
        this.moneybelongId = moneybelongId == null ? null : moneybelongId.trim();
    }

    public String getMoneybelongName() {
        return moneybelongName;
    }

    public void setMoneybelongName(String moneybelongName) {
        this.moneybelongName = moneybelongName == null ? null : moneybelongName.trim();
    }

    public String getMoneybelongType() {
        return moneybelongType;
    }

    public void setMoneybelongType(String moneybelongType) {
        this.moneybelongType = moneybelongType == null ? null : moneybelongType.trim();
    }

    public String getMoneybelongRemarks() {
        return moneybelongRemarks;
    }

    public void setMoneybelongRemarks(String moneybelongRemarks) {
        this.moneybelongRemarks = moneybelongRemarks == null ? null : moneybelongRemarks.trim();
    }

    public String getMoneybelongAuditing() {
        return moneybelongAuditing;
    }

    public void setMoneybelongAuditing(String moneybelongAuditing) {
        this.moneybelongAuditing = moneybelongAuditing == null ? null : moneybelongAuditing.trim();
    }

    public String getMoneybelongYn() {
        return moneybelongYn;
    }

    public void setMoneybelongYn(String moneybelongYn) {
        this.moneybelongYn = moneybelongYn == null ? null : moneybelongYn.trim();
    }

    public String getMoneybelongCustom1() {
        return moneybelongCustom1;
    }

    public void setMoneybelongCustom1(String moneybelongCustom1) {
        this.moneybelongCustom1 = moneybelongCustom1 == null ? null : moneybelongCustom1.trim();
    }

    public String getMoneybelongCustom2() {
        return moneybelongCustom2;
    }

    public void setMoneybelongCustom2(String moneybelongCustom2) {
        this.moneybelongCustom2 = moneybelongCustom2 == null ? null : moneybelongCustom2.trim();
    }

    public String getMoneybelongCustom3() {
        return moneybelongCustom3;
    }

    public void setMoneybelongCustom3(String moneybelongCustom3) {
        this.moneybelongCustom3 = moneybelongCustom3 == null ? null : moneybelongCustom3.trim();
    }

    public String getMoneybelongCustom4() {
        return moneybelongCustom4;
    }

    public void setMoneybelongCustom4(String moneybelongCustom4) {
        this.moneybelongCustom4 = moneybelongCustom4 == null ? null : moneybelongCustom4.trim();
    }

    public String getMoneybelongCustom5() {
        return moneybelongCustom5;
    }

    public void setMoneybelongCustom5(String moneybelongCustom5) {
        this.moneybelongCustom5 = moneybelongCustom5 == null ? null : moneybelongCustom5.trim();
    }

    public String getMoneybelongCustom6() {
        return moneybelongCustom6;
    }

    public void setMoneybelongCustom6(String moneybelongCustom6) {
        this.moneybelongCustom6 = moneybelongCustom6 == null ? null : moneybelongCustom6.trim();
    }
}