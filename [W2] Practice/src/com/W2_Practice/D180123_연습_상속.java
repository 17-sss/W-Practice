package com.W2_Practice;
class Parent_1 {
	int p1 = 100;
}
class Child_1 extends Parent_1 {
	int c1 = 200;
}
public class D180123_����_��� {
	public static void main(String[] args) {
		Parent_1 p1 = new Child_1();
//		Child_1 c1 = new Parent_1(); //<--�׳� ����
		Child_1 c1 = (Child_1) new Parent_1(); //<-- �����ϸ� ����
		
		System.out.println(p1.p1);
//		System.out.println(c1.c1);
	}
}
