package com.apatech.domain;

import java.util.List;

/**
 * 用户信息管理表
 * @author 刘成
 *
 */
public class Users {
    private String userid;//账号，主键
    private String password;//用户名
    private String username;//账户密码
    private String industry;//行业
    private String phonenumber;//手机号码
    private String headportrait;//头像
    private Integer roleid;//角色ID
    private String shopid;//店铺ID
    
    //新增属性
    private Shop shop;	//店铺对象

    private Role role;	//职位（角色）对象
    
    private String path;	//请求路径

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getHeadportrait() {
		return headportrait;
	}

	public void setHeadportrait(String headportrait) {
		this.headportrait = headportrait;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getShopid() {
		return shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", password=" + password + ", username=" + username + ", industry="
				+ industry + ", phonenumber=" + phonenumber + ", headportrait=" + headportrait + ", roleid=" + roleid
				+ ", shopid=" + shopid + ", shop=" + shop + ", role=" + role + "]";
	}

	public Users(String userid, String password, String username, String industry, String phonenumber,
			String headportrait, Integer roleid, String shopid, Shop shop, Role role) {
		super();
		this.userid = userid;
		this.password = password;
		this.username = username;
		this.industry = industry;
		this.phonenumber = phonenumber;
		this.headportrait = headportrait;
		this.roleid = roleid;
		this.shopid = shopid;
		this.shop = shop;
		this.role = role;
	}
    
	public Users() {
		super();
	}
}