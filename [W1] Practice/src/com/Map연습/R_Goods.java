package com.Map¿¬½À;

import java.io.Serializable; 

public class R_Goods implements Serializable { 
private int goodsNo; 
private String gName; 
private int danga; 
	public R_Goods() {} 

	public R_Goods(int goodsNo, String gName, int danga) { 
	super(); 
	this.goodsNo = goodsNo; 
	this.gName = gName; 
	this.danga = danga; 
	} 
	
	public int getGoodsNo() { 
	return goodsNo; 
	} 

	public void setGoodsNo(int goodsNo) { 
	this.goodsNo = goodsNo; 
	} 
	
	public String getgName() { 
	return gName; 
	} 
	
	public void setgName(String gName) { 
	this.gName = gName; 
	} 
	
	public int getDanga() { 
	return danga; 
	} 
	
	public void setDanga(int danga) { 
	this.danga = danga; 
	} 

	@Override 
	public String toString() { 
	return "Goods [goodsNo=" + goodsNo + ", gName=" + gName + ", danga=" 
	+ danga + "]"; 
	} 

} 