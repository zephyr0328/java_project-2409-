package chapter02;

import java.util.Scanner;

public class Example03 {

	// 공용으로 사용되는 고정된 메인
	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("score: ");
		int score1 = scan.nextInt();
				
		String passnonpass;
		passnonpass = (score1 >= 60) ? "합격" : "불합격";
		System.out.println(passnonpass);

	}

}
