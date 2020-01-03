package com.apatech.domain;
/**
 * 角色表	
 * @author 刘成
 *
 */
public class Role {
    private Integer roleid;//编号，主键
    private String rolename;//角色名称
    
    

    @Override
	public String toString() {
		return "Role [roleid=" + roleid + ", rolename=" + rolename + "]";
	}

	public Role() {
		super();
	}

	public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }
}