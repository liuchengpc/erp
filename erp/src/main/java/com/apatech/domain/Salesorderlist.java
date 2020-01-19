package com.apatech.domain;

/**
 * 销售订单详表
 * @author 刘成
 *
 */
public class Salesorderlist {
    private String solId;//单据号码（主键 唯一）
    private String soId;//销售订单id（外键 ）
    private String matterId;//物料编号
    private String solMatName;//物料名称
    private String solMatType;//规格型号
    private String solNominal;//单位名称
    private Integer solQuantity;//数量
    private Float solPrePrice;//折扣前单价
    private Integer solFold;//折数
    private Float solPrice;//单价
    private Float solAmount;//金额
    private Float solTaxRate;//税率
    private Float solTax;//税额
    private Float solTaxAmount;//含税金额
    private Integer solGiveaway;//赠品
    private String solJournalizing;//分录备注
    private Integer solMaterialComposition;//物料组合
    private String solSingleSource;//来源单别
    private String solSingleOder;//来源单号
    private Integer solProduction;//生产
    private String solSchedulingSingleNumber;//排程单号
    private Integer solProducedQuantity;//已生产数量
    private String solAuditing;//是否审核
    private String solYn;//是否删除（0 否 1 是 ，默认0）
    private String solCustom1;//自定义1
    private String solCustom2;//自定义2
    private String solCustom3;//自定义3
    private String solCustom4;//自定义4
    private String solCustom5;//自定义5
    private String solCustom6;//自定义6
    
    

    public Salesorderlist() {
		super();
	}

	@Override
	public String toString() {
		return "Salesorderlist [solId=" + solId + ", soId=" + soId + ", matterId=" + matterId + ", solMatName="
				+ solMatName + ", solMatType=" + solMatType + ", solNominal=" + solNominal + ", solQuantity="
				+ solQuantity + ", solPrePrice=" + solPrePrice + ", solFold=" + solFold + ", solPrice=" + solPrice
				+ ", solAmount=" + solAmount + ", solTaxRate=" + solTaxRate + ", solTax=" + solTax + ", solTaxAmount="
				+ solTaxAmount + ", solGiveaway=" + solGiveaway + ", solJournalizing=" + solJournalizing
				+ ", solMaterialComposition=" + solMaterialComposition + ", solSingleSource=" + solSingleSource
				+ ", solSingleOder=" + solSingleOder + ", solProduction=" + solProduction
				+ ", solSchedulingSingleNumber=" + solSchedulingSingleNumber + ", solProducedQuantity="
				+ solProducedQuantity + ", solAuditing=" + solAuditing + ", solYn=" + solYn + ", solCustom1="
				+ solCustom1 + ", solCustom2=" + solCustom2 + ", solCustom3=" + solCustom3 + ", solCustom4="
				+ solCustom4 + ", solCustom5=" + solCustom5 + ", solCustom6=" + solCustom6 + "]";
	}

	public String getSolId() {
        return solId;
    }

    public void setSolId(String solId) {
        this.solId = solId == null ? null : solId.trim();
    }

    public String getSoId() {
        return soId;
    }

