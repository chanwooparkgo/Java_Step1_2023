package Chapter04;

public class ArrayTest06 {

	public static void main(String[] args) {
		int score[]= {98,90,87};
		int sum=0;
		double avg=0;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			avg = sum/(double)(score.length);			
			
		}//for
			System.out.println("합은 : "+ sum);
			System.out.println("평균은: "+Math.round(avg) );//반올림
	}

}
