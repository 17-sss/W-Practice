package com.������; //��Ȱ�ڵ� (4/6)
abstract class Cal {
	int x,y;
	
	public void num (int x, int y) {
		this.x=x;
		this.y=y;
	}
	int sum_() {
		return this.x+this.y;
	}
	public abstract void sum();
	public abstract void avg(); 
	//�߻�޼ҵ� ���� void�� string�̵� ���ϰ� ����
	public void run() { 
	//public abstract void run() {avg(); sum();} �̷������� �ϸ� X
		avg();
		sum();
	}
}
class Cal_P extends Cal {
	@Override
	public void sum() {
		System.out.println("sum: "+sum_());
	}

	@Override
	public void avg() {
		System.out.println("avg: "+sum_()/2);
		
	}
}
class Cal_M extends Cal {

	@Override
	public void sum() {
		System.out.println("Sum_2: "+sum_());
		
	}

	@Override
	public void avg() {
		System.out.println("Avg_2: "+sum_()/2);
		
	}
	
}

public class CalculatorDemo_������Ȱ�� {
	public static void execute(Cal cal) {
		System.out.println("������");
		cal.run();
	}
	public static void main(String[] args) {
		Cal c1 = new Cal_P();
		c1.num(10, 20);
		execute(c1);
		
		Cal c2 = new Cal_M();
		c2.num(20, 30);
		execute(c2);
	}
}
