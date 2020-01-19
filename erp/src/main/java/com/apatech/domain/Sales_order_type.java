package com.apatech.domain;

/**
 * 销售订单类型表
 * @author 刘成
 *
 */
public class Sales_order_type {
    private String sotId;//id（主键 唯一）
    private String sotName;//类别名称
    private String sotEngname;//英文名称
    private String sotRemark;//备注
    private String sotAuditing;//是否审核
    private String sotYn;//是否删除（0 否 1 是 ，默认0）
    private String sotCustom1;//自定义1
    private String sotCustom2;//自定义2
    private String sotCustom3;//自定义3
    private String sotCustom4;//自定义4
    private String sotCustom5;//自定义5
    private String sotCustom6;//自定义6
    
    

    public Sales_order_type() {
		super();
	}

	@Override
	public String toString() {
		return "Sales_order_type [sotId=" + sotId + ", sotName=" + sotName + ", sotEngname=" + sotEngname
				+ ", sotRemark=" + sotRemark + ", sotAuditing=" + sotAuditing + ", sotYn=" + sotYn + ", sotCustom1="
				+ sotCustom1 + ", sotCustom2=" + sotCustom2 + ", sotCustom3=" + sotCustom3 + ", sotCustom4="
				+ sotCustom4 + ", sotCustom5=" + sotCustom5 + ", sotCustom6=" + sotCustom6 + "]";
	}

	public String getSotId() {
        return sotId;
    }

    public void setSotId(String sotId) {
        this.sotId = sotId == null ? null : sotId.trim();
    }

    public String getSotName() {
        return sotName;
    }

    public void setSotName(String sotName) {
        this.sotName = sotName == null ? null : sotName.trim();
    }

    public String getSotEngname() {
        return sotEngname;
    }

    public void setSotEngname(String sotEngname) {
        this.sotEngname = sotEngname == null ? null : sotEngname.trim();
    }

    public String getSotRemark() {
        return sotRemark;
    }

    public void setSotRemark(String sotRemark) {
        this.sotRemark = sotRemark == null ? null : sotRemark.trim();
    }

    public String getSotAuditing() {
        return sotAuditing;
    }

    public void setSotAuditing(String sotAuditing) {
        this.sotAuditing = sotAuditing == null ? null : sotAuditing.trim();
    }

    public String getSotYn() {
        return sotYn;
    }

    public void setSotYn(String sotYn) {
        this.sotYn = sotYn == null ? null : sotYn.trim();
    }

    public String getSotCustom1() {
        return sotCustom1;
    }

    public void setSotCustom1(String sotCustom1) {
        this.sotCustom1 = sotCustom1 == null ? null : sotCustom1.trim();
    }

    public String getSotCustom2() {
        return sotCustom2;
    }

    public void setSotCustom2(String sotCustom2) {
        this.sotCustom2 = sotCustom2 == null ? null : sotCustom2.trim();
    }

    public String getSotCustom3() {
        return sotCustom3;
    }

    public void setSotCustom3(String sotCustom3) {
        this.sotCustom3 = sotCustom3 == null ? null : sotCustom3.trim();
    }

    public String getSotCustom4() {
        return sotCustom4;
    }

    public void setSotCustom4(String sotCustom4) {
        this.sotCustom4 = sotCustom4 == null ? null : sotCustom4.trim();
    }

    public String getSotCustom5() {
        return sotCustom5;
    }

    public void setSotCustom5(String sotCustom5) {
        this.sotCustom5 = sotCustom5 == null ? null : sotCustom5.trim();
    }

    public String getSotCustom6() {
        return sotCustom6;
    }

    public void setSotCustom6(String sotCustom6) {
        this.sotCustom6 = sotCustom6 == null ? null : sotCustom6.trim();
    }
}