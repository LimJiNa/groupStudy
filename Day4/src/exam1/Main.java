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
			System.out.println("Lotto번호 자동 생성기");
			System.out.println("1.자동 번호 부여 받기");
			System.out.println("2.프로그램 종료");
			System.out.println("메뉴를 선택해주세요.");
			menuNumbers = scan.nextInt(); // 메뉴번호 입력 받기

			switch (menuNumbers) {
			case 1:
				System.out.println("부여 받을 자동 번호의 갯수를 입력하시오.");
				countNumbers = scan.nextInt();
				for (int i = 0; i < countNumbers; i++) {
					int nums = i + 1;
					lottoNumbers = lotto.generate();
					System.out.print("[" + nums + "]" + " 생성된 번호는 ");
					System.out.print(lotto.print(lottoNumbers));
					System.out.println(" 입니다.");
				}
				System.out.println("구입금액은 " + lotto.totalMoney(countNumbers) + "원 입니다.\n");
				break;
			case 2:
				System.out.println("프로그램을 종료합니다.");
				break check;
			default:
				System.out.println("없는 메뉴입니다");
			}
		}
		scan.close();
	}
}
