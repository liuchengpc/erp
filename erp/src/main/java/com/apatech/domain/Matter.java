package com.apatech.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 物料主文件表
 * @author 刘成
 *
 */
public class Matter {
    private String matterId;//物料编号（主键 唯一）
    private String matterName;//物料名称
    private String matterSize;//规格型号
    private String matterEnglishName;//英文名称
    private String matterBarno;//条形码编号
    private Float matterMsaleA;//建议售价a
    private Float matterMsaleB;//建议售价b
    private Float matterMsaleC;//建议售价c
    private Float matterMsaleD;//建议售价d
    private Float matterMsaleE;//建议售价e
    private Float matterStandardPrice;//标准进价
    private Float matterTaxno;//税目
    private Integer matterIftax;//0,1（状态）表示是否含税
    private Float matterTaxpoint;//税率
    private Integer matterSafestock;//安全存量
    private Integer matterLowsafestock;//低于安全存量
    private Integer matterDaystartcount;//期初总数
    private Integer matterNowcount;//现行总数
    private Float matterAvgcost;//平均成本
    private Float matterNowavgcost;//现行平均成本
    private Float matterStandardcost;//标准成本
    private Float matterStandardallcost;//标准总成本
    private Float matterDaystartallcost;//期初总成本
    private Float matterNowallcost;//现行总成本
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date matterFirstin;//最初出库日
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date matterRecentout;//最近出库日
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date matterRecentin;//最近入库
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date matterFirstout;//最初入库日
    private Integer matterAppearstartday;//呆滞起记天数
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date matterStopdate;//停用日期
    private String matterMdecoration;//物料说明
    private String mtId;//物料类型id，关联material_type物料类型表
    private String muId;//计量单位id，关联munit 计量单位表    
    private String currencyId;//币别id，关联currency币别表
    private String matterAuditing;//是否审核
    private String matterYn;//是否删除（0 否 1 是 ，默认0）
    private String matterCustom1;//自定栏1
    private String matterCustom2;//自定栏2
    private String matterCustom3;//自定栏3
    private String matterCustom4;//自定栏4
    private String matterCustom5;//自定栏5
    private String matterCustom6;//自定栏6
    
    private String mu_name;//单位名称
    
   

	public Matter() {
		super();
	}

	

	@Override
	public String toString() {
		return "Matter [matterId=" + matterId + ", matterName=" + matterName + ", matterSize=" + matterSize
				+ ", matterEnglishName=" + matterEnglishName + ", matterBarno=" + matterBarno + ", matterMsaleA="
				+ matterMsaleA + ", matterMsaleB=" + matterMsaleB + ", matterMsaleC=" + matterMsaleC + ", matterMsaleD="
				+ matterMsaleD + ", matterMsaleE=" + matterMsaleE + ", matterStandardPrice=" + matterStandardPrice
				+ ", matterTaxno=" + matterTaxno + ", matterIftax=" + matterIftax + ", matterTaxpoint=" + matterTaxpoint
				+ ", matterSafestock=" + matterSafestock + ", matterLowsafestock=" + matterLowsafestock
				+ ", matterDaystartcount=" + matterDaystartcount + ", matterNowcount=" + matterNowcount
				+ ", matterAvgcost=" + matterAvgcost + ", matterNowavgcost=" + matterNowavgcost
				+ ", matterStandardcost=" + matterStandardcost + ", matterStandardallcost=" + matterStandardallcost
				+ ", matterDaystartallcost=" + matterDaystartallcost + ", matterNowallcost=" + matterNowallcost
				+ ", matterFirstin=" + matterFirstin + ", matterRecentout=" + matterRecentout + ", matterRecentin="
				+ matterRecentin + ", matterFirstout=" + matterFirstout + ", matterAppearstartday="
				+ matterAppearstartday + ", matterStopdate=" + matterStopdate + ", matterMdecoration="
				+ matterMdecoration + ", mtId=" + mtId + ", muId=" + muId + ", currencyId=" + currencyId
				+ ", matterAuditing=" + matterAuditing + ", matterYn=" + matterYn + ", matterCustom1=" + matterCustom1
				+ ", matterCustom2=" + matterCustom2 + ", matterCustom3=" + matterCustom3 + ", matterCustom4="
				+ matterCustom4 + ", matterCustom5=" + matterCustom5 + ", matterCustom6=" + matterCustom6 + ", mu_name="
				+ mu_name + "]";
	}



