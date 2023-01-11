package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		StudentInfo studentkim = new StudentInfo();
		
		studentkim.studentID=1;
		studentkim.grade=50;
		studentkim.address="서울";
		
		studentkim.setStudentName("홍길동");
		String name=studentkim.getStudentName();

		System.out.println(name);
	}

}
