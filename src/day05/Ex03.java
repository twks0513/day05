package day05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			if(i==3) {
				System.out.println("if����");
				//continue;
				break;
			}
			System.out.println("i : "+i);
		}
		int n1=10,n2=10;
		if(n1==n2) {
			System.out.println("�μ��� ����");
		}
		String s1,s2;
		Scanner scan =new Scanner(System.in);
		System.out.println("���� �Է�");
		s1=scan.next();
		System.out.println("���� �Է�");
		s2=scan.next();
		
		if(s1.equals(s2)) {
			System.out.println("�� ���ڴ� ����");
		}
		System.out.println(s1.equals(s2));
		
	}

}
