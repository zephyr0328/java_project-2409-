package chapter02;

import java.util.Scanner;

public class Example03 {

	// �������� ���Ǵ� ������ ����
	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("score: ");
		int score1 = scan.nextInt();
				
		String passnonpass;
		passnonpass = (score1 >= 60) ? "�հ�" : "���հ�";
		System.out.println(passnonpass);

	}

}
