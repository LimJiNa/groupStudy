package ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Movie movie=new Movie();
		int menuInput;
		int row,col;
		
		Scanner scan=new Scanner(System.in);
		
		check:
		while(true) {
			System.out.println("@@ ��ȭ ���� ���α׷� @@");
			System.out.println("1. �¼�Ȯ��(O : ���� ����, X : ���� �Ϸ�)");
			System.out.println("2. �¼� ����");
			System.out.println("3. ����");
			System.out.print("�޴��� �����Ͻÿ�");
			menuInput=scan.nextInt();
			
			switch(menuInput) {
			case 1:
				movie.viewSeat();
				break;

			case 2:
				System.out.println("������ �¼��� �Է��ϼ���");
				System.out.print("�� : ");
				row=scan.nextInt();
				System.out.print("�� : ");
				col=scan.nextInt();
				movie.reservationSeat(row,col);
				break;

			case 3:
				System.out.println("���α׷��� �����մϴ�");
				break check;
			
			default:
				System.out.println("���� �޴��Դϴ�");
			}
		}
	}
}
