package chapter11;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행을 합니다");
		System.out.println("자동차가 스스로 방향을 전환 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 정지 합니다.");
	}

}
