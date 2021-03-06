package com.apatech.domain;

import java.util.List;

public class wd_Adjust_price {
	private String apId;// 调价id（主键 唯一）
	private String apDateid;// 单据编号
	private String materialid;// 物料id
	private String updowmid;// 增减值科目id（关联updownprogram增减值科目表）
	private String apDoworkman;// 制表人
	private String apRecheckman;// 复核人
	private String apAuditing;// 是否审核
	private String apYn;// 是否删除（0 否 1 是 ，默认0）
	private String apCustom1;// 日期
	private String apCustom2;// 自定栏2
	private String apCustom3;// 自定栏3
	private String apCustom4;// 自定栏4
	private String apCustom5;// 自定栏5
	private String apCustom6;// 自定栏6
	private String upName;// 增值科目
	private String upCustom6;// 简直科目
	private String matterName;// 物料名称
	private String matterId;//物料编号
	private List<wd_Adjust_detail>list;
	
	private String mapId;// 调价id（主键 唯一）
	private String mapDateid;// 调价单据编号
	private String mapCustom6;//调价单单据日期
	private String mupName;//增值科目
	private String mupCustom6;//减值科目
	private String mmatterName;//物料名称
	private String mmatterId;//物料编号
	private String mmuName;//计量单位
	private String mmatterSize;//尺寸
	private String mmatterNowcount;//库存
	private String mmatterNowavgcost;//单价
	private String mmonePrice;//单价
	private String dAdjustprice;//调价金额
	private String dDecoration;//分录备注
	private String mapDoworkman;//制表人
	private String mapRecheckman;//复核人
	private String dApid;//从表调价id
	private String dMatterid;//从表物料id
	private String mupdowmid;//增减值科目id
	private String mapYn;//是否审核
	public String getMapId() {
		return mapId;
	}

	public void setMapId(String mapId) {
		this.mapId = mapId;
	}

	public String getMapDateid() {
		return mapDateid;
	}

	public void setMapDateid(String mapDateid) {
		this.mapDateid = mapDateid;
	}

	public String getMapCustom6() {
		return mapCustom6;
	}

	public void setMapCustom6(String mapCustom6) {
		this.mapCustom6 = mapCustom6;
	}

	public String getMupName() {
		return mupName;
	}

	public void setMupName(String mupName) {
		this.mupName = mupName;
	}

	public String getMupCustom6() {
		return mupCustom6;
	}

	public void setMupCustom6(String mupCustom6) {
		this.mupCustom6 = mupCustom6;
	}

	public String getMmatterName() {
		return mmatterName;
	}

	public void setMmatterName(String mmatterName) {
		this.mmatterName = mmatterName;
	}

	public String getMmatterId() {
		return mmatterId;
	}

	public void setMmatterId(String mmatterId) {
		this.mmatterId = mmatterId;
	}

	public String getMmuName() {
		return mmuName;
	}

