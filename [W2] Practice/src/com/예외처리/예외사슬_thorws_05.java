package com.����ó��; //��Ȱ�ڵ�
// **** �������� ������ �ִ� ����. ����ó�� �κи� ����.
import java.io.*;

// ���ܻ罽 ==> B ��  C ��  ����ó��_throws �� main(�Ϲݻ��_����ó��X ���)
class B  {
	void run() throws FileNotFoundException, IOException { 
		// throws FileNotFoundException, IOException �̷��� ���� 
		// Class B�� �޼ҵ带 ���� C���� ó���ؾ���. (�Ѱ���)
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("[����ó��]���ܴ�����.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}
class C  {
	void run() throws FileNotFoundException, IOException {
		// �� �Ѱ���. �������� å�� �Ѿ.
		B b = new B();
		b.run();
	}
}
//FileNotFoundException�� ������ IOException
//�̰�� IOException�� �ᵵ ��. �����ư� Exception
public class ���ܻ罽_thorws_05 {
/*
	Catch�� �ڱⰡ ó���ϴ� ���̰� throws�� �Ѱ��ִ� ��.
 */
	public static void main(String[] args) {
		// ���⼭ ó��
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
