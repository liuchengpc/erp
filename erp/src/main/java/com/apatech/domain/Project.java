package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 项目表
 * @author 刘成
 *
 */
public class Project {
    private String projectId;//项目编号（主键 唯一）
    private String projectName;//项目名称
    private String projectEnglishName;//项目英文名称
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date projectAbate;//失效日期
    private String projectRemark;//备注
    private String projectAuditing;//是否审核
    private String projectYn;//是否删除（0 否 1 是 ，默认0）
    private String projectCustom1;//自定义1
    private String projectCustom2;//自定义2
    private String projectCustom3;//自定义3
    private String projectCustom4;//自定义4
    private String projectCustom5;//自定义5
    private String projectCustom6;//自定义6
    
    

    public Project() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectEnglishName="
				+ projectEnglishName + ", projectAbate=" + projectAbate + ", projectRemark=" + projectRemark
				+ ", projectAuditing=" + projectAuditing + ", projectYn=" + projectYn + ", projectCustom1="
				+ projectCustom1 + ", projectCustom2=" + projectCustom2 + ", projectCustom3=" + projectCustom3
				+ ", projectCustom4=" + projectCustom4 + ", projectCustom5=" + projectCustom5 + ", projectCustom6="
				+ projectCustom6 + "]";
	}



	public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectEnglishName() {
        return projectEnglishName;
    }

    public void setProjectEnglishName(String projectEnglishName) {
        this.projectEnglishName = projectEnglishName == null ? null : projectEnglishName.trim();
    }

    public Date getProjectAbate() {
        return projectAbate;
    }

    public void setProjectAbate(Date projectAbate) {
        this.projectAbate = projectAbate;
    }

    public String getProjectRemark() {
        return projectRemark;
    }

    public void setProjectRemark(String projectRemark) {
        this.projectRemark = projectRemark == null ? null : projectRemark.trim();
    }

    public String getProjectAuditing() {
        return projectAuditing;
    }

    public void setProjectAuditing(String projectAuditing) {
        this.projectAuditing = projectAuditing == null ? null : projectAuditing.trim();
    }

    public String getProjectYn() {
        return projectYn;
    }

    public void setProjectYn(String projectYn) {
        this.projectYn = projectYn == null ? null : projectYn.trim();
    }

    public String getProjectCustom1() {
        return projectCustom1;
    }

    public void setProjectCustom1(String projectCustom1) {
        this.projectCustom1 = projectCustom1 == null ? null : projectCustom1.trim();
    }

    public String getProjectCustom2() {
        return projectCustom2;
    }

    public void setProjectCustom2(String projectCustom2) {
        this.projectCustom2 = projectCustom2 == null ? null : projectCustom2.trim();
    }

    public String getProjectCustom3() {
        return projectCustom3;
    }

    public void setProjectCustom3(String projectCustom3) {
        this.projectCustom3 = projectCustom3 == null ? null : projectCustom3.trim();
    }

    public String getProjectCustom4() {
        return projectCustom4;
    }

    public void setProjectCustom4(String projectCustom4) {
        this.projectCustom4 = projectCustom4 == null ? null : projectCustom4.trim();
    }

    public String getProjectCustom5() {
        return projectCustom5;
    }

    public void setProjectCustom5(String projectCustom5) {
        this.projectCustom5 = projectCustom5 == null ? null : projectCustom5.trim();
    }

    public String getProjectCustom6() {
        return projectCustom6;
    }

    public void setProjectCustom6(String projectCustom6) {
        this.projectCustom6 = projectCustom6 == null ? null : projectCustom6.trim();
    }
}