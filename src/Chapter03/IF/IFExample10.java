package Chapter03.IF;

import javax.swing.JOptionPane;

public class IFExample10 {

	public static void main(String[] args) {
		//서버
		String ID = "soldesk"; //인스턴스 변수
		int PW=221227; //정수형 변수
		//고객
		String id=JOptionPane.showInputDialog("아이디");
		int PASS=Integer.parseInt(JOptionPane.showInputDialog("비밃번호"));
		
		if(ID.equals(id)) {
			//비밀번호
			if(PW==221227) {
				System.out.println(ID +"님 환영합니다");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		}else {
			System.out.println("아이디가 일치하지 않습니다");
		}

	}//main

}//class
