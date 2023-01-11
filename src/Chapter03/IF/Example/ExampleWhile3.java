package Chapter03.IF.Example;

import java.util.Scanner;

public class ExampleWhile3 {

	public static void main(String[] args) {

		boolean run=true;
		int balance = 0;
		int save=0;
		int num,num2,money;
		Scanner scan = new Scanner(System.in);
		
		//if(조건) switch(key) case  for(초기값; 조건; 증감값) while(조건) do~while;
		
		while(run) {
			System.out.println("-----------------------------");
			int a = scan.nextInt();
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료 |");
			System.out.print("메뉴를 선택하세요");	
			num =scan.nextInt();
			
			if(num ==1) {
				System.out.println("예금을선택하셨습니다");
				System.out.println("현재금액"+save);
				System.out.print("입금할금액입력하세요");
				money = scan.nextInt();
				save +=money;
				if(money <0) {
					System.out.println("금액을 잘못 입력하셨습니다");
				}else if(num == 2){
					System.out.println("예금을선택하셨습니다");
					System.out.println("현재금액"+save);
					System.out.print("입금할금액입력하세요");
					money =scan.nextInt();
					save -= money;//save = save-money
					if(save < 0) {
						System.out.println("잔액이 부족합니다");
						save += money;//잔액이 부족하므로 송금시도했던 금액을 다시입금
					}
				}else if(num == 3) {
					System.out.println("잔액확인을 선택하셨습니다");
					System.out.print("현재 금액:"+save);
				}
			}else if(num ==4) {
				System.out.println("종료선택하셨");
				num2=scan.nextInt();
				run=false;
			}else {
				System.out.println("잘못된서비스번호입력하셨습니다");
			}
			
			System.out.print("1.초기메뉴2.종료");
			num2 = scan.nextInt();
		if(num2 ==2) {
			run=false;
		}
			
		}//while
		System.out.print("프로그램이종료됩니다");
	}//main

}
