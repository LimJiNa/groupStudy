package ex2;

import java.util.Scanner;

public class Hd  {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int weight;
		float height;
		double bmi;
		
		System.out.println("�̸��� �Է��Ͻÿ�");
		name = scan.nextLine();
		System.out.println("ü���� �Է��Ͻÿ�(kg)");
		weight = scan.nextInt();
		System.out.println("Ű�� �Է��Ͻÿ�(m)");
		height = scan.nextFloat();
		
		bmi = weight / (height * height);
		if(bmi < 18.5) {
			System.out.println(name + "���� ü�ߺ����Դϴ�.");
		}
		else if(bmi < 22.9) {
			System.out.println(name + "���� �����Դϴ�.");
		}
		else if(bmi < 24.9) {
			System.out.println(name + "���� ��ü���Դϴ�.");
		}
		else {
			System.out.println(name + "���� ���Դϴ�.");
		}
		
		scan.close();
	}
}
