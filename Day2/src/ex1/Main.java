package ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] coin= {500,100,50,10};
		int money;
		int md=0;
		
		 while(true){
			System.out.println("�ݾ��� �Է��ϼ���");
			money=scan.nextInt();
			System.out.println("�Է��� �ݾ��� "+money+"�� �Դϴ�");
			
			int a=money/coin[0];
			System.out.println("500�� : "+a);
			md=money-(a*coin[0]);
			
			int b=md/coin[1];
			System.out.println("100�� : "+b);
			md=md-(b*coin[1]);
			
			int c=md/coin[2];
			System.out.println("50�� : "+c);
			md=md-(c*coin[2]);
			
			int d=md/coin[3];
			System.out.println("10�� :"+d);
			md=md-(d*coin[3]);
			
			scan.close();
		}
	}
}
