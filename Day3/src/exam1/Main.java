package exam1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BaseballGame baseballGame=new BaseballGame();
		Scanner scan=new Scanner(System.in);
		int[] input=new int[3];
		int[] strikeBall=new int[2];
		
		//���� ����
		baseballGame.initialize();
		
		check:
		while(true) {
			//���� �Է�
			System.out.print("���� �����ּ��� : ");
			for(int i=0; i<input.length; i++) {
				input[i]=scan.nextInt();
			}
			
			//�Էµ� ���� ��ȿ�� �˻�
			for(int i=0; i<input.length; i++) {
				if(input[i]<1 || input[i]>9) {
					System.out.print("1~9 ������ ���� �Է����ּ���");
					continue check;
				}
			}
			
			//�Էµ� ���� �ߺ� �˻�
			if(input[0]==input[1] || input[0]==input[2] || input[1]==input[2]) {
				System.out.println("�ߺ����� �ʰ� ���� �Է����ּ���");
				continue;
			}
			
			//���� Ȯ��
			strikeBall=baseballGame.judge(input);
			if(strikeBall[0]==3) {
				System.out.println("�����Դϴ�");
				System.out.println("���� Ƚ��: "+baseballGame.getCntThrow());
				break;
			}
			else {
				System.out.println(strikeBall[0]+"strike"+strikeBall[1]+"ball�Դϴ�");
			}
		}
	}
}
