package com.String;

import java.util.HashMap;
import java.util.Map;

// String�� hashCode �������̵� �Ǿ�����..(Object)
// String�� �Է°�(���ͷ�)�� ������ hashCode ��, equals �� ���Գ���
class Person1 {
	int num = 3;
	
	public boolean equals(Object obj) {	//Object�� equals. �������̵�
		Person1 p = (Person1) obj;
		return num==p.num;
		
	}
	public int hashCode() { //Object�� hashCode. �������̵�. String���� �ٸ��� �����ؾ���
		return num;
	}
}
	

public class StringEx2_NoBook {
	public static void main(String[] args) {
		String s1="AAA";
		String s2=new String("AAA");
		
		Person1 p1 = new Person1();
		Person1 p2 = new Person1();
		
		System.out.println("String �ؽ��ڵ� ��: "+s1.hashCode()+" | "+s2.hashCode());
			if(s2.equals(s1))
				System.out.println("s2.equals(s1): "+"OK");
			else if(s2!=s1)
				System.out.println("s2!=s1: "+"�ٸ���");
			
		System.out.println("Person �ؽ��ڵ� ��: "+p1.hashCode()+" | "+p2.hashCode());
			if(p2.equals(p1))
				System.out.println("p2.equals(p1): "+"OK");
			else if(p2!=p1)
				System.out.println("p2!=p1: "+"�ٸ���");
		
		Map map = new HashMap();
		
		
		map.put(p1, "p1");
		map.put(p2, "p2");
		
		System.out.println("HashMapȰ�� ��(p1, p2): "+map.size());
		/*
		HashMap�� ���� Ű �� �ߺ� �Ұ�. (����÷��ǿ� ����)
		equals �� hashCode �������̵��� 
		�� ���ϳ��� �ȵ��ִٸ�, 2��ȯ (Ű���� ���� �ٸ��� ����.)
		�Ѵ� �Ǿ��ִٸ� 1 ��ȯ. (Ű���� ���� ���� ����.)
		
		// 1�� ����. 2�� �ٸ���.
	 */
	}
}
