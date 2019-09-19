package com.yc.po;

public class GoodsInfo {
	private Integer gno;
	private String gname;
	private Integer tino;
	private Double price;
	private String intro;
	private Integer balance;
	private String unit;
	private String place;
	private String qualityPeriod;
	private Double weight;
	private String pics;
	private String descr;
	public Integer getGno() {
		return gno;
	}
	public void setGno(Integer gno) {
		this.gno = gno;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Integer getTino() {
		return tino;
	}
	public void setTino(Integer tino) {
		this.tino = tino;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getQualityPeriod() {
		return qualityPeriod;
	}
	public void setQualityPeriod(String qualityPeriod) {
		this.qualityPeriod = qualityPeriod;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getPics() {
		return pics;
	}
	public void setPics(String pics) {
		this.pics = pics;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	@Override
	public String toString() {
		return "GoodsInfo [gno=" + gno + ", gname=" + gname + ", tino=" + tino + ", price=" + price + ", intro=" + intro
				+ ", balance=" + balance + ", unit=" + unit + ", place=" + place + ", qualityPeriod=" + qualityPeriod
				+ ", weight=" + weight + ", pics=" + pics + ", descr=" + descr + "]";
	}
	
	
}
