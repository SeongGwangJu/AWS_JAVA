package ch26_socket.simpleGUI.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor //매개변수 socket 받는 생성자.

public class ConnectedSocket extends Thread {
	
	private final Socket socket;


	@Override
	public void run() {

			try {
				BufferedReader bufferedReader =
						new BufferedReader(new InputStreamReader
								(socket.getInputStream()));
			while(true) {
				//클라이언트로부터 받은 메시지 읽기
				String message = bufferedReader.readLine();
				System.out.println("받은 메시지: " + message);

				// 다른 클라이언트들에게 메시지 전송
				for (ConnectedSocket connectedSocket : SimpleGUIServer.connectedSocketList) {
					if(connectedSocket != this) {
						connectedSocket.sendMessage(message);
					}
				}
			}
			} catch (IOException e) {
				e.printStackTrace();
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

	
