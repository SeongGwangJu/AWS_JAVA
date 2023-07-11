package ch26_socket.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SImpleServer {
	public static void main(String[] args) {
		try {
			//서버소켓 객체생성, 포트번호 8000으로 생성. 서버소켓? 클라이언트의 연결요청 수락
			ServerSocket serverSocket = new ServerSocket(8000);
			System.out.println("서버실행");
			List<Socket> socketList = new ArrayList<>();

			while(true) {
				Socket socket = serverSocket.accept();
				socketList.add(socket);

				//스레드 생성 + run메서드. 생성되면 독립적으로 실행! 클라이언트로 부터 데이터 in.
				Thread thread = new Thread(() -> {
					Socket threadSocket = socket;

				while(true) {									//무한 => 지속적으로 데이터를 받기 위함.
					System.out.println("데이터 입력 기다림.");
					BufferedReader bufferedReader;
					try { 
						/*
						 * InputStream은 바이트 단위로 데이터를 읽는 스트림이지만
						 * InputStreamReader를 사용하면 바이트를 문자로 변환하여 읽을 수 있음
						 * socket으로 입력받은 입력 스트림을 변환된 문자 입력 스트림을 통해 문자열을 읽을 수 있습
						 */
						InputStreamReader inputStreamReader = new InputStreamReader(threadSocket.getInputStream());

						bufferedReader = new BufferedReader(inputStreamReader); //변환한 문자를 라인단위로 읽음.
						String requestBody = bufferedReader.readLine();

						socketList.forEach(s -> {
							try {
								PrintWriter printWriter = new PrintWriter(s.getOutputStream(), true);
								printWriter.println("메세지내용("+requestBody + ")");
							} catch (IOException e) {
								e.printStackTrace();
							}
						});
						System.out.println(bufferedReader.readLine());

						/* 클라이언트가 보낸 데이터를 읽어와서 콘솔에 출력. 데이터를 줄때까지 기다린다.
						 * bufferedReader는 문자 기반 입력 스트림(Reader)을 버퍼링하기 위한 클래스 
						 * 버퍼링 : 버퍼라는 메모리 공간에 작은 덩어리로 나누어 저장함으로써 효율& 성능 up. */		
						
					} catch (IOException e) {
						e.printStackTrace(); // 예외의 원인 출력.
					}
				}
			});
			
			thread.start(); //위에서 생성한 스레드를 실행. 즉 while 루프 계속 수행
		}
		} catch (IOException e) {


		}
				}

}
