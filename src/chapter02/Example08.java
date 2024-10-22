package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		//한 자릿수 숫자를 입력받아 (scan)
				//숫자가 짝수인지 홀수인지 출력하는 프로그램(삼항 연산자 사용)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("한 자릿수 숫자를 입력하세요: ");
		int num=scan.nextInt();
		int result=num%2;
		String x=(result==1)?"홀수":"짝수";
		System.out.println(x);
		
		

	}

}
