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
		
		//Comparable을 사용한 정렬
		Collections.sort(students);//Comparable이 들어있는 객체가 들어와야 한다 암기!! 
		
		System.out.println("학생들의 점수를 기준으로 오름차순 정렬");
		for(Student score : students)
		{
			System.out.println(score);
		}
		

	}

}
