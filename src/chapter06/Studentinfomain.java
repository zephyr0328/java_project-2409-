package chapter06;

public class Studentinfomain {

	public static void main(String[] args) {
		StudentInfo studentchoi = new StudentInfo(1004, "�ֹ鼳", 1, "�ϻ�");
		System.out.println(studentchoi.address);

		// �⺻ �����ڷ� ��ü����
		StudentInfo studentlee = new StudentInfo();
		// �������� �ʱ�ȭ
		studentlee.address = "���α�";
		System.out.println(studentlee.address);

		// �⺻ �����ڷ� ��ü����
		StudentInfo studentkim = new StudentInfo();
		// getters and setters(�����ͺ��̽��� ��������� ��� ���)
		studentkim.setStudentName("���ڼ�");
		String sname = studentkim.getStudentName();
		System.out.println(sname);

	}

}
