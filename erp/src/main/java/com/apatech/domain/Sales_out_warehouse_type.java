package com.apatech.domain;

/**
 * 销售出库类型表
 * @author 刘成
 *
 */
public class Sales_out_warehouse_type {
    private String sowtId;//id（主键 唯一）
    private String sowtName;//类别名称
    private String sowtEngname;//英文名称
    private String sowtRemark;//备注
    private String sowtAuditing;//是否审核
    private String sowtYn;//是否删除（0 否 1 是 ，默认0）
    private String sowtCustom1;//自定义1
    private String sowtCustom2;//自定义2
    private String sowtCustom3;//自定义3
    private String sowtCustom4;//自定义4
    private String sowtCustom5;//自定义5
    private String sowtCustom6;//自定义6
    
    

    public Sales_out_warehouse_type() {
		super();
	}

	@Override
	public String toString() {
		return "Sales_out_warehouse_type [sowtId=" + sowtId + ", sowtName=" + sowtName + ", sowtEngname=" + sowtEngname
				+ ", sowtRemark=" + sowtRemark + ", sowtAuditing=" + sowtAuditing + ", sowtYn=" + sowtYn
				+ ", sowtCustom1=" + sowtCustom1 + ", sowtCustom2=" + sowtCustom2 + ", sowtCustom3=" + sowtCustom3
				+ ", sowtCustom4=" + sowtCustom4 + ", sowtCustom5=" + sowtCustom5 + ", sowtCustom6=" + sowtCustom6
				+ "]";
	}

	public String getSowtId() {
        return sowtId;
    }

    public void setSowtId(String sowtId) {
        this.sowtId = sowtId == null ? null : sowtId.trim();
    }

    public String getSowtName() {
        return sowtName;
    }

    public void setSowtName(String sowtName) {
        this.sowtName = sowtName == null ? null : sowtName.trim();
    }

    public String getSowtEngname() {
        return sowtEngname;
    }

    public void setSowtEngname(String sowtEngname) {
        this.sowtEngname = sowtEngname == null ? null : sowtEngname.trim();
    }

    public String getSowtRemark() {
        return sowtRemark;
    }

    public void setSowtRemark(String sowtRemark) {
        this.sowtRemark = sowtRemark == null ? null : sowtRemark.trim();
    }

    public String getSowtAuditing() {
        return sowtAuditing;
    }

    public void setSowtAuditing(String sowtAuditing) {
        this.sowtAuditing = sowtAuditing == null ? null : sowtAuditing.trim();
    }

    public String getSowtYn() {
        return sowtYn;
    }

    public void setSowtYn(String sowtYn) {
        this.sowtYn = sowtYn == null ? null : sowtYn.trim();
    }

    public String getSowtCustom1() {
        return sowtCustom1;
    }

    public void setSowtCustom1(String sowtCustom1) {
        this.sowtCustom1 = sowtCustom1 == null ? null : sowtCustom1.trim();
    }

    public String getSowtCustom2() {
        return sowtCustom2;
    }

    public void setSowtCustom2(String sowtCustom2) {
        this.sowtCustom2 = sowtCustom2 == null ? null : sowtCustom2.trim();
    }

    public String getSowtCustom3() {
        return sowtCustom3;
    }

    public void setSowtCustom3(String sowtCustom3) {
        this.sowtCustom3 = sowtCustom3 == null ? null : sowtCustom3.trim();
    }

    public String getSowtCustom4() {
        return sowtCustom4;
    }

    public void setSowtCustom4(String sowtCustom4) {
        this.sowtCustom4 = sowtCustom4 == null ? null : sowtCustom4.trim();
    }

    public String getSowtCustom5() {
        return sowtCustom5;
    }

    public void setSowtCustom5(String sowtCustom5) {
        this.sowtCustom5 = sowtCustom5 == null ? null : sowtCustom5.trim();
    }

    public String getSowtCustom6() {
        return sowtCustom6;
    }

    public void setSowtCustom6(String sowtCustom6) {
        this.sowtCustom6 = sowtCustom6 == null ? null : sowtCustom6.trim();
    }
}