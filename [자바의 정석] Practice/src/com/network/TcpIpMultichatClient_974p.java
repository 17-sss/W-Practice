package com.network;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TcpIpMultichatClient_974p {
	public static void main(String[] args) {
		String name = "�͸�";
		
		try {
			String serverIp = "211.238.142.36";
			// ������ �����Ͽ� ������ ��û�Ѵ�.
			Socket socket = new Socket(serverIp, 7777);
			System.out.println("������ ����Ǿ����ϴ�.");
			Thread sender = new Thread(new ClientSender(socket, name));
			Thread receiver = new Thread(new ClientReceiver(socket));
			sender.start();
			receiver.start();
		} catch (ConnectException ce) {
			ce.printStackTrace();
			
		} catch (Exception e) {
			
		} 
	}// main
	
	static class ClientSender extends Thread {
		Socket socket;
		DataOutputStream out;
		String name;
		
		ClientSender(Socket socket, String name) {
			this.socket=socket;
			
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name=name;
			} catch (Exception e) {
			}
		}
		
		public void run() {
			Scanner scanner = new Scanner(System.in);
			
			try {
				if(out!=null) {
					out.writeUTF(name);
				}
				
				while(out!=null) {
					out.writeUTF("["+name+"]"+scanner.nextLine());
				}
			} catch (Exception e) {
			}
		} //run()
	} //ClientSender
	
	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		
		ClientReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {	
			}
			 
		}
		
		public void run() {
			while(in!=null) {
				try {
					System.out.println(in.readUTF());
				} catch(IOException e) {}
			}	
		} //run
	} //ClientReceiver
} //class
