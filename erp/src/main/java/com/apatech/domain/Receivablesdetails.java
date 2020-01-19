package com.apatech.domain;

/**
 * 预收款单明细表
 * @author 刘成
 *
 */
public class Receivablesdetails {
    private String recedetailId;//预收款单明细表id, 主键
    private String receivablesbillId;//预收款单主表id,   外键
    private Float recedetailPrice;//预收金额
    private String recedetailType;//来源单别
    private String recedetailNumber;//来源单号
    private String recedetailRemarks;//摘要
    private String recedetailAuditing;//是否审核
    private String recedetailYn;//是否删除（0 否 1 是 ，默认0）
    private String recedetailCustom1;//自定义1
    private String recedetailCustom2;//自定义2
    private String recedetailCustom3;//自定义3
    private String recedetailCustom4;//自定义3
    private String recedetailCustom5;//自定义4
    private String recedetailCustom6;//自定义5
    private String recedetailCustom7;//自定义6
    private String recedetailCustom8;//自定义7
    private String recedetailCustom9;//自定义8
    private String recedetailCustom10;//自定义9
    
    
    

    public Receivablesdetails() {
		super();
	}

	@Override
	public String toString() {
		return "Receivablesdetails [recedetailId=" + recedetailId + ", receivablesbillId=" + receivablesbillId
				+ ", recedetailPrice=" + recedetailPrice + ", recedetailType=" + recedetailType + ", recedetailNumber="
				+ recedetailNumber + ", recedetailRemarks=" + recedetailRemarks + ", recedetailAuditing="
				+ recedetailAuditing + ", recedetailYn=" + recedetailYn + ", recedetailCustom1=" + recedetailCustom1
				+ ", recedetailCustom2=" + recedetailCustom2 + ", recedetailCustom3=" + recedetailCustom3
				+ ", recedetailCustom4=" + recedetailCustom4 + ", recedetailCustom5=" + recedetailCustom5
				+ ", recedetailCustom6=" + recedetailCustom6 + ", recedetailCustom7=" + recedetailCustom7
				+ ", recedetailCustom8=" + recedetailCustom8 + ", recedetailCustom9=" + recedetailCustom9
				+ ", recedetailCustom10=" + recedetailCustom10 + "]";
	}

	public String getRecedetailId() {
        return recedetailId;
    }

    public void setRecedetailId(String recedetailId) {
        this.recedetailId = recedetailId == null ? null : recedetailId.trim();
    }

    public String getReceivablesbillId() {
        return receivablesbillId;
    }

    public void setReceivablesbillId(String receivablesbillId) {
        this.receivablesbillId = receivablesbillId == null ? null : receivablesbillId.trim();
    }

    public Float getRecedetailPrice() {
        return recedetailPrice;
    }

    public void setRecedetailPrice(Float recedetailPrice) {
        this.recedetailPrice = recedetailPrice;
    }

    public String getRecedetailType() {
        return recedetailType;
    }

    public void setRecedetailType(String recedetailType) {
        this.recedetailType = recedetailType == null ? null : recedetailType.trim();
    }

    public String getRecedetailNumber() {
        return recedetailNumber;
    }

    public void setRecedetailNumber(String recedetailNumber) {
        this.recedetailNumber = recedetailNumber == null ? null : recedetailNumber.trim();
    }

    public String getRecedetailRemarks() {
        return recedetailRemarks;
    }

    public void setRecedetailRemarks(String recedetailRemarks) {
        this.recedetailRemarks = recedetailRemarks == null ? null : recedetailRemarks.trim();
    }

    public String getRecedetailAuditing() {
        return recedetailAuditing;
    }

    public void setRecedetailAuditing(String recedetailAuditing) {
        this.recedetailAuditing = recedetailAuditing == null ? null : recedetailAuditing.trim();
    }

    public String getRecedetailYn() {
        return recedetailYn;
    }

    public void setRecedetailYn(String recedetailYn) {
        this.recedetailYn = recedetailYn == null ? null : recedetailYn.trim();
    }

    public String getRecedetailCustom1() {
        return recedetailCustom1;
    }

    public void setRecedetailCustom1(String recedetailCustom1) {
        this.recedetailCustom1 = recedetailCustom1 == null ? null : recedetailCustom1.trim();
    }

    public String getRecedetailCustom2() {
        return recedetailCustom2;
    }

    public void setRecedetailCustom2(String recedetailCustom2) {
        this.recedetailCustom2 = recedetailCustom2 == null ? null : recedetailCustom2.trim();
    }

    public String getRecedetailCustom3() {
        return recedetailCustom3;
    }

    public void setRecedetailCustom3(String recedetailCustom3) {
        this.recedetailCustom3 = recedetailCustom3 == null ? null : recedetailCustom3.trim();
    }

    public String getRecedetailCustom4() {
        return recedetailCustom4;
    }

    public void setRecedetailCustom4(String recedetailCustom4) {
        this.recedetailCustom4 = recedetailCustom4 == null ? null : recedetailCustom4.trim();
    }

    public String getRecedetailCustom5() {
        return recedetailCustom5;
    }

    public void setRecedetailCustom5(String recedetailCustom5) {
        this.recedetailCustom5 = recedetailCustom5 == null ? null : recedetailCustom5.trim();
    }

    public String getRecedetailCustom6() {
        return recedetailCustom6;
    }

    public void setRecedetailCustom6(String recedetailCustom6) {
        this.recedetailCustom6 = recedetailCustom6 == null ? null : recedetailCustom6.trim();
    }

    public String getRecedetailCustom7() {
        return recedetailCustom7;
    }

    public void setRecedetailCustom7(String recedetailCustom7) {
        this.recedetailCustom7 = recedetailCustom7 == null ? null : recedetailCustom7.trim();
    }

    public String getRecedetailCustom8() {
        return recedetailCustom8;
    }

    public void setRecedetailCustom8(String recedetailCustom8) {
        this.recedetailCustom8 = recedetailCustom8 == null ? null : recedetailCustom8.trim();
    }

    public String getRecedetailCustom9() {
        return recedetailCustom9;
    }

    public void setRecedetailCustom9(String recedetailCustom9) {
        this.recedetailCustom9 = recedetailCustom9 == null ? null : recedetailCustom9.trim();
    }

    public String getRecedetailCustom10() {
        return recedetailCustom10;
    }

    public void setRecedetailCustom10(String recedetailCustom10) {
        this.recedetailCustom10 = recedetailCustom10 == null ? null : recedetailCustom10.trim();
    }
}