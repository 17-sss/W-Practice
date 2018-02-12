package com.foreach;

public class Java_166p {
	int arr[] = {10, 20, 30, 40, 50};
	int sum=0;
	
	void for1() {
		System.out.print("for1: ");
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d ",arr[i]);
		}
		  
	}
	void for2() {
		System.out.print("for2: ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" "); 
		}
			 
	}
	void for_each() { 
		System.out.print("for each: ");
		for (int i : arr) {
			System.out.print(i+" "); // 정답 !★★★★★-> 내가 모름
			//System.out.print(arr[i]+" "); // 오답. (arr[i]말고 그냥 대입된 변수 i로..)
		}
	}
	public static void main(String[] args) {
		Java_166p J166 = new Java_166p();
		J166.for1();
		System.out.println();
		J166.for2();
		System.out.println();
		J166.for_each();
	}
}
