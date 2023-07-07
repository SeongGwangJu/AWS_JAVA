package ch26_socket.server;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.security.PublicKey;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServerApplication {

	public static ServerSocket serverSocket; //한번만 생성
	public static int port;
	
	public static void main(String[] args) {
		
		Thread connectionThread = null;
		
		System.out.println("[ 서버프로그램 실행 ]");
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			
			int selectedMenu = 0;
			
			System.out.println("1. 서버켜기");
			System.out.println("2. 서버끄기");
			System.out.print("선택: ");
			
			try {
				selectedMenu = scanner.nextInt(); //입력받음
			} catch (InputMismatchException e) { //숫자가 아니면
				System.out.println("숫자만 입력 가능합니다.");
				continue; //while조건문 다시 실행
			}
			
			switch(selectedMenu) {
			case 1:
				if(serverSocket != null) { //기본값은 null이므로, null이 아니면 이미 실행중이라는 뜻.
					System.out.println("이미 서버가 실행중입니다.");
					break; //다시 while로 올라감
				}
				System.out.print("서버의 포트번호를 입력하세요: ");
				
				try {
					port = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력 가능합니다.");
					continue;
				}
				
				connectionThread = new Thread(() -> { //다른 클라이언트의 접속 기다림,
					try {
						serverSocket = new ServerSocket(port); //정상적인 포트를 입력하면 아래의 while로 넘어감.
						
						while(!Thread.interrupted()) { //interrupt 되지 않으면 아래가 실행. interrupted되면 false가 되며 자연스럽게 종료
							Socket socket = serverSocket.accept();
							System.out.println("접속!!");
							System.out.println(socket.getInetAddress().getHostAddress());
						}
						
					} catch (BindException e) { //포트가 2개일 경우
						System.out.println("이미 사용중인 포트번호입니다."); //이 쓰레드가 종료되면 다시 입력받는 곳으로 감.
						
					} catch (SocketException e) { //interreupted되면.
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
					serverSocket.close(); //서버를 멈춤(객체소멸)
				} catch (IOException e) { }
				
				connectionThread.interrupt();
				
				try {
					connectionThread.join(); //앞의 쓰레드가 다 될때까지 기다렸다가 아래(프로그램 종료)가 실행
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("프로그램 종료");
				return; //main 메소드가 return = The end. 
				
			default: // 명령의 제일 끝 부분, 이게 실행되면 다시 위로 올라감.
				System.out.println("다시 선택하세요.");
			}
			
		}
		
		
		
	}

}
