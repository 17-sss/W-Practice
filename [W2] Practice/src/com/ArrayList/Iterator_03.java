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
		// (Iterator) A.iterator(); => H(Iterator)��� ��ü�� �ȿ� A�� (1,2,3) ����
		while(H.hasNext()) {
			// H.hasNext() => H�ȿ� ���� �����ϴ��� Ȯ��. �����ϸ� true ��ȯ
			System.out.println(H.next());
			// H.next(); => H�ȿ� �ִ� ���� ����ϰ� H�ȿ�(1,2,3) 1�� �־��ٸ� �װ� �����
			// [!] A�ȿ� �ִ� ���� ������� �� �ƴ�.
			
		//ArrayList�� ����. Collection �̱⿡. ���� HashSet��.
		}
	}
}
