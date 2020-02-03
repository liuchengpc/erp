package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 人员表
 * @author 刘成
 *
 */
public class Staff {
    private String staffId;//员工编号（主键 唯一）
    private String staffName;//员工名称
    private String staffEnglishName;//英文名称
    private String teamId;//所属部门（部门id）
    private String staffGender;//性别
    private String staffIdnumber;//身份证号
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date staffBirthday;//出生日期
    private Integer staffMaritalstatus;//婚姻状况(0 未婚|1 已婚|2离婚|3 丧偶)
    private Integer staffNativePlace;//血型（0 a型|1 b型|2 ab型|3 o型|5 rh+型|6 rh-型）
    private String staffNativeplace;//籍贯
    private String staffNationality;//国籍
    private String staffNation;//民族
    private String staffChineseposition;//中文职务
    private String staffZipcode;//联系邮编
    private String staffMobilephone;//联系电话
    private String staffPoliticalstatus;//政治面貌
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date staffEntrydate;//入职日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date staffBecomeaRegularworker;//转正日期
    private String staffProbationperiod;//试用期长
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date staffDimissiondate;//离职日期
    private String staffTechnicaltitle;//技术职称
    private String staffEnglishposition;//英文职务
    private String staffAddress;//联系地址
    private String staffPhone;//移动电话
    private String staffHighesteducation;//最高学历
    private String staffDegree;//学位
    private String staffGraduateschool;//毕业学校
    private String staffMajor;//所学专业
    private String staffForeignlanguagelevel;//外语水平
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date staffPhysicalExaminationdate;//体检日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date staffAtmaturitydate;//到期日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date staffEntercountry;//入境日期
    private String staffPassportNumber;//护照号码
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date staffContractstartdate;//合同起始日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date staffContractenddate;//合同终止日期
    private String staffContractduration;//合同期长
    private String staffEmail;//电子邮件
    private String staffCensusregisternumber;//户籍号码
    private String staffCensusregistezipcode;//户籍邮编
    private String staffCensusregisteraddress;//户籍地址
    private String staffHometelephone;//家庭电话
    private String staffHomezipcode;//家庭邮编
    private String staffHomeaddress;//家庭地址
    private String staffNewphone;//现电话
    private String staffNewzipcode;//现邮编
    private String staffNewaddress;//现住址
    private String staffEmergencycontact;//紧急联系人
    private String staffUrgentcontactzipcode;//紧急联系邮编
    private String staffEmergencycontactnumber;//紧急联系电话
    private String staffEmergencycontactaddress;//紧急联系地址
    private String staffRemark;//备注
    private String staffAuditing;//是否审核
    private String staffYn;//是否删除（0 否 1 是 ，默认0）
    private String staffCustom1;//自定义1
    private String staffCustom2;//自定义2
    private String staffCustom3;//自定义3
    private String staffCustom4;//自定义4
    private String staffCustom5;//自定义5
    private String staffCustom6;//自定义6

    
    
    
    public Staff() {
		super();
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffEnglishName=" + staffEnglishName
				+ ", teamId=" + teamId + ", staffGender=" + staffGender + ", staffIdnumber=" + staffIdnumber
				+ ", staffBirthday=" + staffBirthday + ", staffMaritalstatus=" + staffMaritalstatus
				+ ", staffNativePlace=" + staffNativePlace + ", staffNativeplace=" + staffNativeplace
				+ ", staffNationality=" + staffNationality + ", staffNation=" + staffNation + ", staffChineseposition="
				+ staffChineseposition + ", staffZipcode=" + staffZipcode + ", staffMobilephone=" + staffMobilephone
				+ ", staffPoliticalstatus=" + staffPoliticalstatus + ", staffEntrydate=" + staffEntrydate
				+ ", staffBecomeaRegularworker=" + staffBecomeaRegularworker + ", staffProbationperiod="
				+ staffProbationperiod + ", staffDimissiondate=" + staffDimissiondate + ", staffTechnicaltitle="
				+ staffTechnicaltitle + ", staffEnglishposition=" + staffEnglishposition + ", staffAddress="
				+ staffAddress + ", staffPhone=" + staffPhone + ", staffHighesteducation=" + staffHighesteducation
				+ ", staffDegree=" + staffDegree + ", staffGraduateschool=" + staffGraduateschool + ", staffMajor="
				+ staffMajor + ", staffForeignlanguagelevel=" + staffForeignlanguagelevel
				+ ", staffPhysicalExaminationdate=" + staffPhysicalExaminationdate + ", staffAtmaturitydate="
				+ staffAtmaturitydate + ", staffEntercountry=" + staffEntercountry + ", staffPassportNumber="
				+ staffPassportNumber + ", staffContractstartdate=" + staffContractstartdate + ", staffContractenddate="
				+ staffContractenddate + ", staffContractduration=" + staffContractduration + ", staffEmail="
				+ staffEmail + ", staffCensusregisternumber=" + staffCensusregisternumber
				+ ", staffCensusregistezipcode=" + staffCensusregistezipcode + ", staffCensusregisteraddress="
				+ staffCensusregisteraddress + ", staffHometelephone=" + staffHometelephone + ", staffHomezipcode="
				+ staffHomezipcode + ", staffHomeaddress=" + staffHomeaddress + ", staffNewphone=" + staffNewphone
				+ ", staffNewzipcode=" + staffNewzipcode + ", staffNewaddress=" + staffNewaddress
				+ ", staffEmergencycontact=" + staffEmergencycontact + ", staffUrgentcontactzipcode="
				+ staffUrgentcontactzipcode + ", staffEmergencycontactnumber=" + staffEmergencycontactnumber
				+ ", staffEmergencycontactaddress=" + staffEmergencycontactaddress + ", staffRemark=" + staffRemark
				+ ", staffAuditing=" + staffAuditing + ", staffYn=" + staffYn + ", staffCustom1=" + staffCustom1
				+ ", staffCustom2=" + staffCustom2 + ", staffCustom3=" + staffCustom3 + ", staffCustom4=" + staffCustom4
				+ ", staffCustom5=" + staffCustom5 + ", staffCustom6=" + staffCustom6 + "]";
	}

