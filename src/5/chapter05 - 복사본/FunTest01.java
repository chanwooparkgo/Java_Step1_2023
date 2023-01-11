package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {

	
	//합계 메소드(함수)
	//접근지정자 : public(공용:제한없음) / protected(상속에서만 사용;패키지내에서만 공동사용) / private(class내에서만)
	//void: return 없음
	/*
	public static void sum(int num1, int num2) {
		//int num1;
		//int num2;
		int total = num1+num2;
		System.out.println(total);
	}//main
	*/
	
	//실행 담당하는 메소드
	public static void main(String[] args) {
		int a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		//sum(a,b);

	}//main
	
	//메인을 기준으로 하여 메인선언 선 또는 후에 정의해도 됨
	public  void sum(int num1, int num2) {
		//int num1;
		//int num2;
		int total = num1+num2;
		System.out.println(total);
	}//main

}
