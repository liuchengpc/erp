package com.apatech.domain;

/**
 * 采购请购类型表
 * @author 刘成
 *
 */
public class Purchase_requisition_type {
    private String prtId;//id（主键 唯一）
    private String prtName;//类别名称
    private String prtEngname;//英文名称
    private String prtRemark;//备注
    private String prtAudition;//是否审核
    private String prtYn;//是否删除（0 否 1 是 ，默认0）
    private String prtCustom1;//自定义1
    private String prtCustom2;//自定义2
    private String prtCustom3;//自定义3
    private String prtCustom4;//自定义4
    private String prtCustom5;//自定义5
    private String prtCustom6;//自定义6
    
    
    
    public Purchase_requisition_type() {
		super();
	}

	@Override
	public String toString() {
		return "Purchase_requisition_type [prtId=" + prtId + ", prtName=" + prtName + ", prtEngname=" + prtEngname
				+ ", prtRemark=" + prtRemark + ", prtAudition=" + prtAudition + ", prtYn=" + prtYn + ", prtCustom1="
				+ prtCustom1 + ", prtCustom2=" + prtCustom2 + ", prtCustom3=" + prtCustom3 + ", prtCustom4="
				+ prtCustom4 + ", prtCustom5=" + prtCustom5 + ", prtCustom6=" + prtCustom6 + "]";
	}

	public String getPrtId() {
        return prtId;
    }

    public void setPrtId(String prtId) {
        this.prtId = prtId == null ? null : prtId.trim();
    }

    public String getPrtName() {
        return prtName;
    }

    public void setPrtName(String prtName) {
        this.prtName = prtName == null ? null : prtName.trim();
    }

    public String getPrtEngname() {
        return prtEngname;
    }

    public void setPrtEngname(String prtEngname) {
        this.prtEngname = prtEngname == null ? null : prtEngname.trim();
    }

    public String getPrtRemark() {
        return prtRemark;
    }

    public void setPrtRemark(String prtRemark) {
        this.prtRemark = prtRemark == null ? null : prtRemark.trim();
    }

    public String getPrtAudition() {
        return prtAudition;
    }

    public void setPrtAudition(String prtAudition) {
        this.prtAudition = prtAudition == null ? null : prtAudition.trim();
    }

    public String getPrtYn() {
        return prtYn;
    }

    public void setPrtYn(String prtYn) {
        this.prtYn = prtYn == null ? null : prtYn.trim();
    }

    public String getPrtCustom1() {
        return prtCustom1;
    }

    public void setPrtCustom1(String prtCustom1) {
        this.prtCustom1 = prtCustom1 == null ? null : prtCustom1.trim();
    }

    public String getPrtCustom2() {
        return prtCustom2;
    }

    public void setPrtCustom2(String prtCustom2) {
        this.prtCustom2 = prtCustom2 == null ? null : prtCustom2.trim();
    }

    public String getPrtCustom3() {
        return prtCustom3;
    }

    public void setPrtCustom3(String prtCustom3) {
        this.prtCustom3 = prtCustom3 == null ? null : prtCustom3.trim();
    }

    public String getPrtCustom4() {
        return prtCustom4;
    }

    public void setPrtCustom4(String prtCustom4) {
        this.prtCustom4 = prtCustom4 == null ? null : prtCustom4.trim();
    }

    public String getPrtCustom5() {
        return prtCustom5;
    }

    public void setPrtCustom5(String prtCustom5) {
        this.prtCustom5 = prtCustom5 == null ? null : prtCustom5.trim();
    }

    public String getPrtCustom6() {
        return prtCustom6;
    }

    public void setPrtCustom6(String prtCustom6) {
        this.prtCustom6 = prtCustom6 == null ? null : prtCustom6.trim();
    }
}