package com.����ó��; //��Ȱ�ڵ�
import java.util.Scanner;

interface Save{
	public void divide();
	public void divide(int x, int y);
	/*public void plus(int x, int y);
	public void minus(int x, int y);
	public void Gop(int x, int y);*/
}
class Scan {
	Scanner scan = new Scanner(System.in);
}
class N extends Scan implements Save {
	int x,y= 0;
	

	@Override
	public void divide() { //SCAN�̿�
		//����ó�� X
		/*System.out.println("======divide(Scan)======");
		System.out.print("X�� �Է�: ");
		this.x=scan.nextInt();
		System.out.print("Y�� �Է�: ");
		this.y=scan.nextInt();
		
		int div= this.x/this.y;
		System.out.println("(X/Y)������ �����: "+div);*/
		
		// ����ó�� O (��� ������ �˾Ƶα�)
		try { // �õ��Ѵ�. �̷����� �����غ���.
		System.out.println("======divide(Scan)======");
		System.out.print("X�� �Է�: ");
		this.x=scan.nextInt();
		System.out.print("Y�� �Է�: ");
		this.y=scan.nextInt();
		
		int div= this.x/this.y;
		System.out.println("(X/Y)������ �����: "+div);
		} catch (Exception e) { //������ ��´�. ���.
			System.out.println("������ �߻��߽��ϴ�: "+e.getMessage());
		}
	
		
	}

	@Override
	public void divide(int x, int y) { //�޼ҵ� ������ �̿�.
		this.x=x;
		this.y=y;
		
		// ����ó�� X
		System.out.println("======divide(X,Y)======");
		System.out.println("X��: "+this.x);
		System.out.println("Y��: "+this.y);
		System.out.println("(X/Y)������ �����: "+this.x/this.y);
		
		// ����ó�� O (��� ������ �˾Ƶα�)
		/*try { // �õ��Ѵ�. �̷����� �����غ���.
		System.out.println("======divide(X,Y)======");
		System.out.println("X��: "+this.x);
		System.out.println("Y��: "+this.y);
		System.out.println("(X/Y)������ �����: "+this.x/this.y);
		} catch (Exception e) { //������ ��´�. ���.
			System.out.println("������ �߻��߽��ϴ�: "+e.getMessage());
		}*/
	}

	
	
}
public class ����ó��_����1_01 {
	public static void main(String[] args) {
		N n = new N();
		n.divide();
		System.out.println();
		n.divide(10, 0);
		
	}

}
