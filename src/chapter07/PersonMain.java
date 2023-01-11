package chapter07;

public class PersonMain {

	public static void main(String[] args) {
		
		Person per = new Person();
		
		System.out.println(per.name+"이름: 김유신");
		System.out.println( per.weight);
		System.out.println( per.height);
		
		Person per2 = new Person("강감찬");
		
		System.out.println(per2.name);
		System.out.println( per2.weight=135F);
		System.out.println( per2.height=75F);
		
		Person per3 = new Person("이순신",170,50);
		
		System.out.println(per.name);
		System.out.println( per.weight);
		System.out.println( per.height);
	}
}
