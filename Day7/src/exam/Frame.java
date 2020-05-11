package exam;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame extends JFrame {
	// 멤버변수
	private Container ct;
	private JPanel jP1, jP2;
	private JTextArea jta;
	private JScrollPane jsp;
	private JTextField jtf;

	private JButton[] jb;

	// 생성자
	Frame(String title, int width, int height) {
		cal();
		addcal();
		showWindow(title, width, height);
	}

	// 멤버변수 생성 메소드
	private void cal() {
		// 컨테이너
		ct = getContentPane();

		// 패널1
		jP1 = new JPanel();
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		jtf = new JTextField();

		// 패널2
		jP2 = new JPanel();
		jb = new JButton[4];
	}

	// 멤버변수 초기화
	private void addcal() {
		ct.setLayout(new BorderLayout(5, 5));
		ct.add(jP1, BorderLayout.NORTH);
		ct.add(jP2, BorderLayout.CENTER);

		jP1.setLayout(new BorderLayout(5, 5));
		jP1.setPreferredSize(new Dimension(300, 200));
		jP1.add(jsp, BorderLayout.CENTER);
		jP1.add(jtf, BorderLayout.SOUTH);

		jP2.setLayout(new GridLayout(4, 4, 5, 5));

		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(i + "");
			jP2.add(jb[i]);
		}
		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton((i + 4) + "");
			jP2.add(jb[i]);
		}

		jb[0] = new JButton("8");
		jb[1] = new JButton("9");
		jb[2] = new JButton("+");
		jb[3] = new JButton("-");
		jP2.add(jb[0]);
		jP2.add(jb[1]);
		jP2.add(jb[2]);
		jP2.add(jb[3]);

		jb[0] = new JButton("*");
		jb[1] = new JButton("/");
		jb[2] = new JButton("%");
		jb[3] = new JButton("=");
		jP2.add(jb[0]);
		jP2.add(jb[1]);
		jP2.add(jb[2]);
		jP2.add(jb[3]);
	}
	
	private void addActionListener() {
		
	}

	// 화면출력
	private void showWindow(String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}