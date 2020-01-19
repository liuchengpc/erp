package com.apatech.domain;

/**
 * 
 * @author 刘成
 *
 */
public class Invoice_type {
    private String itId;//编号（主键 唯一）
    private String itName;//名称
    private String itEnglishName;//英文名称
    private String itRemark;//备注
    private String itAuditing;//是否审核
    private String itYn;//是否删除（0 否 1 是 ，默认0）
    private String itCustom1;//自定栏1
    private String itCustom2;//自定栏2
    private String itCustom3;//自定栏3
    private String itCustom4;//自定栏4
    private String itCustom5;//自定栏5
    private String itCustom6;//自定栏6
    
    

    public Invoice_type() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Invoice_type [itId=" + itId + ", itName=" + itName + ", itEnglishName=" + itEnglishName + ", itRemark="
				+ itRemark + ", itAuditing=" + itAuditing + ", itYn=" + itYn + ", itCustom1=" + itCustom1
				+ ", itCustom2=" + itCustom2 + ", itCustom3=" + itCustom3 + ", itCustom4=" + itCustom4 + ", itCustom5="
				+ itCustom5 + ", itCustom6=" + itCustom6 + "]";
	}



	public String getItId() {
        return itId;
    }

    public void setItId(String itId) {
        this.itId = itId == null ? null : itId.trim();
    }

    public String getItName() {
        return itName;
    }

    public void setItName(String itName) {
        this.itName = itName == null ? null : itName.trim();
    }

    public String getItEnglishName() {
        return itEnglishName;
    }

    public void setItEnglishName(String itEnglishName) {
        this.itEnglishName = itEnglishName == null ? null : itEnglishName.trim();
    }

    public String getItRemark() {
        return itRemark;
    }

    public void setItRemark(String itRemark) {
        this.itRemark = itRemark == null ? null : itRemark.trim();
    }

    public String getItAuditing() {
        return itAuditing;
    }

    public void setItAuditing(String itAuditing) {
        this.itAuditing = itAuditing == null ? null : itAuditing.trim();
    }

    public String getItYn() {
        return itYn;
    }

    public void setItYn(String itYn) {
        this.itYn = itYn == null ? null : itYn.trim();
    }

    public String getItCustom1() {
        return itCustom1;
    }

    public void setItCustom1(String itCustom1) {
        this.itCustom1 = itCustom1 == null ? null : itCustom1.trim();
    }

    public String getItCustom2() {
        return itCustom2;
    }

    public void setItCustom2(String itCustom2) {
        this.itCustom2 = itCustom2 == null ? null : itCustom2.trim();
    }

    public String getItCustom3() {
        return itCustom3;
    }

    public void setItCustom3(String itCustom3) {
        this.itCustom3 = itCustom3 == null ? null : itCustom3.trim();
    }

    public String getItCustom4() {
        return itCustom4;
    }

    public void setItCustom4(String itCustom4) {
        this.itCustom4 = itCustom4 == null ? null : itCustom4.trim();
    }

    public String getItCustom5() {
        return itCustom5;
    }

    public void setItCustom5(String itCustom5) {
        this.itCustom5 = itCustom5 == null ? null : itCustom5.trim();
    }

    public String getItCustom6() {
        return itCustom6;
    }

    public void setItCustom6(String itCustom6) {
        this.itCustom6 = itCustom6 == null ? null : itCustom6.trim();
    }
}