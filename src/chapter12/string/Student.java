package chapter12.string;

public class Student {

	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName = " + studentName + "]";
	}

	@Override
	public int hashCode() {// 주 기억장치 메모리 주소
		// return super.hashCode();
		return studentId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std=(Student)obj;
			if(studentId == std.studentId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	

}
