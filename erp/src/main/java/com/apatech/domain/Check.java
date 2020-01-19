package com.apatech.domain;

import java.util.Date;

/**
 * 盘点单主表
 * @author 刘成
 *
 */
public class Check {
    private String checkId;//id（主键 唯一）               
    private String warehouseId;//盘点仓库id
    private String scAppreciationSubjects;//增值科目id
    private String scImpairmentSubjects;//减值科目id
    private String checkDocumentationDate;//单据日期
    private Date checkDocumentationNo;//单据号码
    private String checkBuyer;//盘点人员
    private String checkBelongsSection;//所属部门
    private String checkForm;//制单人员
    private String checkCheckagainStaff;//复核人员
    private String checkRemark;//备注
    private String checkAuditing;//是否审核
    private String checkYn;//是否删除（0 否 1 是 ，默认0）
    private String checkCustom1;//自定栏1
    private String checkCustom2;//自定栏2
    private String checkCustom3;//自定栏3
    private String checkCustom4;//自定栏4
    private String checkCustom5;//自定栏5
    private String checkCustom6;//自定栏6
    
    

    public Check() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Check [checkId=" + checkId + ", warehouseId=" + warehouseId + ", scAppreciationSubjects="
				+ scAppreciationSubjects + ", scImpairmentSubjects=" + scImpairmentSubjects
				+ ", checkDocumentationDate=" + checkDocumentationDate + ", checkDocumentationNo="
				+ checkDocumentationNo + ", checkBuyer=" + checkBuyer + ", checkBelongsSection=" + checkBelongsSection
				+ ", checkForm=" + checkForm + ", checkCheckagainStaff=" + checkCheckagainStaff + ", checkRemark="
				+ checkRemark + ", checkAuditing=" + checkAuditing + ", checkYn=" + checkYn + ", checkCustom1="
				+ checkCustom1 + ", checkCustom2=" + checkCustom2 + ", checkCustom3=" + checkCustom3 + ", checkCustom4="
				+ checkCustom4 + ", checkCustom5=" + checkCustom5 + ", checkCustom6=" + checkCustom6 + "]";
	}



	public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getScAppreciationSubjects() {
        return scAppreciationSubjects;
    }

    public void setScAppreciationSubjects(String scAppreciationSubjects) {
        this.scAppreciationSubjects = scAppreciationSubjects == null ? null : scAppreciationSubjects.trim();
    }

    public String getScImpairmentSubjects() {
        return scImpairmentSubjects;
    }

    public void setScImpairmentSubjects(String scImpairmentSubjects) {
        this.scImpairmentSubjects = scImpairmentSubjects == null ? null : scImpairmentSubjects.trim();
    }

    public String getCheckDocumentationDate() {
        return checkDocumentationDate;
    }

    public void setCheckDocumentationDate(String checkDocumentationDate) {
        this.checkDocumentationDate = checkDocumentationDate == null ? null : checkDocumentationDate.trim();
    }

    public Date getCheckDocumentationNo() {
        return checkDocumentationNo;
    }

    public void setCheckDocumentationNo(Date checkDocumentationNo) {
        this.checkDocumentationNo = checkDocumentationNo;
    }

    public String getCheckBuyer() {
        return checkBuyer;
    }

    public void setCheckBuyer(String checkBuyer) {
        this.checkBuyer = checkBuyer == null ? null : checkBuyer.trim();
    }

    public String getCheckBelongsSection() {
        return checkBelongsSection;
    }

    public void setCheckBelongsSection(String checkBelongsSection) {
        this.checkBelongsSection = checkBelongsSection == null ? null : checkBelongsSection.trim();
    }

    public String getCheckForm() {
        return checkForm;
    }

    public void setCheckForm(String checkForm) {
        this.checkForm = checkForm == null ? null : checkForm.trim();
    }

    public String getCheckCheckagainStaff() {
        return checkCheckagainStaff;
    }

    public void setCheckCheckagainStaff(String checkCheckagainStaff) {
        this.checkCheckagainStaff = checkCheckagainStaff == null ? null : checkCheckagainStaff.trim();
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark == null ? null : checkRemark.trim();
    }

    public String getCheckAuditing() {
        return checkAuditing;
    }

    public void setCheckAuditing(String checkAuditing) {
        this.checkAuditing = checkAuditing == null ? null : checkAuditing.trim();
    }

    public String getCheckYn() {
        return checkYn;
    }

    public void setCheckYn(String checkYn) {
        this.checkYn = checkYn == null ? null : checkYn.trim();
    }

    public String getCheckCustom1() {
        return checkCustom1;
    }

    public void setCheckCustom1(String checkCustom1) {
        this.checkCustom1 = checkCustom1 == null ? null : checkCustom1.trim();
    }

    public String getCheckCustom2() {
        return checkCustom2;
    }

    public void setCheckCustom2(String checkCustom2) {
        this.checkCustom2 = checkCustom2 == null ? null : checkCustom2.trim();
    }

    public String getCheckCustom3() {
        return checkCustom3;
    }

    public void setCheckCustom3(String checkCustom3) {
        this.checkCustom3 = checkCustom3 == null ? null : checkCustom3.trim();
    }

    public String getCheckCustom4() {
        return checkCustom4;
    }

    public void setCheckCustom4(String checkCustom4) {
        this.checkCustom4 = checkCustom4 == null ? null : checkCustom4.trim();
    }

    public String getCheckCustom5() {
        return checkCustom5;
    }

    public void setCheckCustom5(String checkCustom5) {
        this.checkCustom5 = checkCustom5 == null ? null : checkCustom5.trim();
    }

    public String getCheckCustom6() {
        return checkCustom6;
    }

    public void setCheckCustom6(String checkCustom6) {
        this.checkCustom6 = checkCustom6 == null ? null : checkCustom6.trim();
    }
}