	public void setMmuName(String mmuName) {
		this.mmuName = mmuName;
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

	public String getMapDoworkman() {
		return mapDoworkman;
	}

	public void setMapDoworkman(String mapDoworkman) {
		this.mapDoworkman = mapDoworkman;
	}

	public String getMapRecheckman() {
		return mapRecheckman;
	}

	public void setMapRecheckman(String mapRecheckman) {
		this.mapRecheckman = mapRecheckman;
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

	public String getMupdowmid() {
		return mupdowmid;
	}

	public void setMupdowmid(String mupdowmid) {
		this.mupdowmid = mupdowmid;
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

	private String upId;//增减值科目id
	private String upCustom5;//增减值科目单号
	private String mamuId;//物料表计量单位id
	private String myamuId;//计量单位表id
	
	
	
	
	
	
	
	
	
	public List<wd_Adjust_detail> getList() {
		return list;
	}

	public void setList(List<wd_Adjust_detail> list) {
		this.list = list;
	}

	public String getMatterId() {
		return matterId;
	}

	public void setMatterId(String matterId) {
		this.matterId = matterId;
	}

	private String matterSize;
	private String muId;// 单位id
	private String muName;//单位
	public String getMuName() {
		return muName;
	}

	public void setMuName(String muName) {
		this.muName = muName;
	}

	private Float matterNowavgcost;// 平均成本
	private Float matterNowallcost;// 现行总成本
	private int matterNowcount;// 现行总数，库存
	// 单价
	private float onePrice = (matterNowallcost == null || matterNowavgcost == null) ? 0f
			: (matterNowallcost / matterNowavgcost);// 单价

	private Float apPrice;// 调价金额
	private String apDecoration;// 备注

	public wd_Adjust_price() {
		super();
	}

	@Override
	public String toString() {
		return "wd_Adjust_price [apId=" + apId + ", apDateid=" + apDateid + ", materialid=" + materialid + ", updowmid="
				+ updowmid + ", apDoworkman=" + apDoworkman + ", apRecheckman=" + apRecheckman + ", apAuditing="
				+ apAuditing + ", apYn=" + apYn + ", apCustom1=" + apCustom1 + ", apCustom2=" + apCustom2
				+ ", apCustom3=" + apCustom3 + ", apCustom4=" + apCustom4 + ", apCustom5=" + apCustom5 + ", apCustom6="
				+ apCustom6 + ", upName=" + upName + ", upCustom6=" + upCustom6 + ", matterName=" + matterName
				+ ", matterSize=" + matterSize + ", muId=" + muId + ", matterNowavgcost=" + matterNowavgcost
				+ ", matterNowallcost=" + matterNowallcost + ", matterNowcount=" + matterNowcount + ", onePrice="
				+ onePrice + ", apPrice=" + apPrice + ", apDecoration=" + apDecoration + "]";
	}



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

	public String getMaterialid() {
		return materialid;
	}

	public void setMaterialid(String materialid) {
		this.materialid = materialid;
	}

	public String getUpdowmid() {
		return updowmid;
	}

	public String getUpCustom6() {
		return upCustom6;
	}

	public void setUpCustom6(String upCustom6) {
		this.upCustom6 = upCustom6;
	}

	public void setUpdowmid(String updowmid) {
		this.updowmid = updowmid;
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

	public String getApAuditing() {
		return apAuditing;
	}

	public void setApAuditing(String apAuditing) {
		this.apAuditing = apAuditing;
	}

	public String getApYn() {
		return apYn;
	}

	public void setApYn(String apYn) {
		this.apYn = apYn;
	}

	public String getApCustom1() {
		return apCustom1;
	}

	public void setApCustom1(String apCustom1) {
		this.apCustom1 = apCustom1;
	}

	public String getApCustom2() {
		return apCustom2;
	}

	public void setApCustom2(String apCustom2) {
		this.apCustom2 = apCustom2;
	}

	public String getApCustom3() {
		return apCustom3;
	}

	public void setApCustom3(String apCustom3) {
		this.apCustom3 = apCustom3;
	}

	public String getApCustom4() {
		return apCustom4;
	}

	public void setApCustom4(String apCustom4) {
		this.apCustom4 = apCustom4;
	}

	public String getApCustom5() {
		return apCustom5;
	}

	public void setApCustom5(String apCustom5) {
		this.apCustom5 = apCustom5;
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

	public String getMuId() {
		return muId;
	}

	public void setMuId(String muId) {
		this.muId = muId;
	}

	public Float getMatterNowavgcost() {
		return matterNowavgcost;
	}

	public void setMatterNowavgcost(Float matterNowavgcost) {
		this.matterNowavgcost = matterNowavgcost;
	}

	public Float getMatterNowallcost() {
		return matterNowallcost;
	}

	public void setMatterNowallcost(Float matterNowallcost) {
		this.matterNowallcost = matterNowallcost;
	}

	public int getMatterNowcount() {
		return matterNowcount;
	}

	public void setMatterNowcount(int matterNowcount) {
		this.matterNowcount = matterNowcount;
	}

	public float getOnePrice() {
		return onePrice;
	}

	public void setOnePrice(float onePrice) {
		this.onePrice = onePrice;
	}

	public Float getApPrice() {
		return apPrice;
	}

	public void setApPrice(Float apPrice) {
		this.apPrice = apPrice;
	}

	public String getApDecoration() {
		return apDecoration;
	}

	public void setApDecoration(String apDecoration) {
		this.apDecoration = apDecoration;
	}

}
