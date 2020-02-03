package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 采购请购主表
 * @author 刘成
 *
 */
public class Purchase_requisition {
    private String prId;//id（主键 唯一）
    private String prtId;//采购请购类型id
    private String prSingleStatus;//单况(0未结案 1已结案 2无效 )
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date prDocumentDate;//单据日期
    private String prDocumentNumber;//单据号码
    private String prBuyer;//采购人员
    private String prBelongsSection;//所属部门
    private String prExecutor;//制单人员
    private String prCheckagainStaff;//复核人员
    private Integer prSumnum;//总数量
    private Integer prNopurchaseNum;//未采购量
    private String prHeaderProvision;//表头条文
    private String prEndClause;//表尾条文
    private String prRemark;//备注
    private String prAudition;//是否审核
    private String prYn;//是否删除（0 否 1 是 ，默认0）
    private String prCustom1;//自定义1
    private String prCustom2;//自定义2
    private String prCustom3;//自定义3
    private String prCustom4;//自定义4
    private String prCustom5;//自定义5
    private String prCustom6;//自定义6
    
    
    

    public Purchase_requisition() {
		super();
	}

	@Override
	public String toString() {
		return "Purchase_requisition [prId=" + prId + ", prtId=" + prtId + ", prSingleStatus=" + prSingleStatus
				+ ", prDocumentDate=" + prDocumentDate + ", prDocumentNumber=" + prDocumentNumber + ", prBuyer="
				+ prBuyer + ", prBelongsSection=" + prBelongsSection + ", prExecutor=" + prExecutor
				+ ", prCheckagainStaff=" + prCheckagainStaff + ", prSumnum=" + prSumnum + ", prNopurchaseNum="
				+ prNopurchaseNum + ", prHeaderProvision=" + prHeaderProvision + ", prEndClause=" + prEndClause
				+ ", prRemark=" + prRemark + ", prAudition=" + prAudition + ", prYn=" + prYn + ", prCustom1="
				+ prCustom1 + ", prCustom2=" + prCustom2 + ", prCustom3=" + prCustom3 + ", prCustom4=" + prCustom4
				+ ", prCustom5=" + prCustom5 + ", prCustom6=" + prCustom6 + "]";
	}

	public String getPrId() {
        return prId;
    }

    public void setPrId(String prId) {
        this.prId = prId == null ? null : prId.trim();
    }

    public String getPrtId() {
        return prtId;
    }

    public void setPrtId(String prtId) {
        this.prtId = prtId == null ? null : prtId.trim();
    }

    public String getPrSingleStatus() {
        return prSingleStatus;
    }

    public void setPrSingleStatus(String prSingleStatus) {
        this.prSingleStatus = prSingleStatus == null ? null : prSingleStatus.trim();
    }

    public Date getPrDocumentDate() {
        return prDocumentDate;
    }

    public void setPrDocumentDate(Date prDocumentDate) {
        this.prDocumentDate = prDocumentDate;
    }

    public String getPrDocumentNumber() {
        return prDocumentNumber;
    }

    public void setPrDocumentNumber(String prDocumentNumber) {
        this.prDocumentNumber = prDocumentNumber == null ? null : prDocumentNumber.trim();
    }

    public String getPrBuyer() {
        return prBuyer;
    }

    public void setPrBuyer(String prBuyer) {
        this.prBuyer = prBuyer == null ? null : prBuyer.trim();
    }

    public String getPrBelongsSection() {
        return prBelongsSection;
    }

    public void setPrBelongsSection(String prBelongsSection) {
        this.prBelongsSection = prBelongsSection == null ? null : prBelongsSection.trim();
    }

    public String getPrExecutor() {
        return prExecutor;
    }

    public void setPrExecutor(String prExecutor) {
        this.prExecutor = prExecutor == null ? null : prExecutor.trim();
    }

    public String getPrCheckagainStaff() {
        return prCheckagainStaff;
    }

    public void setPrCheckagainStaff(String prCheckagainStaff) {
        this.prCheckagainStaff = prCheckagainStaff == null ? null : prCheckagainStaff.trim();
    }

    public Integer getPrSumnum() {
        return prSumnum;
    }

    public void setPrSumnum(Integer prSumnum) {
        this.prSumnum = prSumnum;
    }

    public Integer getPrNopurchaseNum() {
        return prNopurchaseNum;
    }

    public void setPrNopurchaseNum(Integer prNopurchaseNum) {
        this.prNopurchaseNum = prNopurchaseNum;
    }

    public String getPrHeaderProvision() {
        return prHeaderProvision;
    }

    public void setPrHeaderProvision(String prHeaderProvision) {
        this.prHeaderProvision = prHeaderProvision == null ? null : prHeaderProvision.trim();
    }

    public String getPrEndClause() {
        return prEndClause;
    }

    public void setPrEndClause(String prEndClause) {
        this.prEndClause = prEndClause == null ? null : prEndClause.trim();
    }

    public String getPrRemark() {
        return prRemark;
    }

    public void setPrRemark(String prRemark) {
        this.prRemark = prRemark == null ? null : prRemark.trim();
    }

    public String getPrAudition() {
        return prAudition;
    }

    public void setPrAudition(String prAudition) {
        this.prAudition = prAudition == null ? null : prAudition.trim();
    }

    public String getPrYn() {
        return prYn;
    }

    public void setPrYn(String prYn) {
        this.prYn = prYn == null ? null : prYn.trim();
    }

    public String getPrCustom1() {
        return prCustom1;
    }

    public void setPrCustom1(String prCustom1) {
        this.prCustom1 = prCustom1 == null ? null : prCustom1.trim();
    }

    public String getPrCustom2() {
        return prCustom2;
    }

    public void setPrCustom2(String prCustom2) {
        this.prCustom2 = prCustom2 == null ? null : prCustom2.trim();
    }

    public String getPrCustom3() {
        return prCustom3;
    }

    public void setPrCustom3(String prCustom3) {
        this.prCustom3 = prCustom3 == null ? null : prCustom3.trim();
    }

    public String getPrCustom4() {
        return prCustom4;
    }

    public void setPrCustom4(String prCustom4) {
        this.prCustom4 = prCustom4 == null ? null : prCustom4.trim();
    }

    public String getPrCustom5() {
        return prCustom5;
    }

    public void setPrCustom5(String prCustom5) {
        this.prCustom5 = prCustom5 == null ? null : prCustom5.trim();
    }

    public String getPrCustom6() {
        return prCustom6;
    }

    public void setPrCustom6(String prCustom6) {
        this.prCustom6 = prCustom6 == null ? null : prCustom6.trim();
    }
}