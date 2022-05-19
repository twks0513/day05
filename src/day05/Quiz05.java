package day05;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		while(true) {
			System.out.println("프로그램선택");
			System.out.println("1. 회원가입");
			System.out.println("2. 자판기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			select = scan.nextInt();
			
			if(select==1) {
						
				String id="",pw="";
				String joinid,joinpw;
				String loginid,loginpw;
				
				while(true) {
					System.out.println("1. 로그인");
					System.out.println("2. 회원가입");
					System.out.println("3. 나가기");			
					System.out.print(">>> ");
					int choice = scan.nextInt();
					if(choice == 2) {
						System.out.print("저장할 아이디 입력 : ");
						joinid = scan.next();
						id = joinid;
						System.out.print("저장할 비밀번호 입력 : ");
						joinpw = scan.next();
						pw = joinpw;
						System.out.println("가입완료 !!!");
						continue;
					}else if(choice == 1) {
						System.out.print("아이디 입력 : ");
						loginid = scan.next();
						System.out.print("비밀번호 입력 : ");
						loginpw = scan.next();
						if(id.equals(loginid) && pw.equals(loginpw)) {
							System.out.println("인증 성공 !!!");
							
							
						}else {
							System.out.println("인증 실패 !!!");
							
						}
					}else if(choice == 3) {
						System.out.println("회원가입 프로그램 종료합니다 !!!");
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
				System.out.print("요금을 투입하세요 >>> ");
				inputmoney = scan.nextInt();
				money = inputmoney;
				while(true) {
				System.out.println("==========커피 자판기==========");
				System.out.println("\n");
				System.out.println("1.커피(200)\t2. 코코아(250)\t3. 반환\t4. 종료");
				System.out.print("메뉴를 선택하세요 >>> ");
				
				choice = scan.nextInt();
				
				if(choice == 1) {
					if(money>coffee) {
						System.out.println("맛있게 드세요");
						money-=coffee;
					}else {
						System.out.println("요금이 부족합니다.");
					}
				}else if(choice == 2) {
					if(money>cocoa) {
						System.out.println("맛있게 드세요");
						money-=cocoa;
					}else {
						System.out.println("요금이 부족합니다.");
					}
				}else if(choice == 3) {
					System.out.println("거스름돈 : "+money);
					money = 0;
				}else if(choice == 4) {
					System.out.println("자판기 프로그램 종료!!!");
					break;
					}
				
				}
			}else if(select == 3) {							
				System.out.println("전체 프로그램 종료합니다");
				System.exit(0);
			}else {			
				System.out.println("다시 입력하세요");
				continue;
			}
			
				
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
