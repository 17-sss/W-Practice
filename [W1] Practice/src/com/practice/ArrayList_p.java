package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayTest {
	Scanner scan = new Scanner(System.in);
	ArrayList<String> a1 = new ArrayList<>();
	
	// �⺻ ArrayList �׽�Ʈ
	public void ArrayTest1() {
		
		
		a1.add("��1");	a1.add("��2");
		a1.add("��3");	a1.add("��4");
		System.out.println(a1);
		// [��1, ��2, ��3, ��4]
		
		a1.remove(0);
		System.out.println(a1);
		// [��2, ��3, ��4]
		
		a1.add(0, "��1");
		System.out.println(a1);
		// [��1, ��2, ��3, ��4]
		
		a1.set(0, "��11");
		System.out.println(a1);
		// [��11, ��2, ��3, ��4]
		
		System.out.println(a1.get(0));
		// ��11
		
		a1.clear();
		System.out.println("��_a1�� ���� "+a1+"�Դϴ�.");
		// ��_a1�� ���� []�Դϴ�.
		
		a1.add("�Ź�1");	a1.add("�Ź�2");
		System.out.println(a1);
		// [�Ź�1, �Ź�2]
		
		a1.removeAll(a1);
		System.out.println("�Ź�_a1�� ���� "+a1+"�Դϴ�.");
		// �Ź�_a1�� ���� []�Դϴ�.
	}
	
	// ArrayList �迭 �� �׽�Ʈ
	public void ArrayTest2() {
		a1.add("1");
		a1.add("2��");
		a1.add("3��");
		a1.add("4");
		
		System.out.print("�� �� �Է�: ");
		String ser = scan.next();
		for(int i=0; i<a1.size(); i++) {
			if (a1.get(i).equals(ser)) {
				System.out.println(a1.get(i));
			} /*else {
				a1.removeAll(a1);
				System.out.println("d");
				
			}*/
			/*
				System.out.print("�� �� �Է�: ");
		//		for(int i=0; i<a1.size(); i++) {
				while(scan.hasNextLine()) {
					String ser = scan.next();
				if (a1.contains(ser)) {
						System.out.println("�����: "+a1.get(a1.indexOf(ser)));
					} else {
						System.out.println("�Է� ���� �����ϴ�.");
					}
				System.out.print("�� �� �Է�: ");
			
		}
			 */
			
		}
		
	}
}
public class ArrayList_p {
	
	public static void main(String[] args) {
		ArrayTest t = new ArrayTest();
		t.ArrayTest1();
		System.out.println("======================");
		t.ArrayTest2();
		

		
	}
}
