package day05;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(true) {
			int sum=0;
			
			System.out.print("�� �Է� (1~20): ");
			int num = scan.nextInt();
			if(num < 1 || num > 20) {
				System.out.println("�����ʰ�");
				break;
			}else {
				for(int j= 1; j<=num;j++) {
					sum += j;
				}
				System.out.println(sum);
			}
		}
			
			

	
	}

}
