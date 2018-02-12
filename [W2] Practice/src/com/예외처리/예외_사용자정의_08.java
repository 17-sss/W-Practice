package com.����ó��;
/* checked, unchecked ����
 * + ����_����������Ȳ.java�� ����
 	1. checked
	- API �ʿ��� ���ܸ� ������ ��  API ����� �ʿ��� ���� ��Ȳ�� ���� �� �� �ִٸ� checked ���ܸ� ���
	- checked ���ܴ� ����ڿ��� ������ �ذ��� ��ȸ�� �ִ� ���̸鼭 ����ó���� �����ϴ� ��
	# checked ���ܸ� �ʹ� ���� ����ϸ� API ����ڸ� ���� ����� �� �� �ֱ� ������ �������� ã�� ���� �߿�
	
	2. unchecked
	- ����ڰ� API�� ������� ��ܼ� �߻��ϴ� �����ų� ���� ��Ȳ�� 
	    �̹� �߻��� �������� �׳� ���α׷��� �����ϴ� ���� �� ���� �� �� unchecked�� ���
	ex] arr = new int[3]�϶�. ����ڰ� arr[10]�� �����ϰ� �Ǹ� ����. [0][1][2]�� �̱⿡.
		�̷��� unchecked ���ܷ� �ٷ� �����°� ��.
 */

// ����� ���� ���� ����� ����.

//class DivideException extends RuntimeException { //unchecked 
// class DivideException extends ArithmeticException { //unchecked
class DivideException extends Exception { //checked
	DivideException() {
		super();
	}
	DivideException(String message) { 
		//getMessage�Ҷ� ���ϰ� ������ �Ϸ��� ������ ���� 
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
		/*// checked�� ���.. (1) - �Ѱ��ֱ�
		public void divide() throws DivideException {*/
		
		// checked�� ���.. (2) - ���� ó��
		try {
			if (right == 0) {
			throw new DivideException("0���� ���� �� �����ϴ�.");
			}
			System.out.print(this.left/this.right);
		} catch (DivideException e) {
			e.printStackTrace();
//			System.out.println(e.toString());
			
		}

		/*// unchecked�� ���...
		 * if (right == 0) {
			throw new DivideException("0���� ���� �� �����ϴ�.");
		}
		System.out.print(this.left/this.right);
		*/
		
		
	}
}
public class ����_���������_08 {
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		c1.setOprands(10, 0);
		c1.divide();
		/*//checked�� ���.. (1) - �Ѱ��ֱ�  
		  try {
			c1.divide();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
		}*/
	}
	
}
