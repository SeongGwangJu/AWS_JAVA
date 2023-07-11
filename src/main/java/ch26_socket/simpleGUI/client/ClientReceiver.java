package ch26_socket.simpleGUI.client;

import ch07_클래스.B;
import lombok.RequiredArgsConstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class ClientReceiver extends Thread{

    @Override
    public void run() {
        SimpleGUIClient simpleGUIClient = SimpleGUIClient.getInstance();

        while(true) {
            try {
                BufferedReader bufferedReader
                        = new BufferedReader
                        (new InputStreamReader(simpleGUIClient.getSocket().getInputStream()));
                String requestBody = bufferedReader.readLine();

                //채팅창에 띄워줌
                simpleGUIClient.getTextArea().append(requestBody + "\n");

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
