package chapter02;

public class Example01 {

	public static void main(String[] args) {
		/*
		 /* Soldesk 과수원
배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개이다

과수원에서 하루에 생산되는 총 과일의 갯수를 출력하고, 시간당(24) 
전체 과일의 평균 생산갯수를 출력하시오
(단, 평균값을 담는 데이터 타입은 float으로 정의한다)
*/

		//변수방삽입
		int pear=5;
		int apple=7;
		int orange=5;
		//총 갯수
		int fruitTotal=pear+apple+orange;
		System.out.println("하루에 생산되는 과일의총갯수:"+fruitTotal);
		//시간당 평균
		float h=24f;
		float fruitAge=fruitTotal/h;
		System.out.println("시간당생산되는 과일이 평균: "+ fruitAge);
		
		
		int a=5;
		int b=7;
		int c=5;
		float avg;
		int result;
		
		result =(a+b+c);
		 avg = (a+b+c)/3;
		 System.out.println(result);
		 System.out.println(avg);
		
		
	}

}
