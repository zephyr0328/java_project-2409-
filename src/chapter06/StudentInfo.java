package chapter06;

public class StudentInfo {
	
	//�������(=�ʵ�)
	int studentID;//1004
	private String studentName;//�ֹ鼳
	int grade;//1
	String address;//�ϻ�
	
	//������
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}
	//������ �����ε�
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
