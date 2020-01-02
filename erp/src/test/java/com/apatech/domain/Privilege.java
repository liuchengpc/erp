package com.apatech.domain;
/**
 * 权限表（功能表）
 * @author 刘成
 *
 */
public class Privilege {
    private Integer privilegeid;//编号，主键
    private String privilegename;//权限名称
    private String path;//请求路径
    private String enname;//英文名称，备用
    private String column1;//备用列,启用就加备注
    private String column2;//备用列,启用就加备注
    private String column3;//备用列,启用就加备注
    private String column4;//备用列,启用就加备注
    private String column5;//备用列,启用就加备注
    
    

    @Override
	public String toString() {
		return "Privilege [privilegeid=" + privilegeid + ", privilegename=" + privilegename + ", path=" + path
				+ ", enname=" + enname + ", column1=" + column1 + ", column2=" + column2 + ", column3=" + column3
				+ ", column4=" + column4 + ", column5=" + column5 + "]";
	}

	public Privilege() {
		super();
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
        this.privilegename = privilegename == null ? null : privilegename.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1 == null ? null : column1.trim();
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2 == null ? null : column2.trim();
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3 == null ? null : column3.trim();
    }

    public String getColumn4() {
        return column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4 == null ? null : column4.trim();
    }

    public String getColumn5() {
        return column5;
    }

    public void setColumn5(String column5) {
        this.column5 = column5 == null ? null : column5.trim();
    }
}