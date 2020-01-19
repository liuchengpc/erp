package com.apatech.domain;

/**
 * 采购折让分摊结果表
 * @author 刘成
 *
 */
public class Assessment_procurement_fruit {
    private String apfId;//id（主键 唯一）
    private String apId;//采购分摊单号(assessment_procurement外键)
    private String psId;//采购入库单号(assessment_procurement外键)
    private String apfMatterId;//物料编号
    private String apfMatterName;//物料名称
    private String apfSpecifications;//规格型号
    private String apfCompanyName;//采购金额
    private Integer apfAmount;//数量
    private Float apfMoney;//单位名称
    private Float apfWeight;//重量
    private Float apfVolumeWood;//材积
    private Float apfContribution;//分摊金额
    private String prtAudition;//是否审核
    private String prtYn;//是否删除（0 否 1 是 ，默认0）
    private String prtCustom1;//自定栏1
    private String prtCustom2;//自定栏2
    private String prtCustom3;//自定栏3
    private String prtCustom4;//自定栏4
    private String prtCustom5;//自定栏5
    private String prtCustom6;//自定栏6
    
    
    

    public Assessment_procurement_fruit() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Assessment_procurement_fruit [apfId=" + apfId + ", apId=" + apId + ", psId=" + psId + ", apfMatterId="
				+ apfMatterId + ", apfMatterName=" + apfMatterName + ", apfSpecifications=" + apfSpecifications
				+ ", apfCompanyName=" + apfCompanyName + ", apfAmount=" + apfAmount + ", apfMoney=" + apfMoney
				+ ", apfWeight=" + apfWeight + ", apfVolumeWood=" + apfVolumeWood + ", apfContribution="
				+ apfContribution + ", prtAudition=" + prtAudition + ", prtYn=" + prtYn + ", prtCustom1=" + prtCustom1
				+ ", prtCustom2=" + prtCustom2 + ", prtCustom3=" + prtCustom3 + ", prtCustom4=" + prtCustom4
				+ ", prtCustom5=" + prtCustom5 + ", prtCustom6=" + prtCustom6 + "]";
	}



	public String getApfId() {
        return apfId;
    }

    public void setApfId(String apfId) {
        this.apfId = apfId == null ? null : apfId.trim();
    }

    public String getApId() {
        return apId;
    }

    public void setApId(String apId) {
        this.apId = apId == null ? null : apId.trim();
    }

    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId == null ? null : psId.trim();
    }

    public String getApfMatterId() {
        return apfMatterId;
    }

    public void setApfMatterId(String apfMatterId) {
        this.apfMatterId = apfMatterId == null ? null : apfMatterId.trim();
    }

    public String getApfMatterName() {
        return apfMatterName;
    }

    public void setApfMatterName(String apfMatterName) {
        this.apfMatterName = apfMatterName == null ? null : apfMatterName.trim();
    }

    public String getApfSpecifications() {
        return apfSpecifications;
    }

    public void setApfSpecifications(String apfSpecifications) {
        this.apfSpecifications = apfSpecifications == null ? null : apfSpecifications.trim();
    }

    public String getApfCompanyName() {
        return apfCompanyName;
    }

    public void setApfCompanyName(String apfCompanyName) {
        this.apfCompanyName = apfCompanyName == null ? null : apfCompanyName.trim();
    }

    public Integer getApfAmount() {
        return apfAmount;
    }

    public void setApfAmount(Integer apfAmount) {
        this.apfAmount = apfAmount;
    }

    public Float getApfMoney() {
        return apfMoney;
    }

    public void setApfMoney(Float apfMoney) {
        this.apfMoney = apfMoney;
    }

    public Float getApfWeight() {
        return apfWeight;
    }

    public void setApfWeight(Float apfWeight) {
        this.apfWeight = apfWeight;
    }

    public Float getApfVolumeWood() {
        return apfVolumeWood;
    }

    public void setApfVolumeWood(Float apfVolumeWood) {
        this.apfVolumeWood = apfVolumeWood;
    }

    public Float getApfContribution() {
        return apfContribution;
    }

    public void setApfContribution(Float apfContribution) {
        this.apfContribution = apfContribution;
    }

    public String getPrtAudition() {
        return prtAudition;
    }

    public void setPrtAudition(String prtAudition) {
        this.prtAudition = prtAudition == null ? null : prtAudition.trim();
    }

    public String getPrtYn() {
        return prtYn;
    }

    public void setPrtYn(String prtYn) {
        this.prtYn = prtYn == null ? null : prtYn.trim();
    }

    public String getPrtCustom1() {
        return prtCustom1;
    }

    public void setPrtCustom1(String prtCustom1) {
        this.prtCustom1 = prtCustom1 == null ? null : prtCustom1.trim();
    }

    public String getPrtCustom2() {
        return prtCustom2;
    }

    public void setPrtCustom2(String prtCustom2) {
        this.prtCustom2 = prtCustom2 == null ? null : prtCustom2.trim();
    }

    public String getPrtCustom3() {
        return prtCustom3;
    }

    public void setPrtCustom3(String prtCustom3) {
        this.prtCustom3 = prtCustom3 == null ? null : prtCustom3.trim();
    }

    public String getPrtCustom4() {
        return prtCustom4;
    }

    public void setPrtCustom4(String prtCustom4) {
        this.prtCustom4 = prtCustom4 == null ? null : prtCustom4.trim();
    }

    public String getPrtCustom5() {
        return prtCustom5;
    }

    public void setPrtCustom5(String prtCustom5) {
        this.prtCustom5 = prtCustom5 == null ? null : prtCustom5.trim();
    }

    public String getPrtCustom6() {
        return prtCustom6;
    }

    public void setPrtCustom6(String prtCustom6) {
        this.prtCustom6 = prtCustom6 == null ? null : prtCustom6.trim();
    }
}