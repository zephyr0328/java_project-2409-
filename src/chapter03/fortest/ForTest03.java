package chapter03.fortest;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		int i, sum=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num=scanner.nextInt();
		
		for(i=1;;i++) {
			if(sum>num) {
				break;
			}
			sum+=i;
			System.out.print(i+" ");
		}
		System.out.println("\n"+(i-1)+"까지의 총합: "+sum);
		
	}

}
