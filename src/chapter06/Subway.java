package chapter06;

public class Subway {
	//멤버변수
	
		public String lineNumber;
		int passengerCount;
		int money;
		
		//디폴트 생성자는 생략
		
		public  Subway(String lineNumber) {
			this.lineNumber=lineNumber; 
		}
		
		public void take(int money) {// 승객이낸 돈
			this.money +=money;//지하철의 수익증가
			passengerCount++;//승객 수
		}
		
		public void showInfo() {//지하철의 정보출력
			System.out.println("지하철"+ lineNumber+"번의 승객은"+ passengerCount+"명이고 ,수입은"+ money+"원입니다");
			
		}
}
