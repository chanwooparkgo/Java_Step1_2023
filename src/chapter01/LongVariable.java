package chapter01;

public class LongVariable {

	public static void main(String[] args) {
		//int num1=12345678900;//32비트 = 4byte
		long num2= 12345678900L;
		long num3 = 1000;//long형의 64비트지만 L로 선언을 안했으므로 int로인식
		
		int level;//선언만하고 초기화되지않음
		level=10;//리터널값(초기화값)
		
		System.out.println(num2+num3);//결과값 :long
		System.out.println(level);
	}

}
