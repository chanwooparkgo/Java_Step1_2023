package chapter05;

import java.util.Scanner;

public class FunTest07 {

	public FunTest07() {
		// TODO Auto-generated constructor stub
	}
	/*
	public static String Edustep(int edu) {
		String step;
		
		if(edu ==1) {
			step = "1단계";
		}else if(edu ==2) {
			step ="2단계";
		}else if(edu ==3){
			step ="3단계";
		}else {
			step ="단계없음";
		}
		return step;
	}*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("스터디단계를입력하세요: ");
		int number=scan.nextInt();
		//return값이 있는경우
		//String step=Edustep(number);
		//System.out.println("현재수업단계는: "+step+ "입니다");
		//System.out.println("현재수업단계는: "+Edustep(number)+ "입니다");
		//return  값이 없는경우
	}
	public static void Edustep(int edu) {
		String step=null;
		if(edu ==1) {
			System.out.println("step1단계입니다");;
		}else if(edu ==2) {
			System.out.println("step2단계입니다");
		}else if(edu ==3){
			System.out.println("step3단계입니다");
		}else {
			System.out.println("step4단계입니다");
		}
		System.out.println("아무단계도아닙니다");
		
	}//메소드(main바깥에있어야함)안그럼 오류가 뜸
	

}
