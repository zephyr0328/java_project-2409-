package chapter03.fortest;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int i, sum = 0;
		double avg = 0;
		int j;
		System.out.println("�� ���� ������ �˰� �����Ű���? ");
		i=scanner.nextInt();
		for(j=1;j<=i;j++) {
			System.out.println("�л��� ������ �Է����ּ��� :");
			sum+=scanner.nextInt();
		}
		avg=(double)sum/i;
		System.out.println("���� : "+sum+"��� : "+avg);
		
	}
	

}
