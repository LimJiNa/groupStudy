package exam1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BaseballGame baseballGame=new BaseballGame();
		Scanner scan=new Scanner(System.in);
		int[] input=new int[3];
		int[] strikeBall=new int[2];
		
		//정답 생성
		baseballGame.initialize();
		
		check:
		while(true) {
			//숫자 입력
			System.out.print("공을 던져주세요 : ");
			for(int i=0; i<input.length; i++) {
				input[i]=scan.nextInt();
			}
			
			//입력된 값의 유효성 검사
			for(int i=0; i<input.length; i++) {
				if(input[i]<1 || input[i]>9) {
					System.out.print("1~9 사이의 값을 입력해주세요");
					continue check;
				}
			}
			
			//입력된 값의 중복 검사
			if(input[0]==input[1] || input[0]==input[2] || input[1]==input[2]) {
				System.out.println("중복되지 않게 값을 입력해주세요");
				continue;
			}
			
			//정답 확인
			strikeBall=baseballGame.judge(input);
			if(strikeBall[0]==3) {
				System.out.println("정답입니다");
				System.out.println("투구 횟수: "+baseballGame.getCntThrow());
				break;
			}
			else {
				System.out.println(strikeBall[0]+"strike"+strikeBall[1]+"ball입니다");
			}
		}
	}
}
