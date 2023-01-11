package chapter06;

import java.util.Scanner;

//import com.sun.tools.javac.comp.Check;

public class StartMain {

	public static void main(String[] args) {
		int select;
		String check;
		Scanner scan = new Scanner(System.in);
		
		
		Start s = new Start();
		//객체생성
		//방법1
		while(true) {
			
			System.out.print("숫자를 입력하세요: ");
			select = scan.nextInt();
			check=s.check(select);
			
			if(check.equals("success"))
			break;
			
		}//while
		//방법2
		
		Start obj =new Start();
		int num;
		
		do {
			System.out.print("숫자를 입력하세요: ");
			num = scan.nextInt();
			check= s.check(select);
			
		}while(obj.check(num).equals("fail"));
		
	}//main

}
