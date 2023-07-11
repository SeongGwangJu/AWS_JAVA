package ch26_socket.simpleGUI.client;

import lombok.Getter;

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
@Getter
public class SimpleGUIClient extends JFrame {

	private static SimpleGUIClient instance;
	public static SimpleGUIClient getInstance() {
		if (instance == null) {
			instance = new SimpleGUIClient();
		}
		return instance;
	}
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
					SimpleGUIClient frame = SimpleGUIClient.getInstance();
					frame.setVisible(true);

					ClientReceiver clientReceiver = new ClientReceiver();
					clientReceiver.start(); //run 실행

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

			// PrintWriter 초기화 by GPT
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

		//메세지를 띄어줄 영역
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {

					try {
						PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
						printWriter.println(username + " : " + textField.getText());
					} catch ( IOException e1 ) {
						e1.printStackTrace();
					} finally {
						textField.setText("");
					}
				}
			};
		}
		);
		textField.setBounds(12, 213, 410, 38);
		contentPane.add(textField);
		textField.setColumns(10);
	}




}
