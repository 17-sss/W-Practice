package com.예외처리; //생활코딩
// **** 여러가지 오류가 있는 예제. 예외처리 부분만 보기.
import java.io.*;

// 예외사슬 ==> B ▷  C ▷  예외처리_throws ▷ main(일반사용_예외처리X 출력)
class B  {
	void run() throws FileNotFoundException, IOException { 
		// throws FileNotFoundException, IOException 이렇게 쓰면 
		// Class B의 메소드를 쓰는 C에서 처리해야함. (넘겨줌)
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("[예외처리]예외던지기.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}
class C  {
	void run() throws FileNotFoundException, IOException {
		// 또 넘겨줌. 메인으로 책임 넘어감.
		B b = new B();
		b.run();
	}
}
//FileNotFoundException의 조상은 IOException
//이경우 IOException만 써도 됨. 더나아가 Exception
public class 예외사슬_thorws_05 {
/*
	Catch는 자기가 처리하는 것이고 throws는 넘겨주는 것.
 */
	public static void main(String[] args) {
		// 여기서 처리
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
