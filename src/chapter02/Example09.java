package chapter02;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		// 두 개의 숫자를 입력 받아서 첫 번째(num1) 숫자가 두 번째(num2) 숫자보다
		// 큰지 여부를 출력하는 프로그램을 작성하세요.
		int num1;
		int num2;

		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력해주세요 : ");
		num1 = scan.nextInt();
		System.out.print("두 번째 숫자를 입력해주세요 : ");
		num2 = scan.nextInt();
		System.out.println("첫 번째 숫자가 두 번째 숫자보다 더 큰가요?");

		boolean isGreaterThan = (num1 > num2);
		String result = (isGreaterThan == true) ? "네" : "아니요";
		System.out.print(result);

	}

}
