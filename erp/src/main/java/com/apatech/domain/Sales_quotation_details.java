package com.apatech.domain;

/**
 * 销售报价表详表
 * @author 刘成
 *
 */
public class Sales_quotation_details {
    private String sqdProdid;//物料编号，来源物料主文件
    private String sqdSerno;//栏号
    private String sqdProdname;//物料名称，来源物料主文件
    private String sqdProdsize;//规格型号，来源物料主文件
    private String sqdUnitname;//单位名称，来源物料主文件
    private Integer sqdSquantity;//数量,要有小兰标签，但如果为0，不可保存 
    private Float sqdZkqprice;//折扣前单价
    private Float sqdDiscount;//折数
    private Float sqdUnitprice;//单价
    private Float sqdPrice;//金额
    private Float sqdTaxrate;//税率
    private Float sqdTaxlimit;//税额
    private Float sqdTaxinclusiveprice;//含税金额
    private Integer sqdComplimentart;//赠品（0，1）
    private String sqdItemremark;//分录备注
    private String sqlId;//详表主键 关联主表
    private String sqdAuditing;//是否审核
    private String sqdYn;//是否删除（0 否 1 是 ，默认0）
    private String sqdCustom1;//自定栏一
    private String sqdCustom2;//自定栏二
    private String sqdCustom3;//自定栏三
    private String sqdCustom4;//自定栏四
    private String sqdCustom5;//自定栏五
    private String sqdCustom6;//自定栏六

    public String getSqdProdid() {
        return sqdProdid;
    }

    public void setSqdProdid(String sqdProdid) {
        this.sqdProdid = sqdProdid == null ? null : sqdProdid.trim();
    }

    public String getSqdSerno() {
        return sqdSerno;
    }

    public void setSqdSerno(String sqdSerno) {
        this.sqdSerno = sqdSerno == null ? null : sqdSerno.trim();
    }

    public String getSqdProdname() {
        return sqdProdname;
    }

    public void setSqdProdname(String sqdProdname) {
        this.sqdProdname = sqdProdname == null ? null : sqdProdname.trim();
    }

    public String getSqdProdsize() {
        return sqdProdsize;
    }

    public void setSqdProdsize(String sqdProdsize) {
        this.sqdProdsize = sqdProdsize == null ? null : sqdProdsize.trim();
    }

    public String getSqdUnitname() {
        return sqdUnitname;
    }

    public void setSqdUnitname(String sqdUnitname) {
        this.sqdUnitname = sqdUnitname == null ? null : sqdUnitname.trim();
    }

    public Integer getSqdSquantity() {
        return sqdSquantity;
    }

    public void setSqdSquantity(Integer sqdSquantity) {
        this.sqdSquantity = sqdSquantity;
    }

    public Float getSqdZkqprice() {
        return sqdZkqprice;
    }

    public void setSqdZkqprice(Float sqdZkqprice) {
        this.sqdZkqprice = sqdZkqprice;
    }

    public Float getSqdDiscount() {
        return sqdDiscount;
    }

    public void setSqdDiscount(Float sqdDiscount) {
        this.sqdDiscount = sqdDiscount;
    }

    public Float getSqdUnitprice() {
        return sqdUnitprice;
    }

    public void setSqdUnitprice(Float sqdUnitprice) {
        this.sqdUnitprice = sqdUnitprice;
    }

    public Float getSqdPrice() {
        return sqdPrice;
    }

    public void setSqdPrice(Float sqdPrice) {
        this.sqdPrice = sqdPrice;
    }

    public Float getSqdTaxrate() {
        return sqdTaxrate;
    }

    public void setSqdTaxrate(Float sqdTaxrate) {
        this.sqdTaxrate = sqdTaxrate;
    }

    public Float getSqdTaxlimit() {
        return sqdTaxlimit;
    }

    public void setSqdTaxlimit(Float sqdTaxlimit) {
        this.sqdTaxlimit = sqdTaxlimit;
    }

    public Float getSqdTaxinclusiveprice() {
        return sqdTaxinclusiveprice;
    }

    public void setSqdTaxinclusiveprice(Float sqdTaxinclusiveprice) {
        this.sqdTaxinclusiveprice = sqdTaxinclusiveprice;
    }

    public Integer getSqdComplimentart() {
        return sqdComplimentart;
    }

    public void setSqdComplimentart(Integer sqdComplimentart) {
        this.sqdComplimentart = sqdComplimentart;
    }

    public String getSqdItemremark() {
        return sqdItemremark;
    }

    public void setSqdItemremark(String sqdItemremark) {
        this.sqdItemremark = sqdItemremark == null ? null : sqdItemremark.trim();
    }

    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId == null ? null : sqlId.trim();
    }

    public String getSqdAuditing() {
        return sqdAuditing;
    }

    public void setSqdAuditing(String sqdAuditing) {
        this.sqdAuditing = sqdAuditing == null ? null : sqdAuditing.trim();
    }

    public String getSqdYn() {
        return sqdYn;
    }

    public void setSqdYn(String sqdYn) {
        this.sqdYn = sqdYn == null ? null : sqdYn.trim();
    }

    public String getSqdCustom1() {
        return sqdCustom1;
    }

    public void setSqdCustom1(String sqdCustom1) {
        this.sqdCustom1 = sqdCustom1 == null ? null : sqdCustom1.trim();
    }

    public String getSqdCustom2() {
        return sqdCustom2;
    }

    public void setSqdCustom2(String sqdCustom2) {
        this.sqdCustom2 = sqdCustom2 == null ? null : sqdCustom2.trim();
    }

    public String getSqdCustom3() {
        return sqdCustom3;
    }

    public void setSqdCustom3(String sqdCustom3) {
        this.sqdCustom3 = sqdCustom3 == null ? null : sqdCustom3.trim();
    }

    public String getSqdCustom4() {
        return sqdCustom4;
    }

    public void setSqdCustom4(String sqdCustom4) {
        this.sqdCustom4 = sqdCustom4 == null ? null : sqdCustom4.trim();
    }

    public String getSqdCustom5() {
        return sqdCustom5;
    }

    public void setSqdCustom5(String sqdCustom5) {
        this.sqdCustom5 = sqdCustom5 == null ? null : sqdCustom5.trim();
    }

    public String getSqdCustom6() {
        return sqdCustom6;
    }

    public void setSqdCustom6(String sqdCustom6) {
        this.sqdCustom6 = sqdCustom6 == null ? null : sqdCustom6.trim();
    }
}