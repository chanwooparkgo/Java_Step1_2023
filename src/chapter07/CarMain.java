package chapter07;


public class CarMain {

	public static void main(String[] args) {
		
		//생성자를 통하여 초기화
		Car car = new Car("검정",4000);
		
		//멤버변수에 직접 접근해서 출력
		System.out.println("자동차색깔: "+ car.color+ "자동차연비: "+car.cc);
		System.out.println();
		
		System.out.println("-------------");
		//메서드를 이용한 출력
		
		System.out.println(car.getColor()+ car.getCc());
		car.color="black";
		car.cc=500;
		
	}

}
