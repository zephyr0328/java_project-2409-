package chapter13.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx04 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		// id : key | value : 비밀번호
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력하세요!");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			if (map.containsKey(id)) {
				System.out.print("비밀번호 : ");
				String password = scanner.nextLine();
				if (map.get(id).equals(password)) {
					break;
				}
			}
			System.out.println("아이디와 비밀번호를 다시 입력하세요");
		}
		System.out.println("로그인에 성공했습니다.");
		scanner.close();
	}

}
