package Chapter03.IF.For;

public class ForTest01 {

	public static void main(String[] args) {
		// 1부터 10까지 합
		
		/*
		 * int sum=1;
		sum =sum+2;
		// sum += 2;
		
		
		System.out.println(sum);
		*/
		
		int i;
		System.out.println("1부터10까지의수 출력");
		for(i=1; i<=10; i++) {
			System.out.print(i + " ");
		}//for

		System.out.println();
		System.out.println("===============");
		
		int j; //index 변수
		int sum =0;//누적변수이므로 반드시 초기화시킴
		
		for(j=1; j<=10; j++) {
			System.out.print(j+ " ");
			sum += j;
		}
		System.out.println();
		System.out.print("1부터10까지합: "+ sum + "입니다");
		
		
		
		
	}//main

}//class
