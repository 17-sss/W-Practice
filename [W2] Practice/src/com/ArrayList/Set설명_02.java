package com.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Set은 집합의 개념
public class Set설명_02 {
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<>();
		C.add(1);
		C.add(2);
		
		// 전체 포함하고 있는지 알아보는(같은값이 다 있는지.) containsAll 
		System.out.println(A.containsAll(B)); //false
		// B는 A의 부분집합이 아니다.
		System.out.println(A.containsAll(C)); //true
		//C는 A의 부분집합이다.
		
		A.addAll(B);
		// A와 B를 합쳐서 A로 만든다. (합집합)
		// A- 1,2,3, B- 3,4,5 ==> A- 1,2,3,4,5
		
		A.retainAll(B); // => 간직하다 라는 뜻의 retain
		// A에도 있고 B에도 있는 원소를 A에 담는다. (교집합)
		// A- 1,2,3, B- 3,4,5 ==> A- 3
		
		A.removeAll(B);
		// A에서 B를 뺀 (차집합) ==> B에 있는값을 빼버림.
		// A- 1,2,3, B- 3,4,5 ==> A- 1,2 (A에는 4, 5가 없으니 해당 X. 3만 뺌)
		
		
		Iterator H = (Iterator) A.iterator();
		while(H.hasNext()) {
			System.out.println(H.next());
		}
		
		
		
		
	}
}
