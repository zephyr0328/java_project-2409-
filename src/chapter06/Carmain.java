package chapter06;

public class Carmain {

	public static void main(String[] args) {
		Car myCar = new Car(); // 객체(인스턴스)생성

		System.out.println("제작회사:" + myCar.company);
		System.out.println("모델명:" + myCar.model);
		System.out.println("색상:" + myCar.color);
		System.out.println("최고속도:" + myCar.maxSpeed);
		System.out.println("현재속도:" + myCar.speed);

		myCar.speed = 60;
		System.out.println(" 변경된 현재속도: " + myCar.speed);
	}

}
