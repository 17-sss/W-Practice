package com.W2_Practice;

import java.util.Scanner;

class normal {
	int x,y=0;
	
	public normal() {}
	public normal(int x, int y) {
		this.x=x;
		this.y=y;
	}
	void div () {
		try {
			System.out.println("첫번째 값: "+this.x);
			System.out.println("두번째 값: "+this.y);
			if (x == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다");
			}
			System.out.println(this.x/this.y);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

class scanner {
	Scanner scan = new Scanner(System.in);
	int x, y=0;
	scanner() {}
	
	void div() {
		try {
			System.out.print("첫번째 값 입력: ");
			x = scan.nextInt();
			System.out.print("두번째 값 입력: ");
			y = scan.nextInt();
			
			int divt= this.x/this.y;
			System.out.println("결과값: "+divt);
		} catch (Exception e) {
			System.out.print("\t\tPrintStackTrace: ");
			e.printStackTrace();
		}
		
	}
}
public class D180110_연습_예외처리 {
	public static void main(String[] args) {
		normal n = new normal(0,10);
		n.div();
		
		scanner s = new scanner();
		s.div();
	}

}
