package Chapter03.IF.WHILE;

import java.util.Scanner;

public class WhileTest08 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int num;	
		String menu = "";
		
		while(true) {
			System.out.print("1.입력하기\n2.출력하기\n3.삭제하기\n4.끝내기\n작업할 번호를 선택해주세요");
			num = scan.nextInt();
			System.out.println();
			
			switch(num) {
			case 1:
				System.out.println("입력하기를 누르셨습니다");
				break;
			case 2: {
				System.err.println("출력하기를 선택하셨습니다");
				break;
			}case 3: {
				System.err.println("끝내기를 선택하셨습니다");
				break;
			}case 4: {
				System.err.println("삭제하기를 선택하셨습니다");
				break;
			}default :
				System.err.println("잘못 입력하셨습니다");
			
			}//switch
			System.out.println("다시 입력하세요");
			
		}//while

	}

}
