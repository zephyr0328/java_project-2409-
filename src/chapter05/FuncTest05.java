package chapter05;

import java.util.Scanner;

public class FuncTest05 {
	
	public static String EduStep(int num) {
		String b="";
		switch(num) {
		case 1: 
			
			b="상";
			break;
		case 2:
			
			b="중";
			break;
		case 3:
			
			b="하";
			break;
		default :
			
			b="없는 단계입니다.";
			break;
			}
		return b;
		}

	public static void main(String[] args) {
		
		//사용자로부터 스터디 단계를 입력받아서 EduStep 호출하기
		Scanner scanner=new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요: ");
		int number=scanner.nextInt();
		String a=EduStep(number);//number는 실 매개변수
		System.out.println(a);
		scanner.close();
	}

}
