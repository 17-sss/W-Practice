package com.extends_etc;
//BindingTest3 - 타이핑
public class BindingTest3_366p {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
//		Parent p1 = new Parent();
//		Child c1 = (Child) new Parent();  // Child c1 = new Parent(); 불가.. 캐스팅 해줘야함. 		
		
		System.out.println("p.x= "+p.x);
		p.method();
		System.out.println("======================");
		System.out.println("c.x= "+c.x);
		c.method();
	}
}
class Parent {
	int x = 100;
	
	void method () {
		System.out.println("Parent Method");
	}
}
class Child extends Parent {
	int x = 200;
	
	void method () {
		System.out.println("x= " + x); //this.x와 같다
		System.out.println("super.x= " + super.x);
		System.out.println("this.x= " + this.x);
	}
}
