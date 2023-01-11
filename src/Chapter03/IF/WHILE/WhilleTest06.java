package Chapter03.IF.WHILE;

import java.util.Scanner;

public class WhilleTest06 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int num;
		
		String menu = "";
		
		do {
			System.out.println("1.입력하기");
			System.out.println("2.출력하기");
			System.out.println("3.삭제하기");
			System.out.println("4.끝내기");
			System.out.print("작업할 번호를 선택하세요.: ");
			num = scan.nextInt();
			//예외처리
			if(num == 4) {
				break;
			}
			//1~3을 선택시 수행문
			if(num < 1 ||  num > 3) {
			  if(num == 4){
			  break;
			  }//inner if
				menu="잘못 입력하였습니다";
			}//if
			if(num ==1) {
				menu = "입력하기";
			}else if(num ==2){
				menu = "출력하기";
			}else if(num ==3){
				menu = "삭제하기";
			}//if else문
			System.out.print(menu+"선택하셨습니다\n");
			
		}while(num != 4);
			System.out.println("\n 끝내셨습니다");
	
	
	
	
	
	}

}
