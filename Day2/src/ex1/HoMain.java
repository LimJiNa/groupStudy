package ex1;

import java.util.Scanner;

public class HoMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputMoney;
		int[] coin = new int[4];
		
		System.out.println("�ݾ��� �Է��ϼ���.");
		inputMoney = scan.nextInt();
		System.out.println("�Է��� �ݾ��� " + inputMoney + "�� �Դϴ�.");
		
		coin[0] = inputMoney / 500;
		inputMoney%=500;
		coin[1] = inputMoney / 100;
		inputMoney%=100;
		coin[2] = inputMoney / 50;
		inputMoney%=50;
		coin[3] = inputMoney / 10;
		
		System.out.println("500�� : " + coin[0]);
		System.out.println("100�� : " + coin[1]);
		System.out.println("50�� : " + coin[2]);
		System.out.println("10�� : " + coin[3]);
		
		scan.close();
	}
}
