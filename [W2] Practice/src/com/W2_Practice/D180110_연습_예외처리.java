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
			System.out.println("ù��° ��: "+this.x);
			System.out.println("�ι�° ��: "+this.y);
			if (x == 0) {
				throw new ArithmeticException("0���� ���� �� �����ϴ�");
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
			System.out.print("ù��° �� �Է�: ");
			x = scan.nextInt();
			System.out.print("�ι�° �� �Է�: ");
			y = scan.nextInt();
			
			int divt= this.x/this.y;
			System.out.println("�����: "+divt);
		} catch (Exception e) {
			System.out.print("\t\tPrintStackTrace: ");
			e.printStackTrace();
		}
		
	}
}
public class D180110_����_����ó�� {
	public static void main(String[] args) {
		normal n = new normal(0,10);
		n.div();
		
		scanner s = new scanner();
		s.div();
	}

}
