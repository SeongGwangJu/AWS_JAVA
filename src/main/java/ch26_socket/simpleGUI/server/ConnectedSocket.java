package ch26_socket.simpleGUI.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import ch26_socket.simpleGUI.server.dto.RequestBodyDto;
import ch26_socket.simpleGUI.server.dto.SendMessage;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConnectedSocket extends Thread {
	
	private final Socket socket;
	private String username;
	
	
	@Override
	public void run() {
		
		while(true) {
			try {
				BufferedReader bufferedReader = 
						new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String requestBody = bufferedReader.readLine();
				System.out.println("서버가 문자를 받아들여 reqbody에 저장했다. 컨트롤러GO");
				requestController(requestBody);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private void requestController(String requestBody) {
		Gson gson = new Gson();
		String resource = gson.fromJson(requestBody, RequestBodyDto.class).getResource();
		System.out.println("컨트롤러다. 클라이언트로 부터 "
				+gson.fromJson(requestBody, RequestBodyDto.class).getResource() +"를 읽어왔다.");
		
		//RequestBodyDto<?> requestBodyDto = gson.fromJson(requestBody, RequestBodyDto.class);
		/*
		 * TypeToken<RequestBodyDto<SendMessage>> token = new TypeToken<RequestBodyDto<SendMessage>>( ) { };
		 * RequestBodyDto<SendMessage> requestBodyDto2 = gson.fromJson(requestBody, token.getType());
		 */

		switch(resource) {		
			case "join" :
				System.out.println("받아온 리소스 join을 처리한다. body로 부터 username을 받아왔다.");
				username = (String) gson.fromJson(requestBody, RequestBodyDto.class).getBody();

				System.out.println("연결된 소켓리스트에 저장된 데이터를  usernameList에 저장하고 값을 옮긴다.");
				SimpleGUIServer.connectedSocketList.forEach(connectedSocket -> {
					List<String> usernameList = new ArrayList<>();
					System.out.println("");
					SimpleGUIServer.connectedSocketList.forEach(con -> {
						usernameList.add(con.username);
					});

					System.out.println("유저리스트 업데이트 및 접속알림 데이터 생성");
					RequestBodyDto<List<String>> updateUserListDto
							= new RequestBodyDto<List<String>>("updateUserList", usernameList);

					RequestBodyDto<String> joinMessageDto
							= new RequestBodyDto<String>("showMessage", username + "님이 채팅방에 접속했습니다.");
					
					//클라이언트에게 데이터 보냄.
					System.out.println("서버에서 send() 실행. update와 join 정보를 보낸다.");
					ServerSender.getInstance().send(connectedSocket.socket, updateUserListDto);
					try {
						Thread.sleep(100);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
					ServerSender.getInstance().send(connectedSocket.socket, joinMessageDto);
					
				});
				break;


			case "sendMessage" : //메시지 보내기
				// 밑에 내용 개중요함. 모든 케이스를 다 적어야함.
				System.out.println("받아온 리소스 SendMessage 처리할 준비를 시작한다" +
						"타입토큰을 생성했다");
				TypeToken <RequestBodyDto<SendMessage>> typeToken = new TypeToken<>() {};
				
				//클라이언트한테 받은 Json데이터를, SendMessage객체로 변환
				System.out.println("reqBD를 통해 Type과 타입과 바디를 갖고온다.");
				RequestBodyDto<SendMessage> requestBodyDto = gson.fromJson(requestBody, typeToken.getType());
				SendMessage sendMessage = requestBodyDto.getBody();
				
				//반복으로 모든 접속자에게 전송
				//ClientReceiver가 소켓의 인풋스트림을 통해 reqBody에 문자열 저장 ->컨트롤러
				//->showMessage 스위치 -> TextArea에 append.
				System.out.println("forEach를 통해 showMessage 리소스를 보내고 그 안의" +
						"Sendmessage객체에 담긴 이름과 메세지 내용을 담고 send(). ");
				SimpleGUIServer.connectedSocketList.forEach(connectedSocket -> {
					RequestBodyDto<String> dto = new RequestBodyDto<String>("showMessage", sendMessage.getFromUsername() + ": " + sendMessage.getMessageBody());
					ServerSender.getInstance().send(connectedSocket.socket, dto);
				});

				break;
		}
	}
}
















