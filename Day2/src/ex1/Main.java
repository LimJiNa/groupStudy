package ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] coin= {500,100,50,10};
		int money;
		int md=0;
		
		 while(true){
			System.out.println("금액을 입력하세요");
			money=scan.nextInt();
			System.out.println("입력한 금액은 "+money+"원 입니다");
			
			int a=money/coin[0];
			System.out.println("500원 : "+a);
			md=money-(a*coin[0]);
			
			int b=md/coin[1];
			System.out.println("100원 : "+b);
			md=md-(b*coin[1]);
			
			int c=md/coin[2];
			System.out.println("50원 : "+c);
			md=md-(c*coin[2]);
			
			int d=md/coin[3];
			System.out.println("10원 :"+d);
			md=md-(d*coin[3]);
			
			scan.close();
		}
	}
}
