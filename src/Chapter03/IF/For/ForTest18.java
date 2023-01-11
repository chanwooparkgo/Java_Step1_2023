package Chapter03.IF.For;

import java.util.Scanner;

public class ForTest18 {

	public static void main(String[] args) {
		
		//정수입력받아서 입력된 수만큼 ★ 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int a = scan.nextInt();
		int i,j,k;
		int n =scan.nextInt();
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				System.out.println("★");
			}
			System.out.println();
		}

	}

}
