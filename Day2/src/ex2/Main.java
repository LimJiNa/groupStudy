package ex2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] numbers;
		int n;
		int count;
		
		while(true) {
			System.out.println("N�� ���� �Է��Ͻÿ�(1<N<10000)");
			n=scan.nextInt();
			numbers=new int[n];
			if(10000<n) {
				System.out.println("������ �´� ���� �Է��ϼ���");
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
			System.out.println("1~"+n+"���̿� �ִ� 7�� ����"+count+"�� �Դϴ�");
		}
	}
}
