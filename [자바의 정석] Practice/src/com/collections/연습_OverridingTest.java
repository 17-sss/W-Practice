package com.collections;
class Parent {
	public String rice() {
		return "����";
	}
}

class Child extends Parent{
	public String rice() {
		return "���";
	}
}
public class ����_OverridingTest {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		System.out.println(parent.rice());
		parent=child; //Ÿ���� �θ� �����ϱ� �ڽĵ�.
		
		System.out.println(child.rice());
		
	}
}
