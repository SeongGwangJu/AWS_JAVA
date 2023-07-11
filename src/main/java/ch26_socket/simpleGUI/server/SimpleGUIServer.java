package ch26_socket.simpleGUI.server;

import ch26_socket.simpleGUI.client.SimpleGUIClient;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import static ch26_socket.simpleGUI.client.SimpleGUIClient.getInstance;

public class SimpleGUIServer {
	public static List<ConnectedSocket> connectedSocketList = new ArrayList<>(); //클래스. 하면 어디서나 가능
	private static PrintWriter printWriter;


	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8000);
			System.out.println("[ 서버 실행 ] ");

			while(true) {
				Socket socket = serverSocket.accept();
				System.out.println("접속");

				ConnectedSocket connectedSocket = new ConnectedSocket(socket);
				connectedSocket.start();
				connectedSocketList.add(connectedSocket);

				/*
				BufferedReader를 사용하여 클라이언트로부터 오는 데이터를 읽고,
				이를 다른 클라이언트에게 전달하는 로직을 추가해야함.
				 */
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
		
	}

}
