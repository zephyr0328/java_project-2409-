package chapter02;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		/*
		 * Scanner �� ����Ͽ� �� ���� �Ҹ���(boolean) ���� isSunny�� isWarm�� �Է¹޾�, ������ ȭâ�ϸ鼭 �������� ���θ�
		 * ����ϴ� ���α׷��� �ۼ��ϼ���. (������ ȭâ�ϸ鼭 ���������� ���� ���� isNiceWeather ���� �ۼ��ϼ���.)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("������ ȭâ�Ѱ���? (true/false) : ");
		boolean isSunny = scan.nextBoolean();

		System.out.println("������ �����Ѱ���? (true/false) : ");
		boolean isWarm = scan.nextBoolean();
		
		boolean isNiceWeather=isSunny && isWarm;
		System.out.println("������ ȭâ�ϸ鼭 �����Ѱ���? : "+isNiceWeather);
		

	}

}
