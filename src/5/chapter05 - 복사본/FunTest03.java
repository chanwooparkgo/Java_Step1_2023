package chapter05;

import javax.swing.JOptionPane;

public class FunTest03 {
	
	//메인을 기준으로 하여 메인선언 선 또는 후에 정의해도 됨
	public static void swap(int x, int y) {
		
		//교체알고리즘
		
		int temp= x;
		x=y;
		y=temp;
		
		System.out.println("swap() 결과 값: x ="+ x+", y"+y);
		
	}//main	
		
	public static void main(String[] args) {
		
		int a =10;
		int b = 20;
		
		System.out.println("swap() 호출 전: a ="+ a+", b"+b);
		System.out.println("===================================");
		swap(a,b);
		System.out.println("===================================");
		System.out.println("swap() 호출 후: a ="+ a+", b"+b);
	}//main
	
	
		
		
		
		
	

}
