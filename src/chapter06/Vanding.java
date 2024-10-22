package chapter06;

public class Vanding {
	// 멤버변수
	private Can can[] = new Can[5];
	private int money;

	// 기본생성자
	// 메서드
	public void init() {
		can[0] = new Can("환타", 1000);
		can[1] = new Can("콜라", 1100);
		can[2] = new Can("사이다", 900);
		can[3] = new Can("에너지드링크", 2000);
		can[4] = new Can("자양강장제", 1500);
	}

	// 사용가능한 음료만 보여주는 메서드
	public void showCans(int m) {
		money = m;
		for (int i = 0; i < can.length; i++) {
			if (money >= can[i].getPrice()) {
				System.out.println(can[i].getCanName() + "-" + can[i].getPrice() + "원");
			}
		}
	}

	public void outCan(String name) {
		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println("요청하신" + can[i].getCanName() + "를(을) 선택하셨습니다.");
				System.out.println("잔액은" + (money - can[i].getPrice()) + "원 입니다.");
			}
		}
	}
}
