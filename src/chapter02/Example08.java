package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		//�� �ڸ��� ���ڸ� �Է¹޾� (scan)
				//���ڰ� ¦������ Ȧ������ ����ϴ� ���α׷�(���� ������ ���)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�� �ڸ��� ���ڸ� �Է��ϼ���: ");
		int num=scan.nextInt();
		int result=num%2;
		String x=(result==1)?"Ȧ��":"¦��";
		System.out.println(x);
		
		

	}

}
