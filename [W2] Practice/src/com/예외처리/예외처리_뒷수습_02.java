package com.����ó��; //��Ȱ�ڵ�
class Div2 {
	int x, y=0;
	
	public void divide(int x, int y) { //�޼ҵ� ������ �̿�.
		this.x=x;
		this.y=y;

		try {
		System.out.println("======divide(X,Y)======");
		System.out.println("X��: "+this.x);
		System.out.println("Y��: "+this.y);
		System.out.println("(X/Y)������ �����: "+this.x/this.y);
		} catch (Exception e) {
			System.out.println("\n\n e.getMessage()\n"+e.getMessage());
			// getMessage�� ���� ������ ������ ��Ʈ�� ����ִ� ����
			System.out.println("\n\n e.toString()\n"+e.toString());
			// toString�� ���ܻ�Ȳ�� ���� �ڼ��� ������ ������ �� ����.
			System.out.println("\n\n e.PrintStackTrace");
			// printStackTrace�� ���λ��� ��� (���� ����)
			e.printStackTrace();
			// [�߰�] System.out.println("\n\n e.PrintStackTrace"+e.printStackTrace();); �Ұ���.
		}
		System.out.println("\nDivide End");
		// �ڡڡڡڡڡڡ� �޼ҵ� catch��  ������ ������ ������ ���� ���� ����ؼ� ����. ������ �ߴܵǴ°� X
	}

}

public class ����ó��_�޼���_02 {
	public static void main(String[] args) {
		Div2 D = new Div2();
		D.divide(10, 0);
	}
}
