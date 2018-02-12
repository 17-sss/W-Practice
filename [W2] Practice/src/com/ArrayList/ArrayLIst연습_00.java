package com.ArrayList;

import java.util.ArrayList;

class ArrayOldVer { // Ÿ�� ����<>  ����
	ArrayList oldver = new ArrayList();
	
	ArrayOldVer() {}
	
	void ArrayOldTest1 () {
		oldver.add("���ڹ�");
		oldver.add("����");
		oldver.add("����");
		
		System.out.println(oldver); // -> �ȿ��ִ°� �� ���.
		
		for (int i=0; i<oldver.size(); i++) {
			System.out.println("ArrayOldTest1: "+oldver.get(i));
		}
	}
	
	void ArrayOldTest2 () {
		oldver.add(10);
		oldver.add(100);
		oldver.add(1000);
		
		for (int i=0; i<oldver.size(); i++) {
			int x= (int)oldver.get(i);
			/*//�̰� ����. add(Object e) ��. Ÿ�� �����Ȱ� ����. �˼� ����.
			int x= oldver.get(i); */			
			System.out.println("ArrayOldTest2: "+x);
		}
	}
	/*void ArrayOldTest3_exception () { //����ó�� �׽�Ʈ ��..
		oldver.add("����");
		oldver.add("ó����");
		oldver.add("�Դϴ�");
	
		try {
			for (int i=0; i<oldver.size(); i++) {
				String s= oldver.get(i); 			
				System.out.println("ArrayOldTest2: "+s);
			}
		} catch (ExceptionD e) {
			e.printStackTrace();
		}
		
	} */
}
	
/*class ExceptionD extends Exception { //��������� ���� ó��
	ExceptionD() {
		super();
	}
	ExceptionD(String message) {
		super(message);
	}
}*/



class ArrayNewVer { // Ÿ�� ���� <> ����. 
	// <> ����ȿ� (Object)Ÿ��. (String, Integer ���.. ), �� <>�ȿ��� ��������
	ArrayList<String> newver = new ArrayList<>();
	
	ArrayNewVer() {}
	
	void ArrayNewTest1() {
		newver.add("��");
		newver.add("��");
		newver.add("��");
		
		System.out.println(newver);
		
		for (int i=0; i<newver.size(); i++) {
			String s = newver.get(i);			
			System.out.println("ArrayNewTest1: "+s);
		}
	}
}



public class ArrayLIst����_00 {
	public static void main(String[] args) {
		ArrayOldVer Aold = new ArrayOldVer();
		Aold.ArrayOldTest1();
		
		ArrayNewVer Anew = new ArrayNewVer();
		Anew.ArrayNewTest1();
	}

}
