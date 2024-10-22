package chapter02;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {

		int number;
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		boolean isPositive = number > 0;
		String result = isPositive ? "양수입니다." : "음수 또는 0입니다.";
		System.out.println(result);

	}

}
