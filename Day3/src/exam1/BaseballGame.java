package exam1;

import java.util.Random;

public class BaseballGame {
	//멤버변수
	private int[] answer;
	private int cntThrow;
	private Random rand;

	//생성자
	BaseballGame() {
		answer=new int[3];
		cntThrow=0;
		rand=new Random();
	}
	
	//게임 시작 멘트 및 난수 생성
	void initialize() {
		System.out.println("숫자 야구 게임!");
		while(true) {
			for(int i=0; i<answer.length; i++) {
				answer[i]=rand.nextInt(9)+1;
			}
			if(!(answer[0]==answer[1] || answer[0]==answer[2] || answer[1]==answer[2])) {
				break;
			}			
		}
	}
	
	//정답 비교 및 스트라이크 볼 갯수 반환
	int[] judge(int[] input) {
		int[] strikeBall=new int[2];
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<input.length; j++) {
				if(answer[i]==input[j]) {
					if(i==j) {
						strikeBall[0]++;
					}else {
						strikeBall[1]++;
					}
				}
			}
		}
		cntThrow++;
		return strikeBall;
	}
	
	//투구 횟수 반환
	int getCntThrow() {
		return cntThrow;
	}
}
