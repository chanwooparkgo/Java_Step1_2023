package Chapter04.Example;

public class Example01 {
	public static void main(String[] args) {
		//for문을 이용하여 나온 배열의 점수를 줄단위로 평균을 구하시오
		int[][]  array = { {95,86}, {83,92,96}, {78,83,93,87,88} };
		
		
		//int sum=0;
		int total=0;
		int count=0;
		double avg=0;
		
		//방법1 
		
		  
		 int sum[]=new int[3];
		for(int i=0; i<array.length; i++) {			
			for(int j=0; j<array[i].length; j++) {
				sum[i] += array[i][j];//0,0,0,1|  1, 0,1,1, 1,2 | 2, 0 2, 1 2,2 2,3 2,4
				//sum  += array[i][j];
				count++;
			}//for inner
				avg = sum[i]/(double)count;
							
			//avg = sum /count;
			System.out.println("배열의 총합: "+ sum[i]);
			System.out.println("배열의 각각의 평균: "+avg);	
		}//for 
		    
		
		System.out.println("==============");
		//System.out.println("배열의 전체평균: "+ avg);		
		
		
		//방법2
		/*
			int alltotal;
			int allavg;
				for(int i=0; i<array.length; i++) {			
					for(int j=0; j<array[i].length; j++) {
						total += array[i][j];//각행의합
						count++;//각 행의데이터수가 누적돼 전체 데이터수 받아옴
					}//for inner
					avg = total/(double)(array[i].length);
					System.out.println("배열의 총합: "+ total);			
					System.out.println("배열의 각각의 평균: "+Math.round(avg));		
					//쓰레기값 초기화
					alltotal +=total;
					total=0;
					avg=0;
					System.out.println("==============");
				}//for
				
				//전체평균
				double allavg = alltotal/(double)count;
				System.out.println("전체순위:"+ alltotal);
				System.out.println("전체평균:" + allavg);
				
				System.out.println(String.format("전체평균:" + allavg));
			*/	
		
		//방법3
		for(int[] num:array) {//한줄씩 95, 86
			for(int score : num) {//95, 86
				total += score;
			}// for inner
			count++;
			System.out.println(count + "번째줄 학생의합계:" + total);
			total =0;//초기화
		}//for outer
	
	
	
	}
}
