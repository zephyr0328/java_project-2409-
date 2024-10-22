package chapter06;

import java.util.Scanner;

public class Canmain {

	public static void main(String[] args) {
		int money=0;
		
		Scanner scanner=new Scanner(System.in);
		Vanding van=new Vanding();
		van.init();//음료준비 완료
		System.out.print("돈을 투입하세요 : ");
		money=scanner.nextInt();//돈 투입
		van.showCans(money);
		System.out.println("=====================");
		
		System.out.print("음료를 선택하세요: ");
		String select=scanner.next();
		van.outCan(select);
		scanner.close();
		
	}

}
