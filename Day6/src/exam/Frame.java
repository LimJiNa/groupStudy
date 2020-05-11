package exam;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//GUI구현 영역
public class Frame extends JFrame {
	// 멤버변수
	private Container ct;
	private JPanel jP1, jP2;
	private JTextArea jta;
	private JScrollPane jsp;

	private JButton jb;
	private JTextField[] jtf;
	private JLabel[] jl;
	private JLabel jlOutput;

	// 생성자
	Frame(String title, int width, int height) { // 생성자 작성 순서 중요
		initComps();
		addComps();
		showWnd(title, width, height);
	}

	// 멤버변수 생성 메소드
	private void initComps() {
		// 컨데이너
		ct = getContentPane();

		// 패널1
		jP1 = new JPanel();
		jta = new JTextArea();
		jsp = new JScrollPane(jta); // scroll안에 textarea가 들어가는 것

		// 패널2
		jP2 = new JPanel();
		jb = new JButton("추가");
		jtf = new JTextField[3];
		for (int i = 0; i < jtf.length; i++) {
			jtf[i] = new JTextField();
		}
		jl = new JLabel[4];
		jl[0] = new JLabel("과목명");
		jl[1] = new JLabel("학점");
		jl[2] = new JLabel("평점");
		jl[3] = new JLabel("평점평균");
		jlOutput = new JLabel("");
	}

	// 멤버변수 초기화
	private void addComps() {
		ct.setLayout(new BorderLayout(5, 5));
		ct.add(jP1, BorderLayout.CENTER); // BorderLayout은 add(방향지정) -> 꼭
		ct.add(jP2, BorderLayout.SOUTH);

		jP1.setLayout(new BorderLayout(5, 5));
		jP1.add(jsp, BorderLayout.CENTER);

		jP2.setLayout(new GridLayout(3, 4, 5, 5));
		for (int i = 0; i < jl.length - 1; i++) {
			jP2.add(jl[i]);
		}
		jP2.add(new JLabel(""));
		for (int i = 0; i < jtf.length; i++) {
			jP2.add(jtf[i]);
		}
		jP2.add(jb);
		jP2.add(new JLabel(""));
		jP2.add(new JLabel(""));
		jP2.add(jl[3]);
		jP2.add(jlOutput);
	}

	// 화면 출력
	private void showWnd(String title, int width, int height) {
		setTitle(title); // 객체(프레임)의 제목 설정
		setSize(width, height); // 객체(프레임)의 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫으면 가동 중인 프로세스까지 함께 종료
		setVisible(true); // 객체를 화면에 나타냄
	}
}
