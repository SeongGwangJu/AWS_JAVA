package ch26_socket.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("클라이언트 실행");

		try {
			//클라이언트 소켓 생성. localhost + 8000번으로 서버에 연결.
			Socket socket = new Socket("127.0.0.1", 8000);

			Thread inputThread = new Thread(() -> {
				try {

					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((socket.getInputStream())));

					/* 위 한문장 =
					InputStream inputstream = socket.getInputStream();
					InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
					BufferedReader bufferedReader = new BufferedReader(inputStreamReader);*/

					while(true) {
						String requestBody = bufferedReader.readLine();
						System.out.println("내용 : " +  requestBody);
					}

				} catch(IOException e) {
					e.printStackTrace();
				}
			});

			inputThread.start();
			while(true) {

				PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
				/*소켓 객체로부터 출력스트림 얻어와서, 스트림라이터로 문자를 바이트스트림으로 변환.(OutputStream)
				PrintWriter 객체 생성, 아웃풋스트림을 전달. 
				PrintWriter는 문자열을 직접 출력할 수 있고 내부적으로 문자 인코딩과 문자 단위로 데이터를 처리.
				출력 스트림에 데이터를 쓸 수 있음. */


				System.out.println("입력 :");
				String input = scanner.nextLine(); //입력받은 내용 저장.

				printWriter.println(input); //입력받은 문자열을 서버로 전송. 서버한테는 input.

			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}

}
