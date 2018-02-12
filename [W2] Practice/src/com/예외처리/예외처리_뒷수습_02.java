package com.예외처리; //생활코딩
class Div2 {
	int x, y=0;
	
	public void divide(int x, int y) { //메소드 생성자 이용.
		this.x=x;
		this.y=y;

		try {
		System.out.println("======divide(X,Y)======");
		System.out.println("X값: "+this.x);
		System.out.println("Y값: "+this.y);
		System.out.println("(X/Y)나누기 결과값: "+this.x/this.y);
		} catch (Exception e) {
			System.out.println("\n\n e.getMessage()\n"+e.getMessage());
			// getMessage는 가장 간단한 형태의 힌트가 들어있는 정보
			System.out.println("\n\n e.toString()\n"+e.toString());
			// toString는 예외상황에 대한 자세한 정보를 가져올 수 있음.
			System.out.println("\n\n e.PrintStackTrace");
			// printStackTrace는 세부사항 출력 (에러 전부)
			e.printStackTrace();
			// [추가] System.out.println("\n\n e.PrintStackTrace"+e.printStackTrace();); 불가능.
		}
		System.out.println("\nDivide End");
		// ★★★★★★★ 메소드 catch문  실행이 끝나고 나서도 다음 구문 계속해서 실행. 실행이 중단되는게 X
	}

}

public class 예외처리_뒷수습_02 {
	public static void main(String[] args) {
		Div2 D = new Div2();
		D.divide(10, 0);
	}
}
