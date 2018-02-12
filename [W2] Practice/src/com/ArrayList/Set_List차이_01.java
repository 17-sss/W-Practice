package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Set_List차이_01 {
	public static void main(String[] args) {
		// HashSet
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);
		
		Iterator H = (Iterator) A.iterator();
		while(H.hasNext()) {
			System.out.println(H.next());
			// HashSet은 1, 2, 3 나옴
			// ㄴ 기존에 존재 하는 값이 있다면 저장 X (중복 저장 X)
			// ArrayList는 1, 2, 2, 2, 2, 3 다 나옴
			// ㄴ 입력한 모든 값을 저장
		}
		/*List - ArrayLis Vector LinkedList
		List는 입력한 모든 값을 저장.*/
		//--------------------------------------------
		/*Set - HashSet LinkedSet TreeSet
		입력한 값들이 고유한 값들만 저장되는 것들은 Set (중복 불가)*/
		
		
	}

}
