package exam1;

import java.util.Random;

public class BaseballGame {
	//�������
	private int[] answer;
	private int cntThrow;
	private Random rand;

	//������
	BaseballGame() {
		answer=new int[3];
		cntThrow=0;
		rand=new Random();
	}
	
	//���� ���� ��Ʈ �� ���� ����
	void initialize() {
		System.out.println("���� �߱� ����!");
		while(true) {
			for(int i=0; i<answer.length; i++) {
				answer[i]=rand.nextInt(9)+1;
			}
			if(!(answer[0]==answer[1] || answer[0]==answer[2] || answer[1]==answer[2])) {
				break;
			}			
		}
	}
	
	//���� �� �� ��Ʈ����ũ �� ���� ��ȯ
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
	
	//���� Ƚ�� ��ȯ
	int getCntThrow() {
		return cntThrow;
	}
}
