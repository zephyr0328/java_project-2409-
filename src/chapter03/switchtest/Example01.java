package chapter03.switchtest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/*����ڷκ��� ���� �Է¹޾�, �ش� ���� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * ��:3-5��, ����:6-8��, ����:9-11��, �ܿ�: 12-2��*/
		int month;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("���� ���� : ");
		month=scanner.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:{
			System.out.println("��");
			break;
		}
		case 6:
		case 7:
		case 8:{
			System.out.println("����");
			break;
		}
		case 9:
		case 10:
		case 11:{
			System.out.println("����");
			break;
		}
		case 12:
		case 1:
		case 2:{
			System.out.println("�ܿ�");
			break;
		}
		default:
			System.out.println("1~12������ ���ڸ� �Է����ּ���.");
		}
scanner.close();
	}

}
