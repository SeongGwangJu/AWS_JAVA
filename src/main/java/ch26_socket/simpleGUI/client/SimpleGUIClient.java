package ch26_socket.simpleGUI.client;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Objects;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ch26_socket.simpleGUI.client.dto.RequestBodyDto;
import ch26_socket.simpleGUI.client.dto.SendMessage;
import lombok.Getter;

@Getter
public class SimpleGUIClient extends JFrame {

	//싱글톤 패턴 구현
	private static SimpleGUIClient instance;
	public static SimpleGUIClient getInstance() {
		if(instance == null) {
			instance = new SimpleGUIClient();

		}
		return instance;
	}

	//변수선언 및 GUI요소
	private String username;
	private Socket socket;

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	
	private JScrollPane userListScrollPane;
	private DefaultListModel<String> userListModel;
	private JList userList;
	

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleGUIClient frame = SimpleGUIClient.getInstance(); //인스턴스 생성
					frame.setVisible(true); //GUI창 표시
					System.out.println("GetInstance");

					ClientReceiver clientReceiver = new ClientReceiver(); //리시버 객체생성
					clientReceiver.start(); //run 메서드 실행
					
					//유저네임과 join 리소스를 갖는 객체 생성 + 서버전송.
					RequestBodyDto<String> requestBodyDto
							= new RequestBodyDto<String>("join", frame.username);
					ClientSender.getInstance().send(requestBodyDto);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//클라이언트 창 생성.
	public SimpleGUIClient() {
		//아이디 입력 및 검증
		username = JOptionPane.showInputDialog(contentPane, "아이디를 입력하세요.");			
		
		if(Objects.isNull(username)) {
			System.exit(0);
		}
		
		if(username.isBlank()) {
			System.exit(0);
		}

		//소켓 생성 및 연결
		try {
			socket = new Socket("127.0.0.1", 8000);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

 		//GUI초기화 및 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 270, 203);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		//채팅 입력창 이벤트
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) { //엔터 누르면

					//메세지와 사용자 이름을 담은 sendMessage객체 생성
					SendMessage sendMessage = SendMessage.builder()
							.fromUsername(username)
							.messageBody(textField.getText())
							.build();

					//"SendMessage"리소스를 담은 ReqBD 생성 및 서버 전송 및 텍스트필드 초기화
					//서버에서는 input스트림을 통해 읽어온 뒤 컨트롤러에 전송.
					RequestBodyDto<SendMessage> requestBodyDto = 
							new RequestBodyDto<>("SendMessage", sendMessage);
					ClientSender.getInstance().send(requestBodyDto);
					textField.setText("");
				}
			}
		});

		textField.setBounds(12, 223, 410, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		userListScrollPane = new JScrollPane();
		userListScrollPane.setBounds(294, 10, 128, 203);
		contentPane.add(userListScrollPane);
		
		userListModel = new DefaultListModel<>();
		userList = new JList(userListModel);
		userListScrollPane.setViewportView(userList);
		
	}
}









