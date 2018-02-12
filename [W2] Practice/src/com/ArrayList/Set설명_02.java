package com.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Set�� ������ ����
public class Set����_02 {
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
		
		// ��ü �����ϰ� �ִ��� �˾ƺ���(�������� �� �ִ���.) containsAll 
		System.out.println(A.containsAll(B)); //false
		// B�� A�� �κ������� �ƴϴ�.
		System.out.println(A.containsAll(C)); //true
		//C�� A�� �κ������̴�.
		
		A.addAll(B);
		// A�� B�� ���ļ� A�� �����. (������)
		// A- 1,2,3, B- 3,4,5 ==> A- 1,2,3,4,5
		
		A.retainAll(B); // => �����ϴ� ��� ���� retain
		// A���� �ְ� B���� �ִ� ���Ҹ� A�� ��´�. (������)
		// A- 1,2,3, B- 3,4,5 ==> A- 3
		
		A.removeAll(B);
		// A���� B�� �� (������) ==> B�� �ִ°��� ������.
		// A- 1,2,3, B- 3,4,5 ==> A- 1,2 (A���� 4, 5�� ������ �ش� X. 3�� ��)
		
		
		Iterator H = (Iterator) A.iterator();
		while(H.hasNext()) {
			System.out.println(H.next());
		}
		
		
		
		
	}
}
