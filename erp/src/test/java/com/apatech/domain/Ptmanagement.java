package com.apatech.domain;
/**
 * 权限类型管理表
 * @author 刘成
 *
 */
public class Ptmanagement {
    private Integer ptid; //编号，主键
	private Integer privilegetypeid;//权限类型ID
    private Integer privilegeid;//权限ID
    private String privilegename;	//权限名称
	public Integer getPtid() {
		return ptid;
	}
	public void setPtid(Integer ptid) {
		this.ptid = ptid;
	}
	public Integer getPrivilegetypeid() {
		return privilegetypeid;
	}
	public void setPrivilegetypeid(Integer privilegetypeid) {
		this.privilegetypeid = privilegetypeid;
	}
	public Integer getPrivilegeid() {
		return privilegeid;
	}
	public void setPrivilegeid(Integer privilegeid) {
		this.privilegeid = privilegeid;
	}
	public String getPrivilegename() {
		return privilegename;
	}
	public void setPrivilegename(String privilegename) {
		this.privilegename = privilegename;
	}
	@Override
	public String toString() {
		return "Ptmanagement [ptid=" + ptid + ", privilegetypeid=" + privilegetypeid + ", privilegeid=" + privilegeid
				+ ", privilegename=" + privilegename + "]";
	}
	public Ptmanagement(Integer ptid, Integer privilegetypeid, Integer privilegeid, String privilegename) {
		super();
		this.ptid = ptid;
		this.privilegetypeid = privilegetypeid;
		this.privilegeid = privilegeid;
		this.privilegename = privilegename;
	}
    
	public Ptmanagement() {
		super();
	}
}