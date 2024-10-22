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
		// str1�� �ٸ��ּ� ����
		str1 = str1.concat(str2);
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		System.out.println("str1 ���ڼ� : " + str1.length());
		System.out.println("str2 ���ڼ� : " + str2.length());

		System.out.println("str1 d���� ��ġ : " + str1.indexOf('d'));
		System.out.println("str2 D���� ��ġ : " + str2.indexOf('D'));

		System.out.println("str1 ��� �ҹ��ڷ� : " + str1.toLowerCase());
		System.out.println("str2 ��� �ҹ��ڷ� : " + str2.toLowerCase());

		System.out.println("str1 ��� �빮�ڷ� : " + str1.toUpperCase());
		System.out.println("str2 ��� �빮�ڷ� : " + str2.toUpperCase());

	}

}
