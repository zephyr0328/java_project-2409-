package chapter03.switchtest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/*사용자로부터 월을 입력받아, 해당 월의 계절을 출력하는 프로그램을 작성하세요.
		 * 봄:3-5월, 여름:6-8월, 가을:9-11월, 겨울: 12-2월*/
		int month;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("계절 계산기 : ");
		month=scanner.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:{
			System.out.println("봄");
			break;
		}
		case 6:
		case 7:
		case 8:{
			System.out.println("여름");
			break;
		}
		case 9:
		case 10:
		case 11:{
			System.out.println("가을");
			break;
		}
		case 12:
		case 1:
		case 2:{
			System.out.println("겨울");
			break;
		}
		default:
			System.out.println("1~12사이의 숫자를 입력해주세요.");
		}
scanner.close();
	}

}
