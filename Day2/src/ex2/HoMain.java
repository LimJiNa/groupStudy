package ex2;

import java.util.Scanner;

public class HoMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, count;
		int[] arr;
		
		while(true) {
			System.out.println("N�� ���� �Է��Ͻÿ�. (1<N<10000)");
			n = scan.nextInt();
			if(n>1 && n<10000) {
				arr = new int[n];
				break;
			}
			System.out.println("������ �´� ���� �Է��ϼ���.");
		}
		
		//�ʱ�ȭ
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		//�˰���
		count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 10 == 7) {  // N�� 1�� �ڸ��� �˻�
				count++;
			}
			if((arr[i] / 10) % 10 == 7) {  // N�� 10�� �ڸ��� �˻�
				count++;
			}
			if((arr[i] / 100) % 10 == 7) {  // N�� 100�� �ڸ��� �˻�
				count++;
			}
			if((arr[i] / 1000) % 10 == 7) {  // N�� 1000�� �ڸ��� �˻�
				count++;
			}
		}
		
		//���
		System.out.println("1~" + n + " ���̿� �ִ� 7�� ������ " + count + "�� �Դϴ�.");
		
		scan.close();
	}
}
