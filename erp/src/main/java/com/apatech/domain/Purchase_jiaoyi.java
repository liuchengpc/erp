package com.apatech.domain;

import java.util.Date;

public class Purchase_jiaoyi {
    private Integer jyId;//供应商账款明细表主键ID，自增,快照用
    private Date jyData;//单据日期
    private String jySupplierName;//供应商简称
    private Date jyNumber;//单据号码
    private String jyType;//单别
    private Float jyPriabill;//预付款金额，默认0
    private Float jyPriabillBb;//预付款本币金额，默认0
    private Float jyPayables;//应付款金额，默认0
    private Float jyPayablesBb;//应付款本币金额，默认0
    private String jyAuditing;//是否审核
    private String jyYn;//是否删除（0 否 1 是 ，默认0）
    private String jyCustom1;//创建时间
    private String jyCustom2;//自定栏二
    private String jyCustom3;//自定栏三
    private String jyCustom4;//自定栏四
    private String jyCustom5;//自定栏五
    private String jyCustom6;//自定栏六
    private String jyCustom7;//自定栏七
    private String jyCustom8;//自定栏八
    private String jyCustom9;//自定栏九
    private String jyCustom10;//自定栏十

    public Integer getJyId() {
        return jyId;
    }

    public void setJyId(Integer jyId) {
        this.jyId = jyId;
    }

    public Date getJyData() {
        return jyData;
    }

    public void setJyData(Date jyData) {
        this.jyData = jyData;
    }

    public String getJySupplierName() {
        return jySupplierName;
    }

    public void setJySupplierName(String jySupplierName) {
        this.jySupplierName = jySupplierName == null ? null : jySupplierName.trim();
    }

    public Date getJyNumber() {
        return jyNumber;
    }

    public void setJyNumber(Date jyNumber) {
        this.jyNumber = jyNumber;
    }

    public String getJyType() {
        return jyType;
    }

    public void setJyType(String jyType) {
        this.jyType = jyType == null ? null : jyType.trim();
    }

    public Float getJyPriabill() {
        return jyPriabill;
    }

    public void setJyPriabill(Float jyPriabill) {
        this.jyPriabill = jyPriabill;
    }

    public Float getJyPriabillBb() {
        return jyPriabillBb;
    }

    public void setJyPriabillBb(Float jyPriabillBb) {
        this.jyPriabillBb = jyPriabillBb;
    }

    public Float getJyPayables() {
        return jyPayables;
    }

    public void setJyPayables(Float jyPayables) {
        this.jyPayables = jyPayables;
    }

    public Float getJyPayablesBb() {
        return jyPayablesBb;
    }

    public void setJyPayablesBb(Float jyPayablesBb) {
        this.jyPayablesBb = jyPayablesBb;
    }

    public String getJyAuditing() {
        return jyAuditing;
    }

    public void setJyAuditing(String jyAuditing) {
        this.jyAuditing = jyAuditing == null ? null : jyAuditing.trim();
    }

    public String getJyYn() {
        return jyYn;
    }

    public void setJyYn(String jyYn) {
        this.jyYn = jyYn == null ? null : jyYn.trim();
    }

    public String getJyCustom1() {
        return jyCustom1;
    }

    public void setJyCustom1(String jyCustom1) {
        this.jyCustom1 = jyCustom1 == null ? null : jyCustom1.trim();
    }

    public String getJyCustom2() {
        return jyCustom2;
    }

    public void setJyCustom2(String jyCustom2) {
        this.jyCustom2 = jyCustom2 == null ? null : jyCustom2.trim();
    }

    public String getJyCustom3() {
        return jyCustom3;
    }

    public void setJyCustom3(String jyCustom3) {
        this.jyCustom3 = jyCustom3 == null ? null : jyCustom3.trim();
    }

    public String getJyCustom4() {
        return jyCustom4;
    }

    public void setJyCustom4(String jyCustom4) {
        this.jyCustom4 = jyCustom4 == null ? null : jyCustom4.trim();
    }

    public String getJyCustom5() {
        return jyCustom5;
    }

    public void setJyCustom5(String jyCustom5) {
        this.jyCustom5 = jyCustom5 == null ? null : jyCustom5.trim();
    }

    public String getJyCustom6() {
        return jyCustom6;
    }

    public void setJyCustom6(String jyCustom6) {
        this.jyCustom6 = jyCustom6 == null ? null : jyCustom6.trim();
    }

    public String getJyCustom7() {
        return jyCustom7;
    }

    public void setJyCustom7(String jyCustom7) {
        this.jyCustom7 = jyCustom7 == null ? null : jyCustom7.trim();
    }

    public String getJyCustom8() {
        return jyCustom8;
    }

    public void setJyCustom8(String jyCustom8) {
        this.jyCustom8 = jyCustom8 == null ? null : jyCustom8.trim();
    }

    public String getJyCustom9() {
        return jyCustom9;
    }

    public void setJyCustom9(String jyCustom9) {
        this.jyCustom9 = jyCustom9 == null ? null : jyCustom9.trim();
    }

    public String getJyCustom10() {
        return jyCustom10;
    }

    public void setJyCustom10(String jyCustom10) {
        this.jyCustom10 = jyCustom10 == null ? null : jyCustom10.trim();
    }
}