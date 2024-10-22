package chapter03.fortest;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int i, sum = 0;
		double avg = 0;
		int j;
		System.out.println("몇 명의 성적을 알고 싶으신가요? ");
		i=scanner.nextInt();
		for(j=1;j<=i;j++) {
			System.out.println("학생의 성적을 입력해주세요 :");
			sum+=scanner.nextInt();
		}
		avg=(double)sum/i;
		System.out.println("총점 : "+sum+"평균 : "+avg);
		
	}
	

}
