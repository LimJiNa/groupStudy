package ex2;

import java.util.Scanner;

public class HoMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, count;
		int[] arr;
		
		while(true) {
			System.out.println("N의 값을 입력하시오. (1<N<10000)");
			n = scan.nextInt();
			if(n>1 && n<10000) {
				arr = new int[n];
				break;
			}
			System.out.println("범위에 맞는 값을 입력하세요.");
		}
		
		//초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		//알고리즘
		count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 10 == 7) {  // N의 1의 자리를 검사
				count++;
			}
			if((arr[i] / 10) % 10 == 7) {  // N의 10의 자리를 검사
				count++;
			}
			if((arr[i] / 100) % 10 == 7) {  // N의 100의 자리를 검사
				count++;
			}
			if((arr[i] / 1000) % 10 == 7) {  // N의 1000의 자리를 검사
				count++;
			}
		}
		
		//출력
		System.out.println("1~" + n + " 사이에 있는 7의 개수는 " + count + "개 입니다.");
		
		scan.close();
	}
}
