package com.collections;

import java.util.Iterator;

public class MyVector2Test_623p {
	public static void main(String[] args) {
		MyVector2_620p v = new MyVector2_620p();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
//		v.add("5");
//		v.add("6");
		System.out.println("삭제전: "+v);
		Iterator it=v.iterator();
		it.next();
		it.remove();
		it.next();
		it.remove();
//		it.next();
//		it.remove();
//		it.next();
//		it.remove();
		
		System.out.println("삭제후: "+v);
	}
}
