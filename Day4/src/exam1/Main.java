package exam1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Scanner scan = new Scanner(System.in);
		int menuNumbers;
		int[] lottoNumbers;
		int countNumbers;

		check: while (true) {
			System.out.println("Lotto��ȣ �ڵ� ������");
			System.out.println("1.�ڵ� ��ȣ �ο� �ޱ�");
			System.out.println("2.���α׷� ����");
			System.out.println("�޴��� �������ּ���.");
			menuNumbers = scan.nextInt(); // �޴���ȣ �Է� �ޱ�

			switch (menuNumbers) {
			case 1:
				System.out.println("�ο� ���� �ڵ� ��ȣ�� ������ �Է��Ͻÿ�.");
				countNumbers = scan.nextInt();
				for (int i = 0; i < countNumbers; i++) {
					int nums = i + 1;
					lottoNumbers = lotto.generate();
					System.out.print("[" + nums + "]" + " ������ ��ȣ�� ");
					System.out.print(lotto.print(lottoNumbers));
					System.out.println(" �Դϴ�.");
				}
				System.out.println("���Աݾ��� " + lotto.totalMoney(countNumbers) + "�� �Դϴ�.\n");
				break;
			case 2:
				System.out.println("���α׷��� �����մϴ�.");
				break check;
			default:
				System.out.println("���� �޴��Դϴ�");
			}
		}
		scan.close();
	}
}
