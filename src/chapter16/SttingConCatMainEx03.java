package chapter16;

import javax.print.attribute.standard.RequestingUserName;

public class SttingConCatMainEx03 {
	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";

		// �ν��Ͻ� �޼��� ȣ�� ���
		System.out.println("----------�ν��Ͻ� ���-----------");
		StringConcatImple concat1 = new StringConcatImple();
		concat1.makeString(s1, s2);

		// �͸��� ���� Ŭ���� ȣ�� ���
		System.out.println("----------�͸��� ���� Ŭ���� ���-----------");
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		concat2.makeString(s1, s2);

		// ���ٽ� ȣ�� ���
		System.out.println("---------���ٽ� ���----------");
		StringConcat concat = (str1, str2) -> System.out.println(str1 + " " + str2);
		concat.makeString(s1, s2);

	}

}
