package ex2;

import java.util.Scanner;

public class Hd  {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int weight;
		float height;
		double bmi;
		
		System.out.println("이름을 입력하시오");
		name = scan.nextLine();
		System.out.println("체중을 입력하시오(kg)");
		weight = scan.nextInt();
		System.out.println("키를 입력하시오(m)");
		height = scan.nextFloat();
		
		bmi = weight / (height * height);
		if(bmi < 18.5) {
			System.out.println(name + "님은 체중부족입니다.");
		}
		else if(bmi < 22.9) {
			System.out.println(name + "님은 정상입니다.");
		}
		else if(bmi < 24.9) {
			System.out.println(name + "님은 과체중입니다.");
		}
		else {
			System.out.println(name + "님은 비만입니다.");
		}
		
		scan.close();
	}
}
