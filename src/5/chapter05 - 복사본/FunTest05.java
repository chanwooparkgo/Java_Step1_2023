package chapter05;

import javax.swing.JOptionPane;

public class FunTest05 {

	public String channel ;//멤버변수
	public int chanelInt ;//멤버변수
	public int volume ;//멤버변수
	
	//생략가능
	public FunTest05() {
		
	}
	public FunTest05(int volume) {
		
	}
	
	public void channelUp() {
		System.out.println("소리를"+ volume + "만큼 올립니다");
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를"+ volume + "만큼 내립니다");
	}
	
	//오버로딩(다항성만족)
	public void channelChange(String channel) {
		System.out.println("채널를"+ channel + "로 바꿉니다");
	}
	//오버로딩(다항성만족)
	public void channelChange(int channelInt) {
		System.out.println("채널를"+ channelInt + "로 올립니다");
	}
	//===========================================
	public static void main(String[] args) {
		
		FunTest05 tv = new  FunTest05();
		tv.channelUp();
		tv.channelDown(5);
		
		tv.channelChange("tvn");
		tv.channelChange(5);
		

	}//main

}
