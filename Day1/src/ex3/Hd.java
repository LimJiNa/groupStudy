package ex3;

import java.util.Scanner;

public class Hd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int goalMoney, inputMoney, totalMoney;
		
		System.out.println("목표 금액을 입력하시오(100만원 이하)");
		goalMoney = scan.nextInt();
		System.out.println("목표 금액은 " + goalMoney + "만원 입니다.\n");
		totalMoney = 0;
		
		while(true) {
			System.out.println("입금액을 입력하시오(20만원 이하)");
			inputMoney = scan.nextInt();
			if(inputMoney > 20) {
				System.out.println("20만원 이하의 금액을 입금하시오.");
				continue;
			}
			if(inputMoney < 5) {
				System.out.println("5만원 미만의 금액을 넣을 수 없습니다.");
				continue;
			}
			System.out.println(inputMoney + "만원을 입금하였습니다.");
			totalMoney += (inputMoney - 5);
			System.out.println("현재 통장 잔액은 " + totalMoney + "만원 입니다.");
			if(totalMoney > goalMoney) {
				System.out.println("목표액을 달성하였습니다.");
				break;
			}
		}
	}
}
