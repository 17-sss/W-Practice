package com.tostring;

class Tos_1 {
	int value;
	String st;
	public Tos_1 (int value) {
		this.value=value;
	}
	public Tos_1 (int value, String st) {
		this.value=value;
		this.st=st;
	}
	
	public String toString() {
		//return Integer.toString(value);
		return "value: "+value+" "+"st: "+st;
	}
}
class Tos_2 {
	double valueD;
	String st2;
	public Tos_2 (String st2) {
		this.st2=st2;
	}
}

public class ToString_1 {
	public static void main(String[] args) {
		Tos_1 f = new Tos_1(1);
		Tos_1 f1 = new Tos_1(1,"s");
		/*ToString_1 f = new ToString_1(1);
		여기서 f 저거 신경좀..*/
		System.out.println("Tos_1: "+f);
		System.out.println("Tos_1: "+f1);
		//Tos_1: toString에 정의한것처럼나옴
		
		
		Tos_2 d = new Tos_2("ㅇ");
		System.out.println("Tos_2: "+d);
		//Tos_2: toString 정의안하면 번지값나옴
	}
}

