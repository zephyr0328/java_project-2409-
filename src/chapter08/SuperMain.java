package chapter08;

public class SuperMain {

	public static void main(String[] args) {
		Paprika obj = new Paprika();

		obj.Set1("피망류", "여름", "노랑"); // 부모 클래스의 메서드
		obj.set2("빨강", 7000, "빨강파프리카"); // 자식 클래스의 메서드
		obj.Disp1();
		obj.Disp2();
		

	}

}
