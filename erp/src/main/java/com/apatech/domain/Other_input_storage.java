package com.apatech.domain;

import java.util.Date;

/**
 * 其他入库主表
 * @author 刘成
 *
 */
public class Other_input_storage {
    private String oisId;//id（主键 唯一）
    private String istId;//入库类型
    private String warehouseId;//仓库id
    private String oisDocumentationDate;//单据日期
    private Date oisDocumentationNo;//单据号码
    private String oisCertificateNumber;//凭证编号
    private String oisWarehousingPersonnel;//入库人员
    private String oisBelongsSection;//所属部门
    private String oisForm;//制单人员
    private String oisReviewStaff;//复核人员
    private String oisRemark;//备注
    private String oisAuditing;//是否审核
    private String oisYn;//是否删除（0 否 1 是 ，默认0）
    private String oisCustom1;//自定栏1
    private String oisCustom2;//自定栏2
    private String oisCustom3;//自定栏3
    private String oisCustom4;//自定栏4
    private String oisCustom5;//自定栏5
    private String oisCustom6;//自定栏6
    
    
    
    public Other_input_storage() {
		super();
	}

	@Override
	public String toString() {
		return "Other_input_storage [oisId=" + oisId + ", istId=" + istId + ", warehouseId=" + warehouseId
				+ ", oisDocumentationDate=" + oisDocumentationDate + ", oisDocumentationNo=" + oisDocumentationNo
				+ ", oisCertificateNumber=" + oisCertificateNumber + ", oisWarehousingPersonnel="
				+ oisWarehousingPersonnel + ", oisBelongsSection=" + oisBelongsSection + ", oisForm=" + oisForm
				+ ", oisReviewStaff=" + oisReviewStaff + ", oisRemark=" + oisRemark + ", oisAuditing=" + oisAuditing
				+ ", oisYn=" + oisYn + ", oisCustom1=" + oisCustom1 + ", oisCustom2=" + oisCustom2 + ", oisCustom3="
				+ oisCustom3 + ", oisCustom4=" + oisCustom4 + ", oisCustom5=" + oisCustom5 + ", oisCustom6="
				+ oisCustom6 + "]";
	}

	public String getOisId() {
        return oisId;
    }

    public void setOisId(String oisId) {
        this.oisId = oisId == null ? null : oisId.trim();
    }

    public String getIstId() {
        return istId;
    }

    public void setIstId(String istId) {
        this.istId = istId == null ? null : istId.trim();
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getOisDocumentationDate() {
        return oisDocumentationDate;
    }

    public void setOisDocumentationDate(String oisDocumentationDate) {
        this.oisDocumentationDate = oisDocumentationDate == null ? null : oisDocumentationDate.trim();
    }

    public Date getOisDocumentationNo() {
        return oisDocumentationNo;
    }

    public void setOisDocumentationNo(Date oisDocumentationNo) {
        this.oisDocumentationNo = oisDocumentationNo;
    }

    public String getOisCertificateNumber() {
        return oisCertificateNumber;
    }

    public void setOisCertificateNumber(String oisCertificateNumber) {
        this.oisCertificateNumber = oisCertificateNumber == null ? null : oisCertificateNumber.trim();
    }

    public String getOisWarehousingPersonnel() {
        return oisWarehousingPersonnel;
    }

    public void setOisWarehousingPersonnel(String oisWarehousingPersonnel) {
        this.oisWarehousingPersonnel = oisWarehousingPersonnel == null ? null : oisWarehousingPersonnel.trim();
    }

    public String getOisBelongsSection() {
        return oisBelongsSection;
    }

    public void setOisBelongsSection(String oisBelongsSection) {
        this.oisBelongsSection = oisBelongsSection == null ? null : oisBelongsSection.trim();
    }

    public String getOisForm() {
        return oisForm;
    }

    public void setOisForm(String oisForm) {
        this.oisForm = oisForm == null ? null : oisForm.trim();
    }

    public String getOisReviewStaff() {
        return oisReviewStaff;
    }

    public void setOisReviewStaff(String oisReviewStaff) {
        this.oisReviewStaff = oisReviewStaff == null ? null : oisReviewStaff.trim();
    }

    public String getOisRemark() {
        return oisRemark;
    }

    public void setOisRemark(String oisRemark) {
        this.oisRemark = oisRemark == null ? null : oisRemark.trim();
    }

    public String getOisAuditing() {
        return oisAuditing;
    }

    public void setOisAuditing(String oisAuditing) {
        this.oisAuditing = oisAuditing == null ? null : oisAuditing.trim();
    }

    public String getOisYn() {
        return oisYn;
    }

    public void setOisYn(String oisYn) {
        this.oisYn = oisYn == null ? null : oisYn.trim();
    }

    public String getOisCustom1() {
        return oisCustom1;
    }

    public void setOisCustom1(String oisCustom1) {
        this.oisCustom1 = oisCustom1 == null ? null : oisCustom1.trim();
    }

    public String getOisCustom2() {
        return oisCustom2;
    }

    public void setOisCustom2(String oisCustom2) {
        this.oisCustom2 = oisCustom2 == null ? null : oisCustom2.trim();
    }

    public String getOisCustom3() {
        return oisCustom3;
    }

    public void setOisCustom3(String oisCustom3) {
        this.oisCustom3 = oisCustom3 == null ? null : oisCustom3.trim();
    }

    public String getOisCustom4() {
        return oisCustom4;
    }

    public void setOisCustom4(String oisCustom4) {
        this.oisCustom4 = oisCustom4 == null ? null : oisCustom4.trim();
    }

    public String getOisCustom5() {
        return oisCustom5;
    }

    public void setOisCustom5(String oisCustom5) {
        this.oisCustom5 = oisCustom5 == null ? null : oisCustom5.trim();
    }

    public String getOisCustom6() {
        return oisCustom6;
    }

    public void setOisCustom6(String oisCustom6) {
        this.oisCustom6 = oisCustom6 == null ? null : oisCustom6.trim();
    }
}