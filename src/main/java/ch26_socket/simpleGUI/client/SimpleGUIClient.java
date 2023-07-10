package ch26_socket.simpleGUI.client;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Objects;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SimpleGUIClient extends JFrame {
	
	//내가 추가한 멤버변수
	private String username;	//채팅한 사람
	private Socket socket; 

	private static PrintWriter printWriter;

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleGUIClient frame = new SimpleGUIClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public SimpleGUIClient() {
		
		//아이디 입력창
		username = JOptionPane.showInputDialog(contentPane, "아이디를 입력하세요."); 
		
		//빈값이면 그냥 종료시켜버린다
		if(Objects.isNull(username) || username.isBlank())  {
			System.exit(0);
		}

		try {
			//생성 되는 순간 서버의 accept();가 반응한다!
			socket = new Socket("127.0.0.1", 8000);

			// PrintWriter 초기화
			printWriter = new PrintWriter(socket.getOutputStream(), true);

		} catch (IOException e) {
			e.printStackTrace();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 410, 195);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {

					// Enter 키를 눌렀을 때 sendMessage() 메소드 호출
					sendMessage();

					/*try {
						PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
						printWriter.println(username + " : " + textField.getText());

						//텍스트 영역에 데이터를 추가하는 로직 추가 필요.

					} catch ( IOException e1 ) {
						e1.printStackTrace();
					}*/
				}
			};
		}
		);
		textField.setBounds(12, 213, 410, 38);
		contentPane.add(textField);
		textField.setColumns(10);
	}
	private void sendMessage() {
		String message = textField.getText(); //텍스트필드 내용 가져오기

		printWriter.println(username + " : " + message); // 서버로 메시지 전송

		textField.setText(""); // 메시지 전송 후 텍스트 필드 비우기
	}
}
