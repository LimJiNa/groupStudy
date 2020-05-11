package day1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		int a = 10;
		
//		while(true) {
//			a++;
//			System.out.println(a);
//			if(a > 100) {
//				break;
//			}
//		}
		
//		for(int i=0; i<100; i++) {
//			a++;
//			System.out.println(a+"¹øÂ°");
//			if(i==50) {
//				break;
//			}
//		}
		
		Scanner scan=new Scanner(System.in);
		String name = scan.nextLine();
		int weight = scan.nextInt();
		float height = scan.nextFloat();

		System.out.println(name+" "+weight+" "+height);
		
		scan.close();
	}
}
