package chapter05;

import java.util.Scanner;

public class Method2 {
	int cnt,num;
	boolean run=true;
	String str="";
	Method br;
	Scanner scan = new Scanner(System.in);
	
	public Method2() {
		Method br =new Method();
	}
	void order2() {
		while(run) {
		System.out.println("1.빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종류 :");
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를입력하시오");
		
		num =scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("주문할빵의갯수");
			System.out.println("선택");
			int cnt1=scan.nextInt();
			br.makeBread(cnt1);
			break;
		case 2:
			System.out.println("주문할빵의갯수");
			int cnt2=scan.nextInt();
			System.out.println("주문할빵의종류");
			br.makeBread(cnt2);
			break;
			default:
				System.out.println("잘못된번호입니다");
		}//switch
	}//while
	
		
		
	}//method
	
	
}// class
