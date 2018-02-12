package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayTest {
	Scanner scan = new Scanner(System.in);
	ArrayList<String> a1 = new ArrayList<>();
	
	// ±âº» ArrayList Å×½ºÆ®
	public void ArrayTest1() {
		
		
		a1.add("¿Ê1");	a1.add("¿Ê2");
		a1.add("¿Ê3");	a1.add("¿Ê4");
		System.out.println(a1);
		// [¿Ê1, ¿Ê2, ¿Ê3, ¿Ê4]
		
		a1.remove(0);
		System.out.println(a1);
		// [¿Ê2, ¿Ê3, ¿Ê4]
		
		a1.add(0, "¿Ê1");
		System.out.println(a1);
		// [¿Ê1, ¿Ê2, ¿Ê3, ¿Ê4]
		
		a1.set(0, "¿Ê11");
		System.out.println(a1);
		// [¿Ê11, ¿Ê2, ¿Ê3, ¿Ê4]
		
		System.out.println(a1.get(0));
		// ¿Ê11
		
		a1.clear();
		System.out.println("¿Ê_a1ÀÇ °ªÀº "+a1+"ÀÔ´Ï´Ù.");
		// ¿Ê_a1ÀÇ °ªÀº []ÀÔ´Ï´Ù.
		
		a1.add("½Å¹ß1");	a1.add("½Å¹ß2");
		System.out.println(a1);
		// [½Å¹ß1, ½Å¹ß2]
		
		a1.removeAll(a1);
		System.out.println("½Å¹ß_a1ÀÇ °ªÀº "+a1+"ÀÔ´Ï´Ù.");
		// ½Å¹ß_a1ÀÇ °ªÀº []ÀÔ´Ï´Ù.
	}
	
	// ArrayList ¹è¿­ ºñ±³ Å×½ºÆ®
	public void ArrayTest2() {
		a1.add("1");
		a1.add("2ÀÌ");
		a1.add("3»ï");
		a1.add("4");
		
		System.out.print("ºñ±³ °ª ÀÔ·Â: ");
		String ser = scan.next();
		for(int i=0; i<a1.size(); i++) {
			if (a1.get(i).equals(ser)) {
				System.out.println(a1.get(i));
			} /*else {
				a1.removeAll(a1);
				System.out.println("d");
				
			}*/
			/*
				System.out.print("ºñ±³ °ª ÀÔ·Â: ");
		//		for(int i=0; i<a1.size(); i++) {
				while(scan.hasNextLine()) {
					String ser = scan.next();
				if (a1.contains(ser)) {
						System.out.println("°á°ú°ª: "+a1.get(a1.indexOf(ser)));
					} else {
						System.out.println("ÀÔ·Â °ªÀÌ ¾ø½À´Ï´Ù.");
					}
				System.out.print("ºñ±³ °ª ÀÔ·Â: ");
			
		}
			 */
			
		}
		
	}
}
public class ArrayList_p {
	
	public static void main(String[] args) {
		ArrayTest t = new ArrayTest();
		t.ArrayTest1();
		System.out.println("======================");
		t.ArrayTest2();
		

		
	}
}
