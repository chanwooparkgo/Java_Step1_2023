package Chapter03.IF.For;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력받나 총점과평균을 구하시호(단,평균은실수로
		//출력)
		Scanner scan = new Scanner(System.in);
		int i, sum=0;
		double avg=0;
		int cnt=0;
		System.out.print("몇명의 학생 점수를 입력받으시겠습니까?");
		int stu = scan.nextInt();
		
		for(i=1; i<=stu; i++) {
			System.out.println(i+"번째 학생점수 입력");
			sum += stu;
			cnt++;
			//avg = stu / 5;
		}//for
		
		avg=sum/cnt;
		System.out.println("총점"+sum+"평균"+avg);
		
		System.out.println("합은"+ sum);
		System.out.println("평균은"+ avg);
	}

}

/*
 * 인스턴스변수/ 인덱스 변수 전역/지역변수
 */