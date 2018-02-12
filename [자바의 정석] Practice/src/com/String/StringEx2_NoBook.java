package com.String;

import java.util.HashMap;
import java.util.Map;

// String은 hashCode 오버라이딩 되어있음..(Object)
// String은 입력값(리터럴)이 같으면 hashCode 값, equals 값 같게나옴
class Person1 {
	int num = 3;
	
	public boolean equals(Object obj) {	//Object의 equals. 오버라이딩
		Person1 p = (Person1) obj;
		return num==p.num;
		
	}
	public int hashCode() { //Object의 hashCode. 오버라이딩. String과는 다르게 직접해야함
		return num;
	}
}
	

public class StringEx2_NoBook {
	public static void main(String[] args) {
		String s1="AAA";
		String s2=new String("AAA");
		
		Person1 p1 = new Person1();
		Person1 p2 = new Person1();
		
		System.out.println("String 해쉬코드 비교: "+s1.hashCode()+" | "+s2.hashCode());
			if(s2.equals(s1))
				System.out.println("s2.equals(s1): "+"OK");
			else if(s2!=s1)
				System.out.println("s2!=s1: "+"다르다");
			
		System.out.println("Person 해쉬코드 비교: "+p1.hashCode()+" | "+p2.hashCode());
			if(p2.equals(p1))
				System.out.println("p2.equals(p1): "+"OK");
			else if(p2!=p1)
				System.out.println("p2!=p1: "+"다르다");
		
		Map map = new HashMap();
		
		
		map.put(p1, "p1");
		map.put(p2, "p2");
		
		System.out.println("HashMap활용 비교(p1, p2): "+map.size());
		/*
		HashMap은 같은 키 값 중복 불가. (모든컬렉션에 적용)
		equals 나 hashCode 오버라이딩이 
		둘 중하나라도 안되있다면, 2반환 (키값이 서로 다르게 나옴.)
		둘다 되어있다면 1 반환. (키값이 서로 같게 나옴.)
		
		// 1은 같다. 2는 다르다.
	 */
	}
}
