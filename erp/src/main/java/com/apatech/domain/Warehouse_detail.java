package com.apatech.domain;

/**
 * 仓库明细表
 * @author 刘成
 *
 */
public class Warehouse_detail {
    private String wdId;//仓库明细id（主键 唯一）
    private Integer warehouseId;//仓库id
    private String mtId;//物料id
    private Float wdUnitRice;//单价（成本）
    private Integer wdNumber;//数量
    private Integer wdInorout;//进出库状态（0,1表示）
    private Integer wdLastbalancenumber;//上期结存数（期初数量+入库数量-出库数量）
    private String wdAuditing;//是否审核
    private String wdYn;//是否删除（0 否 1 是 ，默认0）
    private String wdCustom1;//自定义1
    private String wdCustom2;//自定义2
    private String wdCustom3;//自定义3
    private String wdCustom4;//自定义4
    private String wdCustom5;//自定义5
    private String wdCustom6;//自定义6
    
    
    
    public Warehouse_detail() {
		super();
	}

	@Override
	public String toString() {
		return "Warehouse_detail [wdId=" + wdId + ", warehouseId=" + warehouseId + ", mtId=" + mtId + ", wdUnitRice="
				+ wdUnitRice + ", wdNumber=" + wdNumber + ", wdInorout=" + wdInorout + ", wdLastbalancenumber="
				+ wdLastbalancenumber + ", wdAuditing=" + wdAuditing + ", wdYn=" + wdYn + ", wdCustom1=" + wdCustom1
				+ ", wdCustom2=" + wdCustom2 + ", wdCustom3=" + wdCustom3 + ", wdCustom4=" + wdCustom4 + ", wdCustom5="
				+ wdCustom5 + ", wdCustom6=" + wdCustom6 + "]";
	}

	public String getWdId() {
        return wdId;
    }

    public void setWdId(String wdId) {
        this.wdId = wdId == null ? null : wdId.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getMtId() {
        return mtId;
    }

    public void setMtId(String mtId) {
        this.mtId = mtId;
    }

    public Float getWdUnitRice() {
        return wdUnitRice;
    }

    public void setWdUnitRice(Float wdUnitRice) {
        this.wdUnitRice = wdUnitRice;
    }

    public Integer getWdNumber() {
        return wdNumber;
    }

    public void setWdNumber(Integer wdNumber) {
        this.wdNumber = wdNumber;
    }

    public Integer getWdInorout() {
        return wdInorout;
    }

    public void setWdInorout(Integer wdInorout) {
        this.wdInorout = wdInorout;
    }

    public Integer getWdLastbalancenumber() {
        return wdLastbalancenumber;
    }

    public void setWdLastbalancenumber(Integer wdLastbalancenumber) {
        this.wdLastbalancenumber = wdLastbalancenumber;
    }

    public String getWdAuditing() {
        return wdAuditing;
    }

    public void setWdAuditing(String wdAuditing) {
        this.wdAuditing = wdAuditing == null ? null : wdAuditing.trim();
    }

    public String getWdYn() {
        return wdYn;
    }

    public void setWdYn(String wdYn) {
        this.wdYn = wdYn == null ? null : wdYn.trim();
    }

    public String getWdCustom1() {
        return wdCustom1;
    }

    public void setWdCustom1(String wdCustom1) {
        this.wdCustom1 = wdCustom1 == null ? null : wdCustom1.trim();
    }

    public String getWdCustom2() {
        return wdCustom2;
    }

    public void setWdCustom2(String wdCustom2) {
        this.wdCustom2 = wdCustom2 == null ? null : wdCustom2.trim();
    }

    public String getWdCustom3() {
        return wdCustom3;
    }

    public void setWdCustom3(String wdCustom3) {
        this.wdCustom3 = wdCustom3 == null ? null : wdCustom3.trim();
    }

    public String getWdCustom4() {
        return wdCustom4;
    }

    public void setWdCustom4(String wdCustom4) {
        this.wdCustom4 = wdCustom4 == null ? null : wdCustom4.trim();
    }

    public String getWdCustom5() {
        return wdCustom5;
    }

    public void setWdCustom5(String wdCustom5) {
        this.wdCustom5 = wdCustom5 == null ? null : wdCustom5.trim();
    }

    public String getWdCustom6() {
        return wdCustom6;
    }

    public void setWdCustom6(String wdCustom6) {
        this.wdCustom6 = wdCustom6 == null ? null : wdCustom6.trim();
    }
}