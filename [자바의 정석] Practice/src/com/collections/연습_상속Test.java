package com.collections;
//a1=o1; a1=b1; o1=a1;  b1=o1; �׽�Ʈ�غ���. o�� object(100����), a�� AaaŬ����(200����), b�� BbbŬ����(300����) (��Ӱ���)
class Aaa {
	
}
class Bbb {
	
}
public class ����_���Test {
	public static void main(String[] args) {
		Object object = new Object();
		Aaa a1 = new Aaa();
		Bbb b1 = new Bbb();
		
//		a1=object;
//		b1=object;
		//a1 or b1: �ڽ�, object: �θ�.
		//object�� 100������ �ϸ�. a1 or b1�� 200, 300����.
		//�ڽ�(Aaa)���� �θ�(Object)�� �� �� �� ����. ===> a1=object;
		
		
		a1=(Aaa)object;	// ���࿡��
		b1=(Bbb)object; // ���࿡��

		//a1=b1;
		//Aaa�� Bbb�� �ƹ��� ���谡 ���⿡ �Ұ�.
		
		object=a1;
		//�θ� (Object)���� �ڽ�(Aaa)�� �� �� �� �ִ�! ==> object=a1;
	}
}
