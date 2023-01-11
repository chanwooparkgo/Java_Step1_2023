package Chapter04;

public class TwoDimension01 {

	public static void main(String[] args) {
		
		int arr[][]= new int[2][3];
		int n=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				n++;
				System.out.print((arr[i][j]=n) +" ");//리터널 입력후 출력
			}//forinner
			System.out.println();
		}//for

		System.out.println("=====================================");
		System.out.println(arr.length);//행
		System.out.println(arr[0].length);//열
		System.out.println("====================================");
		
		int arr1[] []= { {1,2,3}, {4,5,6}};
		int n1=0;
		for(int k=0; k<arr1.length; k++) {//각 줄의 끝까지 읽음
			for(int o=0; o<arr[k].length; o++) {
				
				System.out.print(arr1[k][o]);
			}
			System.out.println();
		}
	}//main

}//class
