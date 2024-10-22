package chapter05;

public class FuncTest07 {
	public static void swap(int x, int y) {

		int temp = x;
				  x = y;
				  y = temp; // 교체 알고리즘!!(암기해서 응용)(그림처럼 외워서하기)(신발끈 모양)
		System.out.println("swap()결과: a="+x+", b="+y	);
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("swap()호출 전: a=" + a + ", b=" + b);
		System.out.println("====================");
		
		//call by reference
		//메서드에 입력되는 값으로 수행문을 수행 하는것이 아니라 입력값의 주소값을 참고해서 사용하는 것!!
		//원본값은 변경되지 않는다!!
		
		swap(a, b);
		System.out.println("swap()호출 후: a=" + a + ", b=" + b);
		System.out.println("====================");

	}

}
