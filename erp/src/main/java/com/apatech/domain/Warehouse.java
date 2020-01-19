package com.apatech.domain;

/**
 * 
 * @author 刘成
 *
 */
public class Warehouse {
    private String warehouseId;//
    private String warehouseName;//
    private String warehouseEasyName;//
    private String warehouseEngname;//
    private String warehouseLinkman;//
    private String warehouseLinktel;//
    private String warehouseAddress;//
    private String warehouseDecoration;//
    private String warehouseAuditing;//
    private String warehouseYn;//
    private String warehouseCustom1;//自定义1
    private String warehouseCustom2;//自定义2
    private String warehouseCustom3;//自定义3
    private String warehouseCustom4;//自定义4
    private String warehouseCustom5;//自定义5
    private String warehouseCustom6;//自定义6
    
    

    public Warehouse() {
		super();
	}

	@Override
	public String toString() {
		return "Warehouse [warehouseId=" + warehouseId + ", warehouseName=" + warehouseName + ", warehouseEasyName="
				+ warehouseEasyName + ", warehouseEngname=" + warehouseEngname + ", warehouseLinkman="
				+ warehouseLinkman + ", warehouseLinktel=" + warehouseLinktel + ", warehouseAddress=" + warehouseAddress
				+ ", warehouseDecoration=" + warehouseDecoration + ", warehouseAuditing=" + warehouseAuditing
				+ ", warehouseYn=" + warehouseYn + ", warehouseCustom1=" + warehouseCustom1 + ", warehouseCustom2="
				+ warehouseCustom2 + ", warehouseCustom3=" + warehouseCustom3 + ", warehouseCustom4=" + warehouseCustom4
				+ ", warehouseCustom5=" + warehouseCustom5 + ", warehouseCustom6=" + warehouseCustom6 + "]";
	}

	public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName == null ? null : warehouseName.trim();
    }

    public String getWarehouseEasyName() {
        return warehouseEasyName;
    }

    public void setWarehouseEasyName(String warehouseEasyName) {
        this.warehouseEasyName = warehouseEasyName == null ? null : warehouseEasyName.trim();
    }

    public String getWarehouseEngname() {
        return warehouseEngname;
    }

    public void setWarehouseEngname(String warehouseEngname) {
        this.warehouseEngname = warehouseEngname == null ? null : warehouseEngname.trim();
    }

    public String getWarehouseLinkman() {
        return warehouseLinkman;
    }

    public void setWarehouseLinkman(String warehouseLinkman) {
        this.warehouseLinkman = warehouseLinkman == null ? null : warehouseLinkman.trim();
    }

    public String getWarehouseLinktel() {
        return warehouseLinktel;
    }

    public void setWarehouseLinktel(String warehouseLinktel) {
        this.warehouseLinktel = warehouseLinktel == null ? null : warehouseLinktel.trim();
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress == null ? null : warehouseAddress.trim();
    }

    public String getWarehouseDecoration() {
        return warehouseDecoration;
    }

    public void setWarehouseDecoration(String warehouseDecoration) {
        this.warehouseDecoration = warehouseDecoration == null ? null : warehouseDecoration.trim();
    }

    public String getWarehouseAuditing() {
        return warehouseAuditing;
    }

    public void setWarehouseAuditing(String warehouseAuditing) {
        this.warehouseAuditing = warehouseAuditing == null ? null : warehouseAuditing.trim();
    }

    public String getWarehouseYn() {
        return warehouseYn;
    }

    public void setWarehouseYn(String warehouseYn) {
        this.warehouseYn = warehouseYn == null ? null : warehouseYn.trim();
    }

    public String getWarehouseCustom1() {
        return warehouseCustom1;
    }

    public void setWarehouseCustom1(String warehouseCustom1) {
        this.warehouseCustom1 = warehouseCustom1 == null ? null : warehouseCustom1.trim();
    }

    public String getWarehouseCustom2() {
        return warehouseCustom2;
    }

    public void setWarehouseCustom2(String warehouseCustom2) {
        this.warehouseCustom2 = warehouseCustom2 == null ? null : warehouseCustom2.trim();
    }

    public String getWarehouseCustom3() {
        return warehouseCustom3;
    }

    public void setWarehouseCustom3(String warehouseCustom3) {
        this.warehouseCustom3 = warehouseCustom3 == null ? null : warehouseCustom3.trim();
    }

    public String getWarehouseCustom4() {
        return warehouseCustom4;
    }

    public void setWarehouseCustom4(String warehouseCustom4) {
        this.warehouseCustom4 = warehouseCustom4 == null ? null : warehouseCustom4.trim();
    }

    public String getWarehouseCustom5() {
        return warehouseCustom5;
    }

    public void setWarehouseCustom5(String warehouseCustom5) {
        this.warehouseCustom5 = warehouseCustom5 == null ? null : warehouseCustom5.trim();
    }

    public String getWarehouseCustom6() {
        return warehouseCustom6;
    }

    public void setWarehouseCustom6(String warehouseCustom6) {
        this.warehouseCustom6 = warehouseCustom6 == null ? null : warehouseCustom6.trim();
    }
}