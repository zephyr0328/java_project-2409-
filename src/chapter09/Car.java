package chapter09;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed +=1;
	}
	
	public final void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
		speed=0;
	}
	
}
