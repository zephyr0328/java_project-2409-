package chapter03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		boolean run=true;
		int balance=0;
		int out=0;
		Scanner scanner=new Scanner(System.in);
		
		
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
			
			int menuNum=Integer.parseInt(scanner.nextLine());
			
			switch (menuNum) {
			case 1: 
			System.out.print("예금액> ");
			balance=scanner.nextInt();
			break;
			case 2: 
			System.out.print("출금액>");
			out=scanner.nextInt();
			break;
			case 3: 
			System.out.println("잔고>"+(balance-out));
			break;
			case 4: 
			break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
