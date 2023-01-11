package chapter06;

public class Student {

	//필드
	int studentID;
	public String studentName;
	int grade;
	String address;
	
	
	//free compile
	//오버로딩 된 생성자가 있을시 디폴트를 사용하기위해서는 반드시 생략이불가능
	public  Student() {
		
	}
	//생성자 오버로딩
	
	public Student(String studentName, String address) {
		this.studentName=studentName;
		this.address= address;                                                  
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName+"," + address);
	}
	
}
