package chapter06;

import java.util.Random;

public class Start {

	private int pcnum=new Random().nextInt(50)+1;
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) {
		//ramdom값보다 작으면 up /크면 down / 일치하면 -> result="SUCCESS"
		count++;
		
		if(mynumber < pcnum) {
			System.out.println("UP");
		}else if(mynumber > pcnum) {
			System.out.println("down");
		}else {
			System.out.println(count+"회만에 SUCCESS");
			result="SUCCESS";
		}
		
		
		return result;
	}
}
