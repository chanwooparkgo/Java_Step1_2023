package Chapter03.IF.For;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하시오
		
		Scanner scan = new Scanner(System.in);
		
		int a,cnt3=0, cnt5=0;
		
		System.out.println("정수를 입력하세요: ");
		
		for(int i=1; i<=10; i++) {
			a = scan.nextInt();
				if( a % 3 ==0 ) {
					System.out.println("3의배수"+ a);
					cnt3++;
				}//if
				if(a % 5 == 0) {
					System.out.println("5의배수"+a);
					cnt5++;
				}//if
				
			}//for		
		System.out.println("3의배수");
		System.out.println("3의배수");
	}//main

}
