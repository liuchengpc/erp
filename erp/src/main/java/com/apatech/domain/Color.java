package com.apatech.domain;
/**
 * 商品颜色表
 * @author 刘成
 *
 */
public class Color {
    private Integer colorid;//编号，主键
    private Integer colortypeid;//颜色色系id
    private String color;//颜色名
    private String colorimg;//颜色图片
    private String rgb;//色值
    
    

    @Override
	public String toString() {
		return "Color [colorid=" + colorid + ", colortypeid=" + colortypeid + ", color=" + color + ", colorimg="
				+ colorimg + ", rgb=" + rgb + "]";
	}

	public Color() {
		super();
	}

	public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public Integer getColortypeid() {
        return colortypeid;
    }

    public void setColortypeid(Integer colortypeid) {
        this.colortypeid = colortypeid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getColorimg() {
        return colorimg;
    }

    public void setColorimg(String colorimg) {
        this.colorimg = colorimg == null ? null : colorimg.trim();
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb == null ? null : rgb.trim();
    }
}