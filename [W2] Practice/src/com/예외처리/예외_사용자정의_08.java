package com.예외처리;
/* checked, unchecked 설명
 * + 예외_여러가지상황.java도 참고
 	1. checked
	- API 쪽에서 예외를 던졌을 때  API 사용자 쪽에서 예외 상황을 복구 할 수 있다면 checked 예외를 사용
	- checked 예외는 사용자에게 문제를 해결할 기회를 주는 것이면서 예외처리를 강제하는 것
	# checked 예외를 너무 자주 사용하면 API 사용자를 몹시 힘들게 할 수 있기 때문에 적정선을 찾는 것이 중요
	
	2. unchecked
	- 사용자가 API의 사용방법을 어겨서 발생하는 문제거나 예외 상황이 
	    이미 발생한 시점에서 그냥 프로그램을 종료하는 것이 덜 위험 할 때 unchecked를 사용
	ex] arr = new int[3]일때. 사용자가 arr[10]을 선택하게 되면 에러. [0][1][2]뿐 이기에.
		이럴땐 unchecked 예외로 바로 끝내는게 답.
 */

// 사용자 정의 예외 만들기 예시.

//class DivideException extends RuntimeException { //unchecked 
// class DivideException extends ArithmeticException { //unchecked
class DivideException extends Exception { //checked
	DivideException() {
		super();
	}
	DivideException(String message) { 
		//getMessage할때 리턴값 나오게 하려고 생성자 구현 
		super(message);
	}
}

class Calculator1 {
	int left, right;
	public void setOprands(int left, int right) {
		this.left=left;
		this.right=right;		
	}
	public void divide() {
		/*// checked일 경우.. (1) - 넘겨주기
		public void divide() throws DivideException {*/
		
		// checked일 경우.. (2) - 직접 처리
		try {
			if (right == 0) {
			throw new DivideException("0으로 나눌 수 없습니다.");
			}
			System.out.print(this.left/this.right);
		} catch (DivideException e) {
			e.printStackTrace();
//			System.out.println(e.toString());
			
		}

		/*// unchecked일 경우...
		 * if (right == 0) {
			throw new DivideException("0으로 나눌 수 없습니다.");
		}
		System.out.print(this.left/this.right);
		*/
		
		
	}
}
public class 예외_사용자정의_08 {
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		c1.setOprands(10, 0);
		c1.divide();
		/*//checked일 경우.. (1) - 넘겨주기  
		  try {
			c1.divide();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
		}*/
	}
	
}
