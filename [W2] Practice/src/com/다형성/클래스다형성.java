package com.������; //��Ȱ�ڵ� ������ (2~3/6)
class A {
	public A() {//������
	}
	public void a_method() {System.out.println("This -> A");}
}
class B extends A {
	public void b_method() {System.out.println("This -> B");}
}

class A1 {
	public String x() {return "A1.x";}
}
class B1 extends A1 {
	public String x() {return "B1.x";} // A1 �޼ҵ� �������̵�.
	public String y() {return "B1.y";} 
}
public class Ŭ���������� {
	public static void main(String[] args) {
		A test = new B(); 
		// test�� B�� �������, test�� A�� �༼(����)�� �ϰ�����.
		// B test2 = new A(); => ����
		test.a_method();
		
		B test2= new B();
		//	test.b_method(); => �Ұ�
		test2.a_method();
		test2.b_method();
		
		System.out.println("==========================================");
		
		A1 test3 = new B1();
		System.out.println(test3.x()); //=> B1�� �޼ҵ� ������
		//test3�� A1�� �����ϰ� �ֱ⿡ B1�� �޼ҵ带 ������ �� ����.
		//������, ����(����)Ŭ������ �޼ҵ带 �������̵� �ߴٸ�, �������̵� �� ���� ����.
	}
}
