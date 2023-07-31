package ch26_socket.simpleGUI.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.google.gson.Gson;

import ch26_socket.simpleGUI.server.dto.RequestBodyDto;

public class ClientReceiver extends Thread {
	
	@Override
	public void run() {
		System.out.println("클라이언트 리시버 is running");
		SimpleGUIClient simpleGUIClient = SimpleGUIClient.getInstance();
		while(true) {
			try {

				BufferedReader bufferedReader = 
						new BufferedReader(new InputStreamReader(simpleGUIClient.getSocket().getInputStream()));
				String requestBody = bufferedReader.readLine();
				System.out.println("리시버 : Str reqBody에 내용을 저장하고 컨트롤러로 전송.");
				requestController(requestBody);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void requestController(String requestBody) {
		Gson gson = new Gson();
		System.out.println("클라이언트 컨트롤러다." + gson.fromJson(requestBody, RequestBodyDto.class).getResource() + " 를 받아왔다.");
		String resource = gson.fromJson(requestBody, RequestBodyDto.class).getResource(); //리소스를 반환.
		
		switch(resource) {
			//textArea에 문자 뿌려줌
			case "showMessage" :
				//다운캐스팅이 필요하지 않으므로
				System.out.println("ShowMessage : messageContent에 fromJson.getBody를 저장하고 textArea에 append.");
				String messageContent = (String) gson.fromJson(requestBody, RequestBodyDto.class).getBody(); //바디를 반환
				
				//append : 문자열 마지막에 추가.
				SimpleGUIClient.getInstance().getTextArea().append(messageContent + "\n"); 
			
				break;

			//유저리스트 업데이트
			case "updateUserList" :
				System.out.println("Update : usernameList를 생성하고 추가해준다.");
				List<String> usernameList = (List<String>) gson.fromJson(requestBody, RequestBodyDto.class).getBody();
				SimpleGUIClient.getInstance().getUserListModel().clear();
				SimpleGUIClient.getInstance().getUserListModel().addAll(usernameList);
			
		}
	}
}












