package ex3;

import java.util.Scanner;

public class Hd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int goalMoney, inputMoney, totalMoney;
		
		System.out.println("��ǥ �ݾ��� �Է��Ͻÿ�(100���� ����)");
		goalMoney = scan.nextInt();
		System.out.println("��ǥ �ݾ��� " + goalMoney + "���� �Դϴ�.\n");
		totalMoney = 0;
		
		while(true) {
			System.out.println("�Աݾ��� �Է��Ͻÿ�(20���� ����)");
			inputMoney = scan.nextInt();
			if(inputMoney > 20) {
				System.out.println("20���� ������ �ݾ��� �Ա��Ͻÿ�.");
				continue;
			}
			if(inputMoney < 5) {
				System.out.println("5���� �̸��� �ݾ��� ���� �� �����ϴ�.");
				continue;
			}
			System.out.println(inputMoney + "������ �Ա��Ͽ����ϴ�.");
			totalMoney += (inputMoney - 5);
			System.out.println("���� ���� �ܾ��� " + totalMoney + "���� �Դϴ�.");
			if(totalMoney > goalMoney) {
				System.out.println("��ǥ���� �޼��Ͽ����ϴ�.");
				break;
			}
		}
	}
}
