package chapter11;

public class Computermain {
//추상 클래스는 객체생성 불가능
	public static void main(String[] args) {
		Computer c2 = new DeskTop();
		Computer c3 = new Mynotebook(); // NoteBook클래스 참조 가능

		c2.typing();
		c2.display();
		c3.display();
		c3.typing();

	}

}
