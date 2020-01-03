package com.apatech.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 采购单主表
 * @author 刘成
 *
 */
public class Bill {
    private String billid;//编号，主键
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date deliverytime;//交期
    private Integer supplierid;//供应商ID
    private String userid;//制表人id
    private String remarks;//备注
    private int shenhe;//审核
    
    
    private List<Detail> list;//集合
    
    

    
	

	@Override
	public String toString() {
		return "Bill [billid=" + billid + ", deliverytime=" + deliverytime + ", supplierid=" + supplierid + ", userid="
				+ userid + ", remarks=" + remarks + ", shenhe=" + shenhe + ", list=" + list + "]";
	}

	public Bill() {
		super();
	}

	public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid == null ? null : billid.trim();
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

	public List<Detail> getList() {
		return list;
	}

	public void setList(List<Detail> list) {
		this.list = list;
	}

	public int getShenhe() {
		return shenhe;
	}

	public void setShenhe(int shenhe) {
		this.shenhe = shenhe;
	}
    
	
	
    
}