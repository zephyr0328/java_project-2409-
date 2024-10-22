package chapter03.iftest;

import java.util.Scanner;



public class IfExample07 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String ID = "soldesk";
		int PW = 240910;
		
		System.out.println("아이디 : ");
		String id = scanner.nextLine();
	
		if (ID.equals(id)) {
			// 비밀번호
			System.out.println("비밀번호 : ");
			int pass = scanner.nextInt();
			if (PW == pass) {
				System.out.println(ID + "님 환영합니다.");
			} else {
				System.out.println("비밀번호를 다시 입력해주세요.");
			}
		}else {
			System.out.println("없는 아이디 입니다.");
		}
		scanner.close();
	}

}
