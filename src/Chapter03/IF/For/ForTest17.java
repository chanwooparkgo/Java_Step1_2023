package Chapter03.IF.For;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★ ○ 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int a = scan.nextInt();
		/*
		for(int i=1; i<=a; i++) {
			for(int j=1; j>i; j--) {
				System.out.println(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("★");
			}	
			System.out.println();
			
		}//for
*/
		int n = scan.nextInt();
		for( int i=0; i<n; i++)
		{
			for( int j=0; j<=n-1-i; j++)//공백
			{
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++)//별
			{
				System.out.print("★");
			}
			System.out.println();
		}//전체회전수
		
	}//main

}
