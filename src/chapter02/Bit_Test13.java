package chapter02;

public class Bit_Test13 {

	public static void main(String[] args) {

		int num1 = 5; // 0101
		int num2 = 10; // 1010

		// Bit OR(|) : �ϳ��� 1�̸� 1�� ����� ��ȯ
		int result = num1 | num2;
		System.out.println(result);

		// Bit AND(&) : ��� 1�̸� 1�� ����� ��ȯ
		result = num1 & num2;
		System.out.println(result);

		// Bit XOR(^) : 0�� 1�̿��߸� 1�� ����� ��ȯ
		result = num1 ^ num2;
		System.out.println(result);

	}

}
