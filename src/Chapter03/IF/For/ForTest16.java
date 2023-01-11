package Chapter03.IF.For;

import java.util.Scanner;

public class ForTest16 {

	public static void main(String[] args) {
		
		int i,j;
		for(i=2; i<=9; i++) {
			System.out.print("["+i+"단" +"]"+ "\t");
			System.out.println();
			for(j=1; j<=9; j++) {
				System.out.print( i + "*" + j + "="+ j*i + "\t" );
		}//for
			System.out.println();
		}//
		
	}

}
