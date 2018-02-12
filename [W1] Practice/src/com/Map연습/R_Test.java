package com.Map연습;
import java.util.HashMap; 
import java.util.Map; 

public class R_Test {
static Map<Object, Object> map = new HashMap<Object, Object>(); 
static Map<Object, Object> cart = new HashMap<Object, Object>(); 

	public static void main(String[] args) { 
	
	R_Goods good1 = new R_Goods(1001, "볼펜", 1000); 
	R_Goods good2 = new R_Goods(1002, "연필", 500); 
	R_Goods good3 = new R_Goods(1003, "딸기", 6000); 
	
	map.put(1, good1); 
	map.put(2, good2); 
	map.put(3, good3); 
	
	//상품 진열 
	goodsDisplay(); 
	
	R_Cart c1 = new R_Cart(good1, 2); 
	R_Cart c2 = new R_Cart(good2, 3); 
	R_Cart c3 = new R_Cart(good3, 2); 
	
	cart.put(1,c1); 
	cart.put(2,c2); 
	cart.put(3,c3); 
	
	cartDisplay(); 
	
	//Cart 번호에 수량 변경 
	changeNum(1, 10); 
	//Cart 진열 
	cartDisplay(); 
	
	//상품번호 1002  삭제 
	removeGood(1002); 
	//Cart 진열 
	cartDisplay(); 
	} 
	
		//수량 변경 메서드 
		public static void changeNum(int cartNum, int num ) {
		for(Map.Entry<Object, Object> entry: cart.entrySet()){ 
		if(entry.getKey()==(Object)cartNum){ 
		R_Cart c = (R_Cart) entry.getValue(); 
		c.setNum(num); 
			} 
		} 
	} 

	//상품번호 삭제 메서드 
	public static void removeGood(int goodNum){ 
	Object key=null; 
		for(Map.Entry<Object, Object> entry: cart.entrySet()){ 
		R_Cart c = (R_Cart) entry.getValue(); 
			if(c.getGoods().getGoodsNo()==goodNum){ 
				key=entry.getKey(); 
			} 
		} 
	cart.remove(key); 
	} 

//카트 진열 메서드 
	public static void cartDisplay(){ 
		for(Map.Entry<Object, Object> entry: cart.entrySet()){ 
			System.out.print("카트진열"+entry.getKey()+" : " ); 
			R_Cart c = (R_Cart) entry.getValue(); 
			System.out.println("상품번호:"+ c.getGoods().getGoodsNo()+"    상품명:"+c.getGoods().getgName()+
					"    단가:"+c.getGoods().getDanga() +"    수량:"+ c.getNum() + "    합계:"+c.getSum()); 
			} 
		System.out.println("=================================================================================================================");
	} 

//상품 진열 메서드 
	public static void goodsDisplay(){ 
		for(Map.Entry<Object, Object> entry: map.entrySet()){ 
			System.out.print("상품진열"+entry.getKey()+" : " ); 
			R_Goods goods = (R_Goods) entry.getValue(); 
			System.out.println("상품번호: "+ goods.getGoodsNo()+" 상품명: "+goods.getgName()+" 가격: "+goods.getDanga()); 
			}	
			System.out.println("=================================================================================================================");
	} 
} 