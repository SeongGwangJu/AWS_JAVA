package ch26_socket.server2;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.security.PublicKey;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServerApplication {

	public static ServerSocket serverSocket;
	public static int port;
	
	public static void main(String[] args) {
		
		Thread connectionThread = null;
		
		System.out.println("[ 서버프로그램 실행 ]");
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			int selectedMenu = 0;
			System.out.println("1. 서버켜기");
			System.out.println("2. 서버끄기");
			System.out.print("선택: ");
			
			try {
				selectedMenu = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
			
			switch(selectedMenu) {
			case 1:
				if(serverSocket != null) {
					System.out.println("이미 서버가 실행중입니다.");
					break;
				}
				System.out.print("서버의 포트번호를 입력하세요: ");
				
				try {
					port = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력 가능합니다.");
					continue;
				}
				
				connectionThread = new Thread(() -> { //스레드 생성
					try {
						serverSocket = new ServerSocket(port);//서버소켓 생성
						
						while(!Thread.interrupted()) { //여러 클라이언트를 받기위해 무한쓰레드
							Socket socket = serverSocket.accept(); //클라이언트의 접속(연결) 대기중.
							
							ConnectedSocket connectedSocket = new ConnectedSocket(socket); //s1이 들어오면 s1 객체 생성.
							connectedSocket.start();  // 시작. 계~속 in / out.
							
							ConnectedClientController.getInstance()
								.getConnectedSockets().add(connectedSocket); //문말이야?
							
							System.out.println("접속!!");
							System.out.println(socket.getInetAddress().getHostAddress());//연결 받을때 IP출력.
						}
						
					} catch (BindException e) {
						System.out.println("이미 사용중인 포트번호입니다.");
					} catch (SocketException e) {
						System.out.println("서버의 연결이 종료되었습니다.");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}, "connectionThread");
				
				connectionThread.start();
				
				break;
				
			case 2:
				if(serverSocket == null) {
					System.out.println("서버가 실행중이지 않습니다.");
					break;
				}
				
				try {
					serverSocket.close();
				} catch (IOException e) {}
				
				connectionThread.interrupt();
				
				try {
					connectionThread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("프로그램 종료");
				return;
				
			default:
				System.out.println("다시 선택하세요.");
			}
			
//			if(serverSocket == null) {
//				try {
//					connectionThread.join(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
			
		}
		
		
		
	}

}
