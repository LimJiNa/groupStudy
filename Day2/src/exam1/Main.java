package exam1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] nums=new int[10];
		int temp;
		
		System.out.println("값들을 입력하세요");
		for(int i=0; i<nums.length; i++) {
			nums[i]=scan.nextInt();
		}
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i; j<nums.length; j++) {
				if(nums[i]<nums[j]) {
				temp=nums[j];
				nums[j]=nums[i];
				nums[i]=temp;
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+"\t");
		}
		System.out.println("\n최소값은 : "+nums[9]);
		System.out.println("최대값은 :"+nums[0]);
		
		scan.close();
	}
}
