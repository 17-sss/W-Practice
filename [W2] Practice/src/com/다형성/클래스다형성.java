package com.다형성; //생활코딩 다형성 (2~3/6)
class A {
	public A() {//생성자
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
	public String x() {return "B1.x";} // A1 메소드 오버라이딩.
	public String y() {return "B1.y";} 
}
public class 클래스다형성 {
	public static void main(String[] args) {
		A test = new B(); 
		// test는 B를 담았지만, test는 A의 행세(참조)를 하고있음.
		// B test2 = new A(); => 에러
		test.a_method();
		
		B test2= new B();
		//	test.b_method(); => 불가
		test2.a_method();
		test2.b_method();
		
		System.out.println("==========================================");
		
		A1 test3 = new B1();
		System.out.println(test3.x()); //=> B1의 메소드 가져옴
		//test3가 A1을 참조하고 있기에 B1의 메소드를 가져올 순 없음.
		//하지만, 상위(조상)클래스의 메소드를 오버라이딩 했다면, 오버라이딩 한 값이 나옴.
	}
}
