package day05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int i=0;
		//for(;i<3;) {
		while(i<3) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		i=0;
		while(true) {
			System.out.print("�� �Է� (1~100) : ");
			i = scan.nextInt();
			if(i>=1&&i<=100) 
				break;
			System.out.println("�����ʰ�! �ٽ� �Է��ϼ���");
			
			
		}
		for(int j=1;j<=i; j++) 
			sum+=j;
		System.out.println("�Է¹��� �������� �� : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
