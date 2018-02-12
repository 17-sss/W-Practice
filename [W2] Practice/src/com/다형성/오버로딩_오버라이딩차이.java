package com.다형성;

// 오버로딩은 new -> 기존에 없는 새로운 메소드를 정의하는 것.
// 오버라이딩은 modify, change -> 상속받은 메소드 내용 변경.
class Parent {
	void ParentM() {}
}

class Child extends Parent {
	void ParentM() {} //오버라이딩
	void ParentM(int i){} //오버로딩
	void ParentM(long l){} //오버로딩
	
	void ChildM() {}
	void ChildM(int i) {} //오버로딩
	// void ChildM() {} > Error 중복정의
}
public class 오버로딩_오버라이딩차이 {
	
	
}