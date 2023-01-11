package chapter05;

public class MethodMain {
//main은 실행창
	public static void main(String[] args) {
		Method bread = new Method();
		
		bread.makeBread();
		System.out.println("==============");
		bread.makeBread(5);
		System.out.println("==============");
		bread.makeBread(5,"생크림");
		
		bread.order( );
		//bread2.order2( );
	}
	

}
