package day05;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �� �Է� : ");
		int i = scan.nextInt();
		int num = scan.nextInt();
		int sum=0;
		if(i<num) {
			for(int j =i; j<=num;j++) {
				sum+=j;
			}
			System.out.println(sum);

		}else if(i>num) {
			for(int j =num; j<=i;j++) {
				sum+=j;
			}
			System.out.println(sum);
		}else {
			System.out.println("������");
		}
	}

}
