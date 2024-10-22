package chapter06;

public class Student {
	// 필드
	public static final int studentId = 1000;
	public String studentName;
	int grade;
	String address;

	// 생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// 생성자 오버로딩
	public Student(String studentName, String address) {
		this.studentName = studentName;
		this.address = address;
	}

	// 메서드
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

	// 사용자 메서드
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}

}
