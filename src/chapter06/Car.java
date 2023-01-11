package chapter06;

import java.util.Scanner;

public class Car {

	//필드
	String company="현대자동차";
	String model="그랜저";
	String color="검정";
	int maxSpeed=350;
	int speed;
	
	
	public void Company() {
		System.out.println("제작회사 : 현대자동차");
	}
	public void Model() {
		System.out.println("모델명 : 그랜저");
		
	}
	public void Color() {
		System.out.println("색깔 : 검정");
		
	}
	public void MaxSpeed() {
		System.out.println("최고속도 : 350");
		
	}
	public void Speed() {
		Scanner scan = new Scanner(System.in);
		System.out.println("현재속도를 입력하세요");
		scan.nextInt();
	}
}
