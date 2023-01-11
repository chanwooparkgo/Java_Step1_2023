package chapter02;

public class Logic_Test02 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		System.out.println("-------------and------------");
		boolean fiag1=(num1>10) && (num2>20);
		System.out.println("false && false :"+ fiag1);
		
		boolean fiag2=(num1>10) && (num2>20);
		System.out.println("false && true :"+ fiag2);

		boolean fiag3=(num1>0) && (num2>20);
		System.out.println("true && false :"+ fiag3);
		
		boolean fiag4=(num1>0) && (num2>0);
		System.out.println("true && true :"+ fiag4);
		
		
		System.out.println("---------or----");
		
		boolean fiag5=(num1>10) || (num2>20);
		System.out.println("false || false :"+ fiag5);
		
		boolean fiag6=(num1>10) && (num2>20);
		System.out.println("false || true :"+ fiag6);
		
		boolean fiag7=(num1>0) || (num2>0);
		System.out.println("true && false :"+ fiag7);
		
		boolean fiag8=(num1>0) || (num2>0);
		System.out.println("true && true :"+ fiag8);
		
		
		System.out.println("---------not----");
		//num1과 num2는 같지않다
		boolean  fiag=(num1 != num2);
		System.out.println(fiag);
		
		fiag=!(num1>0);
		System.out.println(fiag);
		
	}

}
