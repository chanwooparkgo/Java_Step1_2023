package Chapter03.IF.Example;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {

		boolean run=true;
		int balance = 0;
		int num =0;
		
		String choice;
		Scanner scan = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-----------------------------");
			int a = scan.nextInt();
			System.out.print("1.예금 |2.출금 |3.잔고 |4.종료 |");
			System.out.println("메뉴를 선택하세요");	
			int menuNum=Integer.parseInt(scan.nextLine());
			switch (menuNum) {
			case 1:
				System.out.print("예금 |");//0이하의 금액입력됏을때예외처리
				balance += Integer.parseInt(scan.nextLine());
				break;
			case 2://잔액이부족합니다
				System.out.print("출금 |");
				balance -= Integer.parseInt(scan.nextLine());
				break;
			case 3:
				System.out.print("잔고 |");
				System.out.print(balance);
				break;
			case 4:
				//System.err.print("4.종료 |");
				run = false;
				break;
			
			}
			System.out.println();
			System.out.print("프로그램종료");
			//System.out.println("-----------------------------");
			//System.out.println("선택>"+num);
			
			
			//System.out.println(choice + ">"  + num);
			
			
			
		}//while

	}

}
