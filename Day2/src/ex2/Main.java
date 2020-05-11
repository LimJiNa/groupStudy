package ex2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] numbers;
		int n;
		int count;
		
		while(true) {
			System.out.println("N의 값을 입력하시오(1<N<10000)");
			n=scan.nextInt();
			numbers=new int[n];
			if(10000<n) {
				System.out.println("범위에 맞는 값을 입력하세요");
				continue;
			}
			
			for(int i=0; i<numbers.length; i++) {
				numbers[i]=i+1;
			}
			
			count=0;
			for(int i=0; i<numbers.length; i++) {
				if(numbers[i]%10==7) { //
					count++;//
				}
				if(numbers[i]/100%10==7) {
					count++;
				}
				if(numbers[i]/10%10==7) {
					count++;
				}
				if(numbers[i]/1000==7) {
					count++;
				}
			}
			System.out.println("1~"+n+"사이에 있는 7의 갯는"+count+"개 입니다");
		}
	}
}
