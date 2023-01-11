package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {
		// bit 연산
		
		int num1=5; //0101
		int num2=10; //1010
		
		//bit or(|)
		int result=num1 | num2;
		System.out.println(result);
		
		//bit and(|)
				 result= num1 & num2;
				System.out.println(result);
				
		//bit xor(^)
		 result=num1 ^ num2;
		System.out.println(result);

	}

}
