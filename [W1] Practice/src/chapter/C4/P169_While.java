package chapter.C4;

public class P169_While {

	public static void main(String[] args) {
		int i = 0;
		while (i==0) { // 0�� ���ƾ����� ���� 
			i--; // �̰ž����� ��� 0�̶� ���� �ݺ�.
			//i++; ���� ������ ��� 0...
			System.out.println("i= "+i);
			
			
		}
		System.out.println("=========");
		
		i = 5;
		while (i!=0) { // 0�̵ɶ����� ����
			i--;
			System.out.println("i= "+i);
		}
		
	

	}

}
