package ch26_socket.simpleGUI.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.Socket;

import ch26_socket.simpleGUI.client.SimpleGUIClient;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.swing.*;

@RequiredArgsConstructor //매개변수 socket 받는 생성자.

public class ConnectedSocket extends Thread {
	
	private final Socket socket;

	@Override
	public void run() {
		while(true) {
			try {
				BufferedReader bufferedReader =
						new BufferedReader(new InputStreamReader
								(socket.getInputStream()));
				String requestbody = bufferedReader.readLine();

				//접속메시지
				for (ConnectedSocket connectedSocket1 : SimpleGUIServer.connectedSocketList) {
					try {
						PrintWriter printWriter =
								new PrintWriter(connectedSocket1.socket.getOutputStream(), true);
						printWriter.println(requestbody);


					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
				/*위랑 for each랑 같음
				for (ConnectedSocket connectedSocket : SimpleGUIServer.connectedSocketList) { }
				for (int i = 0; i < SimpleGUIServer.connectedSocketList.size(); i++) {  } */

				while (true) {
					//클라이언트로부터 받은 메시지 읽기
					String message = bufferedReader.readLine();
					System.out.println(message);

					// 다른 클라이언트들에게 메시지 전송
					for (ConnectedSocket connectedSocket : SimpleGUIServer.connectedSocketList) {
						if (connectedSocket != this) {
							connectedSocket.sendMessage(message);
						}
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
				}
		}
	}

	private void sendMessage(String message) {
		try {
			socket.getOutputStream().write((message + "\n").getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

	
