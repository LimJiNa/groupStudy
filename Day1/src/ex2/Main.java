package ex2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		String name = scan.nextLine();
		System.out.println("체중을 입력하시오(kg)");
		int weight = scan.nextInt();
		System.out.println("키를 입력하시오(m)");
		float height = scan.nextFloat();
		
		int w=weight;
		float h=height;
		float BMI=w/(h*h);
		if(BMI<18.5) {
			System.out.println(name+"님은 체중부족입니다");
		}else if(BMI<22.9) {
			System.out.println(name+"님은 정상입니다");
		}else if(BMI<24.9) {
			System.out.println(name+"님은 과체중입니다");
		}else {
			System.out.println(name+"님은 비만입니다");
		}
	}
}
