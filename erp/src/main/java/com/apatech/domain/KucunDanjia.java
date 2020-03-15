package com.apatech.domain;

/**
 * 库存单价
 * zhz专用
 * 盘点专用(用于取当前某个物料的库存及单价)
 */
public class KucunDanjia {
	private Integer ku_cun;//库存
	private float dan_jia;//单价
	
	public KucunDanjia() {
		super();
	}
	@Override
	public String toString() {
		return "KucunDanjia [ku_cun=" + ku_cun + ", dan_jia=" + dan_jia + "]";
	}
	public Integer getKu_cun() {
		return ku_cun;
	}
	public void setKu_cun(Integer ku_cun) {
		this.ku_cun = ku_cun;
	}
	public float getDan_jia() {
		return dan_jia;
	}
	public void setDan_jia(float dan_jia) {
		this.dan_jia = dan_jia;
	}
	
}
