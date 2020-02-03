package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 部门表
 * @author 刘成
 *
 */
public class Team {
    private String teamId;//部门编号（主键 唯一）
    private String teamName;//部门名称
    private String teamEnglishName;//部门英文名称
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date teamAbate;//失效日期
    private String teamRemark;//备注
    private String teamAuditing;//是否审核
    private String teamYn;//是否删除（0 否 1 是 ，默认0）
    private String teamCustom1;//创建时间
    private String teamCustom2;//自定义2
    private String teamCustom3;//自定义3
    private String teamCustom4;//自定义4
    private String teamCustom5;//自定义5
    private String teamCustom6;//自定义6
    
    

    public Team() {
		super();
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamEnglishName=" + teamEnglishName
				+ ", teamAbate=" + teamAbate + ", teamRemark=" + teamRemark + ", teamAuditing=" + teamAuditing
				+ ", teamYn=" + teamYn + ", teamCustom1=" + teamCustom1 + ", teamCustom2=" + teamCustom2
				+ ", teamCustom3=" + teamCustom3 + ", teamCustom4=" + teamCustom4 + ", teamCustom5=" + teamCustom5
				+ ", teamCustom6=" + teamCustom6 + "]";
	}

	public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getTeamEnglishName() {
        return teamEnglishName;
    }

    public void setTeamEnglishName(String teamEnglishName) {
        this.teamEnglishName = teamEnglishName == null ? null : teamEnglishName.trim();
    }

    public Date getTeamAbate() {
        return teamAbate;
    }

    public void setTeamAbate(Date teamAbate) {
        this.teamAbate = teamAbate;
    }

    public String getTeamRemark() {
        return teamRemark;
    }

    public void setTeamRemark(String teamRemark) {
        this.teamRemark = teamRemark == null ? null : teamRemark.trim();
    }

    public String getTeamAuditing() {
        return teamAuditing;
    }

    public void setTeamAuditing(String teamAuditing) {
        this.teamAuditing = teamAuditing == null ? null : teamAuditing.trim();
    }

    public String getTeamYn() {
        return teamYn;
    }

    public void setTeamYn(String teamYn) {
        this.teamYn = teamYn == null ? null : teamYn.trim();
    }

    public String getTeamCustom1() {
        return teamCustom1;
    }

    public void setTeamCustom1(String teamCustom1) {
        this.teamCustom1 = teamCustom1 == null ? null : teamCustom1.trim();
    }

    public String getTeamCustom2() {
        return teamCustom2;
    }

    public void setTeamCustom2(String teamCustom2) {
        this.teamCustom2 = teamCustom2 == null ? null : teamCustom2.trim();
    }

    public String getTeamCustom3() {
        return teamCustom3;
    }

    public void setTeamCustom3(String teamCustom3) {
        this.teamCustom3 = teamCustom3 == null ? null : teamCustom3.trim();
    }

    public String getTeamCustom4() {
        return teamCustom4;
    }

    public void setTeamCustom4(String teamCustom4) {
        this.teamCustom4 = teamCustom4 == null ? null : teamCustom4.trim();
    }

    public String getTeamCustom5() {
        return teamCustom5;
    }

    public void setTeamCustom5(String teamCustom5) {
        this.teamCustom5 = teamCustom5 == null ? null : teamCustom5.trim();
    }

    public String getTeamCustom6() {
        return teamCustom6;
    }

    public void setTeamCustom6(String teamCustom6) {
        this.teamCustom6 = teamCustom6 == null ? null : teamCustom6.trim();
    }
}