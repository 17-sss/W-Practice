package com.������; // ��Ȱ�ڵ� ������ (5/6)
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
public class �������̽�_������ {
	public static void main(String[] args) {
		I1 i1 = new II();
		I2 i2 = new II();
		II ii = new II();
		
		i1.s1();
		System.out.println("I1: "+i1.s1());
//		i1.s2(); <== i1�� I1�������̽� s2�� �ҷ����� ����.
		i2.s2();
		System.out.println("I2: "+i2.s2());
//		i2.s1(); <== i2�� I2�������̽� s2�� �ҷ����� ����.
		
		// II Ŭ������ I1,I2�� �����ϰ� �ֱ⿡ �Ѵ� ����
		ii.s1(); 
		ii.s2();
		System.out.println("II: "+ii.s1());
		System.out.println("II: "+ii.s2());
	}

}
