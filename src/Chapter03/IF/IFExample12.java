package Chapter03.IF;

import java.util.Scanner;

public class IFExample12 {

	public static void main(String[] args) {
		// 데이터베이스
		
		String ID = "soldesk";
		int PW = 221227;
		//Scanner scan
		Scanner scan = new Scanner(System.in);
		System.out.println("ID받기: ");
		//ID받기
		String inputID= scan.nextLine();
		
		if(ID.equals(inputID)) {
			//비번입력 받고
			System.out.println("비번: ");
			String inputPW =scan.nextLine();
			//비번확인 코드
			if(PW == Integer.parseInt(inputPW)) {
				System.out.println(ID+"성공");
			}else {
				System.out.println("비번확인완료");
			}
			
		}else {
			System.out.println("아이디가 틀렸습니다");
		}//out if

	}

}
