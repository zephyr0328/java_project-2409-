package chapter03.whiletest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("�����Ϸ��� no�� �Է��ϼ���.");
		
		String inputString;
	
		do {
			inputString=scanner.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("no"));
		System.out.println("���α׷� ����");
		scanner.close();
	}

}
