package com.예외처리;
class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		if (left == 0) {
			throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다.");
		}
		this.left=left;
		this.right=right;
	}
	public void divide() {
		if (right == 0) {
			// 이게 더 좋음 (아마)
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		try {
			System.out.print("계산결과는");
			System.out.print(this.left/this.right);
			System.out.print("입니다.");
		} catch (Exception e) {
				System.out.println("\n\n e.getMessage()\n"+e.getMessage());
				System.out.println("\n\n e.toString()\n"+e.toString());
				System.out.println("\n\n e.PrintStackTrace");
				e.printStackTrace();
		}
	}
}
public class 예외처리_계산기2_06 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
//		c1.setOprands(0, 10);
		c1.setOprands(10, 0);
		
		
		try {
			c1.divide();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}
