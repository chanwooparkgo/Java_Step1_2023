package Chapter03.IF.For;

public class ForTest02 {

	public static void main(String[] args) {
		System.out.println("1부터100까지합 출력");
		
		int i;
		int sum=0;
		
		for(i=1; i<=100; i++) {
			System.out.println(i+ " ");
			sum += i;
		}
		System.out.println("1~100까지의합: " + sum);
	}

}
