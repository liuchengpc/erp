package com.apatech.domain;

/**
 * 供应商类别表
 * @author 刘成
 *
 */
public class Supplier_type {
    private String stId;//id（主键 唯一）
    private String stName;//类别名称
    private String stEngname;//英文名称
    private String stRemark;//备注
    private String stAuditing;//是否审核
    private String stYn;//是否删除（0 否 1 是 ，默认0）
    private String stCustom1;//自定义1
    private String stCustom2;//自定义2
    private String stCustom3;//自定义3
    private String stCustom4;//自定义4
    private String stCustom5;//自定义5
    private String stCustom6;//自定义6
    
    

    public Supplier_type() {
		super();
	}

	@Override
	public String toString() {
		return "Supplier_type [stId=" + stId + ", stName=" + stName + ", stEngname=" + stEngname + ", stRemark="
				+ stRemark + ", stAuditing=" + stAuditing + ", stYn=" + stYn + ", stCustom1=" + stCustom1
				+ ", stCustom2=" + stCustom2 + ", stCustom3=" + stCustom3 + ", stCustom4=" + stCustom4 + ", stCustom5="
				+ stCustom5 + ", stCustom6=" + stCustom6 + "]";
	}

	public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId == null ? null : stId.trim();
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public String getStEngname() {
        return stEngname;
    }

    public void setStEngname(String stEngname) {
        this.stEngname = stEngname == null ? null : stEngname.trim();
    }

    public String getStRemark() {
        return stRemark;
    }

    public void setStRemark(String stRemark) {
        this.stRemark = stRemark == null ? null : stRemark.trim();
    }

    public String getStAuditing() {
        return stAuditing;
    }

    public void setStAuditing(String stAuditing) {
        this.stAuditing = stAuditing == null ? null : stAuditing.trim();
    }

    public String getStYn() {
        return stYn;
    }

    public void setStYn(String stYn) {
        this.stYn = stYn == null ? null : stYn.trim();
    }

    public String getStCustom1() {
        return stCustom1;
    }

    public void setStCustom1(String stCustom1) {
        this.stCustom1 = stCustom1 == null ? null : stCustom1.trim();
    }

    public String getStCustom2() {
        return stCustom2;
    }

    public void setStCustom2(String stCustom2) {
        this.stCustom2 = stCustom2 == null ? null : stCustom2.trim();
    }

    public String getStCustom3() {
        return stCustom3;
    }

    public void setStCustom3(String stCustom3) {
        this.stCustom3 = stCustom3 == null ? null : stCustom3.trim();
    }

    public String getStCustom4() {
        return stCustom4;
    }

    public void setStCustom4(String stCustom4) {
        this.stCustom4 = stCustom4 == null ? null : stCustom4.trim();
    }

    public String getStCustom5() {
        return stCustom5;
    }

    public void setStCustom5(String stCustom5) {
        this.stCustom5 = stCustom5 == null ? null : stCustom5.trim();
    }

    public String getStCustom6() {
        return stCustom6;
    }

    public void setStCustom6(String stCustom6) {
        this.stCustom6 = stCustom6 == null ? null : stCustom6.trim();
    }
}