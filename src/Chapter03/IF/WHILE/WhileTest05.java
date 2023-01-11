package Chapter03.IF.WHILE;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		
		double avg;
		int num,cnt=0, sum=0;
		//0를 입력하면 종료
		while(true) {
				System.out.println("숫자를 입력하세요");
				 num = scan.nextInt();
				if(num <1) {
					break;
				}
				cnt++;
				sum += num;
				
			
		}
		System.out.println("숫자입력 개수: "+ cnt);
		System.out.println("숫자입력 합: "+ sum);
		System.out.println("숫자입력 평균: "+ sum/(double)cnt);
		

	}

}
