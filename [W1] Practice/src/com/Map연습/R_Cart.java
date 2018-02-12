package com.Map¿¬½À;

public class R_Cart { 
private int num; 
private int sum; 
private R_Goods goods; 

	public R_Cart(R_Goods goods, int num) { 
	this.goods = goods; 
	this.num=num; 
	sum=getSum(); 
	} 

	public int getNum() { 
	return num; 
	} 

	@Override 
	public String toString() { 
	return "Cart [num=" + num + ", sum=" + sum + ", goods=" + goods + "]"; 
	} 

	public void setNum(int num) { 
	this.num = num; 
	} 
	
	public int getSum() { 
	sum=goods.getDanga()*getNum(); 
	return sum; 
	} 
	
	public R_Goods getGoods() { 
	return goods; 
	} 
	
	public void setGoods(R_Goods goods) { 
	this.goods = goods; 
	}	
}