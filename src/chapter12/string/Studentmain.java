package chapter12.string;

public class Studentmain {

	public static void main(String[] args) {
		// String 클래스는 이미 toString이 재정의 돼있음
		String str1 = new String("test");
		String str2 = new String("test");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2); // new로 다른주소 생성

		Student studentLee = new Student(100, "김자바");
		System.out.println(studentLee);
		Student studentLee2 = studentLee;

		Student studentJava = new Student(100, "김자바");

		// 물리적인 주소
		if (studentLee == studentLee2) {
			System.out.println("studentLee와studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와studentLee2의 주소는 다릅니다.");
		}
		// 논리적인 주소
		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee와studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와studentLee2의 주소는 다릅니다.");
		}
		// 물리적인 주소
		System.out.println("물리적인 주소는 다르지만 논리적인 값은 동일하도록 재정의");
		if (studentLee == studentJava) {
			System.out.println("studentLee와studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와studentLee2의 주소는 다릅니다.");
		}
		// 논리적인 주소
		if (studentLee.equals(studentJava)) {
			System.out.println("studentLee와studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와studentLee2의 주소는 다릅니다.");
		}

		System.out.println("-----데이터 값 출력-----");
		System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
		System.out.println("studentJava의  hashCode : " + studentJava.hashCode());
		System.out.println("-----데이터 값 같은 hashcode-----");
		System.out.println("studentLee의 실제 hashCode : " + System.identityHashCode(studentLee));
		System.out.println("studentJava의  실제 hashCode : " + System.identityHashCode(studentJava));

		// 재정의가 되어있는 HashCode
		System.out.println("----String클래스의 실제값----");
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashcode : " + str2.hashCode());

		System.out.println("str1의 실제 hashcode : " + System.identityHashCode(str1));
		System.out.println("str2의 실제 hashcode : " + System.identityHashCode(str2));

	}

}
