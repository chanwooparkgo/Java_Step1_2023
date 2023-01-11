package Chapter03.IF.For;

public class ForTest04 {

	public static void main(String[] args) {
		// 0~100까지의 수 중 홀수만 합하기
		
		int num;
		int total=0;
		
		for(num=0; num<=100; num++) {
			if(num % 2 == 0) 
				continue; //그냥 무시
		
			total += num;
			
		}//for
		
		System.out.println("=========================");
		System.out.println();
		System.out.print("1~20까지의 수 중 홀수값만 출력하시오");
		
		/*for(int i=0; i<=20; i++) {
			if(i%2==1) {
				System.out.println("1~20까지의 홀수: "+i);
		
			}//if
		}//for
		*/
		
		for(int j=0; j<=20; j++) {
			if(j%2== 0) {
				continue;
		
			}//if
			System.out.println("20까지의 홀수 값"+ j);
			
		}//for
		
		
		
		
		
		
		
		
	}//main

}//class
