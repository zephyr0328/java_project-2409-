package chapter15;

public class ThreadEx01Main {

	public static void main(String[] args) {
		ThreadEx01 t = new ThreadEx01();
		t.start();
		//t.run(); // �������� ������ ������ ����ó�������� �������� ���� ����
		System.out.println("main ����");

	}

}
