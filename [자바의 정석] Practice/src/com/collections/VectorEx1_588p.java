package com.collections;

import java.util.Vector;

public class VectorEx1_588p {
	public static void main(String[] args) {
		Vector v = new Vector(5); //용량(capacity)이 5인 Vector를 생성한다.
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize(); // 빈 공간을 없앤다. (용량과 크기가 같아진다.)
		System.out.println("=== After trimToSize() ===");
		print(v);
		
		v.ensureCapacity(6);
		System.out.println("=== After trimToSize(6) ===");
		print(v);
		
		v.setSize(7);
		System.out.println("=== After SetToSize(7) ===");
		print(v);
	}
	
	public static void print (Vector v) {
		System.out.println(v);
		System.out.println("Size: "+v.size());
		System.out.println("Capacity: "+v.capacity());
	}
}
