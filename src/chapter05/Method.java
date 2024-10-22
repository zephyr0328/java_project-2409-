package chapter05;

import java.util.Scanner;

public class Method {
	//메서드의 오버로딩 기법
	//메서드1.
	void makeBread() {
		System.out.println("빵을 만듭니다.");
	}
	//메서드2.
	public void makeBread(int cnt) {
		int i;
		for(i=0;i<cnt;++i) {
			System.out.println("빵"+i+"개");
		}
		System.out.println("빵"+cnt+"개가 완성되었습니다.");
		}
	//메서드3.
	public void makeBread(int cnt,String str) {
		int j;
		for(j=0;j<cnt;++j) {
			System.out.println(str+"빵"+j+"개");
		}
		System.out.println("요청하신"+cnt+"개의"+str+"빵이 완성되었습니다.");
	}
	
	public void order() {
		Scanner scanner=new Scanner(System.in);
		boolean run=true;

		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");
			
			int input_num=Integer.parseInt(scanner.nextLine());
			switch(input_num) {
			case 1:
				System.out.print("빵 개수를 입력: ");
				int cnt1=Integer.parseInt(scanner.nextLine());
				makeBread(cnt1);
				break;
			case 2:
				System.out.print("빵 개수를 입력: ");
				int cnt2=Integer.parseInt(scanner.nextLine());
				System.out.print("종류 선택 : ");
				String str=(scanner.nextLine());
				makeBread(cnt2,str);
				break;
			case 3:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