    public void setSoId(String soId) {
        this.soId = soId == null ? null : soId.trim();
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getSolMatName() {
        return solMatName;
    }

    public void setSolMatName(String solMatName) {
        this.solMatName = solMatName == null ? null : solMatName.trim();
    }

    public String getSolMatType() {
        return solMatType;
    }

    public void setSolMatType(String solMatType) {
        this.solMatType = solMatType == null ? null : solMatType.trim();
    }

    public String getSolNominal() {
        return solNominal;
    }

    public void setSolNominal(String solNominal) {
        this.solNominal = solNominal == null ? null : solNominal.trim();
    }

    public Integer getSolQuantity() {
        return solQuantity;
    }

    public void setSolQuantity(Integer solQuantity) {
        this.solQuantity = solQuantity;
    }

    public Float getSolPrePrice() {
        return solPrePrice;
    }

    public void setSolPrePrice(Float solPrePrice) {
        this.solPrePrice = solPrePrice;
    }

    public Integer getSolFold() {
        return solFold;
    }

    public void setSolFold(Integer solFold) {
        this.solFold = solFold;
    }

    public Float getSolPrice() {
        return solPrice;
    }

    public void setSolPrice(Float solPrice) {
        this.solPrice = solPrice;
    }

    public Float getSolAmount() {
        return solAmount;
    }

    public void setSolAmount(Float solAmount) {
        this.solAmount = solAmount;
    }

    public Float getSolTaxRate() {
        return solTaxRate;
    }

    public void setSolTaxRate(Float solTaxRate) {
        this.solTaxRate = solTaxRate;
    }

    public Float getSolTax() {
        return solTax;
    }

    public void setSolTax(Float solTax) {
        this.solTax = solTax;
    }

    public Float getSolTaxAmount() {
        return solTaxAmount;
    }

    public void setSolTaxAmount(Float solTaxAmount) {
        this.solTaxAmount = solTaxAmount;
    }

    public Integer getSolGiveaway() {
        return solGiveaway;
    }

    public void setSolGiveaway(Integer solGiveaway) {
        this.solGiveaway = solGiveaway;
    }

    public String getSolJournalizing() {
        return solJournalizing;
    }

    public void setSolJournalizing(String solJournalizing) {
        this.solJournalizing = solJournalizing == null ? null : solJournalizing.trim();
    }

    public Integer getSolMaterialComposition() {
        return solMaterialComposition;
    }

    public void setSolMaterialComposition(Integer solMaterialComposition) {
        this.solMaterialComposition = solMaterialComposition;
    }

    public String getSolSingleSource() {
        return solSingleSource;
    }

    public void setSolSingleSource(String solSingleSource) {
        this.solSingleSource = solSingleSource == null ? null : solSingleSource.trim();
    }

    public String getSolSingleOder() {
        return solSingleOder;
    }

    public void setSolSingleOder(String solSingleOder) {
        this.solSingleOder = solSingleOder == null ? null : solSingleOder.trim();
    }

    public Integer getSolProduction() {
        return solProduction;
    }

    public void setSolProduction(Integer solProduction) {
        this.solProduction = solProduction;
    }

    public String getSolSchedulingSingleNumber() {
        return solSchedulingSingleNumber;
    }

    public void setSolSchedulingSingleNumber(String solSchedulingSingleNumber) {
        this.solSchedulingSingleNumber = solSchedulingSingleNumber == null ? null : solSchedulingSingleNumber.trim();
    }

    public Integer getSolProducedQuantity() {
        return solProducedQuantity;
    }

    public void setSolProducedQuantity(Integer solProducedQuantity) {
        this.solProducedQuantity = solProducedQuantity;
    }

    public String getSolAuditing() {
        return solAuditing;
    }

    public void setSolAuditing(String solAuditing) {
        this.solAuditing = solAuditing == null ? null : solAuditing.trim();
    }

    public String getSolYn() {
        return solYn;
    }

    public void setSolYn(String solYn) {
        this.solYn = solYn == null ? null : solYn.trim();
    }

    public String getSolCustom1() {
        return solCustom1;
    }

    public void setSolCustom1(String solCustom1) {
        this.solCustom1 = solCustom1 == null ? null : solCustom1.trim();
    }

    public String getSolCustom2() {
        return solCustom2;
    }

    public void setSolCustom2(String solCustom2) {
        this.solCustom2 = solCustom2 == null ? null : solCustom2.trim();
    }

    public String getSolCustom3() {
        return solCustom3;
    }

    public void setSolCustom3(String solCustom3) {
        this.solCustom3 = solCustom3 == null ? null : solCustom3.trim();
    }

    public String getSolCustom4() {
        return solCustom4;
    }

    public void setSolCustom4(String solCustom4) {
        this.solCustom4 = solCustom4 == null ? null : solCustom4.trim();
    }

    public String getSolCustom5() {
        return solCustom5;
    }

    public void setSolCustom5(String solCustom5) {
        this.solCustom5 = solCustom5 == null ? null : solCustom5.trim();
    }

    public String getSolCustom6() {
        return solCustom6;
    }

    public void setSolCustom6(String solCustom6) {
        this.solCustom6 = solCustom6 == null ? null : solCustom6.trim();
    }
}