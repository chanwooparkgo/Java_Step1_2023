package Chapter03.IF.For;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		//문제1 -> 정수를 입력받아 입력받은 정수부터 100까지의 합을 출려하시오(scanner)
		/*
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하시오");
		int a = scan.nextInt();
		for(int i=a; i<=100; i++) {
			System.out.println(" ");
			sum += i;
		}//for
		System.out.println("입력값부터 정수의 합"+ sum);
		*/
		
		
		//문제2 -> 1~10번까지 반복하면서 정수를 입력받아 그 수 중에 짝수이 갯수 몇 개인지 출력
		//단, 입력받은 수가 0이면 무시
		int b;
		int count = 0;
		Scanner scan2 = new Scanner(System.in);
		System.out.println("입력하시오");
		int a2 = scan2.nextInt();
		for(int j=a2; j<=10; j++) {
			
			if(j % 2 == 0) {
				count++;
				continue;
			}
			System.out.println(" ");
		}//for
		
		System.out.println("1~10까지중에 짝수갯수 => 짝수의 개수는?"+ count);

	}//main

}//class
