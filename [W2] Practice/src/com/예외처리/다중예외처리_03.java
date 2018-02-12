package com.예외처리; //생활코딩
class A2 {
	private int[] arr = new int[3];
	
	A2() { // 생성자
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void AC2(int first, int second) {
		try {
		System.out.println(arr[first]/arr[second]);
		}
		// 다중 Catch=> if문 비슷. 첫번째도 아니고 두번째도 아니면 세번째?
		catch (ArithmeticException e) {
			System.out.println("에러: ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러: ArrayIndexOutOfBoundsException");
		}
		//제일 포괄적인 예외처리
		catch (Exception e) { // 이거는 맨위에 올리면 안됨.. 올리면 밑에 것이 실행 불가.  
			System.out.println("에러: Exception");
		}
		//예외여부와 관계없이 실행되는 finally --> 거의 무조건 실행
		finally {
			System.out.println("finally");
			/*ex) 데이터베이스 서버가 있다. 그리고 자바 어플리케이션(n개)이 있다.
			 	각 자바 는 서버에 데이터를 보내고 가져오고 한다.
			 	서버는  접속을 받아들일수 있는 갯수가 한정되어 있다(100개)
			 	100개가 넘지 않게 끊어주어야한다. 이럴떄 finally를 쓴다.
			 	
			 	끊지않으면 에러가 발생했을때 데이터베이스 서버가 애플리케이션을 계속 물고 있을수도 있다
			 	이게 축적이되면 100개가 넘어버릴것이다. 그러므로 finally라고 하는 것은 예외가 발생하든 안하든 
			 	반드시 처리해야할 것을 실행되게 만드는것이다.
			 	
			 
			 */
		}
	}
}
public class 다중예외처리_03 {
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.AC2(10, 0);
		a2.AC2(1, 0);
		a2.AC2(2, 1);
	}
}
