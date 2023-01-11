package Chapter03.IF;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IFExample11 {

	public static void main(String[] args) {
		// Scanner scan이라는 인스턴스 변수 사용
		Scanner scan = new Scanner(System.in);
		
		
		//ID라는 변수로 아이디 받기
		System.out.println("아이디: ");
		
		String ID = scan.nextLine();//서버
		//String id = JOptionPane.showInputDialog("아이디");
		
		//PW라는 변수로 비번 받기(String) => 수자로 받되 String
		System.out.println("비밀번호: ");
		String PW = scan.nextLine();//서버
		//int형으로 형변환
		int pass = Integer.parseInt(JOptionPane.showInputDialog("비밀번호")); 
		
		
		//중첩질의를 사용하여 로그인 성공과 비밀번호 없음, 아이디 없음
		
		/*if(ID.equals("samsung")) {
			if(pass == 1234) {
				System.out.println(ID +" 로그인 성공 ");
			}else {
				System.out.println("비밀번호가 다름");
			}
		}else {
			System.out.println("아이디가 없음");
		}*/

		//논리연산자
		
		if (ID.equals("abc") && pass == 1234) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
			
		}
		
		
		
	}//main

}
