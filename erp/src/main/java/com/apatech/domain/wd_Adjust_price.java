package com.apatech.domain;

public class wd_Adjust_price {
		private String apId;//调价id（主键 唯一）
	    private String apDateid;//单据编号
	    private String materialid;//物料id
	    private String updowmid;//增减值科目id（关联updownprogram增减值科目表）
	    private String apDoworkman;//制表人
	    private String apRecheckman;//复核人
	    private String apAuditing;//是否审核
	    private String apYn;//是否删除（0 否 1 是 ，默认0）
	    private String apCustom1;//日期
	    private String apCustom2;//自定栏2
	    private String apCustom3;//自定栏3
	    private String apCustom4;//自定栏4
	    private String apCustom5;//自定栏5
	    private String apCustom6;//自定栏6
	    private String up_name;//增值科目
	    private String up_Custom1;//简直科目
	    private String matter_name;//物料名称
	    private String matter_size;
	    private String mu_id;//单位id
	    private Float matter_nowavgcost;//平均成本
	    private Float matter_nowallcost;//现行总成本
	    private int matter_nowcount;//现行总数，库存
	    //单价
	    private float onePrice=matter_nowallcost/matter_nowavgcost;//单价
	    
	    
	    public wd_Adjust_price() {
			super();
		}
	    
	    @Override
		public String toString() {
			return "Adjust_price [apId=" + apId + ", apDateid=" + apDateid + ",mu_id="+mu_id+",onePrice="+onePrice+",matter_nowcount="+matter_nowcount+",matter_nowallcost="+matter_nowallcost+", matter_nowavgcost="+matter_nowavgcost+",materialid=" + materialid + ", updowmid="
					+ updowmid + ", apPrice=" + apPrice + ", apDecoration=" + apDecoration + ", apDoworkman=" + apDoworkman
					+ ", apRecheckman=" + apRecheckman + ", apAuditing=" + apAuditing + ", apYn=" + apYn + ", apCustom1="
					+ apCustom1 + ", apCustom2=" + apCustom2 + ", apCustom3=" + apCustom3 + ", apCustom4=" + apCustom4
					+ ", apCustom5=" + apCustom5 + ", apCustom6=" + apCustom6 + "up_name="+up_name+",up_Custom1="+up_Custom1+",matter_name="+matter_name+",matter_size="+matter_size+"]";
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
		public String getUp_name() {
			return up_name;
		}
		public void setUp_name(String up_name) {
			this.up_name = up_name;
		}
		public String getUp_Custom1() {
			return up_Custom1;
		}
		public void setUp_Custom1(String up_Custom1) {
			this.up_Custom1 = up_Custom1;
		}
		public String getMatter_name() {
			return matter_name;
		}
		public void setMatter_name(String matter_name) {
			this.matter_name = matter_name;
		}
		public String getMatter_size() {
			return matter_size;
		}
		public void setMatter_size(String matter_size) {
			this.matter_size = matter_size;
		}
		public String getMu_id() {
			return mu_id;
		}
		public void setMu_id(String mu_id) {
			this.mu_id = mu_id;
		}
		public Float getMatter_nowavgcost() {
			return matter_nowavgcost;
		}
		public void setMatter_nowavgcost(Float matter_nowavgcost) {
			this.matter_nowavgcost = matter_nowavgcost;
		}
		public Float getMatter_nowallcost() {
			return matter_nowallcost;
		}
		public void setMatter_nowallcost(Float matter_nowallcost) {
			this.matter_nowallcost = matter_nowallcost;
		}
		public int getMatter_nowcount() {
			return matter_nowcount;
		}
		public void setMatter_nowcount(int matter_nowcount) {
			this.matter_nowcount = matter_nowcount;
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
		private Float apPrice;//调价金额
	    private String apDecoration;//备注
}
