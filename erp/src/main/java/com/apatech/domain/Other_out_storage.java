package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 其他出库主表
 * @author 刘成
 *
 */
public class Other_out_storage {
    private String oosId;//id（主键 唯一）
    private Integer istId;//入库类型
    private String warehouseId;//仓库id
    private String oosDocumentationDate;//单据号码
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date oosDocumentationNo;//单据日期
    private String oosCertificateNumber;//凭证编号
    private String oosWarehousingPersonnel;//入库人员
    private String oosBelongsSection;//所属部门
    private String oosForm;//制单人员
    private String oosReviewStaff;//复核人员
    private String oosRemark;//备注
    private String oosAuditing;//是否审核
    private String oosYn;//是否删除（0 否 1 是 ，默认0）
    private String oosCustom1;//自定栏1
    private String oosCustom2;//自定栏2
    private String oosCustom3;//自定栏3
    private String oosCustom4;//自定栏4
    private String oosCustom5;//自定栏5
    private String oosCustom6;//自定栏6
    
    

    public Other_out_storage() {
		super();
	}

	@Override
	public String toString() {
		return "Other_out_storage [oosId=" + oosId + ", istId=" + istId + ", warehouseId=" + warehouseId
				+ ", oosDocumentationDate=" + oosDocumentationDate + ", oosDocumentationNo=" + oosDocumentationNo
				+ ", oosCertificateNumber=" + oosCertificateNumber + ", oosWarehousingPersonnel="
				+ oosWarehousingPersonnel + ", oosBelongsSection=" + oosBelongsSection + ", oosForm=" + oosForm
				+ ", oosReviewStaff=" + oosReviewStaff + ", oosRemark=" + oosRemark + ", oosAuditing=" + oosAuditing
				+ ", oosYn=" + oosYn + ", oosCustom1=" + oosCustom1 + ", oosCustom2=" + oosCustom2 + ", oosCustom3="
				+ oosCustom3 + ", oosCustom4=" + oosCustom4 + ", oosCustom5=" + oosCustom5 + ", oosCustom6="
				+ oosCustom6 + "]";
	}

	public String getOosId() {
        return oosId;
    }

    public void setOosId(String oosId) {
        this.oosId = oosId == null ? null : oosId.trim();
    }

    public Integer getIstId() {
        return istId;
    }

    public void setIstId(Integer istId) {
        this.istId = istId;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getOosDocumentationDate() {
        return oosDocumentationDate;
    }

    public void setOosDocumentationDate(String oosDocumentationDate) {
        this.oosDocumentationDate = oosDocumentationDate == null ? null : oosDocumentationDate.trim();
    }

    public Date getOosDocumentationNo() {
        return oosDocumentationNo;
    }

    public void setOosDocumentationNo(Date oosDocumentationNo) {
        this.oosDocumentationNo = oosDocumentationNo;
    }

    public String getOosCertificateNumber() {
        return oosCertificateNumber;
    }

    public void setOosCertificateNumber(String oosCertificateNumber) {
        this.oosCertificateNumber = oosCertificateNumber == null ? null : oosCertificateNumber.trim();
    }

    public String getOosWarehousingPersonnel() {
        return oosWarehousingPersonnel;
    }

    public void setOosWarehousingPersonnel(String oosWarehousingPersonnel) {
        this.oosWarehousingPersonnel = oosWarehousingPersonnel == null ? null : oosWarehousingPersonnel.trim();
    }

    public String getOosBelongsSection() {
        return oosBelongsSection;
    }

    public void setOosBelongsSection(String oosBelongsSection) {
        this.oosBelongsSection = oosBelongsSection == null ? null : oosBelongsSection.trim();
    }

    public String getOosForm() {
        return oosForm;
    }

    public void setOosForm(String oosForm) {
        this.oosForm = oosForm == null ? null : oosForm.trim();
    }

    public String getOosReviewStaff() {
        return oosReviewStaff;
    }

    public void setOosReviewStaff(String oosReviewStaff) {
        this.oosReviewStaff = oosReviewStaff == null ? null : oosReviewStaff.trim();
    }

    public String getOosRemark() {
        return oosRemark;
    }

    public void setOosRemark(String oosRemark) {
        this.oosRemark = oosRemark == null ? null : oosRemark.trim();
    }

    public String getOosAuditing() {
        return oosAuditing;
    }

    public void setOosAuditing(String oosAuditing) {
        this.oosAuditing = oosAuditing == null ? null : oosAuditing.trim();
    }

    public String getOosYn() {
        return oosYn;
    }

    public void setOosYn(String oosYn) {
        this.oosYn = oosYn == null ? null : oosYn.trim();
    }

    public String getOosCustom1() {
        return oosCustom1;
    }

    public void setOosCustom1(String oosCustom1) {
        this.oosCustom1 = oosCustom1 == null ? null : oosCustom1.trim();
    }

    public String getOosCustom2() {
        return oosCustom2;
    }

    public void setOosCustom2(String oosCustom2) {
        this.oosCustom2 = oosCustom2 == null ? null : oosCustom2.trim();
    }

    public String getOosCustom3() {
        return oosCustom3;
    }

    public void setOosCustom3(String oosCustom3) {
        this.oosCustom3 = oosCustom3 == null ? null : oosCustom3.trim();
    }

    public String getOosCustom4() {
        return oosCustom4;
    }

    public void setOosCustom4(String oosCustom4) {
        this.oosCustom4 = oosCustom4 == null ? null : oosCustom4.trim();
    }

    public String getOosCustom5() {
        return oosCustom5;
    }

    public void setOosCustom5(String oosCustom5) {
        this.oosCustom5 = oosCustom5 == null ? null : oosCustom5.trim();
    }

    public String getOosCustom6() {
        return oosCustom6;
    }

    public void setOosCustom6(String oosCustom6) {
        this.oosCustom6 = oosCustom6 == null ? null : oosCustom6.trim();
    }
}