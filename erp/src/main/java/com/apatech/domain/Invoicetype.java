package com.apatech.domain;

/**
 * 发票类型表
 * @author 刘成
 *
 */
public class Invoicetype {
    private String invoicetypeId;//发票类型id（主键 唯一）
    private String invoicetypeName;//发票类型名称
    private String invoicetypeEngname;//英文名称
    private String invoicetypeRemarks;//备注
    private String invoicetypeAuditing;//是否审核
    private String invoicetypeYn;//是否删除（0 否 1 是 ，默认0）
    private String invoicetypeCustom1;//自定栏1
    private String invoicetypeCustom2;//自定栏2
    private String invoicetypeCustom3;//自定栏3
    private String invoicetypeCustom4;//自定栏4
    private String invoicetypeCustom5;//自定栏5
    private String invoicetypeCustom6;//自定栏6
    
    

    public Invoicetype() {
		super();
	}
    
    

	@Override
	public String toString() {
		return "Invoicetype [invoicetypeId=" + invoicetypeId + ", invoicetypeName=" + invoicetypeName
				+ ", invoicetypeEngname=" + invoicetypeEngname + ", invoicetypeRemarks=" + invoicetypeRemarks
				+ ", invoicetypeAuditing=" + invoicetypeAuditing + ", invoicetypeYn=" + invoicetypeYn
				+ ", invoicetypeCustom1=" + invoicetypeCustom1 + ", invoicetypeCustom2=" + invoicetypeCustom2
				+ ", invoicetypeCustom3=" + invoicetypeCustom3 + ", invoicetypeCustom4=" + invoicetypeCustom4
				+ ", invoicetypeCustom5=" + invoicetypeCustom5 + ", invoicetypeCustom6=" + invoicetypeCustom6 + "]";
	}



	public String getInvoicetypeId() {
        return invoicetypeId;
    }

    public void setInvoicetypeId(String invoicetypeId) {
        this.invoicetypeId = invoicetypeId == null ? null : invoicetypeId.trim();
    }

    public String getInvoicetypeName() {
        return invoicetypeName;
    }

    public void setInvoicetypeName(String invoicetypeName) {
        this.invoicetypeName = invoicetypeName == null ? null : invoicetypeName.trim();
    }

    public String getInvoicetypeEngname() {
        return invoicetypeEngname;
    }

    public void setInvoicetypeEngname(String invoicetypeEngname) {
        this.invoicetypeEngname = invoicetypeEngname == null ? null : invoicetypeEngname.trim();
    }

    public String getInvoicetypeRemarks() {
        return invoicetypeRemarks;
    }

    public void setInvoicetypeRemarks(String invoicetypeRemarks) {
        this.invoicetypeRemarks = invoicetypeRemarks == null ? null : invoicetypeRemarks.trim();
    }

    public String getInvoicetypeAuditing() {
        return invoicetypeAuditing;
    }

    public void setInvoicetypeAuditing(String invoicetypeAuditing) {
        this.invoicetypeAuditing = invoicetypeAuditing == null ? null : invoicetypeAuditing.trim();
    }

    public String getInvoicetypeYn() {
        return invoicetypeYn;
    }

    public void setInvoicetypeYn(String invoicetypeYn) {
        this.invoicetypeYn = invoicetypeYn == null ? null : invoicetypeYn.trim();
    }

    public String getInvoicetypeCustom1() {
        return invoicetypeCustom1;
    }

    public void setInvoicetypeCustom1(String invoicetypeCustom1) {
        this.invoicetypeCustom1 = invoicetypeCustom1 == null ? null : invoicetypeCustom1.trim();
    }

    public String getInvoicetypeCustom2() {
        return invoicetypeCustom2;
    }

    public void setInvoicetypeCustom2(String invoicetypeCustom2) {
        this.invoicetypeCustom2 = invoicetypeCustom2 == null ? null : invoicetypeCustom2.trim();
    }

    public String getInvoicetypeCustom3() {
        return invoicetypeCustom3;
    }

    public void setInvoicetypeCustom3(String invoicetypeCustom3) {
        this.invoicetypeCustom3 = invoicetypeCustom3 == null ? null : invoicetypeCustom3.trim();
    }

    public String getInvoicetypeCustom4() {
        return invoicetypeCustom4;
    }

    public void setInvoicetypeCustom4(String invoicetypeCustom4) {
        this.invoicetypeCustom4 = invoicetypeCustom4 == null ? null : invoicetypeCustom4.trim();
    }

    public String getInvoicetypeCustom5() {
        return invoicetypeCustom5;
    }

    public void setInvoicetypeCustom5(String invoicetypeCustom5) {
        this.invoicetypeCustom5 = invoicetypeCustom5 == null ? null : invoicetypeCustom5.trim();
    }

    public String getInvoicetypeCustom6() {
        return invoicetypeCustom6;
    }

    public void setInvoicetypeCustom6(String invoicetypeCustom6) {
        this.invoicetypeCustom6 = invoicetypeCustom6 == null ? null : invoicetypeCustom6.trim();
    }
}