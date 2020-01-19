package com.apatech.domain;

/**
 * 调价表
 * @author 刘成
 *
 */
public class Adjust_price {
    private String apId;//调价id（主键 唯一）
    private String apDateid;//单据编号
    private String materialid;//物料id
    private String updowmid;//增减值科目id（关联updownprogram增减值科目表）
    private Float apPrice;//调价金额
    private String apDecoration;//备注
    private String apDoworkman;//制表人
    private String apRecheckman;//复核人
    private String apAuditing;//是否审核
    private String apYn;//是否删除（0 否 1 是 ，默认0）
    private String apCustom1;//自定栏1
    private String apCustom2;//自定栏2
    private String apCustom3;//自定栏3
    private String apCustom4;//自定栏4
    private String apCustom5;//自定栏5
    private String apCustom6;//自定栏6
    
    
    

    public Adjust_price() {
		super();
	}

    
	@Override
	public String toString() {
		return "Adjust_price [apId=" + apId + ", apDateid=" + apDateid + ", materialid=" + materialid + ", updowmid="
				+ updowmid + ", apPrice=" + apPrice + ", apDecoration=" + apDecoration + ", apDoworkman=" + apDoworkman
				+ ", apRecheckman=" + apRecheckman + ", apAuditing=" + apAuditing + ", apYn=" + apYn + ", apCustom1="
				+ apCustom1 + ", apCustom2=" + apCustom2 + ", apCustom3=" + apCustom3 + ", apCustom4=" + apCustom4
				+ ", apCustom5=" + apCustom5 + ", apCustom6=" + apCustom6 + "]";
	}


	public String getApId() {
        return apId;
    }

    public void setApId(String apId) {
        this.apId = apId == null ? null : apId.trim();
    }

    public String getApDateid() {
        return apDateid;
    }

    public void setApDateid(String apDateid) {
        this.apDateid = apDateid == null ? null : apDateid.trim();
    }

    public String getMaterialid() {
        return materialid;
    }

    public void setMaterialid(String materialid) {
        this.materialid = materialid == null ? null : materialid.trim();
    }

    public String getUpdowmid() {
        return updowmid;
    }

    public void setUpdowmid(String updowmid) {
        this.updowmid = updowmid == null ? null : updowmid.trim();
    }

    public Float getApPrice() {
        return apPrice;
    }

    public void setApPrice(Float apPrice) {
        this.apPrice = apPrice;
    }

    public String getApDecoration() {
        return apDecoration;
    }

    public void setApDecoration(String apDecoration) {
        this.apDecoration = apDecoration == null ? null : apDecoration.trim();
    }

    public String getApDoworkman() {
        return apDoworkman;
    }

    public void setApDoworkman(String apDoworkman) {
        this.apDoworkman = apDoworkman == null ? null : apDoworkman.trim();
    }

    public String getApRecheckman() {
        return apRecheckman;
    }

    public void setApRecheckman(String apRecheckman) {
        this.apRecheckman = apRecheckman == null ? null : apRecheckman.trim();
    }

    public String getApAuditing() {
        return apAuditing;
    }

    public void setApAuditing(String apAuditing) {
        this.apAuditing = apAuditing == null ? null : apAuditing.trim();
    }

    public String getApYn() {
        return apYn;
    }

    public void setApYn(String apYn) {
        this.apYn = apYn == null ? null : apYn.trim();
    }

    public String getApCustom1() {
        return apCustom1;
    }

    public void setApCustom1(String apCustom1) {
        this.apCustom1 = apCustom1 == null ? null : apCustom1.trim();
    }

    public String getApCustom2() {
        return apCustom2;
    }

    public void setApCustom2(String apCustom2) {
        this.apCustom2 = apCustom2 == null ? null : apCustom2.trim();
    }

    public String getApCustom3() {
        return apCustom3;
    }

    public void setApCustom3(String apCustom3) {
        this.apCustom3 = apCustom3 == null ? null : apCustom3.trim();
    }

    public String getApCustom4() {
        return apCustom4;
    }

    public void setApCustom4(String apCustom4) {
        this.apCustom4 = apCustom4 == null ? null : apCustom4.trim();
    }

    public String getApCustom5() {
        return apCustom5;
    }

    public void setApCustom5(String apCustom5) {
        this.apCustom5 = apCustom5 == null ? null : apCustom5.trim();
    }

    public String getApCustom6() {
        return apCustom6;
    }

    public void setApCustom6(String apCustom6) {
        this.apCustom6 = apCustom6 == null ? null : apCustom6.trim();
    }
}