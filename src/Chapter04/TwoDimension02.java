package Chapter04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
 		System.out.println("입력");
 		
		int JavaScore[][]=new int[2][3];
 		
 		
		for(int i=0; i<JavaScore.length; i++) {
			for(int j=0; j<JavaScore[i].length; j++) 
			
			{  //입력
				int JavaScore2 = Integer.parseInt(JOptionPane.showInputDialog("점수"));
				//입력받은점수대입
				JavaScore[i][j]= JavaScore2;
				System.out.println("javascore[" + i + "] [" + j+"]" + JavaScore[i][j] );
			}
		}//for
		System.out.println();
	}

}