	public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffEnglishName() {
        return staffEnglishName;
    }

    public void setStaffEnglishName(String staffEnglishName) {
        this.staffEnglishName = staffEnglishName == null ? null : staffEnglishName.trim();
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public String getStaffGender() {
        return staffGender;
    }

    public void setStaffGender(String staffGender) {
        this.staffGender = staffGender == null ? null : staffGender.trim();
    }

    public String getStaffIdnumber() {
        return staffIdnumber;
    }

    public void setStaffIdnumber(String staffIdnumber) {
        this.staffIdnumber = staffIdnumber == null ? null : staffIdnumber.trim();
    }

    public Date getStaffBirthday() {
        return staffBirthday;
    }

    public void setStaffBirthday(Date staffBirthday) {
        this.staffBirthday = staffBirthday;
    }

    public Integer getStaffMaritalstatus() {
        return staffMaritalstatus;
    }

    public void setStaffMaritalstatus(Integer staffMaritalstatus) {
        this.staffMaritalstatus = staffMaritalstatus;
    }

    public Integer getStaffNativePlace() {
        return staffNativePlace;
    }

    public void setStaffNativePlace(Integer staffNativePlace) {
        this.staffNativePlace = staffNativePlace;
    }

    public String getStaffNativeplace() {
        return staffNativeplace;
    }

    public void setStaffNativeplace(String staffNativeplace) {
        this.staffNativeplace = staffNativeplace == null ? null : staffNativeplace.trim();
    }

    public String getStaffNationality() {
        return staffNationality;
    }

    public void setStaffNationality(String staffNationality) {
        this.staffNationality = staffNationality == null ? null : staffNationality.trim();
    }

    public String getStaffNation() {
        return staffNation;
    }

    public void setStaffNation(String staffNation) {
        this.staffNation = staffNation == null ? null : staffNation.trim();
    }

    public String getStaffChineseposition() {
        return staffChineseposition;
    }

    public void setStaffChineseposition(String staffChineseposition) {
        this.staffChineseposition = staffChineseposition == null ? null : staffChineseposition.trim();
    }

    public String getStaffZipcode() {
        return staffZipcode;
    }

    public void setStaffZipcode(String staffZipcode) {
        this.staffZipcode = staffZipcode == null ? null : staffZipcode.trim();
    }

    public String getStaffMobilephone() {
        return staffMobilephone;
    }

    public void setStaffMobilephone(String staffMobilephone) {
        this.staffMobilephone = staffMobilephone == null ? null : staffMobilephone.trim();
    }

    public String getStaffPoliticalstatus() {
        return staffPoliticalstatus;
    }

    public void setStaffPoliticalstatus(String staffPoliticalstatus) {
        this.staffPoliticalstatus = staffPoliticalstatus == null ? null : staffPoliticalstatus.trim();
    }

    public Date getStaffEntrydate() {
        return staffEntrydate;
    }

    public void setStaffEntrydate(Date staffEntrydate) {
        this.staffEntrydate = staffEntrydate;
    }

    public Date getStaffBecomeaRegularworker() {
        return staffBecomeaRegularworker;
    }

    public void setStaffBecomeaRegularworker(Date staffBecomeaRegularworker) {
        this.staffBecomeaRegularworker = staffBecomeaRegularworker;
    }

    public String getStaffProbationperiod() {
        return staffProbationperiod;
    }

    public void setStaffProbationperiod(String staffProbationperiod) {
        this.staffProbationperiod = staffProbationperiod == null ? null : staffProbationperiod.trim();
    }

    public Date getStaffDimissiondate() {
        return staffDimissiondate;
    }

    public void setStaffDimissiondate(Date staffDimissiondate) {
        this.staffDimissiondate = staffDimissiondate;
    }

    public String getStaffTechnicaltitle() {
        return staffTechnicaltitle;
    }

    public void setStaffTechnicaltitle(String staffTechnicaltitle) {
        this.staffTechnicaltitle = staffTechnicaltitle == null ? null : staffTechnicaltitle.trim();
    }

    public String getStaffEnglishposition() {
        return staffEnglishposition;
    }

    public void setStaffEnglishposition(String staffEnglishposition) {
        this.staffEnglishposition = staffEnglishposition == null ? null : staffEnglishposition.trim();
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress == null ? null : staffAddress.trim();
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }

    public String getStaffHighesteducation() {
        return staffHighesteducation;
    }

    public void setStaffHighesteducation(String staffHighesteducation) {
        this.staffHighesteducation = staffHighesteducation == null ? null : staffHighesteducation.trim();
    }

    public String getStaffDegree() {
        return staffDegree;
    }

    public void setStaffDegree(String staffDegree) {
        this.staffDegree = staffDegree == null ? null : staffDegree.trim();
    }

    public String getStaffGraduateschool() {
        return staffGraduateschool;
    }

    public void setStaffGraduateschool(String staffGraduateschool) {
        this.staffGraduateschool = staffGraduateschool == null ? null : staffGraduateschool.trim();
    }

    public String getStaffMajor() {
        return staffMajor;
    }

    public void setStaffMajor(String staffMajor) {
        this.staffMajor = staffMajor == null ? null : staffMajor.trim();
    }

    public String getStaffForeignlanguagelevel() {
        return staffForeignlanguagelevel;
    }

    public void setStaffForeignlanguagelevel(String staffForeignlanguagelevel) {
        this.staffForeignlanguagelevel = staffForeignlanguagelevel == null ? null : staffForeignlanguagelevel.trim();
    }

    public Date getStaffPhysicalExaminationdate() {
        return staffPhysicalExaminationdate;
    }

    public void setStaffPhysicalExaminationdate(Date staffPhysicalExaminationdate) {
        this.staffPhysicalExaminationdate = staffPhysicalExaminationdate;
    }

    public Date getStaffAtmaturitydate() {
        return staffAtmaturitydate;
    }

    public void setStaffAtmaturitydate(Date staffAtmaturitydate) {
        this.staffAtmaturitydate = staffAtmaturitydate;
    }

    public Date getStaffEntercountry() {
        return staffEntercountry;
    }

    public void setStaffEntercountry(Date staffEntercountry) {
        this.staffEntercountry = staffEntercountry;
    }

    public String getStaffPassportNumber() {
        return staffPassportNumber;
    }

    public void setStaffPassportNumber(String staffPassportNumber) {
        this.staffPassportNumber = staffPassportNumber == null ? null : staffPassportNumber.trim();
    }

    public Date getStaffContractstartdate() {
        return staffContractstartdate;
    }

    public void setStaffContractstartdate(Date staffContractstartdate) {
        this.staffContractstartdate = staffContractstartdate;
    }

    public Date getStaffContractenddate() {
        return staffContractenddate;
    }

    public void setStaffContractenddate(Date staffContractenddate) {
        this.staffContractenddate = staffContractenddate;
    }

    public String getStaffContractduration() {
        return staffContractduration;
    }

    public void setStaffContractduration(String staffContractduration) {
        this.staffContractduration = staffContractduration == null ? null : staffContractduration.trim();
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail == null ? null : staffEmail.trim();
    }

    public String getStaffCensusregisternumber() {
        return staffCensusregisternumber;
    }

    public void setStaffCensusregisternumber(String staffCensusregisternumber) {
        this.staffCensusregisternumber = staffCensusregisternumber == null ? null : staffCensusregisternumber.trim();
    }

    public String getStaffCensusregistezipcode() {
        return staffCensusregistezipcode;
    }

    public void setStaffCensusregistezipcode(String staffCensusregistezipcode) {
        this.staffCensusregistezipcode = staffCensusregistezipcode == null ? null : staffCensusregistezipcode.trim();
    }

    public String getStaffCensusregisteraddress() {
        return staffCensusregisteraddress;
    }

    public void setStaffCensusregisteraddress(String staffCensusregisteraddress) {
        this.staffCensusregisteraddress = staffCensusregisteraddress == null ? null : staffCensusregisteraddress.trim();
    }

    public String getStaffHometelephone() {
        return staffHometelephone;
    }

    public void setStaffHometelephone(String staffHometelephone) {
        this.staffHometelephone = staffHometelephone == null ? null : staffHometelephone.trim();
    }

    public String getStaffHomezipcode() {
        return staffHomezipcode;
    }

    public void setStaffHomezipcode(String staffHomezipcode) {
        this.staffHomezipcode = staffHomezipcode == null ? null : staffHomezipcode.trim();
    }

    public String getStaffHomeaddress() {
        return staffHomeaddress;
    }

    public void setStaffHomeaddress(String staffHomeaddress) {
        this.staffHomeaddress = staffHomeaddress == null ? null : staffHomeaddress.trim();
    }

    public String getStaffNewphone() {
        return staffNewphone;
    }

    public void setStaffNewphone(String staffNewphone) {
        this.staffNewphone = staffNewphone == null ? null : staffNewphone.trim();
    }

    public String getStaffNewzipcode() {
        return staffNewzipcode;
    }

    public void setStaffNewzipcode(String staffNewzipcode) {
        this.staffNewzipcode = staffNewzipcode == null ? null : staffNewzipcode.trim();
    }

    public String getStaffNewaddress() {
        return staffNewaddress;
    }

    public void setStaffNewaddress(String staffNewaddress) {
        this.staffNewaddress = staffNewaddress == null ? null : staffNewaddress.trim();
    }

    public String getStaffEmergencycontact() {
        return staffEmergencycontact;
    }

    public void setStaffEmergencycontact(String staffEmergencycontact) {
        this.staffEmergencycontact = staffEmergencycontact == null ? null : staffEmergencycontact.trim();
    }

    public String getStaffUrgentcontactzipcode() {
        return staffUrgentcontactzipcode;
    }

    public void setStaffUrgentcontactzipcode(String staffUrgentcontactzipcode) {
        this.staffUrgentcontactzipcode = staffUrgentcontactzipcode == null ? null : staffUrgentcontactzipcode.trim();
    }

    public String getStaffEmergencycontactnumber() {
        return staffEmergencycontactnumber;
    }

    public void setStaffEmergencycontactnumber(String staffEmergencycontactnumber) {
        this.staffEmergencycontactnumber = staffEmergencycontactnumber == null ? null : staffEmergencycontactnumber.trim();
    }

    public String getStaffEmergencycontactaddress() {
        return staffEmergencycontactaddress;
    }

    public void setStaffEmergencycontactaddress(String staffEmergencycontactaddress) {
        this.staffEmergencycontactaddress = staffEmergencycontactaddress == null ? null : staffEmergencycontactaddress.trim();
    }

    public String getStaffRemark() {
        return staffRemark;
    }

    public void setStaffRemark(String staffRemark) {
        this.staffRemark = staffRemark == null ? null : staffRemark.trim();
    }

    public String getStaffAuditing() {
        return staffAuditing;
    }

    public void setStaffAuditing(String staffAuditing) {
        this.staffAuditing = staffAuditing == null ? null : staffAuditing.trim();
    }

    public String getStaffYn() {
        return staffYn;
    }

    public void setStaffYn(String staffYn) {
        this.staffYn = staffYn == null ? null : staffYn.trim();
    }

    public String getStaffCustom1() {
        return staffCustom1;
    }

    public void setStaffCustom1(String staffCustom1) {
        this.staffCustom1 = staffCustom1 == null ? null : staffCustom1.trim();
    }

    public String getStaffCustom2() {
        return staffCustom2;
    }

    public void setStaffCustom2(String staffCustom2) {
        this.staffCustom2 = staffCustom2 == null ? null : staffCustom2.trim();
    }

    public String getStaffCustom3() {
        return staffCustom3;
    }

    public void setStaffCustom3(String staffCustom3) {
        this.staffCustom3 = staffCustom3 == null ? null : staffCustom3.trim();
    }

    public String getStaffCustom4() {
        return staffCustom4;
    }

    public void setStaffCustom4(String staffCustom4) {
        this.staffCustom4 = staffCustom4 == null ? null : staffCustom4.trim();
    }

    public String getStaffCustom5() {
        return staffCustom5;
    }

    public void setStaffCustom5(String staffCustom5) {
        this.staffCustom5 = staffCustom5 == null ? null : staffCustom5.trim();
    }

    public String getStaffCustom6() {
        return staffCustom6;
    }

    public void setStaffCustom6(String staffCustom6) {
        this.staffCustom6 = staffCustom6 == null ? null : staffCustom6.trim();
    }
}