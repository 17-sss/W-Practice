package com.����ó��; // ��Ȱ�ڵ�
/*
	BufferedReader bReader = new BufferedReader(new FileReader("���ܴ�����.txt"));
	String input = bReader.readLine();
	System.out.println(input);
 */
import java.io.*;
public class ���ܴ�����_04 {
	public static void main(String[] args) {
		// ���� Ǯ���Ѱ�.
		try {
			BufferedReader bReader = new BufferedReader(new FileReader("[����ó��]���ܴ�����.txt"));
			String input = bReader.readLine();
			System.out.println(input);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		// ��Ȱ�ڵ�. ��Ŭ�������� �ڵ��ϼ� Ȱ��. null�� �����ȳ����� �Ϸ��� �����.
		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader(new FileReader("[����ó��]���ܴ�����.txt"));
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
