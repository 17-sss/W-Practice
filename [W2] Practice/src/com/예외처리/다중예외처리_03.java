package com.����ó��; //��Ȱ�ڵ�
class A2 {
	private int[] arr = new int[3];
	
	A2() { // ������
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void AC2(int first, int second) {
		try {
		System.out.println(arr[first]/arr[second]);
		}
		// ���� Catch=> if�� ���. ù��°�� �ƴϰ� �ι�°�� �ƴϸ� ����°?
		catch (ArithmeticException e) {
			System.out.println("����: ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����: ArrayIndexOutOfBoundsException");
		}
		//���� �������� ����ó��
		catch (Exception e) { // �̰Ŵ� ������ �ø��� �ȵ�.. �ø��� �ؿ� ���� ���� �Ұ�.  
			System.out.println("����: Exception");
		}
		//���ܿ��ο� ������� ����Ǵ� finally --> ���� ������ ����
		finally {
			System.out.println("finally");
			/*ex) �����ͺ��̽� ������ �ִ�. �׸��� �ڹ� ���ø����̼�(n��)�� �ִ�.
			 	�� �ڹ� �� ������ �����͸� ������ �������� �Ѵ�.
			 	������  ������ �޾Ƶ��ϼ� �ִ� ������ �����Ǿ� �ִ�(100��)
			 	100���� ���� �ʰ� �����־���Ѵ�. �̷��� finally�� ����.
			 	
			 	���������� ������ �߻������� �����ͺ��̽� ������ ���ø����̼��� ��� ���� �������� �ִ�
			 	�̰� �����̵Ǹ� 100���� �Ѿ�������̴�. �׷��Ƿ� finally��� �ϴ� ���� ���ܰ� �߻��ϵ� ���ϵ� 
			 	�ݵ�� ó���ؾ��� ���� ����ǰ� ����°��̴�.
			 	
			 
			 */
		}
	}
}
public class ���߿���ó��_03 {
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.AC2(10, 0);
		a2.AC2(1, 0);
		a2.AC2(2, 1);
	}
}
