package chapter06;

import java.util.Scanner;

public class Canmain {

	public static void main(String[] args) {
		int money=0;
		
		Scanner scanner=new Scanner(System.in);
		Vanding van=new Vanding();
		van.init();//�����غ� �Ϸ�
		System.out.print("���� �����ϼ��� : ");
		money=scanner.nextInt();//�� ����
		van.showCans(money);
		System.out.println("=====================");
		
		System.out.print("���Ḧ �����ϼ���: ");
		String select=scanner.next();
		van.outCan(select);
		scanner.close();
		
	}

}
