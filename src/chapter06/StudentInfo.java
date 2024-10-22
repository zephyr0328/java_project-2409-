package chapter06;

public class StudentInfo {
	
	//멤버변수(=필드)
	int studentID;//1004
	private String studentName;//최백설
	int grade;//1
	String address;//일산
	
	//생성자
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}
	//생성자 오버로딩
	public StudentInfo(int studentID, String studentName, int grade, String address) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	
}
