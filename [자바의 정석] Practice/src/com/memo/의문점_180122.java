package com.memo;

// �̷��� ���� ��ӿ� �� ����� �ϸ� �޸� ũ�Ⱑ....
// ��ü�� �����ɶ� �� ���� �޸𸮸� �Ҵ� �޴���.
class A1 {
	void test() {
		System.out.println("A1 Test");
	}
}
class A2 extends A1 {
	void test() {
		System.out.println("A2 Test");
	}
}
class A3 extends A2 {
	void test() {
		System.out.println("A3 Test");
	}
	void test(String s) {
		System.out.println("A3 Test "+s);
	}
}
class A4 extends A3 {
	void test() {
		System.out.println("A4 Test");
	}
	void test(int i) {
		System.out.println("A4 Test "+i);
	}
	void test(String s) {
		System.out.println("A4 Test "+s);
	}
}
public class �ǹ���_180122 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		A2 a2 = new A2();
		A3 a3 = new A3();
		A4 a4 = new A4();
		
		a1.test();
		a2.test();
		a3.test();
		a3.test("�ٺ�");
		a4.test();
		a4.test(10);
		a4.test("���");
	}
}
