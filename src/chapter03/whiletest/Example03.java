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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.print("����>");
			
			int menuNum=Integer.parseInt(scanner.nextLine());
			
			switch (menuNum) {
			case 1: 
			System.out.print("���ݾ�> ");
			balance=scanner.nextInt();
			break;
			case 2: 
			System.out.print("��ݾ�>");
			out=scanner.nextInt();
			break;
			case 3: 
			System.out.println("�ܰ�>"+(balance-out));
			break;
			case 4: 
			break;
			}
			System.out.println();
		}
		System.out.println("���α׷� ����");
		scanner.close();
	}

}
