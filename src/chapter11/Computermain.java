package chapter11;

public class Computermain {
//�߻� Ŭ������ ��ü���� �Ұ���
	public static void main(String[] args) {
		Computer c2 = new DeskTop();
		Computer c3 = new Mynotebook(); // NoteBookŬ���� ���� ����

		c2.typing();
		c2.display();
		c3.display();
		c3.typing();

	}

}
