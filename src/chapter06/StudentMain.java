package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student();

		student1.studentName = "�ֹ鼳";
		student1.address = "�ϻ�";
		student1.showStudentInfo();

		// ------------------------------------------------------------------
		// student1.setStudentName("�ֹ鼳");
		// student1.setAddress("�ϻ�");
		// student1.showStudentInfo();
		 

		// ------------------------------------------------------------------
		Student student2 = new Student("�ֹ鼳", "�ϻ�");
		student2.showStudentInfo();

		// ------------------------------------------------------------------
		Student student3 = new Student();

		student3.setStudentName("�ֹ鼳");
		student3.setAddress("�ϻ�");
		student3.showStudentInfo();
		
	}
	
}
