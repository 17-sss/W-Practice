package com.����Ŭ����;

import com.����Ŭ����.Outer.StaticInner;

public class Java_408p {
	public static void main(String[] args) {
		//�ν��Ͻ� Ŭ������ �ν��Ͻ��� �����Ϸ��� �ܺ�Ŭ������ �ν��Ͻ� ���� ����
		Outer ot = new Outer();
//		Outer.InstanceInner ii = ot.InstanceInner(); �̷��� �ȴ�.
		Outer.InstanceInner ii = ot.new InstanceInner();
		
		System.out.println("Outer.StaticInner.cv: "+Outer.StaticInner.cv); //300
//		System.out.println("Outer.StaticInner.cv: "+Outer.StaticInner(cv)); �Ұ�
		System.out.println("ii.iv(InstanceInner): "+ii.iv); //100
//		System.out.println("ii.iv"+ii(iv)); �Ұ�
		
		
		System.out.println("StaticInner: "+StaticInner.cv); // StaticInner.iv�� �Ұ�. 21�� ����	 //300
		
		StaticInner st = new StaticInner(); //�ܺ� Ŭ���� �ν��Ͻ� �������� �ʾƵ� ��. ����ƽ ���� Ŭ������.
		System.out.println("st.iv(StaticInner): "+st.iv); //200
	
		
		
	}
}
class Outer {
	class InstanceInner {
		int iv =100;
	}
	static class StaticInner {
		int iv=200;
		static int cv=300;
	}
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}
