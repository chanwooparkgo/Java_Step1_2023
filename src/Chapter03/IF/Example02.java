package Chapter03.IF;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// gender가 M이면 남성입니다 그렇지않으면 여성입니다
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성별입력");
		char gender;
		gender=scan.nextLine().charAt(0);
		
		if(gender == 'M' ) {
			System.out.println("남성");
		}else {
			System.out.println("여성");
		}
		
		System.out.println("===============");
		System.out.println();
		System.out.print("주문하시겠습니까?(y,n)");
		
		char ch;
		//조건에 논리함수 사용
		ch = scan.nextLine().charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			System.out.print("메뉴입력하세요: ");
			String menu = scan.nextLine();			
			System.out.println(menu +"주문되었습니다");
		}else {
			System.out.println("감사합니다");
		}

	}

}
