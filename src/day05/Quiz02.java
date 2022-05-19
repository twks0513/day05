package day05;

public class Quiz02 {

	public static void main(String[] args) {


		for(int i=1;i<5;i++) {
			System.out.println(i+".hello");
		}
		System.out.println();
		
		int num=0;
		for(int i = 1; i<=100;i++) {
			num+=i;
			if(num ==528) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		for(int i =1;i<26;i++) {
			System.out.print(i+"\t");
			if(i%5==0) {
				System.out.println();
			}
		}

	}

}
