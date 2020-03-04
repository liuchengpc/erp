package com.apatech.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 调拨表
 * @author 刘成
 *
 */
public class Requisition {
    private String requisitionId;//id（主键 唯一）
    private String requisitionOutWarehouse;//调出仓库id（仓库表的warehouse_id）
    private String requisitionInputWarehouse;//调入仓库id（仓库表的warehouse_id）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date requisitionDocumentationDate;//单据日期
    private String requisitionDocumentationNo;//单据号码
    private String requisitionForm;//制单人员
    private String isReviewStaff;//复核人员
    private String requisitionRemark;//备注
    private String requisitionAuditing;//是否审核
    private String requisitionYn;//是否删除（0 否 1 是 ，默认0）
    private String requisitionCustom1;//自定义1
    private String requisitionCustom2;//自定义2
    private String requisitionCustom3;//自定义3
    private String requisitionCustom4;//自定义4
    private String requisitionCustom5;//自定义5(占用)
    private String requisitionCustom6;//自定义6(占用)
    
    private List<Requisition_detailed> rd_list;//调拨详表
    private String requisitionOutWarehouseName;//调出仓库的名称（仓库表的warehouse_name）
    private String requisitionInputWarehouseName;//调入仓库的名称（仓库表的warehouse_name）
    

	@Override
	public String toString() {
		return "Requisition [requisitionId=" + requisitionId + ", requisitionOutWarehouse=" + requisitionOutWarehouse
				+ ", requisitionInputWarehouse=" + requisitionInputWarehouse + ", requisitionDocumentationDate="
				+ requisitionDocumentationDate + ", requisitionDocumentationNo=" + requisitionDocumentationNo
				+ ", requisitionForm=" + requisitionForm + ", isReviewStaff=" + isReviewStaff + ", requisitionRemark="
				+ requisitionRemark + ", requisitionAuditing=" + requisitionAuditing + ", requisitionYn="
				+ requisitionYn + ", requisitionCustom1=" + requisitionCustom1 + ", requisitionCustom2="
				+ requisitionCustom2 + ", requisitionCustom3=" + requisitionCustom3 + ", requisitionCustom4="
				+ requisitionCustom4 + ", requisitionCustom5=" + requisitionCustom5 + ", requisitionCustom6="
				+ requisitionCustom6 + ", rd_list=" + rd_list + ", requisitionOutWarehouseName="
				+ requisitionOutWarehouseName + ", requisitionInputWarehouseName=" + requisitionInputWarehouseName
				+ "]";
	}


	public String getRequisitionOutWarehouseName() {
		return requisitionOutWarehouseName;
	}


	public void setRequisitionOutWarehouseName(String requisitionOutWarehouseName) {
		this.requisitionOutWarehouseName = requisitionOutWarehouseName;
	}


	public String getRequisitionInputWarehouseName() {
		return requisitionInputWarehouseName;
	}


	public void setRequisitionInputWarehouseName(String requisitionInputWarehouseName) {
		this.requisitionInputWarehouseName = requisitionInputWarehouseName;
	}


	public List<Requisition_detailed> getRd_list() {
		return rd_list;
	}


	public void setRd_list(List<Requisition_detailed> rd_list) {
		this.rd_list = rd_list;
	}


	public Requisition() {
		super();
	}

	public String getRequisitionId() {
        return requisitionId;
    }

    public void setRequisitionId(String requisitionId) {
        this.requisitionId = requisitionId == null ? null : requisitionId.trim();
    }

    public String getRequisitionOutWarehouse() {
        return requisitionOutWarehouse;
    }

    public void setRequisitionOutWarehouse(String requisitionOutWarehouse) {
        this.requisitionOutWarehouse = requisitionOutWarehouse == null ? null : requisitionOutWarehouse.trim();
    }

    public String getRequisitionInputWarehouse() {
        return requisitionInputWarehouse;
    }

    public void setRequisitionInputWarehouse(String requisitionInputWarehouse) {
        this.requisitionInputWarehouse = requisitionInputWarehouse == null ? null : requisitionInputWarehouse.trim();
    }

   
    public Date getRequisitionDocumentationDate() {
		return requisitionDocumentationDate;
	}

	public void setRequisitionDocumentationDate(Date requisitionDocumentationDate) {
		this.requisitionDocumentationDate = requisitionDocumentationDate;
	}

	public String getRequisitionDocumentationNo() {
		return requisitionDocumentationNo;
	}

	public void setRequisitionDocumentationNo(String requisitionDocumentationNo) {
		this.requisitionDocumentationNo = requisitionDocumentationNo;
	}

	public String getRequisitionForm() {
        return requisitionForm;
    }

    public void setRequisitionForm(String requisitionForm) {
        this.requisitionForm = requisitionForm == null ? null : requisitionForm.trim();
    }

    public String getIsReviewStaff() {
        return isReviewStaff;
    }

    public void setIsReviewStaff(String isReviewStaff) {
        this.isReviewStaff = isReviewStaff == null ? null : isReviewStaff.trim();
    }

    public String getRequisitionRemark() {
        return requisitionRemark;
    }

    public void setRequisitionRemark(String requisitionRemark) {
        this.requisitionRemark = requisitionRemark == null ? null : requisitionRemark.trim();
    }

    public String getRequisitionAuditing() {
        return requisitionAuditing;
    }

    public void setRequisitionAuditing(String requisitionAuditing) {
        this.requisitionAuditing = requisitionAuditing == null ? null : requisitionAuditing.trim();
    }

    public String getRequisitionYn() {
        return requisitionYn;
    }

    public void setRequisitionYn(String requisitionYn) {
        this.requisitionYn = requisitionYn == null ? null : requisitionYn.trim();
    }

    public String getRequisitionCustom1() {
        return requisitionCustom1;
    }

    public void setRequisitionCustom1(String requisitionCustom1) {
        this.requisitionCustom1 = requisitionCustom1 == null ? null : requisitionCustom1.trim();
    }

    public String getRequisitionCustom2() {
        return requisitionCustom2;
    }

    public void setRequisitionCustom2(String requisitionCustom2) {
        this.requisitionCustom2 = requisitionCustom2 == null ? null : requisitionCustom2.trim();
    }

    public String getRequisitionCustom3() {
        return requisitionCustom3;
    }

    public void setRequisitionCustom3(String requisitionCustom3) {
        this.requisitionCustom3 = requisitionCustom3 == null ? null : requisitionCustom3.trim();
    }

    public String getRequisitionCustom4() {
        return requisitionCustom4;
    }

    public void setRequisitionCustom4(String requisitionCustom4) {
        this.requisitionCustom4 = requisitionCustom4 == null ? null : requisitionCustom4.trim();
    }

    public String getRequisitionCustom5() {
        return requisitionCustom5;
    }

    public void setRequisitionCustom5(String requisitionCustom5) {
        this.requisitionCustom5 = requisitionCustom5 == null ? null : requisitionCustom5.trim();
    }

    public String getRequisitionCustom6() {
        return requisitionCustom6;
    }

    public void setRequisitionCustom6(String requisitionCustom6) {
        this.requisitionCustom6 = requisitionCustom6 == null ? null : requisitionCustom6.trim();
    }
}