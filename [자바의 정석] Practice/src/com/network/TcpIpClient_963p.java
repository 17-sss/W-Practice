package com.network;

import java.net.*;
import java.io.*;

public class TcpIpClient_963p {
	public static void main(String[] args) {
		try {
			String serverIp = "211.238.142.36"; //�ڡڡ�
			//String serverIp = "211.238.142.20";
			
			System.out.println("������ �������Դϴ�. ����IP : "+serverIp);
			// ������ �����Ͽ� ������ ��û�Ѵ�.
			Socket socket = new Socket(serverIp, 7777); //�ڡڡڡڡ�
			// ������ �Է½�Ʈ���� ��´�.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			//�������κ��� ���� �����͸� ����Ѵ�.
			System.out.println("�����κ��� ���� �޼���: "+dis.readUTF()); //dis.readUTF()) �ڡڡڡڡ�
			System.out.println("������ �����մϴ�.");
			
			//��Ʈ���� ������ �ݴ´�.
			dis.close();
			socket.close();
			System.out.println("������ ����Ǿ����ϴ�.");
			
		} catch (ConnectException ce) {
			ce.printStackTrace();
			
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} //main
	
} //class
