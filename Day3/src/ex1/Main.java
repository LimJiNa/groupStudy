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
			System.out.println("@@ 영화 예약 프로그램 @@");
			System.out.println("1. 좌석확인(O : 예약 가능, X : 예약 완료)");
			System.out.println("2. 좌석 예약");
			System.out.println("3. 종료");
			System.out.print("메뉴를 선택하시오");
			menuInput=scan.nextInt();
			
			switch(menuInput) {
			case 1:
				movie.viewSeat();
				break;

			case 2:
				System.out.println("예약할 좌석을 입력하세요");
				System.out.print("행 : ");
				row=scan.nextInt();
				System.out.print("열 : ");
				col=scan.nextInt();
				movie.reservationSeat(row,col);
				break;

			case 3:
				System.out.println("프로그램을 종료합니다");
				break check;
			
			default:
				System.out.println("없는 메뉴입니다");
			}
		}
	}
}
