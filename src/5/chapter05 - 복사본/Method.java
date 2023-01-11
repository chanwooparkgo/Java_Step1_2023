package chapter05;

import java.util.Scanner;

public class Method {
	
	//멤버변수(=필드)
	
	//생성자 생략
	
	//메소드
	void makeBread() {
		System.out.println("빵을 만듭니다");
	}//메소드1
	
	void makeBread(int count) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		//.....
		//요청하신 5개의 빵이 모두 완료되었습니다
		
		for(int i=0; i<count; i++) {
			
			System.out.println((i+ 1)+ "번째 빵을 만들었습니다");//괄호 +1
		}
		System.out.println("요청하신"+count+ "개의빵이모두완료되었습니다");
		
	}//메소드2
	
	void makeBread(int count, String name) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		//.....
		//요청하신 5개의 빵이 모두 완료되었습니다
		
		for(int i=0; i<count; i++) {
			
			System.out.println((i+ 1)+ "번째 빵을 만들었습니다");//괄호 +1
		}
		System.out.println("요청하신"+count+ "개의빵이모두완료되었습니다");
		
	}//메소드3
	
	void order( ) {
		boolean run = true;//while문반복문 변수 선언문
		String d;
		int a,b,c;//a: number값, b: scan, c: 
		//int count=0;
		Scanner scan = new Scanner(System.in);
		
		
		
		while(run) {
		System.out.println("1.빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종류 :");
		System.out.println("선택");
		a=scan.nextInt();
		
		if(a ==1) {
			System.out.print("주문할 빵의 갯수: ");
			b=scan.nextInt();	
			makeBread(b);
			if(b<1) {
				System.out.println("잘못입력하셨습니다");
			}
			
		}else if(a == 2) {
			System.out.println("빵의 갯수: ");
			b=scan.nextInt();
			System.out.println("빵의 갯수: ");
			b=scan.nextInt();
			String name=scan.next();
			
		}else if(a == 3) {
			run =false;
			System.out.println("종료");
		}
		
		
		}//while
		
		
		
	}//order method

}
