package com.ArrayList;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_03 {
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<>();
		
		A.add(1);
		A.add(2);
		A.add(3);
		
		Iterator H = (Iterator) A.iterator(); 
		// (Iterator) A.iterator(); => H(Iterator)라는 객체의 안에 A값 (1,2,3) 저장
		while(H.hasNext()) {
			// H.hasNext() => H안에 값이 존재하는지 확인. 존재하면 true 반환
			System.out.println(H.next());
			// H.next(); => H안에 있는 값을 출력하고 H안에(1,2,3) 1이 있었다면 그건 사라짐
			// [!] A안에 있던 값이 사라지는 건 아님.
			
		//ArrayList도 같음. Collection 이기에. 물론 HashSet도.
		}
	}
}
