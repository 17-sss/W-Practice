package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_T {
	Scanner scan = new Scanner(System.in);
	ArrayList<Object> oo = new ArrayList<>();
	ArrayList<String> as = new ArrayList<>();
	ArrayList<Integer> ai = new ArrayList<>();
	
	// Array연구용 변수들
	String ps="";
	int pi=0;
	

	public Array_T() {}
	
	// 추가 테스트 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void add1() {
		as.add("옷1");
		ai.add(1000);
		as.add("옷2");
		ai.add(1020);
		
		oo.add(as);
		oo.add(ai);
		
		for (int i=0; i<oo.size(); i++) {
			System.out.println(oo.get(i));
		}
	}
	public void add2() {
		as.add("띠");
		as.add("빠");
		ai.add(1234);
		ai.add(5678);
		
		for (int i=0; i<as.size(); i++) {
			System.out.println("이름: "+as.get(i)+"\t\t가격(?): "+ai.get(i));
		}
	}
	public void add3() {
		System.out.print("[추가] 이름 입력: ");
		ps = scan.next();
		as.add(ps);
		System.out.print("[추가] 가격 입력: ");
		pi = scan.nextInt();
		ai.add(pi);
		
		for (int i=0; i<as.size(); i++) {
			System.out.println("이름: "+as.get(i)+"\t\t가격(?): "+ai.get(i));
		}
		
	}
	// 수정 테스트 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void set1() {
		as.set(0, "버");
		ai.set(0, 9999);
		
		for (int i=0; i<as.size(); i++) {
			System.out.println("이름: "+as.get(i)+"\t\t가격(?): "+ai.get(i));
			
		}
	}
	public void set2() {
		System.out.print("[수정_이름] 위치 입력 (숫자): ");
		int si = scan.nextInt();
		System.out.print("[수정_이름] 이름 입력: ");
		ps = scan.next();
		as.set(si, ps);
		
		System.out.print("[수정_가격] 위치 입력 (숫자): ");
		int ss = scan.nextInt();
		System.out.print("[수정_가격] 가격 입력: ");
		pi = scan.nextInt();
		ai.set(ss, pi);
		
		for (int i=0; i<as.size(); i++) {
			System.out.println("이름: "+as.get(i)+"\t\t가격(?): "+ai.get(i));
			
		}	
	}
	// 삭제 테스트 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void remove1() {
		as.remove(0);
		ai.remove(0);
		
		for (int i=0; i<as.size(); i++) {
			System.out.println("이름: "+as.get(i)+"\t\t가격(?): "+ai.get(i));
		}
	}
	public void remove2() {
		// *주의* 삭제할떄 각 메소드 ArrayList 추가 되어있는 값에서 0을 입력하면 각자 0번째 삭제.
		System.out.print("삭제할 번호를 입력하세요: ");
		pi=scan.nextInt();
		
		for(int i=0; i<as.size(); i++) {
			as.remove(pi);
			ai.remove(pi);
			System.out.println("이름: "+as.get(i)+"\t\t가격(?): "+ai.get(i));
		}
	}
	// 찾기 테스트 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void get1() {
		System.out.print("[찾기] 찾을 순서를 입력하세요(숫자): ");
		pi = scan.nextInt();
		
		System.out.println("이름: "+as.get(pi)+"\t\t가격(?): "+ai.get(pi));
		
		/*for (int i=0; i<as.size(); i++) {
			System.out.println("이름: "+as.get(pi)+"\t\t가격(?): "+ai.get(pi));
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
