package chapter15;

public class ThreadEx02Main {

	public static void main(String[] args) {
		TreadEx02 t1= new TreadEx02(); // 0~9������ ��Ұ� ����� temp�������� ����
		
		t1.start();
		
		try {
			Thread.sleep(11000);//11��
			System.out.println("���α׷��� ����˴ϴ�.");
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
