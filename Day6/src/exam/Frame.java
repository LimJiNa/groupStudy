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

//GUI���� ����
public class Frame extends JFrame {
	// �������
	private Container ct;
	private JPanel jP1, jP2;
	private JTextArea jta;
	private JScrollPane jsp;

	private JButton jb;
	private JTextField[] jtf;
	private JLabel[] jl;
	private JLabel jlOutput;

	// ������
	Frame(String title, int width, int height) { // ������ �ۼ� ���� �߿�
		initComps();
		addComps();
		showWnd(title, width, height);
	}

	// ������� ���� �޼ҵ�
	private void initComps() {
		// �����̳�
		ct = getContentPane();

		// �г�1
		jP1 = new JPanel();
		jta = new JTextArea();
		jsp = new JScrollPane(jta); // scroll�ȿ� textarea�� ���� ��

		// �г�2
		jP2 = new JPanel();
		jb = new JButton("�߰�");
		jtf = new JTextField[3];
		for (int i = 0; i < jtf.length; i++) {
			jtf[i] = new JTextField();
		}
		jl = new JLabel[4];
		jl[0] = new JLabel("�����");
		jl[1] = new JLabel("����");
		jl[2] = new JLabel("����");
		jl[3] = new JLabel("�������");
		jlOutput = new JLabel("");
	}

	// ������� �ʱ�ȭ
	private void addComps() {
		ct.setLayout(new BorderLayout(5, 5));
		ct.add(jP1, BorderLayout.CENTER); // BorderLayout�� add(��������) -> ��
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

	// ȭ�� ���
	private void showWnd(String title, int width, int height) {
		setTitle(title); // ��ü(������)�� ���� ����
		setSize(width, height); // ��ü(������)�� ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ������ ���� ���� ���μ������� �Բ� ����
		setVisible(true); // ��ü�� ȭ�鿡 ��Ÿ��
	}
}
