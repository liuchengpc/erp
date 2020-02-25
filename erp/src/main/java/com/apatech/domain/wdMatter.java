package com.apatech.domain;

public class wdMatter {
	private String apId;// 调价id（主键 唯一）
	private String apDateid;// 调价单据编号
	private String apCustom6;//调价单单据日期
	private String upName;//增值科目
	private String upCustom6;//减值科目
	private String mmatterName;//物料名称
	private String matterId;//物料编号
	private String muName;//计量单位
	private String mmatterSize;//尺寸
	private String mmatterNowcount;//库存
	private String mmatterNowavgcost;//单价
	private String mmonePrice;//单价
	private String dAdjustprice;//调价金额
	private String dDecoration;//分录备注
	public String getApId() {
		return apId;
	}
	public void setApId(String apId) {
		this.apId = apId;
	}
	public String getApDateid() {
		return apDateid;
	}
	public void setApDateid(String apDateid) {
		this.apDateid = apDateid;
	}
	public String getApCustom6() {
		return apCustom6;
	}
	public void setApCustom6(String apCustom6) {
		this.apCustom6 = apCustom6;
	}
	public String getUpName() {
		return upName;
	}
	public void setUpName(String upName) {
		this.upName = upName;
	}
	public String getUpCustom6() {
		return upCustom6;
	}
	public void setUpCustom6(String upCustom6) {
		this.upCustom6 = upCustom6;
	}
	public String getMmatterName() {
		return mmatterName;
	}
	public void setMmatterName(String mmatterName) {
		this.mmatterName = mmatterName;
	}
	public String getMatterId() {
		return matterId;
	}
	public void setMatterId(String matterId) {
		this.matterId = matterId;
	}
	public String getMuName() {
		return muName;
	}
	public void setMuName(String muName) {
		this.muName = muName;
	}
	public String getMmatterSize() {
		return mmatterSize;
	}
	public void setMmatterSize(String mmatterSize) {
		this.mmatterSize = mmatterSize;
	}
	public String getMmatterNowcount() {
		return mmatterNowcount;
	}
	public void setMmatterNowcount(String mmatterNowcount) {
		this.mmatterNowcount = mmatterNowcount;
	}
	public String getMmatterNowavgcost() {
		return mmatterNowavgcost;
	}
	public void setMmatterNowavgcost(String mmatterNowavgcost) {
		this.mmatterNowavgcost = mmatterNowavgcost;
	}
	public String getMmonePrice() {
		return mmonePrice;
	}
	public void setMmonePrice(String mmonePrice) {
		this.mmonePrice = mmonePrice;
	}
	public String getdAdjustprice() {
		return dAdjustprice;
	}
	public void setdAdjustprice(String dAdjustprice) {
		this.dAdjustprice = dAdjustprice;
	}
	public String getdDecoration() {
		return dDecoration;
	}
	public void setdDecoration(String dDecoration) {
		this.dDecoration = dDecoration;
	}
	public String getApDoworkman() {
		return apDoworkman;
	}
	public void setApDoworkman(String apDoworkman) {
		this.apDoworkman = apDoworkman;
	}
	public String getApRecheckman() {
		return apRecheckman;
	}
	public void setApRecheckman(String apRecheckman) {
		this.apRecheckman = apRecheckman;
	}
	public String getdApid() {
		return dApid;
	}
	public void setdApid(String dApid) {
		this.dApid = dApid;
	}
	public String getdMatterid() {
		return dMatterid;
	}
	public void setdMatterid(String dMatterid) {
		this.dMatterid = dMatterid;
	}
	public String getUpdowmid() {
		return updowmid;
	}
	public void setUpdowmid(String updowmid) {
		this.updowmid = updowmid;
	}
	public String getApYn() {
		return apYn;
	}
	public void setApYn(String apYn) {
		this.apYn = apYn;
	}
	public String getUpId() {
		return upId;
	}
	public void setUpId(String upId) {
		this.upId = upId;
	}
	public String getUpCustom5() {
		return upCustom5;
	}
	public void setUpCustom5(String upCustom5) {
		this.upCustom5 = upCustom5;
	}
	public String getMamuId() {
		return mamuId;
	}
	public void setMamuId(String mamuId) {
		this.mamuId = mamuId;
	}
	public String getMyamuId() {
		return myamuId;
	}
	public void setMyamuId(String myamuId) {
		this.myamuId = myamuId;
	}
	private String apDoworkman;//制表人
	private String apRecheckman;//复核人
	private String dApid;//从表调价id
	private String dMatterid;//从表物料id
	private String updowmid;//增减值科目id
	private String apYn;//是否审核
	private String upId;//增减值科目id
	private String upCustom5;//增减值科目单号
	private String mamuId;//物料表计量单位id
	private String myamuId;//计量单位表id
}
