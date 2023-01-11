package chapter05;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		
		int num1;
		int num2 = 0;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num1=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		/*
		int res=num1/num2;
		System.out.println(res);
		*/
		
		try {
			System.out.println(num1/num2);//해당작업코드
		} catch (ArithmeticException e) {
			System.out.println("숫자0를입력하시면 안됩니다");//에러시 수행되어야 할 코드
		}//try
		
		System.out.println("error 후 컴파일 -> 프로그램 종료");
	}//main
	

}
