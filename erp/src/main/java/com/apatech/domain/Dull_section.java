package com.apatech.domain;

/**
 * 呆滞区间表
 * @author 刘成
 *
 */
public class Dull_section {
    private String dsId;//区间id（主键 唯一）
    private Integer dsStartday;//起止天数
    private Integer dsEnddate;//截至天数
    private String dsDecoration;//区间说明
    private String dsAuditing;//是否审核
    private String dsYn;//是否删除（0 否 1 是 ，默认0）
    private String dsCustom1;//自定栏1
    private String dsCustom2;//自定栏2
    private String dsCustom3;//自定栏3
    private String dsCustom4;//自定栏4
    private String dsCustom5;//自定栏5
    private String dsCustom6;//自定栏6
    
    
    
    public Dull_section() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Dull_section [dsId=" + dsId + ", dsStartday=" + dsStartday + ", dsEnddate=" + dsEnddate
				+ ", dsDecoration=" + dsDecoration + ", dsAuditing=" + dsAuditing + ", dsYn=" + dsYn + ", dsCustom1="
				+ dsCustom1 + ", dsCustom2=" + dsCustom2 + ", dsCustom3=" + dsCustom3 + ", dsCustom4=" + dsCustom4
				+ ", dsCustom5=" + dsCustom5 + ", dsCustom6=" + dsCustom6 + "]";
	}



	public String getDsId() {
        return dsId;
    }

    public void setDsId(String dsId) {
        this.dsId = dsId == null ? null : dsId.trim();
    }

    public Integer getDsStartday() {
        return dsStartday;
    }

    public void setDsStartday(Integer dsStartday) {
        this.dsStartday = dsStartday;
    }

    public Integer getDsEnddate() {
        return dsEnddate;
    }

    public void setDsEnddate(Integer dsEnddate) {
        this.dsEnddate = dsEnddate;
    }

    public String getDsDecoration() {
        return dsDecoration;
    }

    public void setDsDecoration(String dsDecoration) {
        this.dsDecoration = dsDecoration == null ? null : dsDecoration.trim();
    }

    public String getDsAuditing() {
        return dsAuditing;
    }

    public void setDsAuditing(String dsAuditing) {
        this.dsAuditing = dsAuditing == null ? null : dsAuditing.trim();
    }

    public String getDsYn() {
        return dsYn;
    }

    public void setDsYn(String dsYn) {
        this.dsYn = dsYn == null ? null : dsYn.trim();
    }

    public String getDsCustom1() {
        return dsCustom1;
    }

    public void setDsCustom1(String dsCustom1) {
        this.dsCustom1 = dsCustom1 == null ? null : dsCustom1.trim();
    }

    public String getDsCustom2() {
        return dsCustom2;
    }

    public void setDsCustom2(String dsCustom2) {
        this.dsCustom2 = dsCustom2 == null ? null : dsCustom2.trim();
    }

    public String getDsCustom3() {
        return dsCustom3;
    }

    public void setDsCustom3(String dsCustom3) {
        this.dsCustom3 = dsCustom3 == null ? null : dsCustom3.trim();
    }

    public String getDsCustom4() {
        return dsCustom4;
    }

    public void setDsCustom4(String dsCustom4) {
        this.dsCustom4 = dsCustom4 == null ? null : dsCustom4.trim();
    }

    public String getDsCustom5() {
        return dsCustom5;
    }

    public void setDsCustom5(String dsCustom5) {
        this.dsCustom5 = dsCustom5 == null ? null : dsCustom5.trim();
    }

    public String getDsCustom6() {
        return dsCustom6;
    }

    public void setDsCustom6(String dsCustom6) {
        this.dsCustom6 = dsCustom6 == null ? null : dsCustom6.trim();
    }
}