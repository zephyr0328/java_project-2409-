package chapter02;

import java.util.Scanner;

public class Bit_Test15 {

	public static void main(String[] args) {
		// Ű���� �Է°� �ޱ�
		Scanner scan=new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է�: ");
		int num1=scan.nextInt();
		System.out.print("�� ��° ���� �Է�: ");
		int num2=scan.nextInt();
		
		//System.out.println(num1);
		//System.out.print(num2);
		
		
		int andResult=num1&num2;
		int orResult =num1|num2;
		int xorResult=num1^num2;
		
		System.out.println("��Ʈ and ���: "+andResult);
		System.out.println("��Ʈ or ���: "+orResult);
		System.out.println("��Ʈ xor ���: "+xorResult);
		
		
		

	}

}
