package day05;

public class Ex01 {

	public static void main(String[] args) {
		int sum =0, i=0;
//		i++; sum = sum+i;
//		i++; sum = sum+i;
//		i++; sum = sum+i;
//		i++; sum = sum+i;
//		i++; sum = sum+i;
//		i++; sum = sum+i;
//		i++; sum = sum+i;
//		i++; sum = sum+i;
//		i++; sum = sum+i;
//		i++; sum = sum+i;
//		System.out.println("sum : "+sum);
		
		for(i=0;i<=10;i++) {
			sum = sum+i;			
		}
		
		System.out.println(sum);
		System.out.println();

		
		for (int k = 1; k<=10; k+=2) {
			System.out.println(k);
		}
		System.out.println();
		
		
		for(int k = 1; k<=10; k++) {
			if(k%2==1) {
				System.out.println(k);
			}
		}
		
		
		i =0;
		
		for (;i<3;) {
			System.out.println("test");
			i++;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
