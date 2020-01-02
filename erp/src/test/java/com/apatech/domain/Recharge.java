package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 会员充值抵扣表
 * @author 刘成
 *
 */
public class Recharge {
    private Integer rechargeid;//编号，主键
    private Integer memberid;//会员id
    @DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date rechargedate;//充值时间
    private String wechatnumber;//微信号
    private String name;//姓名
    private String phone;//手机号
    private Float recharge;//充值
    private Float give;//赠送
    private Float balance;//余额
    private String remarks;//说明
    
    
    

    @Override
	public String toString() {
		return "Recharge [rechargeid=" + rechargeid + ", rechargedate=" + rechargedate + ", wechatnumber="
				+ wechatnumber + ", name=" + name + ", phone=" + phone + ", recharge=" + recharge + ", give=" + give
				+ ", balance=" + balance + ", remarks=" + remarks + "]";
	}

	public Recharge() {
		super();
	}

	public Integer getRechargeid() {
        return rechargeid;
    }

    public void setRechargeid(Integer rechargeid) {
        this.rechargeid = rechargeid;
    }

    public Date getRechargedate() {
        return rechargedate;
    }

    public void setRechargedate(Date rechargedate) {
        this.rechargedate = rechargedate;
    }

    public String getWechatnumber() {
        return wechatnumber;
    }

    public void setWechatnumber(String wechatnumber) {
        this.wechatnumber = wechatnumber == null ? null : wechatnumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Float getRecharge() {
        return recharge;
    }

    public void setRecharge(Float recharge) {
        this.recharge = recharge;
    }

    public Float getGive() {
        return give;
    }

    public void setGive(Float give) {
        this.give = give;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

	public Integer getMemberid() {
		return memberid;
	}

	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}
    
    
    
}