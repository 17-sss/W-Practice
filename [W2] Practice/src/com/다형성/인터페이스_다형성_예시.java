package com.������;
// static : ��������, Ŭ������
// final : ��������, ����ɼ� ����
interface Program_Student{
	public String Coding();
	// public void String study(); �̷��Դ� �ȵ�
	// public void String(); �̷����ϸ� String�� �޼ҵ� �̸��� �Ǿ����.
}
interface GongSi_Student {
	public String Study();
	//�������̽�) ��� �޼���� public abstract �̾�� �ϸ�, ���� ����
	//public abstract String study();�� ����.
}
	
interface Me {
	//�������̽�) ��� ��������� public static final �̾�� �ϸ�, ���� ����
	final int i=26;
	//public static final int i�� ����.
} 
interface You {
	static int y=27;
	//public static final int y�� ����.
}
class Son implements Me, Program_Student {
	@Override
	public String Coding() {
		for(int i=0; i<5; i++) {
			System.out.println("Coding");
		}
		return "Coding Stop!";
	}
	
}
class Jo implements You, GongSi_Student {
	@Override
	public String Study() {
		for (int i=0; i<5; i++) {
			System.out.println("Study");
		}
		return "Study Stop!";
	}
	
}
public class �������̽�_������_���� {
	public static void main(String[] args) {
		//===================================
		Me m = new Son();
		You y = new Jo();
		//m.Coding(); => �Ұ��� / �޼ҵ� ���� X
		System.out.println(m.i);
		//[static final]������. m.i=26; �Ұ�
		System.out.println(m.i+1);
		//y.Study(); => �Ұ��� / �޼ҵ� ���� X
		System.out.println(y.y);
		//===================================
		
		System.out.println();
		
		//===================================
		Program_Student p = new Son();
		GongSi_Student g = new Jo();
		p.Coding();
		//System.out.println(p.i); => �Ұ��� / ��� ���� X
		g.Study();
		//System.out.println(g.y); => �Ұ��� / ��� ���� X
		
		//===================================
		
		System.out.println();
		
		//===================================
		Son s = new Son();
		Jo j = new Jo();
		s.Coding();
		System.out.println(s.i+"\n");
		j.Study(); 
		System.out.println(j.y);
		//===================================
	}

}
