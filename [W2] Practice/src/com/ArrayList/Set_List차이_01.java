package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Set_List����_01 {
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
			// HashSet�� 1, 2, 3 ����
			// �� ������ ���� �ϴ� ���� �ִٸ� ���� X (�ߺ� ���� X)
			// ArrayList�� 1, 2, 2, 2, 2, 3 �� ����
			// �� �Է��� ��� ���� ����
		}
		/*List - ArrayLis Vector LinkedList
		List�� �Է��� ��� ���� ����.*/
		//--------------------------------------------
		/*Set - HashSet LinkedSet TreeSet
		�Է��� ������ ������ ���鸸 ����Ǵ� �͵��� Set (�ߺ� �Ұ�)*/
		
		
	}

}
