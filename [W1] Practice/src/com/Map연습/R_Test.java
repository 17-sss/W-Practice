package com.Map����;
import java.util.HashMap; 
import java.util.Map; 

public class R_Test {
static Map<Object, Object> map = new HashMap<Object, Object>(); 
static Map<Object, Object> cart = new HashMap<Object, Object>(); 

	public static void main(String[] args) { 
	
	R_Goods good1 = new R_Goods(1001, "����", 1000); 
	R_Goods good2 = new R_Goods(1002, "����", 500); 
	R_Goods good3 = new R_Goods(1003, "����", 6000); 
	
	map.put(1, good1); 
	map.put(2, good2); 
	map.put(3, good3); 
	
	//��ǰ ���� 
	goodsDisplay(); 
	
	R_Cart c1 = new R_Cart(good1, 2); 
	R_Cart c2 = new R_Cart(good2, 3); 
	R_Cart c3 = new R_Cart(good3, 2); 
	
	cart.put(1,c1); 
	cart.put(2,c2); 
	cart.put(3,c3); 
	
	cartDisplay(); 
	
	//Cart ��ȣ�� ���� ���� 
	changeNum(1, 10); 
	//Cart ���� 
	cartDisplay(); 
	
	//��ǰ��ȣ 1002  ���� 
	removeGood(1002); 
	//Cart ���� 
	cartDisplay(); 
	} 
	
		//���� ���� �޼��� 
		public static void changeNum(int cartNum, int num ) {
		for(Map.Entry<Object, Object> entry: cart.entrySet()){ 
		if(entry.getKey()==(Object)cartNum){ 
		R_Cart c = (R_Cart) entry.getValue(); 
		c.setNum(num); 
			} 
		} 
	} 

	//��ǰ��ȣ ���� �޼��� 
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

//īƮ ���� �޼��� 
	public static void cartDisplay(){ 
		for(Map.Entry<Object, Object> entry: cart.entrySet()){ 
			System.out.print("īƮ����"+entry.getKey()+" : " ); 
			R_Cart c = (R_Cart) entry.getValue(); 
			System.out.println("��ǰ��ȣ:"+ c.getGoods().getGoodsNo()+"    ��ǰ��:"+c.getGoods().getgName()+
					"    �ܰ�:"+c.getGoods().getDanga() +"    ����:"+ c.getNum() + "    �հ�:"+c.getSum()); 
			} 
		System.out.println("=================================================================================================================");
	} 

//��ǰ ���� �޼��� 
	public static void goodsDisplay(){ 
		for(Map.Entry<Object, Object> entry: map.entrySet()){ 
			System.out.print("��ǰ����"+entry.getKey()+" : " ); 
			R_Goods goods = (R_Goods) entry.getValue(); 
			System.out.println("��ǰ��ȣ: "+ goods.getGoodsNo()+" ��ǰ��: "+goods.getgName()+" ����: "+goods.getDanga()); 
			}	
			System.out.println("=================================================================================================================");
	} 
} 