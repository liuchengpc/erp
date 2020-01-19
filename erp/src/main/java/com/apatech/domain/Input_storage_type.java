package com.apatech.domain;

/**
 * 入库类型表
 * @author 刘成
 *
 */
public class Input_storage_type {
    private String istId;//id（主键 唯一）
    private String istName;//类别名称
    private String istEngname;//英文名称
    private String istRemark;//备注
    private String istAuditing;//是否审核
    private String istYn;//是否删除（0 否 1 是 ，默认0）
    private String istCustom1;//自定栏1
    private String istCustom2;//自定栏2
    private String istCustom3;//自定栏3
    private String istCustom4;//自定栏4
    private String istCustom5;//自定栏5
    private String istCustom6;//自定栏6
    
    
    
    public Input_storage_type() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Input_storage_type [istId=" + istId + ", istName=" + istName + ", istEngname=" + istEngname
				+ ", istRemark=" + istRemark + ", istAuditing=" + istAuditing + ", istYn=" + istYn + ", istCustom1="
				+ istCustom1 + ", istCustom2=" + istCustom2 + ", istCustom3=" + istCustom3 + ", istCustom4="
				+ istCustom4 + ", istCustom5=" + istCustom5 + ", istCustom6=" + istCustom6 + "]";
	}



	public String getIstId() {
        return istId;
    }

    public void setIstId(String istId) {
        this.istId = istId == null ? null : istId.trim();
    }

    public String getIstName() {
        return istName;
    }

    public void setIstName(String istName) {
        this.istName = istName == null ? null : istName.trim();
    }

    public String getIstEngname() {
        return istEngname;
    }

    public void setIstEngname(String istEngname) {
        this.istEngname = istEngname == null ? null : istEngname.trim();
    }

    public String getIstRemark() {
        return istRemark;
    }

    public void setIstRemark(String istRemark) {
        this.istRemark = istRemark == null ? null : istRemark.trim();
    }

    public String getIstAuditing() {
        return istAuditing;
    }

    public void setIstAuditing(String istAuditing) {
        this.istAuditing = istAuditing == null ? null : istAuditing.trim();
    }

    public String getIstYn() {
        return istYn;
    }

    public void setIstYn(String istYn) {
        this.istYn = istYn == null ? null : istYn.trim();
    }

    public String getIstCustom1() {
        return istCustom1;
    }

    public void setIstCustom1(String istCustom1) {
        this.istCustom1 = istCustom1 == null ? null : istCustom1.trim();
    }

    public String getIstCustom2() {
        return istCustom2;
    }

    public void setIstCustom2(String istCustom2) {
        this.istCustom2 = istCustom2 == null ? null : istCustom2.trim();
    }

    public String getIstCustom3() {
        return istCustom3;
    }

    public void setIstCustom3(String istCustom3) {
        this.istCustom3 = istCustom3 == null ? null : istCustom3.trim();
    }

    public String getIstCustom4() {
        return istCustom4;
    }

    public void setIstCustom4(String istCustom4) {
        this.istCustom4 = istCustom4 == null ? null : istCustom4.trim();
    }

    public String getIstCustom5() {
        return istCustom5;
    }

    public void setIstCustom5(String istCustom5) {
        this.istCustom5 = istCustom5 == null ? null : istCustom5.trim();
    }

    public String getIstCustom6() {
        return istCustom6;
    }

    public void setIstCustom6(String istCustom6) {
        this.istCustom6 = istCustom6 == null ? null : istCustom6.trim();
    }
}