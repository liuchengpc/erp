package com.apatech.domain;

/**
 * 盘点单详表
 * @author 刘成
 *
 */
public class Check_detailed {
    private String cdId;//id（主键 唯一）
    private String proofNumber;//凭证编号    
    private String checkId;//盘点单id（外键 唯一）
    private String cdName;//物料编号
    private String cdFormat;//物料名称
    private String cdIncludeTax;//规格型号
    private Integer cdVolume;//单位名称
    private Integer cdInventoriesNumber;//账面数量
    private Integer cdProfitsLossesNumber;//盘点数量
    private Float cdUnitPrice;//盈亏数量
    private Float cdLossAmountProfit;//单价
    private String cdBatchNumber;//盈亏金额
    private String cdCause;//批号
    private String cdAuditing;//原因
    private String cdYn;//是否审核
    private String matterId;//是否删除（0 否 1 是 ，默认0）
    private String cdCustom1;//自定栏1
    private String cdCustom2;//自定栏2
    private String cdCustom3;//自定栏3
    private String cdCustom4;//自定栏4
    private String cdCustom5;//自定栏5
    private String cdCustom6;//自定栏6
    
    
    

    public Check_detailed() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Check_detailed [cdId=" + cdId + ", proofNumber=" + proofNumber + ", checkId=" + checkId + ", cdName="
				+ cdName + ", cdFormat=" + cdFormat + ", cdIncludeTax=" + cdIncludeTax + ", cdVolume=" + cdVolume
				+ ", cdInventoriesNumber=" + cdInventoriesNumber + ", cdProfitsLossesNumber=" + cdProfitsLossesNumber
				+ ", cdUnitPrice=" + cdUnitPrice + ", cdLossAmountProfit=" + cdLossAmountProfit + ", cdBatchNumber="
				+ cdBatchNumber + ", cdCause=" + cdCause + ", cdAuditing=" + cdAuditing + ", cdYn=" + cdYn
				+ ", matterId=" + matterId + ", cdCustom1=" + cdCustom1 + ", cdCustom2=" + cdCustom2 + ", cdCustom3="
				+ cdCustom3 + ", cdCustom4=" + cdCustom4 + ", cdCustom5=" + cdCustom5 + ", cdCustom6=" + cdCustom6
				+ "]";
	}



	public String getCdId() {
        return cdId;
    }

    public void setCdId(String cdId) {
        this.cdId = cdId == null ? null : cdId.trim();
    }

    public String getProofNumber() {
        return proofNumber;
    }

    public void setProofNumber(String proofNumber) {
        this.proofNumber = proofNumber == null ? null : proofNumber.trim();
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

    public String getCdName() {
        return cdName;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName == null ? null : cdName.trim();
    }

    public String getCdFormat() {
        return cdFormat;
    }

    public void setCdFormat(String cdFormat) {
        this.cdFormat = cdFormat == null ? null : cdFormat.trim();
    }

    public String getCdIncludeTax() {
        return cdIncludeTax;
    }

    public void setCdIncludeTax(String cdIncludeTax) {
        this.cdIncludeTax = cdIncludeTax == null ? null : cdIncludeTax.trim();
    }

    public Integer getCdVolume() {
        return cdVolume;
    }

    public void setCdVolume(Integer cdVolume) {
        this.cdVolume = cdVolume;
    }

    public Integer getCdInventoriesNumber() {
        return cdInventoriesNumber;
    }

    public void setCdInventoriesNumber(Integer cdInventoriesNumber) {
        this.cdInventoriesNumber = cdInventoriesNumber;
    }

    public Integer getCdProfitsLossesNumber() {
        return cdProfitsLossesNumber;
    }

    public void setCdProfitsLossesNumber(Integer cdProfitsLossesNumber) {
        this.cdProfitsLossesNumber = cdProfitsLossesNumber;
    }

    public Float getCdUnitPrice() {
        return cdUnitPrice;
    }

    public void setCdUnitPrice(Float cdUnitPrice) {
        this.cdUnitPrice = cdUnitPrice;
    }

    public Float getCdLossAmountProfit() {
        return cdLossAmountProfit;
    }

    public void setCdLossAmountProfit(Float cdLossAmountProfit) {
        this.cdLossAmountProfit = cdLossAmountProfit;
    }

    public String getCdBatchNumber() {
        return cdBatchNumber;
    }

    public void setCdBatchNumber(String cdBatchNumber) {
        this.cdBatchNumber = cdBatchNumber == null ? null : cdBatchNumber.trim();
    }

    public String getCdCause() {
        return cdCause;
    }

    public void setCdCause(String cdCause) {
        this.cdCause = cdCause == null ? null : cdCause.trim();
    }

    public String getCdAuditing() {
        return cdAuditing;
    }

    public void setCdAuditing(String cdAuditing) {
        this.cdAuditing = cdAuditing == null ? null : cdAuditing.trim();
    }

    public String getCdYn() {
        return cdYn;
    }

    public void setCdYn(String cdYn) {
        this.cdYn = cdYn == null ? null : cdYn.trim();
    }

    public String getCdCustom1() {
        return cdCustom1;
    }

    public void setCdCustom1(String cdCustom1) {
        this.cdCustom1 = cdCustom1 == null ? null : cdCustom1.trim();
    }

    public String getCdCustom2() {
        return cdCustom2;
    }

    public void setCdCustom2(String cdCustom2) {
        this.cdCustom2 = cdCustom2 == null ? null : cdCustom2.trim();
    }

    public String getCdCustom3() {
        return cdCustom3;
    }

    public void setCdCustom3(String cdCustom3) {
        this.cdCustom3 = cdCustom3 == null ? null : cdCustom3.trim();
    }

    public String getCdCustom4() {
        return cdCustom4;
    }

    public void setCdCustom4(String cdCustom4) {
        this.cdCustom4 = cdCustom4 == null ? null : cdCustom4.trim();
    }

    public String getCdCustom5() {
        return cdCustom5;
    }

    public void setCdCustom5(String cdCustom5) {
        this.cdCustom5 = cdCustom5 == null ? null : cdCustom5.trim();
    }

    public String getCdCustom6() {
        return cdCustom6;
    }

    public void setCdCustom6(String cdCustom6) {
        this.cdCustom6 = cdCustom6 == null ? null : cdCustom6.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }
}