package com.apatech.domain;

/**
 * 其他入库详表
 * @author 刘成
 *
 */
public class Other_input_storage_detailed {
    private String oisdId;//id（主键 唯一）
    private String oisId;//其他入库id（外键）
    private String matterId;//物料编号
    private String oisdEngname;//物料名称
    private String oisdRemark;//规格型号
    private String oisdPriceIncludeTax;//单位名称
    private Integer oisdSingleStatus;//数量
    private Float oisdPrice;//单价
    private Float oisdMoney;//金额
    private String oisdRemarks;//分录备注
    private String oisdSourceOrder;//来源单别
    private String oisdSourceNo;//来源单号
    private String oisdAuditing;//是否审核
    private String oisdYn;//是否删除（0 否 1 是 ，默认0）
    private String oisdCustom1;//自定栏1
    private String oisdCustom2;//自定栏2
    private String oisdCustom3;//自定栏3
    private String oisdCustom4;//自定栏4
    private String oisdCustom5;//自定栏5
    private String oisdCustom6;//自定栏6
    
    

    public Other_input_storage_detailed() {
		super();
	}

	@Override
	public String toString() {
		return "Other_input_storage_detailed [oisdId=" + oisdId + ", oisId=" + oisId + ", matterId=" + matterId
				+ ", oisdEngname=" + oisdEngname + ", oisdRemark=" + oisdRemark + ", oisdPriceIncludeTax="
				+ oisdPriceIncludeTax + ", oisdSingleStatus=" + oisdSingleStatus + ", oisdPrice=" + oisdPrice
				+ ", oisdMoney=" + oisdMoney + ", oisdRemarks=" + oisdRemarks + ", oisdSourceOrder=" + oisdSourceOrder
				+ ", oisdSourceNo=" + oisdSourceNo + ", oisdAuditing=" + oisdAuditing + ", oisdYn=" + oisdYn
				+ ", oisdCustom1=" + oisdCustom1 + ", oisdCustom2=" + oisdCustom2 + ", oisdCustom3=" + oisdCustom3
				+ ", oisdCustom4=" + oisdCustom4 + ", oisdCustom5=" + oisdCustom5 + ", oisdCustom6=" + oisdCustom6
				+ "]";
	}

	public String getOisdId() {
        return oisdId;
    }

    public void setOisdId(String oisdId) {
        this.oisdId = oisdId == null ? null : oisdId.trim();
    }

    public String getOisId() {
        return oisId;
    }

    public void setOisId(String oisId) {
        this.oisId = oisId == null ? null : oisId.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getOisdEngname() {
        return oisdEngname;
    }

    public void setOisdEngname(String oisdEngname) {
        this.oisdEngname = oisdEngname == null ? null : oisdEngname.trim();
    }

    public String getOisdRemark() {
        return oisdRemark;
    }

    public void setOisdRemark(String oisdRemark) {
        this.oisdRemark = oisdRemark == null ? null : oisdRemark.trim();
    }

    public String getOisdPriceIncludeTax() {
        return oisdPriceIncludeTax;
    }

    public void setOisdPriceIncludeTax(String oisdPriceIncludeTax) {
        this.oisdPriceIncludeTax = oisdPriceIncludeTax == null ? null : oisdPriceIncludeTax.trim();
    }

    public Integer getOisdSingleStatus() {
        return oisdSingleStatus;
    }

    public void setOisdSingleStatus(Integer oisdSingleStatus) {
        this.oisdSingleStatus = oisdSingleStatus;
    }

    public Float getOisdPrice() {
        return oisdPrice;
    }

    public void setOisdPrice(Float oisdPrice) {
        this.oisdPrice = oisdPrice;
    }

    public Float getOisdMoney() {
        return oisdMoney;
    }

    public void setOisdMoney(Float oisdMoney) {
        this.oisdMoney = oisdMoney;
    }

    public String getOisdRemarks() {
        return oisdRemarks;
    }

    public void setOisdRemarks(String oisdRemarks) {
        this.oisdRemarks = oisdRemarks == null ? null : oisdRemarks.trim();
    }

    public String getOisdSourceOrder() {
        return oisdSourceOrder;
    }

    public void setOisdSourceOrder(String oisdSourceOrder) {
        this.oisdSourceOrder = oisdSourceOrder == null ? null : oisdSourceOrder.trim();
    }

    public String getOisdSourceNo() {
        return oisdSourceNo;
    }

    public void setOisdSourceNo(String oisdSourceNo) {
        this.oisdSourceNo = oisdSourceNo == null ? null : oisdSourceNo.trim();
    }

    public String getOisdAuditing() {
        return oisdAuditing;
    }

    public void setOisdAuditing(String oisdAuditing) {
        this.oisdAuditing = oisdAuditing == null ? null : oisdAuditing.trim();
    }

    public String getOisdYn() {
        return oisdYn;
    }

    public void setOisdYn(String oisdYn) {
        this.oisdYn = oisdYn == null ? null : oisdYn.trim();
    }

    public String getOisdCustom1() {
        return oisdCustom1;
    }

    public void setOisdCustom1(String oisdCustom1) {
        this.oisdCustom1 = oisdCustom1 == null ? null : oisdCustom1.trim();
    }

    public String getOisdCustom2() {
        return oisdCustom2;
    }

    public void setOisdCustom2(String oisdCustom2) {
        this.oisdCustom2 = oisdCustom2 == null ? null : oisdCustom2.trim();
    }

    public String getOisdCustom3() {
        return oisdCustom3;
    }

    public void setOisdCustom3(String oisdCustom3) {
        this.oisdCustom3 = oisdCustom3 == null ? null : oisdCustom3.trim();
    }

    public String getOisdCustom4() {
        return oisdCustom4;
    }

    public void setOisdCustom4(String oisdCustom4) {
        this.oisdCustom4 = oisdCustom4 == null ? null : oisdCustom4.trim();
    }

    public String getOisdCustom5() {
        return oisdCustom5;
    }

    public void setOisdCustom5(String oisdCustom5) {
        this.oisdCustom5 = oisdCustom5 == null ? null : oisdCustom5.trim();
    }

    public String getOisdCustom6() {
        return oisdCustom6;
    }

    public void setOisdCustom6(String oisdCustom6) {
        this.oisdCustom6 = oisdCustom6 == null ? null : oisdCustom6.trim();
    }
}