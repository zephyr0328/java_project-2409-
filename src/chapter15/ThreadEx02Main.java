package chapter15;

public class ThreadEx02Main {

	public static void main(String[] args) {
		TreadEx02 t1= new TreadEx02(); // 0~9까지의 요소가 저장된 temp변수방이 생성
		
		t1.start();
		
		try {
			Thread.sleep(11000);//11초
			System.out.println("프로그램이 종료됩니다.");
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
