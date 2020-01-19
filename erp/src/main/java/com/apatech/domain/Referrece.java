package com.apatech.domain;

/**
 * 取用预收明细表
 * @author 刘成
 *
 */
public class Referrece {
    private String referreceId;//取用预付明细表id, 主键行号
    private String recedetailId;//预付款单明细表id,外键
    private String receivablesbillId;//预付款单主表id，外键
    private String receivablesbillNumber;//来源单号
    private String receivablesbillType;//来源单别
    private Float receivablesbillAdvance;//预收余额
    private Float receivablesbillQyadvance;//取用预收金额
    private String referreceRemarks;//备注
    private String referreceAuditing;//是否审核
    private String referreceYn;//是否删除（0 否 1 是 ，默认0）
    private String referreceCustom1;//自定义1
    private String referreceCustom2;//自定义2
    private String referreceCustom3;//自定义3
    private String referreceCustom4;//自定义4
    private String referreceCustom5;//自定义5
    private String referreceCustom6;//自定义6
    private String referreceCustom7;//自定义6
    private String referreceCustom8;//自定义7
    private String referreceCustom9;//自定义7
    private String referreceCustom10;//自定义8
    
    

    public Referrece() {
		super();
	}

	@Override
	public String toString() {
		return "Referrece [referreceId=" + referreceId + ", recedetailId=" + recedetailId + ", receivablesbillId="
				+ receivablesbillId + ", receivablesbillNumber=" + receivablesbillNumber + ", receivablesbillType="
				+ receivablesbillType + ", receivablesbillAdvance=" + receivablesbillAdvance
				+ ", receivablesbillQyadvance=" + receivablesbillQyadvance + ", referreceRemarks=" + referreceRemarks
				+ ", referreceAuditing=" + referreceAuditing + ", referreceYn=" + referreceYn + ", referreceCustom1="
				+ referreceCustom1 + ", referreceCustom2=" + referreceCustom2 + ", referreceCustom3=" + referreceCustom3
				+ ", referreceCustom4=" + referreceCustom4 + ", referreceCustom5=" + referreceCustom5
				+ ", referreceCustom6=" + referreceCustom6 + ", referreceCustom7=" + referreceCustom7
				+ ", referreceCustom8=" + referreceCustom8 + ", referreceCustom9=" + referreceCustom9
				+ ", referreceCustom10=" + referreceCustom10 + "]";
	}

	public String getReferreceId() {
        return referreceId;
    }

    public void setReferreceId(String referreceId) {
        this.referreceId = referreceId == null ? null : referreceId.trim();
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

    public String getReceivablesbillNumber() {
        return receivablesbillNumber;
    }

    public void setReceivablesbillNumber(String receivablesbillNumber) {
        this.receivablesbillNumber = receivablesbillNumber == null ? null : receivablesbillNumber.trim();
    }

    public String getReceivablesbillType() {
        return receivablesbillType;
    }

    public void setReceivablesbillType(String receivablesbillType) {
        this.receivablesbillType = receivablesbillType == null ? null : receivablesbillType.trim();
    }

    public Float getReceivablesbillAdvance() {
        return receivablesbillAdvance;
    }

    public void setReceivablesbillAdvance(Float receivablesbillAdvance) {
        this.receivablesbillAdvance = receivablesbillAdvance;
    }

    public Float getReceivablesbillQyadvance() {
        return receivablesbillQyadvance;
    }

    public void setReceivablesbillQyadvance(Float receivablesbillQyadvance) {
        this.receivablesbillQyadvance = receivablesbillQyadvance;
    }

    public String getReferreceRemarks() {
        return referreceRemarks;
    }

    public void setReferreceRemarks(String referreceRemarks) {
        this.referreceRemarks = referreceRemarks == null ? null : referreceRemarks.trim();
    }

    public String getReferreceAuditing() {
        return referreceAuditing;
    }

    public void setReferreceAuditing(String referreceAuditing) {
        this.referreceAuditing = referreceAuditing == null ? null : referreceAuditing.trim();
    }

    public String getReferreceYn() {
        return referreceYn;
    }

    public void setReferreceYn(String referreceYn) {
        this.referreceYn = referreceYn == null ? null : referreceYn.trim();
    }

    public String getReferreceCustom1() {
        return referreceCustom1;
    }

    public void setReferreceCustom1(String referreceCustom1) {
        this.referreceCustom1 = referreceCustom1 == null ? null : referreceCustom1.trim();
    }

    public String getReferreceCustom2() {
        return referreceCustom2;
    }

    public void setReferreceCustom2(String referreceCustom2) {
        this.referreceCustom2 = referreceCustom2 == null ? null : referreceCustom2.trim();
    }

    public String getReferreceCustom3() {
        return referreceCustom3;
    }

    public void setReferreceCustom3(String referreceCustom3) {
        this.referreceCustom3 = referreceCustom3 == null ? null : referreceCustom3.trim();
    }

    public String getReferreceCustom4() {
        return referreceCustom4;
    }

    public void setReferreceCustom4(String referreceCustom4) {
        this.referreceCustom4 = referreceCustom4 == null ? null : referreceCustom4.trim();
    }

    public String getReferreceCustom5() {
        return referreceCustom5;
    }

    public void setReferreceCustom5(String referreceCustom5) {
        this.referreceCustom5 = referreceCustom5 == null ? null : referreceCustom5.trim();
    }

    public String getReferreceCustom6() {
        return referreceCustom6;
    }

    public void setReferreceCustom6(String referreceCustom6) {
        this.referreceCustom6 = referreceCustom6 == null ? null : referreceCustom6.trim();
    }

    public String getReferreceCustom7() {
        return referreceCustom7;
    }

    public void setReferreceCustom7(String referreceCustom7) {
        this.referreceCustom7 = referreceCustom7 == null ? null : referreceCustom7.trim();
    }

    public String getReferreceCustom8() {
        return referreceCustom8;
    }

    public void setReferreceCustom8(String referreceCustom8) {
        this.referreceCustom8 = referreceCustom8 == null ? null : referreceCustom8.trim();
    }

    public String getReferreceCustom9() {
        return referreceCustom9;
    }

    public void setReferreceCustom9(String referreceCustom9) {
        this.referreceCustom9 = referreceCustom9 == null ? null : referreceCustom9.trim();
    }

    public String getReferreceCustom10() {
        return referreceCustom10;
    }

    public void setReferreceCustom10(String referreceCustom10) {
        this.referreceCustom10 = referreceCustom10 == null ? null : referreceCustom10.trim();
    }
}