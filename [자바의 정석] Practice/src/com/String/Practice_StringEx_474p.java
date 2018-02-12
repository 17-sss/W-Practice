package com.String;

import java.util.ArrayList;

public class Practice_StringEx_474p {
	public static void main(String[] args) {
		ArrayList<Object> aa = new ArrayList<>();
		boolean b = false;
		byte by = 1;
		short s = 2;
		int i = 3;
		long l = 4l;
		float f = 5.0f;
		double d =7.0;
		double d1 = 7.0;
		
		aa.add(String.valueOf(b));
		aa.add(String.valueOf(by));
		aa.add(String.valueOf(s));
		aa.add(String.valueOf(i));
		aa.add(String.valueOf(l));
		aa.add(String.valueOf(f));
		aa.add(String.valueOf(d));
		aa.add(String.valueOf(d1));
		
		System.out.println(aa);
		
		if(aa.get(5)==aa.get(2)) {
			System.out.println("true");
		} else {
			System.out.println("no");
		}
		
		if(aa.get(6).equals(aa.get(7))) {
			System.out.println("true");
		} else {
			System.out.println("no");
		}
	}
}

