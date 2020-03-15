package com.apatech.domain;

import java.util.List;

public class wdQueryTaiz {

	public String matterId;
	public String matterName;
	public String matterSize;
	public String muName;
	public String wdLastbalancenumber;
	public String muId;
	public String mamuId;
	public String warehouseId;
	public String warehouseName;
	public String wdwarehouseId;//详单仓库id
	public String mtId;//单位id
	public String mtName;
	public List<wdQueryTaizDetail>list;
	
	public List<wdQueryTaizDetail> getList() {
		return list;
	}
	public void setList(List<wdQueryTaizDetail> list) {
		this.list = list;
	}
	public String getMtName() {
		return mtName;
	}
	public void setMtName(String mtName) {
		this.mtName = mtName;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getMatterId() {
		return matterId;
	}
	public void setMatterId(String matterId) {
		this.matterId = matterId;
	}
	public String getMatterName() {
		return matterName;
	}
	public void setMatterName(String matterName) {
		this.matterName = matterName;
	}
	public String getMatterSize() {
		return matterSize;
	}
	public void setMatterSize(String matterSize) {
		this.matterSize = matterSize;
	}
	public String getMuName() {
		return muName;
	}
	public void setMuName(String muName) {
		this.muName = muName;
	}
	public String getWdLastbalancenumber() {
		return wdLastbalancenumber;
	}
	public void setWdLastbalancenumber(String wdLastbalancenumber) {
		this.wdLastbalancenumber = wdLastbalancenumber;
	}
	public String getMuId() {
		return muId;
	}
	public void setMuId(String muId) {
		this.muId = muId;
	}
	public String getMamuId() {
		return mamuId;
	}
	public void setMamuId(String mamuId) {
		this.mamuId = mamuId;
	}
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getWdwarehouseId() {
		return wdwarehouseId;
	}
	public void setWdwarehouseId(String wdwarehouseId) {
		this.wdwarehouseId = wdwarehouseId;
	}
	public String getMtId() {
		return mtId;
	}
	public void setMtId(String mtId) {
		this.mtId = mtId;
	}
	public String getInnum() {
		return innum;
	}
	public void setInnum(String innum) {
		this.innum = innum;
	}
	public String getOutnum() {
		return outnum;
	}
	public void setOutnum(String outnum) {
		this.outnum = outnum;
	}
	public String getWdInorout() {
		return wdInorout;
	}
	public void setWdInorout(String wdInorout) {
		this.wdInorout = wdInorout;
	}
	public String innum;
	public String outnum;
	public String wdInorout;
	
}
