package ex2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ�");
		String name = scan.nextLine();
		System.out.println("ü���� �Է��Ͻÿ�(kg)");
		int weight = scan.nextInt();
		System.out.println("Ű�� �Է��Ͻÿ�(m)");
		float height = scan.nextFloat();
		
		int w=weight;
		float h=height;
		float BMI=w/(h*h);
		if(BMI<18.5) {
			System.out.println(name+"���� ü�ߺ����Դϴ�");
		}else if(BMI<22.9) {
			System.out.println(name+"���� �����Դϴ�");
		}else if(BMI<24.9) {
			System.out.println(name+"���� ��ü���Դϴ�");
		}else {
			System.out.println(name+"���� ���Դϴ�");
		}
	}
}
