package exam2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Frame extends JFrame {
	// ��� ����
	Calculator calculator;
	private Container ct;
	private JPanel jpTop, jpCenter;
	private JButton[] jbNum, jbOp;
	private JTextArea jtaLog;
	private JScrollPane jspLog;
	private JTextField jtfInput;
	private final String[] operator = { "+", "-", "*", "/", "%", "=" };

	// ������
	Frame(String title, int width, int height) {
		initComps();
		addComps();
		addActionListener();
		showWnd(title, width, height);
	}

	// ��� ���� ����
	private void initComps() {
		// Ŭ���� ����
		calculator = new Calculator();
		// �����̳�
		ct = getContentPane();

		// ȭ�� ���
		jpTop = new JPanel();
		jtaLog = new JTextArea();
		jspLog = new JScrollPane(jtaLog);
		// ȭ�� ����� �Ʒ���
		jtfInput = new JTextField();

		// ȭ�� �ϴ�
		jpCenter = new JPanel();
		jbNum = new JButton[10];
		for (int i = 0; i < jbNum.length; i++) {
			jbNum[i] = new JButton("" + i);
		}
		jbOp = new JButton[6];
		for (int i = 0; i < jbOp.length; i++) {
			jbOp[i] = new JButton(operator[i]);
		}
	}

	// ��� ���� �ʱ�ȭ
	private void addComps() {
		// Container
		ct.setLayout(new BorderLayout(5, 5));
		ct.add(jpTop, BorderLayout.NORTH);
		ct.add(jpCenter, BorderLayout.CENTER);

		// jpTop
		jpTop.setLayout(new BorderLayout(5, 5));
		jpTop.setPreferredSize(new Dimension(300, 200));
		jpTop.add(jtfInput, BorderLayout.SOUTH);
		jpTop.add(jspLog, BorderLayout.CENTER);

		// jpCenter
		jpCenter.setLayout(new GridLayout(4, 4, 5, 5));
		for (int i = 0; i < jbNum.length; i++) {
			jpCenter.add(jbNum[i]);
		}
		for (int i = 0; i < jbOp.length; i++) {
			jpCenter.add(jbOp[i]);
		}
	}

	private void addActionListener() {
		for (int i = 0; i < jbNum.length; i++) {
			int index = i;
			jbNum[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					jtfInput.setText(calculator.clickNum(jtfInput.getText(), jbNum[index].getText()));
				}
			});
		}
		for (int i = 0; i < jbOp.length; i++) {
			int index = i;
			jbOp[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (jbOp[index].getText().equals("=")) {
						jtaLog.append(calculator.calculation(jtfInput.getText()));
						jtfInput.setText("");
					} else {
						jtfInput.setText(calculator.clickOp(jtfInput.getText(), jbOp[index].getText()));
					}
				}
			});
		}
	}

	// ȭ�� ���
	private void showWnd(String title, int width, int height) {
		setTitle(title); // ��ü(������)�� ���� ����
		setSize(width, height); // ��ü(������)�� ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ������ �������� ���μ������� �Բ� ����
		setVisible(true); // ��ü�� ��Ÿ��(ȭ�鿡 ���)
	}
}