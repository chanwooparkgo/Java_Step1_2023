package Chapter04;

import java.util.Scanner;

public class BookArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		//Book bk=new Book(); //5개 
		Book bk[] = new Book[5];
		
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i]);
		}
		
	}

}
