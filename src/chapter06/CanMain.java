package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		
		String select="";
		int money=0;
		
		Vending ven= new Vending();
		ven.init();
		
		System.out.println("돈을투입하세요: ");
		Scanner scan=new Scanner(System.in);
		money=scan.nextInt();
		
		
		ven.showCans(money);
		
		
		System.out.println("음료를 선택하세요: ");
		select=scan.next();
		ven.outCan(select);
		
		ven.showCans(money);
	}

}
