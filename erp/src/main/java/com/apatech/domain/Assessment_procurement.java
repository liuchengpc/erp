package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 采购分摊作业表
 * @author 刘成
 *
 */
public class Assessment_procurement {
    private String apId;//单据号码（主键 唯一）
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date apDateDocument;//单据日期
    private String apMethodAssessment;//分摊方式（0按金额，1按数量，2按材积，3按重量）
    private Float apPrincipalCurrencyAmortized;//待摊金额本位币
    private String apSingleStatus;//凭证编号
    private String apBelongsProject;//所属项目
    private String apExecutor;//制单人员
    private String apCheckagainStaff;//复核人员
    private String apHeaderProvision;//表头条文
    private String apEndClause;//表尾条文
    private String apRemark;//备注
    private String apAudition;//是否审核
    private String apYn;//是否删除（0 否 1 是 ，默认0）
    private String apCustom1;//自定栏1
    private String apCustom2;//自定栏2
    private String apCustom3;//自定栏3
    private String apCustom4;//自定栏4
    private String apCustom5;//自定栏5
    private String apCustom6;//自定栏6
    
    

    public Assessment_procurement() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Assessment_procurement [apId=" + apId + ", apDateDocument=" + apDateDocument + ", apMethodAssessment="
				+ apMethodAssessment + ", apPrincipalCurrencyAmortized=" + apPrincipalCurrencyAmortized
				+ ", apSingleStatus=" + apSingleStatus + ", apBelongsProject=" + apBelongsProject + ", apExecutor="
				+ apExecutor + ", apCheckagainStaff=" + apCheckagainStaff + ", apHeaderProvision=" + apHeaderProvision
				+ ", apEndClause=" + apEndClause + ", apRemark=" + apRemark + ", apAudition=" + apAudition + ", apYn="
				+ apYn + ", apCustom1=" + apCustom1 + ", apCustom2=" + apCustom2 + ", apCustom3=" + apCustom3
				+ ", apCustom4=" + apCustom4 + ", apCustom5=" + apCustom5 + ", apCustom6=" + apCustom6 + "]";
	}



	public String getApId() {
        return apId;
    }

    public void setApId(String apId) {
        this.apId = apId == null ? null : apId.trim();
    }

    public Date getApDateDocument() {
        return apDateDocument;
    }

    public void setApDateDocument(Date apDateDocument) {
        this.apDateDocument = apDateDocument;
    }

    public String getApMethodAssessment() {
        return apMethodAssessment;
    }

    public void setApMethodAssessment(String apMethodAssessment) {
        this.apMethodAssessment = apMethodAssessment == null ? null : apMethodAssessment.trim();
    }

    public Float getApPrincipalCurrencyAmortized() {
        return apPrincipalCurrencyAmortized;
    }

    public void setApPrincipalCurrencyAmortized(Float apPrincipalCurrencyAmortized) {
        this.apPrincipalCurrencyAmortized = apPrincipalCurrencyAmortized;
    }

    public String getApSingleStatus() {
        return apSingleStatus;
    }

    public void setApSingleStatus(String apSingleStatus) {
        this.apSingleStatus = apSingleStatus == null ? null : apSingleStatus.trim();
    }

    public String getApBelongsProject() {
        return apBelongsProject;
    }

    public void setApBelongsProject(String apBelongsProject) {
        this.apBelongsProject = apBelongsProject == null ? null : apBelongsProject.trim();
    }

    public String getApExecutor() {
        return apExecutor;
    }

    public void setApExecutor(String apExecutor) {
        this.apExecutor = apExecutor == null ? null : apExecutor.trim();
    }

    public String getApCheckagainStaff() {
        return apCheckagainStaff;
    }

    public void setApCheckagainStaff(String apCheckagainStaff) {
        this.apCheckagainStaff = apCheckagainStaff == null ? null : apCheckagainStaff.trim();
    }

    public String getApHeaderProvision() {
        return apHeaderProvision;
    }

    public void setApHeaderProvision(String apHeaderProvision) {
        this.apHeaderProvision = apHeaderProvision == null ? null : apHeaderProvision.trim();
    }

    public String getApEndClause() {
        return apEndClause;
    }

    public void setApEndClause(String apEndClause) {
        this.apEndClause = apEndClause == null ? null : apEndClause.trim();
    }

    public String getApRemark() {
        return apRemark;
    }

    public void setApRemark(String apRemark) {
        this.apRemark = apRemark == null ? null : apRemark.trim();
    }

    public String getApAudition() {
        return apAudition;
    }

    public void setApAudition(String apAudition) {
        this.apAudition = apAudition == null ? null : apAudition.trim();
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