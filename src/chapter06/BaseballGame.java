package chapter06;

import java.util.Random;
import java.util.Scanner;
/*
public class BaseballGame {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//컴퓨터가 발생한 난수1개
		
		int com1=0;
		int com2=0;
		int com3=0;
		
		do {
			//1에서9사이의난수발생
			
			com1= new Random().nextInt(9)+1;
			com2= new Random().nextInt(9)+1;
			com3= new Random().nextInt(9)+1;
			
			for(int i=0; i<Random().nextInt(9)+1) {
				
			}
			
			
		} while (com1 ==com2||com3==com1|| com2==com3);
		
		//컴퓨터준비완료
		
		//사용자가 입력할 수
		int user1=0;
		int user2=0;
		int user3=0;
		while(true) {
			
			System.out.println("1~9사이의 수를 입력하세요: ");
			System.out.println("첫번째 수를 입력하세요: ");
			user1=scan.nextInt();//사용자가 입력한수
			System.out.println("두번째 수를 입력하세요: ");
			user1=scan.nextInt();//사용자가 입력한수
			System.out.println("세번째 수를 입력하세요: ");
			user1=scan.nextInt();//사용자가 입력한수
			
			int strike=0;
			int ball = 0;
			//만약에 com1과 사용자가 입력할 첫번째(user1)숫자가 같으면 스트라이크 
			//첫번째(user1)숫자가 com2 또는 com3랑 숫자만 맞으면   ball
			
			if(user1 == com1) {
				strike++;
				
			}else if(user1==user2 || user1==user3) {
				ball++;
			}
			///////////////////////////
			if(user2 == com2) {
				strike++;
			}else if(user2 == com2 || user2 ==com3) {
				ball++;
			}
			/////////////////////////
			if(user3 == com3) {
				strike++;
			}else if(user3 == com2 || user3 ==com1) {
				ball++;
			}
			///////////////////////////
			if(strike ==3) {
				System.out.println("정답 -"+com1+com2+com3);
			}else {
				if(strike >0 || ball > 0) {
					System.out.println(strike+"strike , "+ball+"ball");					
				}else {// 아무것도 일치하지않는것이 없을경우
					System.out.println("out");
					System.out.println("===================");
				}//in if
			}//out if
		}//while
		
		
		
		
	}

}*/
