package Chapter03.IF;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//정보처리기사의 각 과목의 정답개수를 int형 타입의 변수 5개를 선언하고 입력받으세요
		//(단 입력은 Scanner클래스 사용)
        //소프트웨어 설계(soft1), 소프트웨어 개발(soft2), 데이터베이스 구축(DB), 
		//프로그램밍언어활용(pro), 정보시스템 구축(os)
		//한 과목이라도 8개 미만,전체갯수가(sum)이 60점 미만인 경우 불합격입니다로 출력
		//그렇지 않으면 합격입니다으로 출력
		
		//입력은 Scanner

		
		Scanner soft1 = new Scanner(System.in);
		System.out.println("soft1정답개수를 입력하세요");
		int a = soft1.nextInt();
		Scanner soft2 = new Scanner(System.in);
		System.out.println("soft2정답개수를 입력하세요");
		int b = soft2.nextInt();
		Scanner DB = new Scanner(System.in);
		System.out.println("db정답개수를 입력하세요");
		int c = DB.nextInt();
		Scanner pro = new Scanner(System.in);
		System.out.println("pro정답개수를 입력하세요");
		int d = pro.nextInt();
		Scanner os = new Scanner(System.in);
		System.out.println("os정답개수를 입력하세요");
		int e = pro.nextInt();
		
		System.out.println("첫번째과목"+a);
		System.out.println("두번째과목"+b);
		System.out.println("세번째과목"+c);
		System.out.println("네번째과목"+d);
		System.out.println("다섯번째과목"+e);
		//int result = 8;
		int sum = a+b+c+d+e;
		
		if(a <8 || b < 8 || c <8 || d <8 || e < 8 || sum<60 ) {
			System.out.println("불합격입니다");
		}else {
			System.out.println("합격입니다");			
		}
		
	}//main

}
