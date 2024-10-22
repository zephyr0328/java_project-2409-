package chapter11;

public class ExpertLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("매우 빠르게 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("매우 높이 jump를 합니다.");

	}

	@Override
	public void turn() {
		System.out.println("빠르게 turn합니다..");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****상급자 입니다*****");

	}

}
