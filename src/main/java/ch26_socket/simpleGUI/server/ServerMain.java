package server;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JList;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.ImageIcon;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ServerMain extends JFrame {

    private JPanel server;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ServerMain frame = new ServerMain();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ServerMain() {


        setBackground(new Color(128, 128, 128));
        setFont(new Font("나눔바른고딕", Font.PLAIN, 14));
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jusg0\\OneDrive\\사진\\Samsung Gallery\\DCIM\\Screenshots\\Screenshot_20230710_225559_Whale.jpg"));
        setTitle("ServerTool");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(1500, 100, 350, 600);
        server = new JPanel();
        server.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(server);
        server.setLayout(null);

        JScrollPane serverNotiScrollPane = new JScrollPane();
        serverNotiScrollPane.setBounds(12, 81, 310, 470);
        server.add(serverNotiScrollPane);

        JTextArea serverNotiTextArea = new JTextArea();
        serverNotiScrollPane.setViewportView(serverNotiTextArea);

        //서버시작
        JToggleButton ServerStartButton = new JToggleButton("서버 시작", false);
        ServerStartButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int clickCount = 0;
                clickCount += 1;

                if(clickCount % 2 == 1) { //서버 실행
                    try {
                        ServerSocket serverSocket = new ServerSocket(8000);
                        serverNotiTextArea.append("서버를 시작합니다.\n");

                        while(true) {
                            Socket socket = serverSocket.accept();

                        }
                    } catch (IOException e1) {
                        System.out.println("서버실행에서 에러 : \n");
                        e1.printStackTrace();
                    }
                } else {
                    System.out.println("서버를 닫았습니다.");

                }

            }
        });
        ServerStartButton.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 15));
        ServerStartButton.setBounds(26, 20, 94, 39);
        server.add(ServerStartButton);

        JLabel ipLabel = new JLabel("IP");
        ipLabel.setFont(new Font("나눔바른고딕", Font.PLAIN, 12));
        ipLabel.setBounds(163, 10, 22, 15);
        server.add(ipLabel);

        JLabel portLabel = new JLabel("Port");
        portLabel.setFont(new Font("나눔바른고딕", Font.PLAIN, 12));
        portLabel.setBounds(163, 33, 57, 15);
        server.add(portLabel);

        JLabel userNumLabel = new JLabel("접속자");
        userNumLabel.setFont(new Font("나눔바른고딕", Font.PLAIN, 12));
        userNumLabel.setBounds(163, 56, 57, 15);
        server.add(userNumLabel);

        JTextArea ipArea = new JTextArea();
        ipArea.setEditable(false);
        ipArea.setFont(new Font("나눔고딕", Font.PLAIN, 12));
        ipArea.setForeground(Color.WHITE);
        ipArea.setBackground(Color.DARK_GRAY);
        ipArea.setText("127.0.0.1");
        ipArea.setBounds(208, 10, 56, 15);
        server.add(ipArea);

        JTextArea portArea = new JTextArea();
        portArea.setEditable(false);
        portArea.setFont(new Font("나눔고딕", Font.PLAIN, 12));
        portArea.setText("8000");
        portArea.setForeground(Color.WHITE);
        portArea.setBackground(Color.DARK_GRAY);
        portArea.setBounds(208, 33, 56, 15);
        server.add();

        JTextArea userNumArea = new JTextArea();
        userNumArea.setEditable(false);
        userNumArea.setFont(new Font("나눔고딕", Font.PLAIN, 13));
        userNumArea.setForeground(Color.WHITE);
        userNumArea.setBackground(Color.DARK_GRAY);
        userNumArea.setBounds(208, 56, 56, 15);
        server.add(userNumArea);
    }
}
