package day05;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int num = scan.nextInt();
		int evensum=0, oddsum=0, sum=0;
		for(int i =1; i<=num; i++) {
			if(i%2==0) {
				evensum +=i; 
				
			}else{
				oddsum +=i;
				
			}
			sum +=i;	
			
		}
		System.out.println("¦�� �� : "+evensum);
		System.out.println("Ȧ�� �� : "+oddsum);
		System.out.println("�� �� : "+sum);
	}

}
