package com.다형성; // 생활코딩 다형성 (5/6)
interface I1 {
	public String s1();
}
interface I2 {
	public String s2(); 
}
class II implements I1,I2 {
	@Override
	public String s1() {
		return "S1";
	}
	
	@Override
	public String s2() {
		return "S2";
	}
}
public class 인터페이스_다형성 {
	public static void main(String[] args) {
		I1 i1 = new II();
		I2 i2 = new II();
		II ii = new II();
		
		i1.s1();
		System.out.println("I1: "+i1.s1());
//		i1.s2(); <== i1는 I1인터페이스 s2만 불러낼수 있음.
		i2.s2();
		System.out.println("I2: "+i2.s2());
//		i2.s1(); <== i2는 I2인터페이스 s2만 불러낼수 있음.
		
		// II 클래스는 I1,I2를 구현하고 있기에 둘다 가능
		ii.s1(); 
		ii.s2();
		System.out.println("II: "+ii.s1());
		System.out.println("II: "+ii.s2());
	}

}
