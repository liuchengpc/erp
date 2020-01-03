package com.apatech.domain;
/**
 * 商品色系表
 * @author 刘成
 *
 */
public class Colortype {
    private Integer colortypeid;//编号，主键
    private String colortype;//颜色色系
    
    

    @Override
	public String toString() {
		return "Colortype [colortypeid=" + colortypeid + ", colortype=" + colortype + "]";
	}

	public Colortype() {
		super();
	}

	public Integer getColortypeid() {
        return colortypeid;
    }

    public void setColortypeid(Integer colortypeid) {
        this.colortypeid = colortypeid;
    }

    public String getColortype() {
        return colortype;
    }

    public void setColortype(String colortype) {
        this.colortype = colortype == null ? null : colortype.trim();
    }
}