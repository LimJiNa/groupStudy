package exam2;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		boolean[][] arr=new boolean[4][4];
		int n=rand.nextInt(4); //int n=rand.nextInt(arr.length);
		int m=rand.nextInt(4); //int m=rand.nextInt(arr[0.length);
		int x, y;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=true;
			}
		}
		System.out.println("������ ��Ÿ�����ϴ�");
		
		while(true) {
			System.out.println("��ġ�� �����ϼ���");
			System.out.print("��: ");
			x=scan.nextInt();
			System.out.print("��: ");
			y=scan.nextInt();
			
			if(!(x<4 && y<4)) {
				System.out.println("��ȿ���� ���� ��ġ�Դϴ�");
				continue;
			}
			
			if(x==n && y==m) {
				System.out.println("������ ã�ҽ��ϴ�\n������ �����մϴ�");
				break;
			}
			
			if(arr[x][y]) {
				arr[x][y]=false;
				System.out.println("������ ã�� ���߽��ϴ�");
			}else {
				System.out.println("�̹� ã�ƺ� ��ġ�Դϴ�");
			}
		}
		scan.close();
	}
}
