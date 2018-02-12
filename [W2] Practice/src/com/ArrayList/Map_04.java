package com.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
	key 값은 중복 불가
	value 값은 중복 가능
	
	만약 key, value ==> 	("one", 1) 이 있는데
						("one", 200)을 추가하려한다면.
						("one", 200)이 되고, ("one", 1)은 사라짐
 */
public class Map_04 {
	static void iteratorUsingForEach(HashMap map) {
		Set<Map.Entry<String, Integer>>entires = map.entrySet();
		for (Map.Entry<String, Integer>entry : entires) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String, Integer>>entires = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entires.iterator();
		while (i.hasNext()) {
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<>();
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);
		a.put("중복", 100);
		a.put("중복", 200);
		
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		System.out.println(a.get("four"));
		
		System.out.println(a.get("중복"));
		
//		iteratorUsingForEach(a);
		
	}
}
