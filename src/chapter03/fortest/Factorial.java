package chapter03.fortest;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int N=scanner.nextInt();
		int i;
		int fac=N;
		for(i=1;i<N;i++) {
			fac=fac*(N-i);
		}
		int result=fac;
		System.out.println("입 력 : "+N);
		System.out.println("출 력 : "+result);
	}

}
