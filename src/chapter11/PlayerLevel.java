package chapter11;

public abstract class PlayerLevel {

	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	// ���ø� �޼���
	public final void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}

}
