package com.����ó��;

import java.io.IOException;

class E {
	void throwArithmeticException() { //����ó������ �ʾƵ� ��..? �̻���
		// ����: unchecked Exception �̱⿡. 
		// ���ܵ� �� �θ��߿� RuntimeException�� ������ unchecked. (Error�� unchecked)
		// # ���ܸ� ó�� ���� �ʾƵ� ��.
		throw new ArithmeticException();
	}
	void throwIOException1() { //���1. ����ó��   // (+) ��ó�� ����ó�� ���ϸ� �ȵ�.
		// ����: checked Exception �̱⿡.
		// �θ��� RuntimeException�� ������ checked
		// # �� ����ó�� �ؾ���.
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void throwIOException2() throws IOException { //���2. �Ѱ���
		throw new IOException();
	}
}
public class ����_����������Ȳ_07 {

}
