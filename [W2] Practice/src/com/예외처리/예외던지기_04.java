package com.예외처리; // 생활코딩
/*
	BufferedReader bReader = new BufferedReader(new FileReader("예외던지기.txt"));
	String input = bReader.readLine();
	System.out.println(input);
 */
import java.io.*;
public class 예외던지기_04 {
	public static void main(String[] args) {
		// 내가 풀이한거.
		try {
			BufferedReader bReader = new BufferedReader(new FileReader("[예외처리]예외던지기.txt"));
			String input = bReader.readLine();
			System.out.println(input);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		// 생활코딩. 이클립스에서 자동완성 활용. null은 에러안나오게 하려고 만든거.
		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader(new FileReader("[예외처리]예외던지기.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String input = null;
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(input);
		
	}

}
