package test;
import java.util.Scanner;

public class ����_test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int s = scan.nextInt();
		if (s >= 50) {
			System.out.println("�հ� �Դϴ�");
		} else if (s < 50) {
			System.out.println("���հ� �Դϴ�");
		}
		System.out.print("���ڸ� �Է��ϼ���: ");
		int x = scan.nextInt();
		if (x%4==0 && x%3!=0)
			System.out.println("��");
			else
				System.out.println("����");
		
	}

}

