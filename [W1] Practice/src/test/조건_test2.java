package test;
import java.util.Scanner;

public class 조건_test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int s = scan.nextInt();
		if (s >= 50) {
			System.out.println("합격 입니다");
		} else if (s < 50) {
			System.out.println("불합격 입니다");
		}
		System.out.print("숫자를 입력하세요: ");
		int x = scan.nextInt();
		if (x%4==0 && x%3!=0)
			System.out.println("참");
			else
				System.out.println("거짓");
		
	}

}

