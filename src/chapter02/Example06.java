package chapter02;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {

		int number;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		boolean isPositive = number > 0;
		String result = isPositive ? "����Դϴ�." : "���� �Ǵ� 0�Դϴ�.";
		System.out.println(result);

	}

}
