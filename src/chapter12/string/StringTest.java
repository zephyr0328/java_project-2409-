package chapter12.string;

public class StringTest {

	public static void main(String[] args) {
		String str = "";
		String str1 = "Hi everybody!";
		String str2 = " Have a nice Day!";

		System.out.println(System.identityHashCode(str1));

		str = str1 + str2;
		System.out.println(str);
		System.out.println(System.identityHashCode(str1));
		System.out.println();
		// str1의 다른주소 생성
		str1 = str1.concat(str2);
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		System.out.println("str1 글자수 : " + str1.length());
		System.out.println("str2 글자수 : " + str2.length());

		System.out.println("str1 d글자 위치 : " + str1.indexOf('d'));
		System.out.println("str2 D글자 위치 : " + str2.indexOf('D'));

		System.out.println("str1 모두 소문자로 : " + str1.toLowerCase());
		System.out.println("str2 모두 소문자로 : " + str2.toLowerCase());

		System.out.println("str1 모두 대문자로 : " + str1.toUpperCase());
		System.out.println("str2 모두 대문자로 : " + str2.toUpperCase());

	}

}
