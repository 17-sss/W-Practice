package com.내부클래스;

import com.내부클래스.Outer.StaticInner;

public class Java_408p {
	public static void main(String[] args) {
		//인스턴스 클래스의 인스턴스를 생성하려면 외부클래스의 인스턴스 먼저 생성
		Outer ot = new Outer();
//		Outer.InstanceInner ii = ot.InstanceInner(); 이렇게 안댐.
		Outer.InstanceInner ii = ot.new InstanceInner();
		
		System.out.println("Outer.StaticInner.cv: "+Outer.StaticInner.cv); //300
//		System.out.println("Outer.StaticInner.cv: "+Outer.StaticInner(cv)); 불가
		System.out.println("ii.iv(InstanceInner): "+ii.iv); //100
//		System.out.println("ii.iv"+ii(iv)); 불가
		
		
		System.out.println("StaticInner: "+StaticInner.cv); // StaticInner.iv는 불가. 21열 참조	 //300
		
		StaticInner st = new StaticInner(); //외부 클래스 인스턴스 생성하지 않아도 됨. 스태틱 내부 클래스는.
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
