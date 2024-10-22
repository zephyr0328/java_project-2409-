package chapter06;

public class Studentinfomain {

	public static void main(String[] args) {
		StudentInfo studentchoi = new StudentInfo(1004, "최백설", 1, "일산");
		System.out.println(studentchoi.address);

		// 기본 생성자로 객체생성
		StudentInfo studentlee = new StudentInfo();
		// 직관적인 초기화
		studentlee.address = "종로구";
		System.out.println(studentlee.address);

		// 기본 생성자로 객체생성
		StudentInfo studentkim = new StudentInfo();
		// getters and setters(데이터베이스와 연결돼있을 경우 사용)
		studentkim.setStudentName("강자성");
		String sname = studentkim.getStudentName();
		System.out.println(sname);

	}

}
