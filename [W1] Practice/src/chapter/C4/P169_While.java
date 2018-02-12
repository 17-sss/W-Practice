package chapter.C4;

public class P169_While {

	public static void main(String[] args) {
		int i = 0;
		while (i==0) { // 0과 같아야지만 실행 
			i--; // 이거없으면 계속 0이라 무한 반복.
			//i++; 까지 있으면 계속 0...
			System.out.println("i= "+i);
			
			
		}
		System.out.println("=========");
		
		i = 5;
		while (i!=0) { // 0이될때까지 실행
			i--;
			System.out.println("i= "+i);
		}
		
	

	}

}
