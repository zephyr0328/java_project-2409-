package chapter11;

public class ExpertLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�ſ� ������ �޸��ϴ�.");

	}

	@Override
	public void jump() {
		System.out.println("�ſ� ���� jump�� �մϴ�.");

	}

	@Override
	public void turn() {
		System.out.println("������ turn�մϴ�..");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****����� �Դϴ�*****");

	}

}
