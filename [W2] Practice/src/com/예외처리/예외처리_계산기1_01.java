package com.예외처리; //생활코딩
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
	public void divide() { //SCAN이용
		//예외처리 X
		/*System.out.println("======divide(Scan)======");
		System.out.print("X값 입력: ");
		this.x=scan.nextInt();
		System.out.print("Y값 입력: ");
		this.y=scan.nextInt();
		
		int div= this.x/this.y;
		System.out.println("(X/Y)나누기 결과값: "+div);*/
		
		// 예외처리 O (어떻게 쓰는지 알아두기)
		try { // 시도한다. 이로직을 실행해본다.
		System.out.println("======divide(Scan)======");
		System.out.print("X값 입력: ");
		this.x=scan.nextInt();
		System.out.print("Y값 입력: ");
		this.y=scan.nextInt();
		
		int div= this.x/this.y;
		System.out.println("(X/Y)나누기 결과값: "+div);
		} catch (Exception e) { //오류를 잡는다. 출력.
			System.out.println("오류가 발생했습니다: "+e.getMessage());
		}
	
		
	}

	@Override
	public void divide(int x, int y) { //메소드 생성자 이용.
		this.x=x;
		this.y=y;
		
		// 예외처리 X
		System.out.println("======divide(X,Y)======");
		System.out.println("X값: "+this.x);
		System.out.println("Y값: "+this.y);
		System.out.println("(X/Y)나누기 결과값: "+this.x/this.y);
		
		// 예외처리 O (어떻게 쓰는지 알아두기)
		/*try { // 시도한다. 이로직을 실행해본다.
		System.out.println("======divide(X,Y)======");
		System.out.println("X값: "+this.x);
		System.out.println("Y값: "+this.y);
		System.out.println("(X/Y)나누기 결과값: "+this.x/this.y);
		} catch (Exception e) { //오류를 잡는다. 출력.
			System.out.println("오류가 발생했습니다: "+e.getMessage());
		}*/
	}

	
	
}
public class 예외처리_계산기1_01 {
	public static void main(String[] args) {
		N n = new N();
		n.divide();
		System.out.println();
		n.divide(10, 0);
		
	}

}
