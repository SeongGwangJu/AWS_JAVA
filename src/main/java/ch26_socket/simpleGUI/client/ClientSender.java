package ch26_socket.simpleGUI.client;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import ch26_socket.simpleGUI.client.dto.RequestBodyDto;

public class ClientSender {
	
	private Gson gson;
	
	private static ClientSender instance;
	
	private ClientSender() {
		gson = new Gson();
	}
	
	public static ClientSender getInstance() {
		if(instance == null) {
			instance = new ClientSender();
		}
		return instance;
	}
	
	public void send(RequestBodyDto requestBodyDto) { //클래스의 객체
		try {
			PrintWriter printWriter =  //문자열 데이터를 출력할 수 있음
					//클라이언트클래스의 소켓의 출력스트림.
					new PrintWriter(SimpleGUIClient.getInstance().getSocket().getOutputStream(), true);
			printWriter.println(gson.toJson(requestBodyDto)); //직렬화된 문자열로 변환 후 서버로전송.
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}













