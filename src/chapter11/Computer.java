package chapter11;
//추상 클래스
public abstract class Computer {
	
	public abstract void display(); // 추상 메서드 (body가 없는 메서드)
	public abstract void typing();
	
	/*
	 * 설계만 해 놓는 개념 
	 */
	
	//일반 메서드
	public void turnOn() {
		System.out.println("전원을 켭니다.");//수행문-> 메서드의 "바디"
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
