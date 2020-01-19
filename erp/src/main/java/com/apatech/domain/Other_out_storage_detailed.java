package com.apatech.domain;

/**
 * 其他出库详表
 * @author 刘成
 *
 */
public class Other_out_storage_detailed {
    private String oosdId;//id
    private String oosId;//其他入库id（外键）
    private String matterId;//物料编号
    private String oosdEngname;//物料名称
    private String oosdRemark;//规格型号
    private String oosdPriceIncludeTax;//单位名称
    private Integer oosdSingleStatus;//数量
    private Float oosdPrice;//单价
    private Float oosdMoney;//金额
    private String oosdRemarks;//分录备注
    private String oosdSourceOrder;//来源单号
    private String oosdSourceNo;//来源单别
    private String oosdAuditing;//是否审核
    private String oosdYn;//是否删除（0 否 1 是 ，默认0）
    private String oosdCustom1;//自定栏1
    private String oosdCustom2;//自定栏2
    private String oosdCustom3;//自定栏3
    private String oosdCustom4;//自定栏4
    private String oosdCustom5;//自定栏5
    private String oosdCustom6;//自定栏6
    
    

    public Other_out_storage_detailed() {
		super();
	}

	@Override
	public String toString() {
		return "Other_out_storage_detailed [oosdId=" + oosdId + ", oosId=" + oosId + ", matterId=" + matterId
				+ ", oosdEngname=" + oosdEngname + ", oosdRemark=" + oosdRemark + ", oosdPriceIncludeTax="
				+ oosdPriceIncludeTax + ", oosdSingleStatus=" + oosdSingleStatus + ", oosdPrice=" + oosdPrice
				+ ", oosdMoney=" + oosdMoney + ", oosdRemarks=" + oosdRemarks + ", oosdSourceOrder=" + oosdSourceOrder
				+ ", oosdSourceNo=" + oosdSourceNo + ", oosdAuditing=" + oosdAuditing + ", oosdYn=" + oosdYn
				+ ", oosdCustom1=" + oosdCustom1 + ", oosdCustom2=" + oosdCustom2 + ", oosdCustom3=" + oosdCustom3
				+ ", oosdCustom4=" + oosdCustom4 + ", oosdCustom5=" + oosdCustom5 + ", oosdCustom6=" + oosdCustom6
				+ "]";
	}

	public String getOosdId() {
        return oosdId;
    }

    public void setOosdId(String oosdId) {
        this.oosdId = oosdId == null ? null : oosdId.trim();
    }

    public String getOosId() {
        return oosId;
    }

    public void setOosId(String oosId) {
        this.oosId = oosId == null ? null : oosId.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getOosdEngname() {
        return oosdEngname;
    }

    public void setOosdEngname(String oosdEngname) {
        this.oosdEngname = oosdEngname == null ? null : oosdEngname.trim();
    }

    public String getOosdRemark() {
        return oosdRemark;
    }

    public void setOosdRemark(String oosdRemark) {
        this.oosdRemark = oosdRemark == null ? null : oosdRemark.trim();
    }

    public String getOosdPriceIncludeTax() {
        return oosdPriceIncludeTax;
    }

    public void setOosdPriceIncludeTax(String oosdPriceIncludeTax) {
        this.oosdPriceIncludeTax = oosdPriceIncludeTax == null ? null : oosdPriceIncludeTax.trim();
    }

    public Integer getOosdSingleStatus() {
        return oosdSingleStatus;
    }

    public void setOosdSingleStatus(Integer oosdSingleStatus) {
        this.oosdSingleStatus = oosdSingleStatus;
    }

    public Float getOosdPrice() {
        return oosdPrice;
    }

    public void setOosdPrice(Float oosdPrice) {
        this.oosdPrice = oosdPrice;
    }

    public Float getOosdMoney() {
        return oosdMoney;
    }

    public void setOosdMoney(Float oosdMoney) {
        this.oosdMoney = oosdMoney;
    }

    public String getOosdRemarks() {
        return oosdRemarks;
    }

    public void setOosdRemarks(String oosdRemarks) {
        this.oosdRemarks = oosdRemarks == null ? null : oosdRemarks.trim();
    }

    public String getOosdSourceOrder() {
        return oosdSourceOrder;
    }

    public void setOosdSourceOrder(String oosdSourceOrder) {
        this.oosdSourceOrder = oosdSourceOrder == null ? null : oosdSourceOrder.trim();
    }

    public String getOosdSourceNo() {
        return oosdSourceNo;
    }

    public void setOosdSourceNo(String oosdSourceNo) {
        this.oosdSourceNo = oosdSourceNo == null ? null : oosdSourceNo.trim();
    }

    public String getOosdAuditing() {
        return oosdAuditing;
    }

    public void setOosdAuditing(String oosdAuditing) {
        this.oosdAuditing = oosdAuditing == null ? null : oosdAuditing.trim();
    }

    public String getOosdYn() {
        return oosdYn;
    }

    public void setOosdYn(String oosdYn) {
        this.oosdYn = oosdYn == null ? null : oosdYn.trim();
    }

    public String getOosdCustom1() {
        return oosdCustom1;
    }

    public void setOosdCustom1(String oosdCustom1) {
        this.oosdCustom1 = oosdCustom1 == null ? null : oosdCustom1.trim();
    }

    public String getOosdCustom2() {
        return oosdCustom2;
    }

    public void setOosdCustom2(String oosdCustom2) {
        this.oosdCustom2 = oosdCustom2 == null ? null : oosdCustom2.trim();
    }

    public String getOosdCustom3() {
        return oosdCustom3;
    }

    public void setOosdCustom3(String oosdCustom3) {
        this.oosdCustom3 = oosdCustom3 == null ? null : oosdCustom3.trim();
    }

    public String getOosdCustom4() {
        return oosdCustom4;
    }

    public void setOosdCustom4(String oosdCustom4) {
        this.oosdCustom4 = oosdCustom4 == null ? null : oosdCustom4.trim();
    }

    public String getOosdCustom5() {
        return oosdCustom5;
    }

    public void setOosdCustom5(String oosdCustom5) {
        this.oosdCustom5 = oosdCustom5 == null ? null : oosdCustom5.trim();
    }

    public String getOosdCustom6() {
        return oosdCustom6;
    }

    public void setOosdCustom6(String oosdCustom6) {
        this.oosdCustom6 = oosdCustom6 == null ? null : oosdCustom6.trim();
    }
}