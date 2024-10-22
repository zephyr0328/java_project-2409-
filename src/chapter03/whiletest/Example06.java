package chapter03.whiletest;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {

		int cnt, num;
		boolean run = true;
		String str = "";
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");
			num =Integer.parseInt(scanner.nextLine());

			if (num > 0 && num <= 3) {
				switch (num) {
				case 1:System.out.print("빵의 개수를 입력하세요: ");
					cnt=Integer.parseInt(scanner.nextLine());
					int i;
					for(i=0;i<cnt;++i) {
						System.out.println("빵"+i+"개");
					}
					System.out.println("빵"+cnt+"개가 완성되었습니다.");
					break;
				case 2:System.out.print("빵의 개수입력 : ");
					cnt=Integer.parseInt(scanner.nextLine());
					System.out.print("종류 선택 : "	);
					str=scanner.nextLine();
					int j;
					for(j=0;j<cnt;++j) {
						System.out.println(str+"빵"+j+"개");
					}
					System.out.println("요청하신"+cnt+"개의"+str+"빵이 완성되었습니다.");
					break;
				case 3:
					run = false;
					break;
				}
			} else {
				System.out.println("다시 선택하세요.");
			}

		} // while
		System.out.println("프로그램 종료");
		scanner.close();
	}// main

}// class
