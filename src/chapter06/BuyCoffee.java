package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		// 고객2명 생성
		Customer kim = new Customer("Kim", 12000);
		Customer park = new Customer("park", 10000);
		// 카페 생성
		Cafe cafe = new Cafe("힘이 나는 카페");
		// 카페방문
		kim.visitCafe(cafe, 4000);
		park.visitCafe(cafe, 4500);
		// 카페정보
		cafe.showInfo();
		// 고객들의 정보
		kim.showInfo();
		park.showInfo();
		

	}

}
