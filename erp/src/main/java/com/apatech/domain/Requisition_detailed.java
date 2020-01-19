package com.apatech.domain;

import java.util.Arrays;

/**}
 * 调拨详表
 * @author 刘成
 *
 */
public class Requisition_detailed {
    private String rdId;//id（主键 唯一）
    private String requisitionId;//主表id
    private String matterId;//物料编号
    private String rdEngname;//物料名称
    private String rdRemark;//规格型号
    private String rdPriceIncludeTax;//单位名称
    private Integer rdSingleNum;//数量
    private String rdBatchNumber;//批号
    private String rdRemarks;//分录备注
    private String rdAuditing;//是否审核
    private String rdYn;//是否删除（0 否 1 是 ，默认0）
    private String rdCustom1;//自定义1
    private String rdCustom2;//自定义2
    private String rdCustom3;//自定义3
    private String rdCustom4;//自定义4
    private String rdCustom5;//自定义5
    private byte[] rdCustom6;//自定义6
    
    

    public Requisition_detailed() {
		super();
	}

	@Override
	public String toString() {
		return "Requisition_detailed [rdId=" + rdId + ", requisitionId=" + requisitionId + ", matterId=" + matterId
				+ ", rdEngname=" + rdEngname + ", rdRemark=" + rdRemark + ", rdPriceIncludeTax=" + rdPriceIncludeTax
				+ ", rdSingleNum=" + rdSingleNum + ", rdBatchNumber=" + rdBatchNumber + ", rdRemarks=" + rdRemarks
				+ ", rdAuditing=" + rdAuditing + ", rdYn=" + rdYn + ", rdCustom1=" + rdCustom1 + ", rdCustom2="
				+ rdCustom2 + ", rdCustom3=" + rdCustom3 + ", rdCustom4=" + rdCustom4 + ", rdCustom5=" + rdCustom5
				+ ", rdCustom6=" + Arrays.toString(rdCustom6) + "]";
	}

	public String getRdId() {
        return rdId;
    }

    public void setRdId(String rdId) {
        this.rdId = rdId == null ? null : rdId.trim();
    }

    public String getRequisitionId() {
        return requisitionId;
    }

    public void setRequisitionId(String requisitionId) {
        this.requisitionId = requisitionId == null ? null : requisitionId.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getRdEngname() {
        return rdEngname;
    }

    public void setRdEngname(String rdEngname) {
        this.rdEngname = rdEngname == null ? null : rdEngname.trim();
    }

    public String getRdRemark() {
        return rdRemark;
    }

    public void setRdRemark(String rdRemark) {
        this.rdRemark = rdRemark == null ? null : rdRemark.trim();
    }

    public String getRdPriceIncludeTax() {
        return rdPriceIncludeTax;
    }

    public void setRdPriceIncludeTax(String rdPriceIncludeTax) {
        this.rdPriceIncludeTax = rdPriceIncludeTax == null ? null : rdPriceIncludeTax.trim();
    }

    public Integer getRdSingleNum() {
        return rdSingleNum;
    }

    public void setRdSingleNum(Integer rdSingleNum) {
        this.rdSingleNum = rdSingleNum;
    }

    public String getRdBatchNumber() {
        return rdBatchNumber;
    }

    public void setRdBatchNumber(String rdBatchNumber) {
        this.rdBatchNumber = rdBatchNumber == null ? null : rdBatchNumber.trim();
    }

    public String getRdRemarks() {
        return rdRemarks;
    }

    public void setRdRemarks(String rdRemarks) {
        this.rdRemarks = rdRemarks == null ? null : rdRemarks.trim();
    }

    public String getRdAuditing() {
        return rdAuditing;
    }

    public void setRdAuditing(String rdAuditing) {
        this.rdAuditing = rdAuditing == null ? null : rdAuditing.trim();
    }

    public String getRdYn() {
        return rdYn;
    }

    public void setRdYn(String rdYn) {
        this.rdYn = rdYn == null ? null : rdYn.trim();
    }

    public String getRdCustom1() {
        return rdCustom1;
    }

    public void setRdCustom1(String rdCustom1) {
        this.rdCustom1 = rdCustom1 == null ? null : rdCustom1.trim();
    }

    public String getRdCustom2() {
        return rdCustom2;
    }

    public void setRdCustom2(String rdCustom2) {
        this.rdCustom2 = rdCustom2 == null ? null : rdCustom2.trim();
    }

    public String getRdCustom3() {
        return rdCustom3;
    }

    public void setRdCustom3(String rdCustom3) {
        this.rdCustom3 = rdCustom3 == null ? null : rdCustom3.trim();
    }

    public String getRdCustom4() {
        return rdCustom4;
    }

    public void setRdCustom4(String rdCustom4) {
        this.rdCustom4 = rdCustom4 == null ? null : rdCustom4.trim();
    }

    public String getRdCustom5() {
        return rdCustom5;
    }

    public void setRdCustom5(String rdCustom5) {
        this.rdCustom5 = rdCustom5 == null ? null : rdCustom5.trim();
    }

    public byte[] getRdCustom6() {
        return rdCustom6;
    }

    public void setRdCustom6(byte[] rdCustom6) {
        this.rdCustom6 = rdCustom6;
    }
}