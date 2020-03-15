package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class wdStaff {
	  	private String staffId;//员工编号（主键 唯一）
	    public String getStaffId() {
			return staffId;
		}
		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}
		public String getStaffName() {
			return staffName;
		}
		public void setStaffName(String staffName) {
			this.staffName = staffName;
		}
		public String getStaffEnglishName() {
			return staffEnglishName;
		}
		public void setStaffEnglishName(String staffEnglishName) {
			this.staffEnglishName = staffEnglishName;
		}
		public String getTeamId() {
			return teamId;
		}
		public void setTeamId(String teamId) {
			this.teamId = teamId;
		}
		public String getStaffGender() {
			return staffGender;
		}
		public void setStaffGender(String staffGender) {
			this.staffGender = staffGender;
		}
		public String getTeamName() {
			return teamName;
		}
		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}
		private String staffName;//员工名称
	    private String staffEnglishName;//英文名称
	    private String teamId;//所属部门（部门id）
	    private String staffGender;//性别
	    private String teamName;//部门名称
	   
}
