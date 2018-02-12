package com.collections;
//a1=o1; a1=b1; o1=a1;  b1=o1; 테스트해보기. o는 object(100번지), a는 Aaa클래스(200번지), b는 Bbb클래스(300번지) (상속관련)
class Aaa {
	
}
class Bbb {
	
}
public class 연습_상속Test {
	public static void main(String[] args) {
		Object object = new Object();
		Aaa a1 = new Aaa();
		Bbb b1 = new Bbb();
		
//		a1=object;
//		b1=object;
		//a1 or b1: 자식, object: 부모.
		//object는 100번지라 하면. a1 or b1은 200, 300번지.
		//자식(Aaa)집엔 부모(Object)가 막 갈 수 없다. ===> a1=object;
		
		
		a1=(Aaa)object;	// 실행에러
		b1=(Bbb)object; // 실행에러

		//a1=b1;
		//Aaa와 Bbb는 아무런 관계가 없기에 불가.
		
		object=a1;
		//부모 (Object)집엔 자식(Aaa)이 막 갈 수 있다! ==> object=a1;
	}
}
