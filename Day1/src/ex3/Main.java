package ex3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ǥ �ݾ��� �Է��Ͻÿ�(100���� ����)");
		int a;
		a = scan.nextInt();
		System.out.println("��ǥ �ݾ��� "+a+"�����Դϴ�");
		System.out.println();

		int b;
		int c = 0;
		
		while(true) {
			System.out.println("�Աݾ��� �Է��Ͻÿ�(20���� ����)");
			b = scan.nextInt();
			if(b<=20) {
				System.out.println(b+"������ �Ա��Ͽ����ϴ�");
				c += b-5;
				System.out.println("���� ���� �ܾ���"+c+"�����Դϴ�");
				System.out.println();
			} else {
				System.out.println(b+"������ �Ա��Ͽ����ϴ�");
				System.out.println("20���� ������ �ݾ��� �Ա��Ͻÿ�");
				System.out.println();
			}
			if(c>a) {
				System.out.println("��ǥ���� �޼��Ͽ����ϴ�");
				break;
			}
		}
	}
}
