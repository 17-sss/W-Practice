package com.������;

// �����ε��� new -> ������ ���� ���ο� �޼ҵ带 �����ϴ� ��.
// �������̵��� modify, change -> ��ӹ��� �޼ҵ� ���� ����.
class Parent {
	void ParentM() {}
}

class Child extends Parent {
	void ParentM() {} //�������̵�
	void ParentM(int i){} //�����ε�
	void ParentM(long l){} //�����ε�
	
	void ChildM() {}
	void ChildM(int i) {} //�����ε�
	// void ChildM() {} > Error �ߺ�����
}
public class �����ε�_�������̵����� {
	
	
}