package chapter03.whiletest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("메시지를 입력하세요.");
		System.out.println("종료하려면 no를 입력하세요.");
		
		String inputString;
	
		do {
			inputString=scanner.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("no"));
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
