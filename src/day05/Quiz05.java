package day05;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		while(true) {
			System.out.println("���α׷�����");
			System.out.println("1. ȸ������");
			System.out.println("2. ���Ǳ�");
			System.out.println("3. ����");
			System.out.print(">>> ");
			select = scan.nextInt();
			
			if(select==1) {
						
				String id="",pw="";
				String joinid,joinpw;
				String loginid,loginpw;
				
				while(true) {
					System.out.println("1. �α���");
					System.out.println("2. ȸ������");
					System.out.println("3. ������");			
					System.out.print(">>> ");
					int choice = scan.nextInt();
					if(choice == 2) {
						System.out.print("������ ���̵� �Է� : ");
						joinid = scan.next();
						id = joinid;
						System.out.print("������ ��й�ȣ �Է� : ");
						joinpw = scan.next();
						pw = joinpw;
						System.out.println("���ԿϷ� !!!");
						continue;
					}else if(choice == 1) {
						System.out.print("���̵� �Է� : ");
						loginid = scan.next();
						System.out.print("��й�ȣ �Է� : ");
						loginpw = scan.next();
						if(id.equals(loginid) && pw.equals(loginpw)) {
							System.out.println("���� ���� !!!");
							
							
						}else {
							System.out.println("���� ���� !!!");
							
						}
					}else if(choice == 3) {
						System.out.println("ȸ������ ���α׷� �����մϴ� !!!");
						break;
					}
					
				
				}
				continue;
			}else if(select ==2) {
				
			
				int inputmoney;
				int coffee = 200;
				int cocoa = 250;
				int money;				
				int choice;
				System.out.print("����� �����ϼ��� >>> ");
				inputmoney = scan.nextInt();
				money = inputmoney;
				while(true) {
				System.out.println("==========Ŀ�� ���Ǳ�==========");
				System.out.println("\n");
				System.out.println("1.Ŀ��(200)\t2. ���ھ�(250)\t3. ��ȯ\t4. ����");
				System.out.print("�޴��� �����ϼ��� >>> ");
				
				choice = scan.nextInt();
				
				if(choice == 1) {
					if(money>coffee) {
						System.out.println("���ְ� �弼��");
						money-=coffee;
					}else {
						System.out.println("����� �����մϴ�.");
					}
				}else if(choice == 2) {
					if(money>cocoa) {
						System.out.println("���ְ� �弼��");
						money-=cocoa;
					}else {
						System.out.println("����� �����մϴ�.");
					}
				}else if(choice == 3) {
					System.out.println("�Ž����� : "+money);
					money = 0;
				}else if(choice == 4) {
					System.out.println("���Ǳ� ���α׷� ����!!!");
					break;
					}
				
				}
			}else if(select == 3) {							
				System.out.println("��ü ���α׷� �����մϴ�");
				System.exit(0);
			}else {			
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}
			
				
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
