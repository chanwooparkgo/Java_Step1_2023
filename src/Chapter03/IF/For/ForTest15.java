package Chapter03.IF.For;

import java.util.Scanner;

public class ForTest15 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			int i,j;
			System.out.println("행을입력하세요");
			int a= scan.nextInt();
			int b= scan.nextInt();
		for(i=1; i<a; i++) {
			for(j=1; j<=b; j++) {
				System.out.print(i*j+ " ");
			}//
			System.out.println();
		}//


	}

}