	public String getMu_name() {
		return mu_name;
	}



	public void setMu_name(String mu_name) {
		this.mu_name = mu_name;
	}



	public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getMatterName() {
        return matterName;
    }

    public void setMatterName(String matterName) {
        this.matterName = matterName == null ? null : matterName.trim();
    }

    public String getMatterSize() {
        return matterSize;
    }

    public void setMatterSize(String matterSize) {
        this.matterSize = matterSize == null ? null : matterSize.trim();
    }

    public String getMatterEnglishName() {
        return matterEnglishName;
    }

    public void setMatterEnglishName(String matterEnglishName) {
        this.matterEnglishName = matterEnglishName == null ? null : matterEnglishName.trim();
    }

    public String getMatterBarno() {
        return matterBarno;
    }

    public void setMatterBarno(String matterBarno) {
        this.matterBarno = matterBarno == null ? null : matterBarno.trim();
    }

    public Float getMatterMsaleA() {
        return matterMsaleA;
    }

    public void setMatterMsaleA(Float matterMsaleA) {
        this.matterMsaleA = matterMsaleA;
    }

    public Float getMatterMsaleB() {
        return matterMsaleB;
    }

    public void setMatterMsaleB(Float matterMsaleB) {
        this.matterMsaleB = matterMsaleB;
    }

    public Float getMatterMsaleC() {
        return matterMsaleC;
    }

    public void setMatterMsaleC(Float matterMsaleC) {
        this.matterMsaleC = matterMsaleC;
    }

    public Float getMatterMsaleD() {
        return matterMsaleD;
    }

    public void setMatterMsaleD(Float matterMsaleD) {
        this.matterMsaleD = matterMsaleD;
    }

    public Float getMatterMsaleE() {
        return matterMsaleE;
    }

    public void setMatterMsaleE(Float matterMsaleE) {
        this.matterMsaleE = matterMsaleE;
    }

    public Float getMatterStandardPrice() {
        return matterStandardPrice;
    }

    public void setMatterStandardPrice(Float matterStandardPrice) {
        this.matterStandardPrice = matterStandardPrice;
    }

    public Float getMatterTaxno() {
        return matterTaxno;
    }

    public void setMatterTaxno(Float matterTaxno) {
        this.matterTaxno = matterTaxno;
    }

    public Integer getMatterIftax() {
        return matterIftax;
    }

    public void setMatterIftax(Integer matterIftax) {
        this.matterIftax = matterIftax;
    }

    public Float getMatterTaxpoint() {
        return matterTaxpoint;
    }

    public void setMatterTaxpoint(Float matterTaxpoint) {
        this.matterTaxpoint = matterTaxpoint;
    }

    public Integer getMatterSafestock() {
        return matterSafestock;
    }

    public void setMatterSafestock(Integer matterSafestock) {
        this.matterSafestock = matterSafestock;
    }

    public Integer getMatterLowsafestock() {
        return matterLowsafestock;
    }

    public void setMatterLowsafestock(Integer matterLowsafestock) {
        this.matterLowsafestock = matterLowsafestock;
    }

    public Integer getMatterDaystartcount() {
        return matterDaystartcount;
    }

    public void setMatterDaystartcount(Integer matterDaystartcount) {
        this.matterDaystartcount = matterDaystartcount;
    }

    public Integer getMatterNowcount() {
        return matterNowcount;
    }

    public void setMatterNowcount(Integer matterNowcount) {
        this.matterNowcount = matterNowcount;
    }

    public Float getMatterAvgcost() {
        return matterAvgcost;
    }

    public void setMatterAvgcost(Float matterAvgcost) {
        this.matterAvgcost = matterAvgcost;
    }

    public Float getMatterNowavgcost() {
        return matterNowavgcost;
    }

    public void setMatterNowavgcost(Float matterNowavgcost) {
        this.matterNowavgcost = matterNowavgcost;
    }

    public Float getMatterStandardcost() {
        return matterStandardcost;
    }

