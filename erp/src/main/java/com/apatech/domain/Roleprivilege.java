package com.apatech.domain;
/**
 * 角色权限管理表
 * @author 刘成
 *
 */
public class Roleprivilege {
    private Integer roleprivilegeid;//编号，主键
    private Integer roleid;//角色ID
    private Integer privilegeid;//权限ID
    
    private String rolename;//角色名称
    private String privilegename;//权限名称
    private String path;//请求路径

    @Override
	public String toString() {
		return "Roleprivilege [roleprivilegeid=" + roleprivilegeid + ", roleid=" + roleid + ", privilegeid="
				+ privilegeid + "]";
	}

	public Roleprivilege() {
		super();
	}

	public Integer getRoleprivilegeid() {
        return roleprivilegeid;
    }

    public void setRoleprivilegeid(Integer roleprivilegeid) {
        this.roleprivilegeid = roleprivilegeid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPrivilegeid() {
        return privilegeid;
    }

    public void setPrivilegeid(Integer privilegeid) {
        this.privilegeid = privilegeid;
    }

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getPrivilegename() {
		return privilegename;
	}

	public void setPrivilegename(String privilegename) {
		this.privilegename = privilegename;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
    
    
}