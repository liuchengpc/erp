package com.apatech.domain;

public class Adjust_detail {
    private Integer addeId;

    private String dMatterid;

    private Float dAdjustprice;

    private String dDecoration;

    private String dApid;

    private String addeCustom1;

    private String addeCustom2;

    private String addeCustom3;

    private String addeCustom4;

    private String addeCustom5;

    private String addeCustom6;
    
    
    

    @Override
	public String toString() {
		return "Adjust_detail [addeId=" + addeId + ", dMatterid=" + dMatterid + ", dAdjustprice=" + dAdjustprice
				+ ", dDecoration=" + dDecoration + ", dApid=" + dApid + ", addeCustom1=" + addeCustom1
				+ ", addeCustom2=" + addeCustom2 + ", addeCustom3=" + addeCustom3 + ", addeCustom4=" + addeCustom4
				+ ", addeCustom5=" + addeCustom5 + ", addeCustom6=" + addeCustom6 + "]";
	}
    
    

	public Adjust_detail() {
		super();
	}



	public Integer getAddeId() {
        return addeId;
    }

    public void setAddeId(Integer addeId) {
        this.addeId = addeId;
    }

    public String getdMatterid() {
        return dMatterid;
    }

    public void setdMatterid(String dMatterid) {
        this.dMatterid = dMatterid == null ? null : dMatterid.trim();
    }

    public Float getdAdjustprice() {
        return dAdjustprice;
    }

    public void setdAdjustprice(Float dAdjustprice) {
        this.dAdjustprice = dAdjustprice;
    }

    public String getdDecoration() {
        return dDecoration;
    }

    public void setdDecoration(String dDecoration) {
        this.dDecoration = dDecoration == null ? null : dDecoration.trim();
    }

    public String getdApid() {
        return dApid;
    }

    public void setdApid(String dApid) {
        this.dApid = dApid == null ? null : dApid.trim();
    }

    public String getAddeCustom1() {
        return addeCustom1;
    }

    public void setAddeCustom1(String addeCustom1) {
        this.addeCustom1 = addeCustom1 == null ? null : addeCustom1.trim();
    }

    public String getAddeCustom2() {
        return addeCustom2;
    }

    public void setAddeCustom2(String addeCustom2) {
        this.addeCustom2 = addeCustom2 == null ? null : addeCustom2.trim();
    }

    public String getAddeCustom3() {
        return addeCustom3;
    }

    public void setAddeCustom3(String addeCustom3) {
        this.addeCustom3 = addeCustom3 == null ? null : addeCustom3.trim();
    }

    public String getAddeCustom4() {
        return addeCustom4;
    }

    public void setAddeCustom4(String addeCustom4) {
        this.addeCustom4 = addeCustom4 == null ? null : addeCustom4.trim();
    }

    public String getAddeCustom5() {
        return addeCustom5;
    }

    public void setAddeCustom5(String addeCustom5) {
        this.addeCustom5 = addeCustom5 == null ? null : addeCustom5.trim();
    }

    public String getAddeCustom6() {
        return addeCustom6;
    }

    public void setAddeCustom6(String addeCustom6) {
        this.addeCustom6 = addeCustom6 == null ? null : addeCustom6.trim();
    }
}