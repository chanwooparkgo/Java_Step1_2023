package Chapter04.Example;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Mylotto {

	public static void main(String[] args) {
		// 로또번호 6개를 담을배열
		int number;
		int cnt=0;
		int[] lotto= new int[6];
		Scanner scan = new Scanner(System.in);
		System.out.print("입력");
		
		System.out.println("=======이번주 로또예상번호=====");
		number=Integer.parseInt(JOptionPane.showInputDialog("원하는로또구매횟수를입력하세요"));
		while(number > cnt) {
			System.out.print("[" + (cnt+1) + "]  : " );
			
			outer:for(int i=0; i<lotto.length; ) {
				lotto[i]= new Random().nextInt(45)+1;
				
				//중복값을 비교하는 반복문
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						continue outer;
					}//if
				}///in for
				System.out.print(lotto[i]+" ");
				i++;
			}//out for
			
			cnt++;
			System.out.println();
			
			
			
			
			
			
			
			/*
			for(int i=0; i<lotto.length; i++) {
				for(int j=0; j<i; j++) {
					System.out.println(Math.random()*6+1);
				lotto[i]=number;
				}
			}
			System.out.println();
			*/
			
			
		}//while
	}

}
