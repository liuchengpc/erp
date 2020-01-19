package com.apatech.domain;

/**
 * 增减值科目表
 * @author 刘成
 *
 */
public class Updown_program {
    private String upId;//科目id（主键 唯一）
    private String upName;//科目名称
    private String upAuditing;//是否审核
    private String upYn;//是否删除（0 否 1 是 ，默认0）
    private String upCustom1;//自定义1
    private String upCustom2;//自定义2
    private String upCustom3;//自定义3
    private String upCustom4;//自定义4
    private String upCustom5;//自定义5
    private String upCustom6;//自定义6
    
    

    public Updown_program() {
		super();
	}

	@Override
	public String toString() {
		return "Updown_program [upId=" + upId + ", upName=" + upName + ", upAuditing=" + upAuditing + ", upYn=" + upYn
				+ ", upCustom1=" + upCustom1 + ", upCustom2=" + upCustom2 + ", upCustom3=" + upCustom3 + ", upCustom4="
				+ upCustom4 + ", upCustom5=" + upCustom5 + ", upCustom6=" + upCustom6 + "]";
	}

	public String getUpId() {
        return upId;
    }

    public void setUpId(String upId) {
        this.upId = upId == null ? null : upId.trim();
    }

    public String getUpName() {
        return upName;
    }

    public void setUpName(String upName) {
        this.upName = upName == null ? null : upName.trim();
    }

    public String getUpAuditing() {
        return upAuditing;
    }

    public void setUpAuditing(String upAuditing) {
        this.upAuditing = upAuditing == null ? null : upAuditing.trim();
    }

    public String getUpYn() {
        return upYn;
    }

    public void setUpYn(String upYn) {
        this.upYn = upYn == null ? null : upYn.trim();
    }

    public String getUpCustom1() {
        return upCustom1;
    }

    public void setUpCustom1(String upCustom1) {
        this.upCustom1 = upCustom1 == null ? null : upCustom1.trim();
    }

    public String getUpCustom2() {
        return upCustom2;
    }

    public void setUpCustom2(String upCustom2) {
        this.upCustom2 = upCustom2 == null ? null : upCustom2.trim();
    }

    public String getUpCustom3() {
        return upCustom3;
    }

    public void setUpCustom3(String upCustom3) {
        this.upCustom3 = upCustom3 == null ? null : upCustom3.trim();
    }

    public String getUpCustom4() {
        return upCustom4;
    }

    public void setUpCustom4(String upCustom4) {
        this.upCustom4 = upCustom4 == null ? null : upCustom4.trim();
    }

    public String getUpCustom5() {
        return upCustom5;
    }

    public void setUpCustom5(String upCustom5) {
        this.upCustom5 = upCustom5 == null ? null : upCustom5.trim();
    }

    public String getUpCustom6() {
        return upCustom6;
    }

    public void setUpCustom6(String upCustom6) {
        this.upCustom6 = upCustom6 == null ? null : upCustom6.trim();
    }
}