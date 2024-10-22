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
	public int hashCode() {// �� �����ġ �޸� �ּ�
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
