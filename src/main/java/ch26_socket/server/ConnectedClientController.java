package ch26_socket.server;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class ConnectedClientController {
	
	private static ConnectedClientController instance;
	
	@Getter
	private List<ConnectedSocket> connectedSockets; //ConnectedSocket 객체를 담은 List
	
	
	private ConnectedClientController() {
		connectedSockets = new ArrayList<>();
	}
	
	public static ConnectedClientController getInstance() {
		if(instance == null) {
			instance = new ConnectedClientController();
			}
		return instance;
	}

}
