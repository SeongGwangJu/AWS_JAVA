package ch25_GUI;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIMain1 extends JFrame {
	
	private final String ADMIN_USERNAME = "admin";
	private final String ADMIN_PASSWORD = "1234";
	private final String HYEJIN_USERNAME = "gkxmqhfvps";
	private final String HYEJIN_PASSWORD = "love";
	private CardLayout mainCardLayout;
	
	private JPanel mainCardPanel;
	private JPanel loginPanel;
	private JPanel homePanel;
	private JTextField usernameTextField;
	private JPasswordField PasswordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMain1 frame = new GUIMain1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUIMain1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//====Login Panel====
		mainCardPanel = new JPanel();
		mainCardLayout = new CardLayout();
		mainCardPanel.setLayout(mainCardLayout);
		setContentPane(mainCardPanel);
		
		
		loginPanel = new JPanel();
		loginPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		loginPanel.setLayout(null);
		mainCardPanel.add(loginPanel, "LoginPanel"); //로그인패널이 메인카드패널의 하위항목으로 들어감		
		
		//ID
		usernameTextField = new JTextField();
		usernameTextField.setBounds(128, 53, 190, 33);
		loginPanel.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		//PW
		PasswordTextField = new JPasswordField();
		PasswordTextField.setBounds(128, 96, 190, 33);
		loginPanel.add(PasswordTextField);
		PasswordTextField.setColumns(10);
		
		//Btn
		JButton signinBtn = new JButton("Login");
		
		//마우스클릭시 로그인 검증
		signinBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username = usernameTextField.getText();
				String password = PasswordTextField.getText();
				
				if((!username.equals(ADMIN_USERNAME) || !password.equals(ADMIN_PASSWORD))&&!username.equals(HYEJIN_USERNAME)) { // 아이디 비번 둘 중 하나라도 일치하지 않을때
					JOptionPane.showMessageDialog(loginPanel, "사용자 정보가 일치하지 않습니다.", "로그인 실패", JOptionPane.ERROR_MESSAGE);
					return;
				} else if(username.equals(HYEJIN_USERNAME) && password.equals(HYEJIN_PASSWORD)) { 
					JOptionPane.showMessageDialog(loginPanel, "hi hyejin.", "로그인 good", JOptionPane.ERROR_MESSAGE);
					return;				
				}
				JOptionPane.showMessageDialog(loginPanel, "환영합니다.", "로그인 성공", JOptionPane.OK_OPTION);
				mainCardLayout.show(mainCardPanel, "homePanel");
				
			}
		});
		signinBtn.setBounds(128, 167, 190, 33);
		loginPanel.add(signinBtn);
		

		//====homePanel====
		homePanel = new JPanel();
		homePanel.setLayout(null);
		mainCardPanel.add(homePanel, "homePanel");	

	}
}