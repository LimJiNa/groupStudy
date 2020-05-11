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
		System.out.println("보물이 나타났습니다");
		
		while(true) {
			System.out.println("위치를 선택하세요");
			System.out.print("행: ");
			x=scan.nextInt();
			System.out.print("열: ");
			y=scan.nextInt();
			
			if(!(x<4 && y<4)) {
				System.out.println("유효하지 않은 위치입니다");
				continue;
			}
			
			if(x==n && y==m) {
				System.out.println("보물을 찾았습니다\n게임을 종료합니다");
				break;
			}
			
			if(arr[x][y]) {
				arr[x][y]=false;
				System.out.println("보물을 찾지 못했습니다");
			}else {
				System.out.println("이미 찾아본 위치입니다");
			}
		}
		scan.close();
	}
}
