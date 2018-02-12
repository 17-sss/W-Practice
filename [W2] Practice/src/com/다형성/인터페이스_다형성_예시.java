package com.다형성;
// static : 공통적인, 클래스의
// final : 마지막의, 변경될수 없는
interface Program_Student{
	public String Coding();
	// public void String study(); 이렇게는 안됨
	// public void String(); 이렇게하면 String이 메소드 이름이 되어버림.
}
interface GongSi_Student {
	public String Study();
	//인터페이스) 모든 메서드는 public abstract 이어야 하며, 생략 가능
	//public abstract String study();로 간주.
}
	
interface Me {
	//인터페이스) 모든 멤버변수는 public static final 이어야 하며, 생략 가능
	final int i=26;
	//public static final int i로 간주.
} 
interface You {
	static int y=27;
	//public static final int y로 간주.
}
class Son implements Me, Program_Student {
	@Override
	public String Coding() {
		for(int i=0; i<5; i++) {
			System.out.println("Coding");
		}
		return "Coding Stop!";
	}
	
}
class Jo implements You, GongSi_Student {
	@Override
	public String Study() {
		for (int i=0; i<5; i++) {
			System.out.println("Study");
		}
		return "Study Stop!";
	}
	
}
public class 인터페이스_다형성_예시 {
	public static void main(String[] args) {
		//===================================
		Me m = new Son();
		You y = new Jo();
		//m.Coding(); => 불가능 / 메소드 존재 X
		System.out.println(m.i);
		//[static final]고정값. m.i=26; 불가
		System.out.println(m.i+1);
		//y.Study(); => 불가능 / 메소드 존재 X
		System.out.println(y.y);
		//===================================
		
		System.out.println();
		
		//===================================
		Program_Student p = new Son();
		GongSi_Student g = new Jo();
		p.Coding();
		//System.out.println(p.i); => 불가능 / 상수 존재 X
		g.Study();
		//System.out.println(g.y); => 불가능 / 상수 존재 X
		
		//===================================
		
		System.out.println();
		
		//===================================
		Son s = new Son();
		Jo j = new Jo();
		s.Coding();
		System.out.println(s.i+"\n");
		j.Study(); 
		System.out.println(j.y);
		//===================================
	}

}
