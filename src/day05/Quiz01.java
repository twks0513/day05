package day05;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¼ö ÀÔ·Â : ");
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
		System.out.println("Â¦¼ö ÇÕ : "+evensum);
		System.out.println("È¦¼ö ÇÕ : "+oddsum);
		System.out.println("ÃÑ ÇÕ : "+sum);
	}

}
