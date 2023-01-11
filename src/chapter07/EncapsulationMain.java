package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		int side;
		int height;
		int Area;
		
		side=Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		height=Integer.parseInt(JOptionPane.showInputDialog("높이"));
		
		//객체 생성
		Encapsulation obj= new Encapsulation();
		
		
		//Encapsulaion의 메소드를 사용하여 사각형의 넓이 구하기
		Area=obj.Cal_Area(side, height);
		System.out.println("사각형의넓이: "+ Area+ "니다");
		String str= "사각형의넓이: "+ Area+"니다";
		JOptionPane.showInputDialog(null,str);
		

	}

}
