package chapter05;

import java.util.Scanner;

public class FuncTest05 {
	
	public static String EduStep(int num) {
		String b="";
		switch(num) {
		case 1: 
			
			b="��";
			break;
		case 2:
			
			b="��";
			break;
		case 3:
			
			b="��";
			break;
		default :
			
			b="���� �ܰ��Դϴ�.";
			break;
			}
		return b;
		}

	public static void main(String[] args) {
		
		//����ڷκ��� ���͵� �ܰ踦 �Է¹޾Ƽ� EduStep ȣ���ϱ�
		Scanner scanner=new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ���: ");
		int number=scanner.nextInt();
		String a=EduStep(number);//number�� �� �Ű�����
		System.out.println(a);
		scanner.close();
	}

}