    public void setMatterStandardcost(Float matterStandardcost) {
        this.matterStandardcost = matterStandardcost;
    }

    public Float getMatterStandardallcost() {
        return matterStandardallcost;
    }

    public void setMatterStandardallcost(Float matterStandardallcost) {
        this.matterStandardallcost = matterStandardallcost;
    }

    public Float getMatterDaystartallcost() {
        return matterDaystartallcost;
    }

    public void setMatterDaystartallcost(Float matterDaystartallcost) {
        this.matterDaystartallcost = matterDaystartallcost;
    }

    public Float getMatterNowallcost() {
        return matterNowallcost;
    }

    public void setMatterNowallcost(Float matterNowallcost) {
        this.matterNowallcost = matterNowallcost;
    }

    public Date getMatterFirstin() {
        return matterFirstin;
    }

    public void setMatterFirstin(Date matterFirstin) {
        this.matterFirstin = matterFirstin;
    }

    public Date getMatterRecentout() {
        return matterRecentout;
    }

    public void setMatterRecentout(Date matterRecentout) {
        this.matterRecentout = matterRecentout;
    }

    public Date getMatterRecentin() {
        return matterRecentin;
    }

    public void setMatterRecentin(Date matterRecentin) {
        this.matterRecentin = matterRecentin;
    }

    public Date getMatterFirstout() {
        return matterFirstout;
    }

    public void setMatterFirstout(Date matterFirstout) {
        this.matterFirstout = matterFirstout;
    }

    public Integer getMatterAppearstartday() {
        return matterAppearstartday;
    }

    public void setMatterAppearstartday(Integer matterAppearstartday) {
        this.matterAppearstartday = matterAppearstartday;
    }

    public Date getMatterStopdate() {
        return matterStopdate;
    }

    public void setMatterStopdate(Date matterStopdate) {
        this.matterStopdate = matterStopdate;
    }

    public String getMatterMdecoration() {
        return matterMdecoration;
    }

    public void setMatterMdecoration(String matterMdecoration) {
        this.matterMdecoration = matterMdecoration == null ? null : matterMdecoration.trim();
    }

    public String getMtId() {
        return mtId;
    }

    public void setMtId(String mtId) {
        this.mtId = mtId == null ? null : mtId.trim();
    }

    public String getMuId() {
        return muId;
    }

    public void setMuId(String muId) {
        this.muId = muId == null ? null : muId.trim();
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId == null ? null : currencyId.trim();
    }

    public String getMatterAuditing() {
        return matterAuditing;
    }

    public void setMatterAuditing(String matterAuditing) {
        this.matterAuditing = matterAuditing == null ? null : matterAuditing.trim();
    }

    public String getMatterYn() {
        return matterYn;
    }

    public void setMatterYn(String matterYn) {
        this.matterYn = matterYn == null ? null : matterYn.trim();
    }

    public String getMatterCustom1() {
        return matterCustom1;
    }

    public void setMatterCustom1(String matterCustom1) {
        this.matterCustom1 = matterCustom1 == null ? null : matterCustom1.trim();
    }

    public String getMatterCustom2() {
        return matterCustom2;
    }

    public void setMatterCustom2(String matterCustom2) {
        this.matterCustom2 = matterCustom2 == null ? null : matterCustom2.trim();
    }

    public String getMatterCustom3() {
        return matterCustom3;
    }

    public void setMatterCustom3(String matterCustom3) {
        this.matterCustom3 = matterCustom3 == null ? null : matterCustom3.trim();
    }

    public String getMatterCustom4() {
        return matterCustom4;
    }

    public void setMatterCustom4(String matterCustom4) {
        this.matterCustom4 = matterCustom4 == null ? null : matterCustom4.trim();
    }

    public String getMatterCustom5() {
        return matterCustom5;
    }

    public void setMatterCustom5(String matterCustom5) {
        this.matterCustom5 = matterCustom5 == null ? null : matterCustom5.trim();
    }

    public String getMatterCustom6() {
        return matterCustom6;
    }

    public void setMatterCustom6(String matterCustom6) {
        this.matterCustom6 = matterCustom6 == null ? null : matterCustom6.trim();
    }
}