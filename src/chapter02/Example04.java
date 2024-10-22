package chapter02;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("score : ");
		int score = scan.nextInt();
		
		char grade=score>90?'A':((score>80)?'B':'C');
		
		System.out.println("ÇÐÁ¡ : "+grade);
		
		
		

	}

}
