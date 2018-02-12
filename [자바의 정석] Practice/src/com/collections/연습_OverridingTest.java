package com.collections;
class Parent {
	public String rice() {
		return "현미";
	}
}

class Child extends Parent{
	public String rice() {
		return "백미";
	}
}
public class 연습_OverridingTest {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		System.out.println(parent.rice());
		parent=child; //타입은 부모 가보니까 자식들.
		
		System.out.println(child.rice());
		
	}
}
