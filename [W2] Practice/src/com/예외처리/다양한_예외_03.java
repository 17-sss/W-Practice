package com.예외처리; //생활코딩
// 다양한 예외처리 및 사용예시
// 예외 상황에 맞게 사용하기

class A {
	private int[] arr = new int[3];
	
	A() { // 생성자
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void AC(int first, int second) {
		try {
		System.out.println(arr[first]/arr[second]);
		} catch (Exception e) {
			System.out.println("\n\n e.getMessage()"+e.getMessage());
			/*System.out.println("\n\n e.toString()"+e.toString());*/
			/*System.out.println("\n\n e.PrintStackTrace");
			e.printStackTrace();*/
		}
	}
}
public class 다양한_예외_03 {
	public static void main(String[] args) {
		A a = new A();
		//예외 처리가 없다면, 두 오류가 발생한다.
		a.AC(1, 0); 
		/*
		  예외처리 없을때 >> java.lang.ArithmeticException /by zero
	 					0으로 나누려 했기에 발생.
		  예외처리 있을때 >>
		  # e.getMessage()
		  		/ by zero
		  #  e.toString()
		   		java.lang.ArithmeticException: / by zero
		  #  e.PrintStackTrace
				java.lang.ArithmeticException: / by zero
				
		 */ 
		
		a.AC(10,0);
		/*
		  예외처리 없을때 >> java.lang.ArrayIndexOutOfBoundsException
		  				Array에 [10]이라는 순서(값)는 없기에 발생
		  예외처리 있을때 >> 
		  # e.getMessage()
		  		10
		  # e.toString()
		  		java.lang.ArrayIndexOutOfBoundsException:
		  # e.PrintStackTrace
				at com.예외처리.A.AC(다양한_예외.java:12)
				at com.예외처리.다양한_예외.main(다양한_예외.java:25)
				java.lang.ArrayIndexOutOfBoundsException: 10
				at com.예외처리.A.AC(다양한_예외.java:12)
				at com.예외처리.다양한_예외.main(다양한_예외.java:32)
		 */
		
		
	}

}
