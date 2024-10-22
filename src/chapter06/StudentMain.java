package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student();

		student1.studentName = "최백설";
		student1.address = "일산";
		student1.showStudentInfo();

		// ------------------------------------------------------------------
		// student1.setStudentName("최백설");
		// student1.setAddress("일산");
		// student1.showStudentInfo();
		 

		// ------------------------------------------------------------------
		Student student2 = new Student("최백설", "일산");
		student2.showStudentInfo();

		// ------------------------------------------------------------------
		Student student3 = new Student();

		student3.setStudentName("최백설");
		student3.setAddress("일산");
		student3.showStudentInfo();
		
	}
	
}
