package chapter02;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		// �� ���� ���ڸ� �Է� �޾Ƽ� ù ��°(num1) ���ڰ� �� ��°(num2) ���ں���
		// ū�� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		int num1;
		int num2;

		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է����ּ��� : ");
		num1 = scan.nextInt();
		System.out.print("�� ��° ���ڸ� �Է����ּ��� : ");
		num2 = scan.nextInt();
		System.out.println("ù ��° ���ڰ� �� ��° ���ں��� �� ū����?");

		boolean isGreaterThan = (num1 > num2);
		String result = (isGreaterThan == true) ? "��" : "�ƴϿ�";
		System.out.print(result);

	}

}
