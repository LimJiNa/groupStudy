package ex3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("목표 금액을 입력하시오(100만원 이하)");
		int a;
		a = scan.nextInt();
		System.out.println("목표 금액은 "+a+"만원입니다");
		System.out.println();

		int b;
		int c = 0;
		
		while(true) {
			System.out.println("입금액을 입력하시오(20만원 이하)");
			b = scan.nextInt();
			if(b<=20) {
				System.out.println(b+"만원을 입금하였습니다");
				c += b-5;
				System.out.println("현재 통장 잔액은"+c+"만원입니다");
				System.out.println();
			} else {
				System.out.println(b+"만원을 입금하였습니다");
				System.out.println("20만원 이하의 금액을 입금하시오");
				System.out.println();
			}
			if(c>a) {
				System.out.println("목표액을 달성하였습니다");
				break;
			}
		}
	}
}
