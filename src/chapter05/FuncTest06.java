package chapter05;

import java.util.Scanner;

public class FuncTest06 {
	
	public static String EduStep(int num) {
		String a;
		switch (num) {
		case 1:
			a = "�ʱ�";
			break;
		case 2:
			a = "�߱�";
			break;
		case 3:
			a = "���";
			break;
		default:
			a = "null";
			break;
		}
		return a;
	}

	public static void main(String[] args) {
		// ����ڷκ��� ���͵� �ܰ踦 �Է¹޾Ƽ� EduStep ȣ���ϱ�
		Scanner scanner = new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ���: ");
		int number = scanner.nextInt();

		String step = EduStep(number);
		System.out.println("���� ���� �ܰ�� " + step + "�Դϴ�.");
		
		
	}

}
