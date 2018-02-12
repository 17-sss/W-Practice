package com.ArrayList;

import java.util.ArrayList;

class ArrayOldVer { // 타입 지정<>  없음
	ArrayList oldver = new ArrayList();
	
	ArrayOldVer() {}
	
	void ArrayOldTest1 () {
		oldver.add("가자미");
		oldver.add("복어");
		oldver.add("문어");
		
		System.out.println(oldver); // -> 안에있는거 다 출력.
		
		for (int i=0; i<oldver.size(); i++) {
			System.out.println("ArrayOldTest1: "+oldver.get(i));
		}
	}
	
	void ArrayOldTest2 () {
		oldver.add(10);
		oldver.add(100);
		oldver.add(1000);
		
		for (int i=0; i<oldver.size(); i++) {
			int x= (int)oldver.get(i);
			/*//이건 오류. add(Object e) 임. 타입 지정된게 없음. 알수 없음.
			int x= oldver.get(i); */			
			System.out.println("ArrayOldTest2: "+x);
		}
	}
	/*void ArrayOldTest3_exception () { //예외처리 테스트 겸..
		oldver.add("예외");
		oldver.add("처리용");
		oldver.add("입니다");
	
		try {
			for (int i=0; i<oldver.size(); i++) {
				String s= oldver.get(i); 			
				System.out.println("ArrayOldTest2: "+s);
			}
		} catch (ExceptionD e) {
			e.printStackTrace();
		}
		
	} */
}
	
/*class ExceptionD extends Exception { //사용자정의 예외 처리
	ExceptionD() {
		super();
	}
	ExceptionD(String message) {
		super(message);
	}
}*/



class ArrayNewVer { // 타입 지정 <> 있음. 
	// <> 여기안에 (Object)타입. (String, Integer 등등.. ), 뒤 <>안에는 생략가능
	ArrayList<String> newver = new ArrayList<>();
	
	ArrayNewVer() {}
	
	void ArrayNewTest1() {
		newver.add("바");
		newver.add("밥");
		newver.add("줘");
		
		System.out.println(newver);
		
		for (int i=0; i<newver.size(); i++) {
			String s = newver.get(i);			
			System.out.println("ArrayNewTest1: "+s);
		}
	}
}



public class ArrayLIst연습_00 {
	public static void main(String[] args) {
		ArrayOldVer Aold = new ArrayOldVer();
		Aold.ArrayOldTest1();
		
		ArrayNewVer Anew = new ArrayNewVer();
		Anew.ArrayNewTest1();
	}

}
