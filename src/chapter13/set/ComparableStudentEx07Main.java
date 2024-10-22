package chapter13.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableStudentEx07Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Alice", 85));
		students.add(new Student("Bob", 85));
		students.add(new Student("Charlie", 80));
		
		//Comparable�� ����� ����
		Collections.sort(students);//Comparable�� ����ִ� ��ü�� ���;� �Ѵ� �ϱ�!! 
		
		System.out.println("�л����� ������ �������� �������� ����");
		for(Student score : students)
		{
			System.out.println(score);
		}
		

	}

}
