package com.����ó��;
class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		if (left == 0) {
			throw new IllegalArgumentException("�ι�° ���ڴ� 0�� ������� �ʽ��ϴ�.");
		}
		this.left=left;
		this.right=right;
	}
	public void divide() {
		if (right == 0) {
			// �̰� �� ���� (�Ƹ�)
			throw new ArithmeticException("0���� ���� �� �����ϴ�.");
		}
		try {
			System.out.print("�������");
			System.out.print(this.left/this.right);
			System.out.print("�Դϴ�.");
		} catch (Exception e) {
				System.out.println("\n\n e.getMessage()\n"+e.getMessage());
				System.out.println("\n\n e.toString()\n"+e.toString());
				System.out.println("\n\n e.PrintStackTrace");
				e.printStackTrace();
		}
	}
}
public class ����ó��_����2_06 {
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
