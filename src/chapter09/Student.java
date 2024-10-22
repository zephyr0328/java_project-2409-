package chapter09;

public class Student extends People{
	
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //부모클래스의 생성자 호출하여 멤버 초기화
		this.studentNo = studentNo;
	}
	
	
}
