package com.다형성; //생활코딩 (4/6)
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
	//추상메소드 쓸때 void든 string이든 리턴값 쓰기
	public void run() { 
	//public abstract void run() {avg(); sum();} 이런식으로 하면 X
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

public class CalculatorDemo_다형성활용 {
	public static void execute(Cal cal) {
		System.out.println("실행결과");
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
