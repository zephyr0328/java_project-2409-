package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int n = scanner.nextInt(); // 3
		boolean run = true;
		// 초기화를 통해서 메모리 확보 및 고객생성(Guide의 객체)
		Guide guide = new Guide(n);

		// 관광객 등록
		System.out.println("관광객 등록");
		for (int i = 0; i < n; i++) {
			System.out.print("이름 : ");
			guide.guest[i].setName(scanner.next());
			System.out.print("성별 : ");
			guide.guest[i].setGender(scanner.next());
			System.out.println("--------------------------");
		}
		while (run) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>");
			int m = scanner.nextInt();
			switch (m) {
			case 1:
				for (int j = 0; j < n; j++) {
					System.out.println((j + 1) + ".");
					System.out.println("이름 : " + guide.guest[j].getName());
					System.out.println("성별 : " + guide.guest[j].getGender());
					System.out.println("목적지 : " + Guide.getPoint());
				}
				System.out.println("------------------------------");
				break;
			case 2:
				System.out.print("어디로 변경하시겠습니까 : ");
				Guide.point = scanner.next();
				System.out.println(Guide.getPoint() + "로 목적지변경");
				System.out.println("------------------------------");
				break;
			case 3:
				System.out.println("종료");
				
				return;
			}scanner.close();
		}
	}
}
