package com.memo;

import java.util.ArrayList;

/*
 	☆  equals tostring compareto 이거만 알아도 자바함.
 	
	(??????)인스턴스 변수? 지역변수?
	
	스태틱은 바로불러올수 있음.
	
	자바의 4가지 => 클래스명 생성자명 메소드명 변수명
	
	- (?)클래스 변수는 앞 타입 => 
	- 메소드는 리턴타입이 있고 파라미터(매게변수) 존재.
	- 스태틱 변수 를 찾아갈때 앞 클래스명
	- 생성자 = 해당되는 클래스에 틀(메모리)을 저장해놓고 그주소를 리턴할때 쓰는 메소드
	- 변수쓰려면 = 그 클래스를 찾던지 그 클래스가 저장되있는 인스턴스를 찾던지.
	
	- jar는 클래스 파일 묶음
	
	* 쓰레드란.
		팝업으로 막띄우고 음악을 듣는다하면 멀티 프로세스. 
	
	예) 쓰레드_(싱크로나이즈)
	쓰레드의 가장위험한부분은 통장에 50억들어있다하면 통장을 실행하는 프로그램이있다하면 주인은 뽑아야지하며 바라보고
	있는데. 다른 사람이 동시접속해서 먼저 뽑아감. 이런걸 막는게 싱크로나이즈.
	싱크로나이즈를 신경안쓸때 대신 쓸수있는게 Vector
	Vector는 쓰레드의 취약성을 대신할수 있다. 유용함.
	
	// __LinkedList 정의 찾아보기.
	// a1=o1; a1=b1; o1=a1;  b1=o1; 테스트해보기. o는 object(100번지), a는 Aaa클래스(200번지), b는 Bbb클래스(300번지) (상속관련)
	
 */
class Test_180123 {
	ArrayList<Integer> list1 = new ArrayList<>();
	
	int over (int a, int b)  { //int over (int a, int b <- 이괄호가 메소드 파라미터)
		int c = a*b;
		System.out.println(c*7+"만원");
		return c;
	}
}
public class 메모_180123 {
	public static void main(String[] args) {
		Test_180123 t = new Test_180123();
		t.over(400, 12);
		System.out.println("테스트");
		//system-클래스. out-스태틱변수. 메소드-println
	}
	
}


