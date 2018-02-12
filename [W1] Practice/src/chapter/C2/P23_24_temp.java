package chapter.C2;

public class P23_24_temp {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0;
		System.out.println("x: " + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("X: " + x + " y:" +y);

	}

}
