package com.����ó��; //��Ȱ�ڵ�
// �پ��� ����ó�� �� ��뿹��
// ���� ��Ȳ�� �°� ����ϱ�

class A {
	private int[] arr = new int[3];
	
	A() { // ������
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
public class �پ���_����_03 {
	public static void main(String[] args) {
		A a = new A();
		//���� ó���� ���ٸ�, �� ������ �߻��Ѵ�.
		a.AC(1, 0); 
		/*
		  ����ó�� ������ >> java.lang.ArithmeticException /by zero
	 					0���� ������ �߱⿡ �߻�.
		  ����ó�� ������ >>
		  # e.getMessage()
		  		/ by zero
		  #  e.toString()
		   		java.lang.ArithmeticException: / by zero
		  #  e.PrintStackTrace
				java.lang.ArithmeticException: / by zero
				
		 */ 
		
		a.AC(10,0);
		/*
		  ����ó�� ������ >> java.lang.ArrayIndexOutOfBoundsException
		  				Array�� [10]�̶�� ����(��)�� ���⿡ �߻�
		  ����ó�� ������ >> 
		  # e.getMessage()
		  		10
		  # e.toString()
		  		java.lang.ArrayIndexOutOfBoundsException:
		  # e.PrintStackTrace
				at com.����ó��.A.AC(�پ���_����.java:12)
				at com.����ó��.�پ���_����.main(�پ���_����.java:25)
				java.lang.ArrayIndexOutOfBoundsException: 10
				at com.����ó��.A.AC(�پ���_����.java:12)
				at com.����ó��.�پ���_����.main(�پ���_����.java:32)
		 */
		
		
	}

}
