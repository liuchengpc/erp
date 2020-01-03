package com.apatech.domain;

import java.util.List;

	/**
	 * 权限类型表
	 * @author 刘成
	 *
	 */
	public class Privilegetype {
    private Integer privilegetypeid;//编号，主键
    private String privilegetype;//  类型名称
    private List<Ptmanagement> list;	//权限集合
	public Integer getPrivilegetypeid() {
		return privilegetypeid;
	}
	public void setPrivilegetypeid(Integer privilegetypeid) {
		this.privilegetypeid = privilegetypeid;
	}
	public String getPrivilegetype() {
		return privilegetype;
	}
	public void setPrivilegetype(String privilegetype) {
		this.privilegetype = privilegetype;
	}
	public List<Ptmanagement> getList() {
		return list;
	}
	public void setList(List<Ptmanagement> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Privilegetype [privilegetypeid=" + privilegetypeid + ", privilegetype=" + privilegetype + ", list="
				+ list + "]";
	}
	public Privilegetype(Integer privilegetypeid, String privilegetype, List<Ptmanagement> list) {
		super();
		this.privilegetypeid = privilegetypeid;
		this.privilegetype = privilegetype;
		this.list = list;
	}
	
	public Privilegetype() {
		super();
	}
}