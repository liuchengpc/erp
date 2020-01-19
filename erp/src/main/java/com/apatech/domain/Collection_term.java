package com.apatech.domain;

/**
 * 收款条件表
 * @author 刘成
 *
 */
public class Collection_term {
    private String coteId;//条件id（主键 唯一）
    private String coteName;//条件名称
    private Integer coteDays;//天数
    private String coteAuditing;//是否审核
    private String coteYn;//是否删除（0 否 1 是 ，默认0）
    private String coteCustom1;//自定栏1
    private String coteCustom2;//自定栏2
    private String coteCustom3;//自定栏3
    private String coteCustom4;//自定栏4
    private String coteCustom5;//自定栏5
    private String coteCustom6;//自定栏6
    
    

    public Collection_term() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Collection_term [coteId=" + coteId + ", coteName=" + coteName + ", coteDays=" + coteDays
				+ ", coteAuditing=" + coteAuditing + ", coteYn=" + coteYn + ", coteCustom1=" + coteCustom1
				+ ", coteCustom2=" + coteCustom2 + ", coteCustom3=" + coteCustom3 + ", coteCustom4=" + coteCustom4
				+ ", coteCustom5=" + coteCustom5 + ", coteCustom6=" + coteCustom6 + "]";
	}



	public String getCoteId() {
        return coteId;
    }

    public void setCoteId(String coteId) {
        this.coteId = coteId == null ? null : coteId.trim();
    }

    public String getCoteName() {
        return coteName;
    }

    public void setCoteName(String coteName) {
        this.coteName = coteName == null ? null : coteName.trim();
    }

    public Integer getCoteDays() {
        return coteDays;
    }

    public void setCoteDays(Integer coteDays) {
        this.coteDays = coteDays;
    }

    public String getCoteAuditing() {
        return coteAuditing;
    }

    public void setCoteAuditing(String coteAuditing) {
        this.coteAuditing = coteAuditing == null ? null : coteAuditing.trim();
    }

    public String getCoteYn() {
        return coteYn;
    }

    public void setCoteYn(String coteYn) {
        this.coteYn = coteYn == null ? null : coteYn.trim();
    }

    public String getCoteCustom1() {
        return coteCustom1;
    }

    public void setCoteCustom1(String coteCustom1) {
        this.coteCustom1 = coteCustom1 == null ? null : coteCustom1.trim();
    }

    public String getCoteCustom2() {
        return coteCustom2;
    }

    public void setCoteCustom2(String coteCustom2) {
        this.coteCustom2 = coteCustom2 == null ? null : coteCustom2.trim();
    }

    public String getCoteCustom3() {
        return coteCustom3;
    }

    public void setCoteCustom3(String coteCustom3) {
        this.coteCustom3 = coteCustom3 == null ? null : coteCustom3.trim();
    }

    public String getCoteCustom4() {
        return coteCustom4;
    }

    public void setCoteCustom4(String coteCustom4) {
        this.coteCustom4 = coteCustom4 == null ? null : coteCustom4.trim();
    }

    public String getCoteCustom5() {
        return coteCustom5;
    }

    public void setCoteCustom5(String coteCustom5) {
        this.coteCustom5 = coteCustom5 == null ? null : coteCustom5.trim();
    }

    public String getCoteCustom6() {
        return coteCustom6;
    }

    public void setCoteCustom6(String coteCustom6) {
        this.coteCustom6 = coteCustom6 == null ? null : coteCustom6.trim();
    }
}