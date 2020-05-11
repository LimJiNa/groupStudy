package ex1;

import java.util.Scanner;

public class PourWaterMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("======= ¹Ø ºüÁø µ¶¿¡ ¹° º×±â =======");
		System.out.println("1 : ¹Ø ¹Ù´Ú¿¡ ±¸¸Û ¶Õ±â");
		System.out.println("2 : ¹° º×±â(500ml)");
		WaterTank tank = new WaterTank(1000);
		WaterHoleThread waterThread1 = new WaterHoleThread(tank, 100);
		waterThread1.start();

		scan.nextLine();
		while (true) {
			int menuNumbers = scan.nextInt();
			switch (menuNumbers) {
			case 1:
				System.out.println(">> ±¸¸Û Ãß°¡µÊ");
				new WaterHoleThread(tank, 100).start();
				break;
			case 2:
				tank.pour(500);
				break;
			}
		}
	}
}
