package com.apatech.domain;

/**
 * 预付款单明细表
 * @author 刘成
 *
 */
public class Priadetails {
    private String priadetailsId;//预付款单明细表id, 主键 行号
    private String priabillId;//预付款单主表id,外键
    private Float priabillPrice;//预付金额
    private String priabillType;//来源单别
    private String priabillNumber;//来源单号
    private String priabillRemarks;//摘要
    private String priabillAuditing;//是否审核
    private String priabillYn;//是否删除（0 否 1 是 ,默认 0）
    private String priabillCustom1;//自定义1
    private String priabillCustom2;//自定义2
    private String priabillCustom3;//自定义3
    private String priabillCustom4;//自定义4 
    private String priabillCustom5;//自定义5	--原预付明细单据(主体)
    private String priabillCustom6;//自定义6
    private String priabillCustom7;//自定义7	--应付款主表ID
    private String priabillCustom8;//自定义8	--取用预付金额
    private String priabillCustom9;//自定义9	--预付余额
    private String priabillCustom10;//自定义10 --供应商名称
    
    
    
    

    public Priadetails() {
		super();
	}

	@Override
	public String toString() {
		return "Priadetails [priadetailsId=" + priadetailsId + ", priabillId=" + priabillId + ", priabillPrice="
				+ priabillPrice + ", priabillType=" + priabillType + ", priabillNumber=" + priabillNumber
				+ ", priabillRemarks=" + priabillRemarks + ", priabillAuditing=" + priabillAuditing + ", priabillYn="
				+ priabillYn + ", priabillCustom1=" + priabillCustom1 + ", priabillCustom2=" + priabillCustom2
				+ ", priabillCustom3=" + priabillCustom3 + ", priabillCustom4=" + priabillCustom4 + ", priabillCustom5="
				+ priabillCustom5 + ", priabillCustom6=" + priabillCustom6 + ", priabillCustom7=" + priabillCustom7
				+ ", priabillCustom8=" + priabillCustom8 + ", priabillCustom9=" + priabillCustom9
				+ ", priabillCustom10=" + priabillCustom10 + "]";
	}

	public String getPriadetailsId() {
        return priadetailsId;
    }

    public void setPriadetailsId(String priadetailsId) {
        this.priadetailsId = priadetailsId == null ? null : priadetailsId.trim();
    }

    public String getPriabillId() {
        return priabillId;
    }

    public void setPriabillId(String priabillId) {
        this.priabillId = priabillId == null ? null : priabillId.trim();
    }

    public Float getPriabillPrice() {
        return priabillPrice;
    }

    public void setPriabillPrice(Float priabillPrice) {
        this.priabillPrice = priabillPrice;
    }

    public String getPriabillType() {
        return priabillType;
    }

    public void setPriabillType(String priabillType) {
        this.priabillType = priabillType == null ? null : priabillType.trim();
    }

    public String getPriabillNumber() {
        return priabillNumber;
    }

    public void setPriabillNumber(String priabillNumber) {
        this.priabillNumber = priabillNumber == null ? null : priabillNumber.trim();
    }

    public String getPriabillRemarks() {
        return priabillRemarks;
    }

    public void setPriabillRemarks(String priabillRemarks) {
        this.priabillRemarks = priabillRemarks == null ? null : priabillRemarks.trim();
    }

    public String getPriabillAuditing() {
        return priabillAuditing;
    }

    public void setPriabillAuditing(String priabillAuditing) {
        this.priabillAuditing = priabillAuditing == null ? null : priabillAuditing.trim();
    }

    public String getPriabillYn() {
        return priabillYn;
    }

    public void setPriabillYn(String priabillYn) {
        this.priabillYn = priabillYn == null ? null : priabillYn.trim();
    }

    public String getPriabillCustom1() {
        return priabillCustom1;
    }

    public void setPriabillCustom1(String priabillCustom1) {
        this.priabillCustom1 = priabillCustom1 == null ? null : priabillCustom1.trim();
    }

    public String getPriabillCustom2() {
        return priabillCustom2;
    }

    public void setPriabillCustom2(String priabillCustom2) {
        this.priabillCustom2 = priabillCustom2 == null ? null : priabillCustom2.trim();
    }

    public String getPriabillCustom3() {
        return priabillCustom3;
    }

    public void setPriabillCustom3(String priabillCustom3) {
        this.priabillCustom3 = priabillCustom3 == null ? null : priabillCustom3.trim();
    }

    public String getPriabillCustom4() {
        return priabillCustom4;
    }

    public void setPriabillCustom4(String priabillCustom4) {
        this.priabillCustom4 = priabillCustom4 == null ? null : priabillCustom4.trim();
    }

    public String getPriabillCustom5() {
        return priabillCustom5;
    }

    public void setPriabillCustom5(String priabillCustom5) {
        this.priabillCustom5 = priabillCustom5 == null ? null : priabillCustom5.trim();
    }

    public String getPriabillCustom6() {
        return priabillCustom6;
    }

    public void setPriabillCustom6(String priabillCustom6) {
        this.priabillCustom6 = priabillCustom6 == null ? null : priabillCustom6.trim();
    }

    public String getPriabillCustom7() {
        return priabillCustom7;
    }

    public void setPriabillCustom7(String priabillCustom7) {
        this.priabillCustom7 = priabillCustom7 == null ? null : priabillCustom7.trim();
    }

    public String getPriabillCustom8() {
        return priabillCustom8;
    }

    public void setPriabillCustom8(String priabillCustom8) {
        this.priabillCustom8 = priabillCustom8 == null ? null : priabillCustom8.trim();
    }

    public String getPriabillCustom9() {
        return priabillCustom9;
    }

    public void setPriabillCustom9(String priabillCustom9) {
        this.priabillCustom9 = priabillCustom9 == null ? null : priabillCustom9.trim();
    }

    public String getPriabillCustom10() {
        return priabillCustom10;
    }

    public void setPriabillCustom10(String priabillCustom10) {
        this.priabillCustom10 = priabillCustom10 == null ? null : priabillCustom10.trim();
    }
}