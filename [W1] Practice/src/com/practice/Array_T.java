package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_T {
	Scanner scan = new Scanner(System.in);
	ArrayList<Object> oo = new ArrayList<>();
	ArrayList<String> as = new ArrayList<>();
	ArrayList<Integer> ai = new ArrayList<>();
	
	// Array������ ������
	String ps="";
	int pi=0;
	

	public Array_T() {}
	
	// �߰� �׽�Ʈ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void add1() {
		as.add("��1");
		ai.add(1000);
		as.add("��2");
		ai.add(1020);
		
		oo.add(as);
		oo.add(ai);
		
		for (int i=0; i<oo.size(); i++) {
			System.out.println(oo.get(i));
		}
	}
	public void add2() {
		as.add("��");
		as.add("��");
		ai.add(1234);
		ai.add(5678);
		
		for (int i=0; i<as.size(); i++) {
			System.out.println("�̸�: "+as.get(i)+"\t\t����(?): "+ai.get(i));
		}
	}
	public void add3() {
		System.out.print("[�߰�] �̸� �Է�: ");
		ps = scan.next();
		as.add(ps);
		System.out.print("[�߰�] ���� �Է�: ");
		pi = scan.nextInt();
		ai.add(pi);
		
		for (int i=0; i<as.size(); i++) {
			System.out.println("�̸�: "+as.get(i)+"\t\t����(?): "+ai.get(i));
		}
		
	}
	// ���� �׽�Ʈ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void set1() {
		as.set(0, "��");
		ai.set(0, 9999);
		
		for (int i=0; i<as.size(); i++) {
			System.out.println("�̸�: "+as.get(i)+"\t\t����(?): "+ai.get(i));
			
		}
	}
	public void set2() {
		System.out.print("[����_�̸�] ��ġ �Է� (����): ");
		int si = scan.nextInt();
		System.out.print("[����_�̸�] �̸� �Է�: ");
		ps = scan.next();
		as.set(si, ps);
		
		System.out.print("[����_����] ��ġ �Է� (����): ");
		int ss = scan.nextInt();
		System.out.print("[����_����] ���� �Է�: ");
		pi = scan.nextInt();
		ai.set(ss, pi);
		
		for (int i=0; i<as.size(); i++) {
			System.out.println("�̸�: "+as.get(i)+"\t\t����(?): "+ai.get(i));
			
		}	
	}
	// ���� �׽�Ʈ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void remove1() {
		as.remove(0);
		ai.remove(0);
		
		for (int i=0; i<as.size(); i++) {
			System.out.println("�̸�: "+as.get(i)+"\t\t����(?): "+ai.get(i));
		}
	}
	public void remove2() {
		// *����* �����ҋ� �� �޼ҵ� ArrayList �߰� �Ǿ��ִ� ������ 0�� �Է��ϸ� ���� 0��° ����.
		System.out.print("������ ��ȣ�� �Է��ϼ���: ");
		pi=scan.nextInt();
		
		for(int i=0; i<as.size(); i++) {
			as.remove(pi);
			ai.remove(pi);
			System.out.println("�̸�: "+as.get(i)+"\t\t����(?): "+ai.get(i));
		}
	}
	// ã�� �׽�Ʈ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void get1() {
		System.out.print("[ã��] ã�� ������ �Է��ϼ���(����): ");
		pi = scan.nextInt();
		
		System.out.println("�̸�: "+as.get(pi)+"\t\t����(?): "+ai.get(pi));
		
		/*for (int i=0; i<as.size(); i++) {
			System.out.println("�̸�: "+as.get(pi)+"\t\t����(?): "+ai.get(pi));
		}*/
	}
	

	
	// ============================================
	public static void main(String[] args) {
		Array_T AA = new Array_T();
		AA.add1();
		System.out.println("=============================");
		AA.add2();
		System.out.println("=============================");
//		AA.add3();
//		System.out.println("=============================");
//		AA.set1();
//		System.out.println("=============================");
//		AA.set2();
//		System.out.println("=============================");
//		AA.remove1();
//		System.out.println("=============================");
//		AA.remove2();
//		System.out.println("=============================");
		AA.get1();
		System.out.println("=============================");
		
	}
	
}
